package com.takoito.myth_of_harvest_core;

import net.minecraft.util.ResourceLocation;
import thaumcraft.api.aspects.Aspect;

public class AdditionalAspects {
    public static Aspect FLORA;
    public static Aspect JAPONICA;
    public static Aspect ASTER;
    public static Aspect SAL;
    public static Aspect COCTIONE;
    public static Aspect MALUM;

    public static void initAspects(){
        FLORA = new Aspect(
            "flora",
            0xfeeeeede,
            new Aspect[] {Aspect.PLANT, Aspect.AURA},
            new ResourceLocation("myth_of_harvest_core","textures/aspects/flora.png"),1
        );
        /*
        JAPONICA = new Aspect(
                "JAPONICA",
                0x3399cce,
                new Aspect[] {Aspect.MAN}
        );
        */
        ASTER = new Aspect(
                "aster",
                0xcce_5ffe,
                new Aspect[] {Aspect.LIGHT,Aspect.DARKNESS},
                new ResourceLocation("myth_of_harvest_core","textures/aspects/aster.png"),1
        );
    }
}
