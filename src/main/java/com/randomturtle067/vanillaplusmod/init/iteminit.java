package com.randomturtle067.vanillaplusmod.init;

import java.util.function.Supplier;

import com.randomturtle067.vanillaplusmod.VanillaPlusMod;
import com.randomturtle067.vanillaplusmod.VanillaPlusMod.VanillaItemGroup;
import com.randomturtle067.vanillaplusmod.objects.items.DragonTotemItem;
import com.randomturtle067.vanillaplusmod.objects.items.FossilItem;

import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.AxeItem;
import net.minecraft.item.Food;
import net.minecraft.item.HoeItem;
import net.minecraft.item.IArmorMaterial;
import net.minecraft.item.IItemTier;
import net.minecraft.item.Item;
import net.minecraft.item.Item.Properties;
import net.minecraft.item.Items;
import net.minecraft.item.PickaxeItem;
import net.minecraft.item.ShovelItem;
import net.minecraft.item.SwordItem;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;
import net.minecraft.util.LazyValue;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.SoundEvents;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;
import net.minecraftforge.registries.ObjectHolder;

@Mod.EventBusSubscriber(modid = VanillaPlusMod.MOD_ID, bus = Bus.MOD)
@ObjectHolder(VanillaPlusMod.MOD_ID)
public class iteminit {
	public static final Item taco = null;
	public static final Item dragonite = null;
	public static final Item dragon_totem = null;
	public static final Item fossil = null;
	public static final Item dark_quartz = null;

	// Tools
	public static final Item dragonite_sword = null;
	public static final Item dragonite_pik = null;
	public static final Item dragonite_shovel = null;
	public static final Item dragonite_axe = null;
	public static final Item dragonite_hoe = null;
	public static final Item quartz_sword = null;
	public static final Item quartz_pik = null;
	public static final Item quartz_shovel = null;
	public static final Item quartz_axe = null;
	public static final Item quartz_hoe = null;

	// Armor
	public static final Item dragonite_helm = null;
	public static final Item dragonite_chest = null;
	public static final Item dragonite_legs = null;
	public static final Item dragonite_boots = null;
	public static final Item stone_helm = null;
	public static final Item stone_chest = null;
	public static final Item stone_legs = null;
	public static final Item stone_boots = null;
	public static final Item quartz_helm = null;
	public static final Item quartz_chest = null;
	public static final Item quartz_legs = null;
	public static final Item quartz_boots = null;

