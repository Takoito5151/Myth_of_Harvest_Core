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
public Item summary_blade;
public Item summary_metal;
public Item summary_skinned;
public Item summary_freeze;
    // preInit "Run before anything else. Read your config, create blocks, items, etc, and register them with the
    // GameRegistry." (Remove if not needed)
    public void preInit(FMLPreInitializationEvent event) {
        Config.synchronizeConfiguration(event.getSuggestedConfigurationFile());
        //ItemRegister
        summary_nightmare = new ModItem()
            .setUnlocalizedName("summary_nightmare")
            .setTextureName("summary_nightmare");
        summary_withered = new ModItem()
            .setUnlocalizedName("summary_withered")
            .setTextureName("summary_withered");
        summary_nature = new ModItem()
            .setUnlocalizedName("summary_nature")
            .setTextureName("summary_nature");
        summary_ender = new ModItem()
            .setUnlocalizedName("summary_ender")
            .setTextureName("summary_ender");
        summary_blade = new ModItem()
            .setUnlocalizedName("summary_blade")
            .setTextureName("summary_blade");
        summary_metal = new ModItem()
            .setUnlocalizedName("summary_metal")
            .setTextureName("summary_metal");
        summary_skinned = new ModItem()
            .setUnlocalizedName("summary_skinned")
            .setTextureName("summary_skinned");
        summary_freeze = new ModItem()
            .setUnlocalizedName("summary_freeze")
            .setTextureName("summary_freeze");
        GameRegistry.registerItem(summary_nightmare,"summary_nightmare");
        GameRegistry.registerItem(summary_withered,"summary_withered");
        GameRegistry.registerItem(summary_nature,"summary_nature");
        GameRegistry.registerItem(summary_ender,"summary_ender");
        GameRegistry.registerItem(summary_blade,"summary_blade");
        GameRegistry.registerItem(summary_metal,"summary_metal");
        GameRegistry.registerItem(summary_skinned,"summary_skinned");
        GameRegistry.registerItem(summary_freeze,"summary_freeze");
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
