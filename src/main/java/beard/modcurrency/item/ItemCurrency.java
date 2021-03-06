package beard.modcurrency.item;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.world.World;

/**
 * This class was created by BeardlessBrady. It is distributed as
 * part of The Currency-Mod. Source Code located on github:
 * https://github.com/BeardlessBrady/Currency-Mod
 * -
 * Copyright (C) All Rights Reserved
 * File Created 2018-02-25
 */
public class ItemCurrency extends Item{

    public ItemCurrency(){
        setRegistryName("currency");
        setUnlocalizedName(getRegistryName().toString());

    }



    @Override
    public ActionResult<ItemStack> onItemRightClick(World worldIn, EntityPlayer playerIn, EnumHand handIn) {
        ItemStack itemStack = playerIn.getHeldItem(handIn);


        if(!itemStack.hasTagCompound()){
            itemStack.setTagCompound(new NBTTagCompound());
        }

        NBTTagCompound nbtTagCompound = itemStack.getTagCompound();
        nbtTagCompound.setInteger("shape", 2);
        nbtTagCompound.setInteger("prime", 3);

        itemStack.setTagCompound(nbtTagCompound);


        return super.onItemRightClick(worldIn, playerIn, handIn);
    }
}

