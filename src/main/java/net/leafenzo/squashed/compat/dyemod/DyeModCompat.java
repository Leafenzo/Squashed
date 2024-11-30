package net.leafenzo.squashed.compat.dyemod;

import net.fabricmc.api.*;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.leafenzo.squashed.compat.*;
import net.minecraft.block.Block;
import net.minecraft.block.MapColor;
import net.minecraft.sound.BlockSoundGroup;

import static net.leafenzo.squashed.block.ModBlocks.createDyeBlock;
import static net.leafenzo.squashed.block.ModBlocks.registerBlock;


public class DyeModCompat extends SquashedIntegrationPacks.ModIntegrationPack {


    public static Block ACORN_DYE_BLOCK;
    public static Block AMBER_DYE_BLOCK;
    public static Block ARTICHOKE_DYE_BLOCK;
    public static Block BANANA_DYE_BLOCK;
    public static Block CERULEAN_DYE_BLOCK;
    public static Block FUCHSIA_DYE_BLOCK;
    public static Block GRAPE_DYE_BLOCK;
    public static Block INDIGO_DYE_BLOCK;
    public static Block MAROON_DYE_BLOCK;
    public static Block MAUVE_DYE_BLOCK;
    public static Block MINT_DYE_BLOCK;
    public static Block MOLD_DYE_BLOCK;
    public static Block NAVY_DYE_BLOCK;
    public static Block PEACH_DYE_BLOCK;
    public static Block PERIWINKLE_DYE_BLOCK;
    public static Block SAGE_DYE_BLOCK;
    public static Block SAP_DYE_BLOCK;
    public static Block SHAMROCK_DYE_BLOCK;
    public static Block VELVET_DYE_BLOCK;
    public static Block VERMILION_DYE_BLOCK;

    @Override
    public void register() {
        ACORN_DYE_BLOCK = registerBlock("acorn_dye_block", createDyeBlock(FabricBlockSettings.create().mapColor(MapColor.BLACK).strength(0.3f).sounds(BlockSoundGroup.FROGSPAWN)));
        AMBER_DYE_BLOCK = registerBlock("amber_dye_block", createDyeBlock(FabricBlockSettings.create().mapColor(MapColor.BLACK).strength(0.3f).sounds(BlockSoundGroup.FROGSPAWN)));
        ARTICHOKE_DYE_BLOCK = registerBlock("artichoke_dye_block", createDyeBlock(FabricBlockSettings.create().mapColor(MapColor.BLACK).strength(0.3f).sounds(BlockSoundGroup.FROGSPAWN)));
        BANANA_DYE_BLOCK = registerBlock("banana_dye_block", createDyeBlock(FabricBlockSettings.create().mapColor(MapColor.BLACK).strength(0.3f).sounds(BlockSoundGroup.FROGSPAWN)));
        CERULEAN_DYE_BLOCK = registerBlock("cerulean_dye_block", createDyeBlock(FabricBlockSettings.create().mapColor(MapColor.BLACK).strength(0.3f).sounds(BlockSoundGroup.FROGSPAWN)));
        FUCHSIA_DYE_BLOCK = registerBlock("fuchsia_dye_block", createDyeBlock(FabricBlockSettings.create().mapColor(MapColor.BLACK).strength(0.3f).sounds(BlockSoundGroup.FROGSPAWN)));
        GRAPE_DYE_BLOCK = registerBlock("grape_dye_block", createDyeBlock(FabricBlockSettings.create().mapColor(MapColor.BLACK).strength(0.3f).sounds(BlockSoundGroup.FROGSPAWN)));
        INDIGO_DYE_BLOCK = registerBlock("indigo_dye_block", createDyeBlock(FabricBlockSettings.create().mapColor(MapColor.BLACK).strength(0.3f).sounds(BlockSoundGroup.FROGSPAWN)));
        MAROON_DYE_BLOCK = registerBlock("maroon_dye_block", createDyeBlock(FabricBlockSettings.create().mapColor(MapColor.BLACK).strength(0.3f).sounds(BlockSoundGroup.FROGSPAWN)));
        MAUVE_DYE_BLOCK = registerBlock("mauve_dye_block", createDyeBlock(FabricBlockSettings.create().mapColor(MapColor.BLACK).strength(0.3f).sounds(BlockSoundGroup.FROGSPAWN)));
        MINT_DYE_BLOCK = registerBlock("mint_dye_block", createDyeBlock(FabricBlockSettings.create().mapColor(MapColor.BLACK).strength(0.3f).sounds(BlockSoundGroup.FROGSPAWN)));
        MOLD_DYE_BLOCK = registerBlock("mold_dye_block", createDyeBlock(FabricBlockSettings.create().mapColor(MapColor.BLACK).strength(0.3f).sounds(BlockSoundGroup.FROGSPAWN)));
        NAVY_DYE_BLOCK = registerBlock("navy_dye_block", createDyeBlock(FabricBlockSettings.create().mapColor(MapColor.BLACK).strength(0.3f).sounds(BlockSoundGroup.FROGSPAWN)));
        PEACH_DYE_BLOCK = registerBlock("peach_dye_block", createDyeBlock(FabricBlockSettings.create().mapColor(MapColor.BLACK).strength(0.3f).sounds(BlockSoundGroup.FROGSPAWN)));
        PERIWINKLE_DYE_BLOCK = registerBlock("periwinkle_dye_block", createDyeBlock(FabricBlockSettings.create().mapColor(MapColor.BLACK).strength(0.3f).sounds(BlockSoundGroup.FROGSPAWN)));
        SAGE_DYE_BLOCK = registerBlock("sage_dye_block", createDyeBlock(FabricBlockSettings.create().mapColor(MapColor.BLACK).strength(0.3f).sounds(BlockSoundGroup.FROGSPAWN)));
        SAP_DYE_BLOCK = registerBlock("sap_dye_block", createDyeBlock(FabricBlockSettings.create().mapColor(MapColor.BLACK).strength(0.3f).sounds(BlockSoundGroup.FROGSPAWN)));
        SHAMROCK_DYE_BLOCK = registerBlock("shamrock_dye_block", createDyeBlock(FabricBlockSettings.create().mapColor(MapColor.BLACK).strength(0.3f).sounds(BlockSoundGroup.FROGSPAWN)));
        VELVET_DYE_BLOCK = registerBlock("velvet_dye_block", createDyeBlock(FabricBlockSettings.create().mapColor(MapColor.BLACK).strength(0.3f).sounds(BlockSoundGroup.FROGSPAWN)));
        VERMILION_DYE_BLOCK = registerBlock("vermilion_dye_block", createDyeBlock(FabricBlockSettings.create().mapColor(MapColor.BLACK).strength(0.3f).sounds(BlockSoundGroup.FROGSPAWN)));

    }

    @Environment(EnvType.CLIENT)
    @Override
    public void registerClient() {

    }
}
