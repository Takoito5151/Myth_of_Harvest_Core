package com.takoito.myth_of_harvest_core;

import net.minecraft.util.ResourceLocation;
import thaumcraft.api.research.ResearchCategories;

public class MythicResearch {
    public static void addResearch(){
        ResearchCategories.registerCategory(
                "MYTHOFHARVEST",
                new ResourceLocation("myth_of_harvest_core","textures/researches/tab_icon.png"),
                new ResourceLocation("myth_of_harvest_core","textures/researches/background.png")
        );
    }
}
