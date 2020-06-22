package com.randomturtle067.vanillaplusmod.events;




import com.randomturtle067.vanillaplusmod.VanillaPlusMod;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;
import net.minecraftforge.event.entity.player.PlayerEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;

@Mod.EventBusSubscriber(modid = VanillaPlusMod.MOD_ID, bus = Bus.FORGE)
public class SneakInvisEvent 
{
	@SubscribeEvent
	public static void testJumpEvent(PlayerEvent event)
	{
		PlayerEntity Player = event.getPlayer();
		if (Player.isSneaking())
		{
			Player.addPotionEffect(new EffectInstance(new EffectInstance(Effects.INVISIBILITY, 50, 255)));
		}else if (Player.isInvisible())
		{
			Player.removePotionEffect(Effects.INVISIBILITY);
		}
	}
}
