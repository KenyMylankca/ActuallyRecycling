package com.kenymylankca.actuallyrecycling;

import org.apache.logging.log4j.Logger;

import de.ellpeck.actuallyadditions.api.ActuallyAdditionsAPI;
import de.ellpeck.actuallyadditions.mod.items.InitItems;
import de.ellpeck.actuallyadditions.mod.util.StackUtil;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = ActuallyRecycling.MODID, name = ActuallyRecycling.NAME, version = ActuallyRecycling.VERSION)
public class ActuallyRecycling
{
    public static final String MODID = "actuallyrecycling";
    public static final String NAME = "Actually Recycling";
    public static final String VERSION = "1.0";

    private static Logger logger;

    @EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        logger = event.getModLog();
    }

    @EventHandler
    public void init(FMLInitializationEvent event)
    {
    	//ARMORS
    	ActuallyAdditionsAPI.addCrusherRecipe(new ItemStack(Items.DIAMOND_HELMET, 1), new ItemStack(InitItems.itemDust, 4, 2), StackUtil.getEmpty(), 0);
    	ActuallyAdditionsAPI.addCrusherRecipe(new ItemStack(Items.DIAMOND_CHESTPLATE, 1), new ItemStack(InitItems.itemDust, 7, 2), StackUtil.getEmpty(), 0);
    	ActuallyAdditionsAPI.addCrusherRecipe(new ItemStack(Items.DIAMOND_LEGGINGS, 1), new ItemStack(InitItems.itemDust, 6, 2), StackUtil.getEmpty(), 0);
    	ActuallyAdditionsAPI.addCrusherRecipe(new ItemStack(Items.DIAMOND_BOOTS, 1), new ItemStack(InitItems.itemDust, 3, 2), StackUtil.getEmpty(), 0);
    	
    	//WEAPONS
    	ActuallyAdditionsAPI.addCrusherRecipe(new ItemStack(Items.DIAMOND_AXE, 1), new ItemStack(InitItems.itemDust, 2, 2), StackUtil.getEmpty(), 0);
    	ActuallyAdditionsAPI.addCrusherRecipe(new ItemStack(Items.DIAMOND_HOE, 1), new ItemStack(InitItems.itemDust, 1, 2), StackUtil.getEmpty(), 0);
    	ActuallyAdditionsAPI.addCrusherRecipe(new ItemStack(Items.DIAMOND_PICKAXE, 1), new ItemStack(InitItems.itemDust, 2, 2), StackUtil.getEmpty(), 0);
    	ActuallyAdditionsAPI.addCrusherRecipe(new ItemStack(Items.DIAMOND_SHOVEL, 1), new ItemStack(InitItems.itemDust, 1, 2), StackUtil.getEmpty(), 0);
    	ActuallyAdditionsAPI.addCrusherRecipe(new ItemStack(Items.DIAMOND_SWORD, 1), new ItemStack(InitItems.itemDust, 1, 2), StackUtil.getEmpty(), 0);
    	
    	//MISC
    	ActuallyAdditionsAPI.addCrusherRecipe(new ItemStack(Blocks.ENCHANTING_TABLE, 1), new ItemStack(InitItems.itemDust, 2, 2), new ItemStack(Blocks.OBSIDIAN), 100);
    	ActuallyAdditionsAPI.addCrusherRecipe(new ItemStack(Blocks.JUKEBOX, 1), new ItemStack(InitItems.itemDust, 1, 2), StackUtil.getEmpty(), 0);
    }
}