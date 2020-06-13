package com.randomturtle067.vanillaplusmod.init;

import java.util.function.Supplier;

import com.randomturtle067.vanillaplusmod.VanillaPlusMod;

import com.randomturtle067.vanillaplusmod.VanillaPlusMod.VanillaItemGroup;

import net.minecraft.item.AxeItem;
import net.minecraft.item.Food;
import net.minecraft.item.HoeItem;
import net.minecraft.item.IItemTier;
import net.minecraft.item.Item;
import net.minecraft.item.PickaxeItem;
import net.minecraft.item.ShovelItem;
import net.minecraft.item.SwordItem;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;
import net.minecraft.util.LazyValue;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;
import net.minecraftforge.registries.ObjectHolder;

@Mod.EventBusSubscriber(modid = VanillaPlusMod.MOD_ID, bus = Bus.MOD)
@ObjectHolder(VanillaPlusMod.MOD_ID)
public class iteminit 
{
	public static final Item taco = null;
	public static final Item dragonite = null;
	
	//Tools
	public static final Item dragonite_sword = null;
	public static final Item dragonite_pik = null;
	public static final Item dragonite_shovel = null;
	public static final Item dragonite_axe = null;
	public static final Item dragonite_hoe = null;
	
	@SubscribeEvent
	public static void registerItems(final RegistryEvent.Register<Item> event)
	{
		event.getRegistry().register(new Item(new Item.Properties().group(VanillaItemGroup.instance).food(new Food.Builder().hunger(15).saturation(5f).setAlwaysEdible().meat().effect(new EffectInstance(Effects.STRENGTH, 3000, 5), 0.7f).effect(new EffectInstance(Effects.ABSORPTION, 3000, 2), 1f).effect(new EffectInstance(Effects.SPEED, 3000, 4), 1f).effect(new EffectInstance(Effects.INSTANT_HEALTH, 1, 5), 1f).effect(new EffectInstance(Effects.NAUSEA, 600, 2), 0.25f).effect(new EffectInstance(Effects.MINING_FATIGUE, 1500, 3), 0.25f).effect(new EffectInstance(Effects.POISON, 1500, 2), .1f).build()).maxStackSize(1)).setRegistryName("taco"));
		event.getRegistry().register(new Item(new Item.Properties().group(VanillaItemGroup.instance).maxStackSize(64)).setRegistryName("dragonite"));
	
		//Tools
		event.getRegistry().register(new SwordItem(ModItemTier.DRAGONITE, 10, 6.0f, new Item.Properties().group(VanillaItemGroup.instance)).setRegistryName("dragonite_sword"));
		event.getRegistry().register(new PickaxeItem(ModItemTier.DRAGONITE, 4, 3.0f, new Item.Properties().group(VanillaItemGroup.instance)).setRegistryName("dragonite_pik"));
		event.getRegistry().register(new ShovelItem(ModItemTier.DRAGONITE, 5, 3.0f, new Item.Properties().group(VanillaItemGroup.instance)).setRegistryName("dragonite_shovel"));
		event.getRegistry().register(new AxeItem(ModItemTier.DRAGONITE, 7, 3.0f, new Item.Properties().group(VanillaItemGroup.instance)).setRegistryName("dragonite_axe"));
		event.getRegistry().register(new HoeItem(ModItemTier.DRAGONITE, 5.0f, new Item.Properties().group(VanillaItemGroup.instance)).setRegistryName("dragonite_hoe"));
	}
	
	public enum ModItemTier implements IItemTier
	{
		DRAGONITE(4, 5000, 25.0f, 10.0f, 275, () -> {
			return Ingredient.fromItems(iteminit.dragonite);
		});
		
		private final int harvestLevel;
		private final int maxUses;
		private final float efficiency;
		private final float attackDamage;
		private final int enchantability;
		private final LazyValue<Ingredient> repairMaterial;
		
		
		private ModItemTier(int harvestLevel, int maxUses, float efficiency, float attackDamage, int enchantability, Supplier<Ingredient> repairMaterial)
		{
			this.harvestLevel = harvestLevel;
			this.maxUses = maxUses;
			this.efficiency = efficiency;
			this.attackDamage = attackDamage;
			this.enchantability = enchantability;
			this.repairMaterial = new LazyValue<>(repairMaterial);
		}


		@Override
		public int getMaxUses() 
		{
			return this.maxUses;
		}


		@Override
		public float getEfficiency() 
		{
			return this.efficiency;
		}


		@Override
		public float getAttackDamage() 
		{
			return this.attackDamage;
		}


		@Override
		public int getHarvestLevel() 
		{
			return this.harvestLevel;
		}


		@Override
		public int getEnchantability() 
		{
			return this.enchantability;
		}


		@Override
		public Ingredient getRepairMaterial() 
		{
			return this.repairMaterial.getValue();
		}
	}
	
}
