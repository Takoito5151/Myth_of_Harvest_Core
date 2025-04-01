package com.takoito.myth_of_harvest_core;

import net.minecraft.util.ResourceLocation;
import thaumcraft.api.aspects.Aspect;

public class AdditionalAspects {
    public static Aspect FLORA;

    public static void initAspects(){
        FLORA = new Aspect(
            "flora",
            0xfeeeeede,
            new Aspect[] {Aspect.PLANT, Aspect.AURA},
            new ResourceLocation("myth_of_harvest_core","textures/aspects/flora.png"),1
        );
    }
}
