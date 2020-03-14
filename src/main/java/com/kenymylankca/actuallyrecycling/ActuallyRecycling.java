package com.kenymylankca.actuallyrecycling;

import org.apache.logging.log4j.Logger;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = ActuallyRecycling.MODID, name = ActuallyRecycling.NAME, version = ActuallyRecycling.VERSION)
public class ActuallyRecycling
{
    public static final String MODID = "actuallyrecycling";
    public static final String NAME = "Actually Recycling";
    public static final String VERSION = "2.0";

    private static Logger logger;

    @EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        logger = event.getModLog();
    }

    @EventHandler
    public void init(FMLInitializationEvent event)
    {
    	Recipes.recipes();
    }
}