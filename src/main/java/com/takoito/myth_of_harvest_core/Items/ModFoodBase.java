package com.takoito.myth_of_harvest_core.Items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemFood;

public class ModFoodBase extends ItemFood {
    public ModFoodBase(int heal_amount,float saturation,boolean is_wolves_favorite){
        super(heal_amount,saturation,is_wolves_favorite);
        this.setCreativeTab(CreativeTabs.tabMisc);
    }
}
