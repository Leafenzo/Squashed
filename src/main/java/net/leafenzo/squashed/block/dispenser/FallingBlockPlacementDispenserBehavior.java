package net.leafenzo.squashed.block.dispenser;

import com.mojang.logging.LogUtils;
import net.minecraft.block.DispenserBlock;
import net.minecraft.block.dispenser.FallibleItemDispenserBehavior;
import net.minecraft.item.AutomaticItemPlacementContext;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.BlockPointer;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.world.World;
import org.slf4j.Logger;

public class FallingBlockPlacementDispenserBehavior
        extends FallibleItemDispenserBehavior {
    private static final Logger LOGGER = LogUtils.getLogger();

    @Override
    protected ItemStack dispenseSilently(BlockPointer pointer, ItemStack stack) {
        this.setSuccess(false);
        Item item = stack.getItem();
        if (item instanceof BlockItem) {
            Direction direction = pointer.getBlockState().get(DispenserBlock.FACING);
            if(direction == Direction.UP) { return stack; } // Don't place block if we are facing straight up

            BlockPos blockPos = pointer.getPos().offset(direction);
            Direction direction2 = pointer.getWorld().isAir(blockPos.down()) ? direction : Direction.UP;
            try {
                this.setSuccess(((BlockItem)item).place(new AutomaticItemPlacementContext((World)pointer.getWorld(), blockPos, direction, stack, direction2)).isAccepted());
            } catch (Exception exception) {
                LOGGER.error("Error trying to place block at {}", blockPos, exception); //literally copied this over just
            }
        }
        return stack;
    }
}

