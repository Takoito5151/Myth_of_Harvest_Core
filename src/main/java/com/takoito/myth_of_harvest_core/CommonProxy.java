package com.takoito.myth_of_harvest_core;

import com.takoito.myth_of_harvest_core.Items.ModItem;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.event.FMLServerStartingEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.Item;

public class CommonProxy {
public Item summary_nightmare;
public Item summary_withered;
public Item summary_nature;
public Item summary_ender;
public Item summary_hunger;
public Item summary_metal;
public Item summary_battle;
public Item summary_freeze;
public Item summary_buff;
    // preInit "Run before anything else. Read your config, create blocks, items, etc, and register them with the
    // GameRegistry." (Remove if not needed)
    public void preInit(FMLPreInitializationEvent event) {
        Config.synchronizeConfiguration(event.getSuggestedConfigurationFile());
        //ItemRegister
        summary_nightmare = new ModItem()
            .setUnlocalizedName("summary_nightmare")
            .setTextureName("myth_of_harvest_core:summary_nightmare");
        summary_withered = new ModItem()
            .setUnlocalizedName("summary_withered")
            .setTextureName("myth_of_harvest_core:summary_withered");
        summary_nature = new ModItem()
            .setUnlocalizedName("summary_nature")
            .setTextureName("myth_of_harvest_core:summary_nature");
        summary_ender = new ModItem()
            .setUnlocalizedName("summary_ender")
            .setTextureName("myth_of_harvest_core:summary_ender");
        summary_hunger = new ModItem()
            .setUnlocalizedName("summary_hunger")
            .setTextureName("myth_of_harvest_core:summary_hunger");
        summary_metal = new ModItem()
            .setUnlocalizedName("summary_metal")
            .setTextureName("myth_of_harvest_core:summary_metal");
        summary_battle = new ModItem()
            .setUnlocalizedName("summary_battle")
            .setTextureName("myth_of_harvest_core:summary_battle");
        summary_freeze = new ModItem()
            .setUnlocalizedName("summary_freeze")
            .setTextureName("myth_of_harvest_core:summary_freeze");
        summary_buff = new ModItem()
            .setUnlocalizedName("summary_buff")
            .setTextureName("myth_of_harvest_core:summary_buff");
        GameRegistry.registerItem(summary_nightmare,"summary_nightmare");
        GameRegistry.registerItem(summary_withered,"summary_withered");
        GameRegistry.registerItem(summary_nature,"summary_nature");
        GameRegistry.registerItem(summary_ender,"summary_ender");
        GameRegistry.registerItem(summary_hunger,"summary_hunger");
        GameRegistry.registerItem(summary_metal,"summary_metal");
        GameRegistry.registerItem(summary_battle,"summary_battle");
        GameRegistry.registerItem(summary_freeze,"summary_freeze");
        GameRegistry.registerItem(summary_buff,"summary_buff");
        Myth_of_Harvest_Core.LOG.info(Config.greeting);
        Myth_of_Harvest_Core.LOG.info("I am Myth of Harvest Core at version " + Tags.VERSION);
    }

    // load "Do your mod setup. Build whatever data structures you care about. Register recipes." (Remove if not needed)
    public void init(FMLInitializationEvent event) {}

    // postInit "Handle interaction with other mods, complete your setup based on this." (Remove if not needed)
    public void postInit(FMLPostInitializationEvent event) {}

    // register server commands in this event handler (Remove if not needed)
    public void serverStarting(FMLServerStartingEvent event) {}
}
