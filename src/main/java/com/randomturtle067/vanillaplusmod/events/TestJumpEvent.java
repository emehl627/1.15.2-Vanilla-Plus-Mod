package com.randomturtle067.vanillaplusmod.events;

import com.randomturtle067.vanillaplusmod.VanillaPlusMod;

import net.minecraft.block.Blocks;
import net.minecraft.entity.LivingEntity;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;
import net.minecraft.world.World;
import net.minecraftforge.event.entity.living.LivingEvent.LivingJumpEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;

@Mod.EventBusSubscriber(modid = VanillaPlusMod.MOD_ID, bus = Bus.FORGE)
public class TestJumpEvent
{
	@SubscribeEvent
	public static void testJumpEvent(LivingJumpEvent event)
	{
		VanillaPlusMod.LOGGER.info("testJumpEvent fired");
		LivingEntity livingEntity = event.getEntityLiving();
		World world = livingEntity.getEntityWorld();
		world.setBlockState(livingEntity.getPosition().add(0, 5, 0), Blocks.ANVIL.getDefaultState());
		livingEntity.addPotionEffect(new EffectInstance(Effects.LEVITATION, 600, 255));
		livingEntity.addPotionEffect(new EffectInstance(Effects.SLOW_FALLING, 5000, 255));
		livingEntity.setGlowing(true);
		
	}
}