	@SuppressWarnings("deprecation")
	@SubscribeEvent
	public static void registerItems(final RegistryEvent.Register<Item> event) {
		event.getRegistry()
				.register(new Item(new Item.Properties().group(VanillaItemGroup.instance)
						.food(new Food.Builder().hunger(15).saturation(5f).setAlwaysEdible().meat()
								.effect(new EffectInstance(Effects.STRENGTH, 3000, 5), 0.7f)
								.effect(new EffectInstance(Effects.ABSORPTION, 3000, 2), 1f)
								.effect(new EffectInstance(Effects.SPEED, 3000, 4), 1f)
								.effect(new EffectInstance(Effects.INSTANT_HEALTH, 1, 5), 1f)
								.effect(new EffectInstance(Effects.NAUSEA, 600, 2), 0.25f)
								.effect(new EffectInstance(Effects.MINING_FATIGUE, 1500, 3), 0.25f)
								.effect(new EffectInstance(Effects.POISON, 1500, 2), .1f).build())
						.maxStackSize(1)).setRegistryName("taco"));
		event.getRegistry()
				.register(new DragonTotemItem(new Item.Properties().group(VanillaItemGroup.instance).maxStackSize(1))
						.setRegistryName("dragon_totem"));
		event.getRegistry().register(new Item(new Item.Properties().group(VanillaItemGroup.instance).maxStackSize(64))
				.setRegistryName("dragonite"));
		event.getRegistry()
				.register(new FossilItem(new Item.Properties().group(VanillaItemGroup.instance).maxStackSize(64))
						.setRegistryName("fossil"));
		event.getRegistry().register(new Item(new Item.Properties().group(VanillaItemGroup.instance).maxStackSize(64))
				.setRegistryName("dark_quartz"));

		// Tools
		event.getRegistry().register(
				new SwordItem(ModItemTier.DRAGONITE, 10, 6.0f, new Item.Properties().group(VanillaItemGroup.instance))
						.setRegistryName("dragonite_sword"));
		event.getRegistry().register(
				new PickaxeItem(ModItemTier.DRAGONITE, 4, 3.0f, new Item.Properties().group(VanillaItemGroup.instance))
						.setRegistryName("dragonite_pik"));
		event.getRegistry().register(
				new ShovelItem(ModItemTier.DRAGONITE, 5, 3.0f, new Item.Properties().group(VanillaItemGroup.instance))
						.setRegistryName("dragonite_shovel"));
		event.getRegistry().register(
				new AxeItem(ModItemTier.DRAGONITE, 7, 3.0f, new Item.Properties().group(VanillaItemGroup.instance))
						.setRegistryName("dragonite_axe"));
		event.getRegistry().register(
				new HoeItem(ModItemTier.DRAGONITE, 5.0f, new Item.Properties().group(VanillaItemGroup.instance))
						.setRegistryName("dragonite_hoe"));
		event.getRegistry().register(
				new SwordItem(QuartzItemTier.QUARTZ, 7, 6.0f, new Item.Properties().group(VanillaItemGroup.instance))
						.setRegistryName("quartz_sword"));
		event.getRegistry().register(
				new PickaxeItem(QuartzItemTier.QUARTZ, 2, 3.0f, new Item.Properties().group(VanillaItemGroup.instance))
						.setRegistryName("quartz_pik"));
		event.getRegistry().register(
				new ShovelItem(QuartzItemTier.QUARTZ, 2, 3.0f, new Item.Properties().group(VanillaItemGroup.instance))
						.setRegistryName("quartz_shovel"));
		event.getRegistry().register(
				new AxeItem(QuartzItemTier.QUARTZ, 2, 3.0f, new Item.Properties().group(VanillaItemGroup.instance))
						.setRegistryName("quartz_axe"));
		event.getRegistry().register(
				new HoeItem(QuartzItemTier.QUARTZ, 3.0f, new Item.Properties().group(VanillaItemGroup.instance))
						.setRegistryName("quartz_hoe"));

		// Armor
		event.getRegistry().register(new ArmorItem(DragoniteArmorMaterial.DRAGONITE, EquipmentSlotType.HEAD,
				new Item.Properties().group(VanillaItemGroup.instance)).setRegistryName("dragonite_helm"));
		event.getRegistry().register(new ArmorItem(DragoniteArmorMaterial.DRAGONITE, EquipmentSlotType.CHEST,
				new Item.Properties().group(VanillaItemGroup.instance)).setRegistryName("dragonite_chest"));
		event.getRegistry().register(new ArmorItem(DragoniteArmorMaterial.DRAGONITE, EquipmentSlotType.LEGS,
				new Item.Properties().group(VanillaItemGroup.instance)).setRegistryName("dragonite_legs"));
		event.getRegistry().register(new ArmorItem(DragoniteArmorMaterial.DRAGONITE, EquipmentSlotType.FEET,
				new Item.Properties().group(VanillaItemGroup.instance)).setRegistryName("dragonite_boots"));
		event.getRegistry().register(new ArmorItem(StoneArmorMaterial.STONE, EquipmentSlotType.HEAD,
				new Item.Properties().group(VanillaItemGroup.instance)).setRegistryName("stone_helm"));
		event.getRegistry().register(new ArmorItem(StoneArmorMaterial.STONE, EquipmentSlotType.CHEST,
				new Item.Properties().group(VanillaItemGroup.instance)).setRegistryName("stone_chest"));
		event.getRegistry().register(new ArmorItem(StoneArmorMaterial.STONE, EquipmentSlotType.LEGS,
				new Item.Properties().group(VanillaItemGroup.instance)).setRegistryName("stone_legs"));
		event.getRegistry().register(new ArmorItem(StoneArmorMaterial.STONE, EquipmentSlotType.FEET,
				new Item.Properties().group(VanillaItemGroup.instance)).setRegistryName("stone_boots"));
		event.getRegistry().register(new ArmorItem(QuartzArmorMaterial.QUARTZ, EquipmentSlotType.HEAD,
				new Item.Properties().group(VanillaItemGroup.instance)).setRegistryName("quartz_helm"));
		event.getRegistry().register(new ArmorItem(QuartzArmorMaterial.QUARTZ, EquipmentSlotType.CHEST,
				new Item.Properties().group(VanillaItemGroup.instance)).setRegistryName("quartz_chest"));
		event.getRegistry().register(new ArmorItem(QuartzArmorMaterial.QUARTZ, EquipmentSlotType.LEGS,
				new Item.Properties().group(VanillaItemGroup.instance)).setRegistryName("quartz_legs"));
		event.getRegistry().register(new ArmorItem(QuartzArmorMaterial.QUARTZ, EquipmentSlotType.FEET,
				new Item.Properties().group(VanillaItemGroup.instance)).setRegistryName("quartz_boots"));

	}

