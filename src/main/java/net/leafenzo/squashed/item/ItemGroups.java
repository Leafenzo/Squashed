package net.leafenzo.squashed.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.leafenzo.squashed.Super;
import net.leafenzo.squashed.block.AllBlocks;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ItemGroups {

    /** Might place each item in a vanilla category? Not sure if that would make porting back harder*/
    public static final ItemGroup SQUASHED = FabricItemGroup.builder(new Identifier(Super.MOD_ID))
            .displayName(Text.literal("Squashed"))
            .icon(() -> new ItemStack(AllBlocks.CYAN_DYE_BLOCK))
            .build();

}
