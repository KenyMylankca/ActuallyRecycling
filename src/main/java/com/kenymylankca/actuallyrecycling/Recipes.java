package com.kenymylankca.actuallyrecycling;

import de.ellpeck.actuallyadditions.api.ActuallyAdditionsAPI;
import de.ellpeck.actuallyadditions.mod.blocks.InitBlocks;
import de.ellpeck.actuallyadditions.mod.items.InitItems;
import de.ellpeck.actuallyadditions.mod.util.StackUtil;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

public class Recipes
{
	public static void recipes()
	{
		//ARMORS
    	ActuallyAdditionsAPI.addCrusherRecipe(new ItemStack(Items.DIAMOND_HELMET, 1), new ItemStack(InitItems.itemDust, 4, 2), StackUtil.getEmpty(), 0);
    	ActuallyAdditionsAPI.addCrusherRecipe(new ItemStack(Items.DIAMOND_CHESTPLATE, 1), new ItemStack(InitItems.itemDust, 7, 2), StackUtil.getEmpty(), 0);
    	ActuallyAdditionsAPI.addCrusherRecipe(new ItemStack(Items.DIAMOND_LEGGINGS, 1), new ItemStack(InitItems.itemDust, 6, 2), StackUtil.getEmpty(), 0);
    	ActuallyAdditionsAPI.addCrusherRecipe(new ItemStack(Items.DIAMOND_BOOTS, 1), new ItemStack(InitItems.itemDust, 3, 2), StackUtil.getEmpty(), 0);
    	
    	ActuallyAdditionsAPI.addCrusherRecipe(new ItemStack(Items.GOLDEN_HELMET, 1), new ItemStack(InitItems.itemDust, 4, 1), StackUtil.getEmpty(), 0);
    	ActuallyAdditionsAPI.addCrusherRecipe(new ItemStack(Items.GOLDEN_CHESTPLATE, 1), new ItemStack(InitItems.itemDust, 7, 1), StackUtil.getEmpty(), 0);
    	ActuallyAdditionsAPI.addCrusherRecipe(new ItemStack(Items.GOLDEN_LEGGINGS, 1), new ItemStack(InitItems.itemDust, 6, 1), StackUtil.getEmpty(), 0);
    	ActuallyAdditionsAPI.addCrusherRecipe(new ItemStack(Items.GOLDEN_BOOTS, 1), new ItemStack(InitItems.itemDust, 3, 1), StackUtil.getEmpty(), 0);
    	
    	ActuallyAdditionsAPI.addCrusherRecipe(new ItemStack(InitItems.itemHelmQuartz, 1), new ItemStack(InitItems.itemDust, 4, 7), StackUtil.getEmpty(), 0);
    	ActuallyAdditionsAPI.addCrusherRecipe(new ItemStack(InitItems.itemChestQuartz, 1), new ItemStack(InitItems.itemDust, 7, 7), StackUtil.getEmpty(), 0);
    	ActuallyAdditionsAPI.addCrusherRecipe(new ItemStack(InitItems.itemPantsQuartz, 1), new ItemStack(InitItems.itemDust, 6, 7), StackUtil.getEmpty(), 0);
    	ActuallyAdditionsAPI.addCrusherRecipe(new ItemStack(InitItems.itemBootsQuartz, 1), new ItemStack(InitItems.itemDust, 3, 7), StackUtil.getEmpty(), 0);
    	
    	ActuallyAdditionsAPI.addCrusherRecipe(new ItemStack(InitItems.itemHelmEmerald, 1), new ItemStack(InitItems.itemDust, 4, 3), StackUtil.getEmpty(), 0);
    	ActuallyAdditionsAPI.addCrusherRecipe(new ItemStack(InitItems.itemChestEmerald, 1), new ItemStack(InitItems.itemDust, 7, 3), StackUtil.getEmpty(), 0);
    	ActuallyAdditionsAPI.addCrusherRecipe(new ItemStack(InitItems.itemPantsEmerald, 1), new ItemStack(InitItems.itemDust, 6, 3), StackUtil.getEmpty(), 0);
    	ActuallyAdditionsAPI.addCrusherRecipe(new ItemStack(InitItems.itemBootsEmerald, 1), new ItemStack(InitItems.itemDust, 3, 3), StackUtil.getEmpty(), 0);
    	
    	//WEAPONS
    	ActuallyAdditionsAPI.addCrusherRecipe(new ItemStack(Items.DIAMOND_AXE, 1), new ItemStack(InitItems.itemDust, 2, 2), StackUtil.getEmpty(), 0);
    	ActuallyAdditionsAPI.addCrusherRecipe(new ItemStack(Items.DIAMOND_HOE, 1), new ItemStack(InitItems.itemDust, 1, 2), StackUtil.getEmpty(), 0);
    	ActuallyAdditionsAPI.addCrusherRecipe(new ItemStack(Items.DIAMOND_PICKAXE, 1), new ItemStack(InitItems.itemDust, 2, 2), StackUtil.getEmpty(), 0);
    	ActuallyAdditionsAPI.addCrusherRecipe(new ItemStack(Items.DIAMOND_SHOVEL, 1), new ItemStack(InitItems.itemDust, 1, 2), StackUtil.getEmpty(), 0);
    	ActuallyAdditionsAPI.addCrusherRecipe(new ItemStack(Items.DIAMOND_SWORD, 1), new ItemStack(InitItems.itemDust, 1, 2), StackUtil.getEmpty(), 0);
    	
    	//BLOCKS
    	ActuallyAdditionsAPI.addCrusherRecipe(new ItemStack(Blocks.ENCHANTING_TABLE, 1), new ItemStack(InitItems.itemDust, 2, 2), new ItemStack(Blocks.OBSIDIAN), 100);
    	ActuallyAdditionsAPI.addCrusherRecipe(new ItemStack(Blocks.JUKEBOX, 1), new ItemStack(InitItems.itemDust, 1, 2), StackUtil.getEmpty(), 0);
    	
    	ActuallyAdditionsAPI.addCrusherRecipe(new ItemStack(Blocks.QUARTZ_BLOCK, 1), new ItemStack(InitItems.itemDust, 4, 5), StackUtil.getEmpty(), 0);
    	ActuallyAdditionsAPI.addCrusherRecipe(new ItemStack(Blocks.QUARTZ_BLOCK, 1, 1), new ItemStack(InitItems.itemDust, 4, 5), StackUtil.getEmpty(), 0);
    	ActuallyAdditionsAPI.addCrusherRecipe(new ItemStack(Blocks.QUARTZ_BLOCK, 1, 2), new ItemStack(InitItems.itemDust, 4, 5), StackUtil.getEmpty(), 0);
    	ActuallyAdditionsAPI.addCrusherRecipe(new ItemStack(Blocks.QUARTZ_STAIRS, 1), new ItemStack(InitItems.itemDust, 3, 5), StackUtil.getEmpty(), 0);
    	ActuallyAdditionsAPI.addCrusherRecipe(new ItemStack(Blocks.STONE_SLAB, 1, 7), new ItemStack(InitItems.itemDust, 2, 5), StackUtil.getEmpty(), 0);
    	
    	ActuallyAdditionsAPI.addCrusherRecipe(new ItemStack(InitBlocks.blockMisc, 1, 0), new ItemStack(InitItems.itemDust, 2, 7), StackUtil.getEmpty(), 0);
    	ActuallyAdditionsAPI.addCrusherRecipe(new ItemStack(InitBlocks.blockMisc, 1, 1), new ItemStack(InitItems.itemDust, 4, 7), StackUtil.getEmpty(), 0);
    	ActuallyAdditionsAPI.addCrusherRecipe(new ItemStack(InitBlocks.blockMisc, 1, 2), new ItemStack(InitItems.itemDust, 4, 7), StackUtil.getEmpty(), 0);
    	
    	ActuallyAdditionsAPI.addCrusherRecipe(new ItemStack(InitBlocks.blockQuartzWall, 1), new ItemStack(InitItems.itemDust, 2, 7), StackUtil.getEmpty(), 0);
    	ActuallyAdditionsAPI.addCrusherRecipe(new ItemStack(InitBlocks.blockChiseledQuartzWall, 1), new ItemStack(InitItems.itemDust, 2, 7), StackUtil.getEmpty(), 0);
    	ActuallyAdditionsAPI.addCrusherRecipe(new ItemStack(InitBlocks.blockPillarQuartzWall, 1), new ItemStack(InitItems.itemDust, 1, 7), StackUtil.getEmpty(), 0);
    	
    	ActuallyAdditionsAPI.addCrusherRecipe(new ItemStack(InitBlocks.blockQuartzStair, 1), new ItemStack(InitItems.itemDust, 3, 7), StackUtil.getEmpty(), 0);
    	ActuallyAdditionsAPI.addCrusherRecipe(new ItemStack(InitBlocks.blockChiseledQuartzStair, 1), new ItemStack(InitItems.itemDust, 3, 7), StackUtil.getEmpty(), 0);
    	ActuallyAdditionsAPI.addCrusherRecipe(new ItemStack(InitBlocks.blockPillarQuartzStair, 1), new ItemStack(InitItems.itemDust, 2, 7), StackUtil.getEmpty(), 0);
    	
    	ActuallyAdditionsAPI.addCrusherRecipe(new ItemStack(InitBlocks.blockQuartzSlab, 1), new ItemStack(InitItems.itemDust, 2, 7), StackUtil.getEmpty(), 0);
    	ActuallyAdditionsAPI.addCrusherRecipe(new ItemStack(InitBlocks.blockChiseledQuartzSlab, 1), new ItemStack(InitItems.itemDust, 2, 7), StackUtil.getEmpty(), 0);
    	ActuallyAdditionsAPI.addCrusherRecipe(new ItemStack(InitBlocks.blockPillarQuartzSlab, 1), new ItemStack(InitItems.itemDust, 1, 7), StackUtil.getEmpty(), 0);
	}
}