	public enum ModItemTier implements IItemTier {
		DRAGONITE(4, 5000, 30.0f, 10.0f, 275, () -> {
			return Ingredient.fromItems(iteminit.dragonite);
		});

		private final int harvestLevel;
		private final int maxUses;
		private final float efficiency;
		private final float attackDamage;
		private final int enchantability;
		private final LazyValue<Ingredient> repairMaterial;

		private ModItemTier(int harvestLevel, int maxUses, float efficiency, float attackDamage, int enchantability,
				Supplier<Ingredient> repairMaterial) {
			this.harvestLevel = harvestLevel;
			this.maxUses = maxUses;
			this.efficiency = efficiency;
			this.attackDamage = attackDamage;
			this.enchantability = enchantability;
			this.repairMaterial = new LazyValue<>(repairMaterial);
		}

		@Override
		public int getMaxUses() {
			return this.maxUses;
		}

		@Override
		public float getEfficiency() {
			return this.efficiency;
		}

		@Override
		public float getAttackDamage() {
			return this.attackDamage;
		}

		@Override
		public int getHarvestLevel() {
			return this.harvestLevel;
		}

		@Override
		public int getEnchantability() {
			return this.enchantability;
		}

		@Override
		public Ingredient getRepairMaterial() {
			return this.repairMaterial.getValue();
		}
	}

	// Be Careful Here
	// It Can Crash
	public enum DragoniteArmorMaterial implements IArmorMaterial {
		DRAGONITE(VanillaPlusMod.MOD_ID + ":dragonite", 2, new int[] { 50, 60, 65, 55 }, 450,
				SoundEvents.field_226142_fM_, 12.0f, () ->

				{
					return Ingredient.fromItems(iteminit.dragonite);
				});

		private static final int[] MAX_DAMAGE_ARRAY = new int[] { 2500, 2500, 2500, 2500 };
		private final String name;
		private final int maxDamageFactor;
		private final int[] damageReductionAmmountArray;
		private final int enchantability;
		private final SoundEvent soundEvent;
		private final float toughness;
		private final LazyValue<Ingredient> repairMaterial;

		private DragoniteArmorMaterial(String nameIn, int maxDamageFactorIn, int[] damageReductionAmmountIn,
				int enchantabilityIn, SoundEvent soundEventIn, float toughnessIn,
				Supplier<Ingredient> repairMaterialIn) {
			this.name = nameIn;
			this.maxDamageFactor = maxDamageFactorIn;
			this.damageReductionAmmountArray = damageReductionAmmountIn;
			this.enchantability = enchantabilityIn;
			this.soundEvent = soundEventIn;
			this.toughness = toughnessIn;
			this.repairMaterial = new LazyValue<>(repairMaterialIn);
		}

		@Override
		public int getDurability(EquipmentSlotType slotIn) {
			return MAX_DAMAGE_ARRAY[slotIn.getIndex()] * this.maxDamageFactor;
		}

		@Override
		public int getDamageReductionAmount(EquipmentSlotType slotIn) {
			return this.damageReductionAmmountArray[slotIn.getIndex()];
		}

		@Override
		public int getEnchantability() {
			return this.enchantability;
		}

		@Override
		public SoundEvent getSoundEvent() {
			return this.soundEvent;
		}

		@Override
		public Ingredient getRepairMaterial() {
			return this.repairMaterial.getValue();
		}

		@Override
		public String getName() {
			return this.name;
		}

		@OnlyIn(Dist.CLIENT)
		public float getToughness() {
			return this.toughness;
		}
	}

	public enum StoneArmorMaterial implements IArmorMaterial {
		STONE(VanillaPlusMod.MOD_ID + ":stone", 1, new int[] { 1, 4, 5, 2 }, 5, SoundEvents.field_226142_fM_, 1.0f,
				() ->

				{
					return Ingredient.fromItems(Items.STONE);
				});

		private static final int[] MAX_DAMAGE_ARRAY = new int[] { 165, 165, 165, 165 };
		private final String name;
		private final int maxDamageFactor;
		private final int[] damageReductionAmmountArray;
		private final int enchantability;
		private final SoundEvent soundEvent;
		private final float toughness;
		private final LazyValue<Ingredient> repairMaterial;

