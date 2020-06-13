package com.randomturtle067.vanillaplusmod.objects.items;

import java.util.List;

import com.randomturtle067.vanillaplusmod.util.helpers.KeyboardHelper;

import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.world.World;

public class DragonTotemItem extends Item
{

	public DragonTotemItem(Properties properties) 
	{
		super(properties);
	}
	
	@Override
	public boolean hasEffect(ItemStack stack) 
	{
		return true;
	}
	
	@Override
	public void addInformation(ItemStack stack, World worldIn, List<ITextComponent> tooltip, ITooltipFlag flagIn) 
	{
		tooltip.add(new StringTextComponent("RIGHT CLICK WITH THIS TO START FLYING"));
		super.addInformation(stack, worldIn, tooltip, flagIn);
	}
	
	@Override
	public ActionResult<ItemStack> onItemRightClick(World worldIn, PlayerEntity playerIn, Hand handIn) 
	{
		playerIn.addPotionEffect(new EffectInstance(Effects.LEVITATION, 5, 15));
		playerIn.addPotionEffect(new EffectInstance(Effects.SLOW_FALLING, 5, 20));
		playerIn.addPotionEffect(new EffectInstance(Effects.SPEED, 5, 1));
		return super.onItemRightClick(worldIn, playerIn, handIn);
	}

}
