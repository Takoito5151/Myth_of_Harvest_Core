package com.takoito.myth_of_harvest_core.Items;

import cpw.mods.fml.common.Loader;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class HugeLunchBoxItem extends ModFoodBase{
    ItemStack lunchbox = GameRegistry.findItemStack("SpiceOfLife","SpiceOfLife.lunchbox",1);
    public HugeLunchBoxItem(){
        super(64,64,false);
        this.setUnlocalizedName("huge_lunch_box")
            .setTextureName("myth_of_harvest_core:huge_lunch_box")
            .setMaxStackSize(1);
    }

    @Override
    public ItemStack onEaten(ItemStack stack, World world, EntityPlayer player){
        super.onEaten(stack,world,player);
        if (Loader.isModLoaded("SpiceOfLife")){
            return lunchbox;
        }
        else {
            return stack;
        }
    }
}