		private StoneArmorMaterial(String nameIn, int maxDamageFactorIn, int[] damageReductionAmmountIn,
				int enchantabilityIn, SoundEvent soundEventIn, float toughnessIn,
				Supplier<Ingredient> repairMaterialIn) {
			this.name = nameIn;
			this.maxDamageFactor = maxDamageFactorIn;
			this.damageReductionAmmountArray = damageReductionAmmountIn;
			this.enchantability = enchantabilityIn;
			this.soundEvent = soundEventIn;
			this.toughness = toughnessIn;
			this.repairMaterial = new LazyValue<>(repairMaterialIn);
		}

		@Override
		public int getDurability(EquipmentSlotType slotIn) {
			return MAX_DAMAGE_ARRAY[slotIn.getIndex()] * this.maxDamageFactor;
		}

		@Override
		public int getDamageReductionAmount(EquipmentSlotType slotIn) {
			return this.damageReductionAmmountArray[slotIn.getIndex()];
		}

		@Override
		public int getEnchantability() {
			return this.enchantability;
		}

		@Override
		public SoundEvent getSoundEvent() {
			return this.soundEvent;
		}

		@Override
		public Ingredient getRepairMaterial() {
			return this.repairMaterial.getValue();
		}

		@Override
		public String getName() {
			return this.name;
		}

		@OnlyIn(Dist.CLIENT)
		public float getToughness() {
			return this.toughness;
		}
	}

	public enum QuartzItemTier implements IItemTier {
		QUARTZ(1, 250, 15.0f, 6.5f, 1000, () -> {
			return Ingredient.fromItems(Items.QUARTZ);
		});

		private final int harvestLevel;
		private final int maxUses;
		private final float efficiency;
		private final float attackDamage;
		private final int enchantability;
		private final LazyValue<Ingredient> repairMaterial;

		private QuartzItemTier(int harvestLevel, int maxUses, float efficiency, float attackDamage, int enchantability,
				Supplier<Ingredient> repairMaterial) {
			this.harvestLevel = harvestLevel;
			this.maxUses = maxUses;
			this.efficiency = efficiency;
			this.attackDamage = attackDamage;
			this.enchantability = enchantability;
			this.repairMaterial = new LazyValue<>(repairMaterial);
		}

		@Override
		public int getMaxUses() {
			return this.maxUses;
		}

		@Override
		public float getEfficiency() {
			return this.efficiency;
		}

		@Override
		public float getAttackDamage() {
			return this.attackDamage;
		}

		@Override
		public int getHarvestLevel() {
			return this.harvestLevel;
		}

		@Override
		public int getEnchantability() {
			return this.enchantability;
		}

		@Override
		public Ingredient getRepairMaterial() {
			return this.repairMaterial.getValue();
		}
	}

	public enum QuartzArmorMaterial implements IArmorMaterial {
		QUARTZ(VanillaPlusMod.MOD_ID + ":quartz", 1, new int[] { 2, 5, 6, 2 }, 5, SoundEvents.field_226142_fM_, 1.0f,
				() ->

				{
					return Ingredient.fromItems(Items.QUARTZ);
				});

		private static final int[] MAX_DAMAGE_ARRAY = new int[] { 165, 165, 165, 165 };
		private final String name;
		private final int maxDamageFactor;
		private final int[] damageReductionAmmountArray;
		private final int enchantability;
		private final SoundEvent soundEvent;
		private final float toughness;
		private final LazyValue<Ingredient> repairMaterial;

		private QuartzArmorMaterial(String nameIn, int maxDamageFactorIn, int[] damageReductionAmmountIn,
				int enchantabilityIn, SoundEvent soundEventIn, float toughnessIn,
				Supplier<Ingredient> repairMaterialIn) {
			this.name = nameIn;
			this.maxDamageFactor = maxDamageFactorIn;
			this.damageReductionAmmountArray = damageReductionAmmountIn;
			this.enchantability = enchantabilityIn;
			this.soundEvent = soundEventIn;
			this.toughness = toughnessIn;
			this.repairMaterial = new LazyValue<>(repairMaterialIn);
		}

		@Override
		public int getDurability(EquipmentSlotType slotIn) {
			return MAX_DAMAGE_ARRAY[slotIn.getIndex()] * this.maxDamageFactor;
		}

		@Override
		public int getDamageReductionAmount(EquipmentSlotType slotIn) {
			return this.damageReductionAmmountArray[slotIn.getIndex()];
		}

		@Override
		public int getEnchantability() {
			return this.enchantability;
		}

		@Override
		public SoundEvent getSoundEvent() {
			return this.soundEvent;
		}

		@Override
		public Ingredient getRepairMaterial() {
			return this.repairMaterial.getValue();
		}

		@Override
		public String getName() {
			return this.name;
		}

		@OnlyIn(Dist.CLIENT)
		public float getToughness() {
			return this.toughness;
		}
	}
}
