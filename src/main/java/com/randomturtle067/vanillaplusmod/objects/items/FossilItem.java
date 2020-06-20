package com.randomturtle067.vanillaplusmod.objects.items;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class FossilItem extends Item
{

	public FossilItem(Properties properties) 
	{
		super(properties);
	}
	
	@Override
	public int getBurnTime(ItemStack itemStack)
	{
		return 1200;
	}

}
