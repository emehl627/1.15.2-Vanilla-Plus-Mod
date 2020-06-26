package com.randomturtle067.vanillaplusmod.init;

import com.randomturtle067.vanillaplusmod.VanillaPlusMod;

import com.randomturtle067.vanillaplusmod.VanillaPlusMod.VanillaItemGroup;
import net.minecraft.block.Block;
import net.minecraft.block.ChestBlock;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;
import net.minecraftforge.registries.ObjectHolder;

@ObjectHolder(VanillaPlusMod.MOD_ID)
@Mod.EventBusSubscriber(modid = VanillaPlusMod.MOD_ID, bus = Bus.MOD)
public class Blockinit {
	public static final Block contained_lava = null;
	public static final Block dragonite_ore = null;
	public static final Block dragon_block = null;
	public static final Block fossil_ore = null;
	public static final Block dark_quartz_ore = null;
	public static final Block blast_proof_glass = null;

	@SubscribeEvent
	public static void registerBlocks(final RegistryEvent.Register<Block> event) {
		event.getRegistry()
				.register(new Block(Block.Properties.create(Material.ROCK).lightValue(15).doesNotBlockMovement()
						.hardnessAndResistance(1.0f).harvestTool(ToolType.PICKAXE).harvestLevel(2))
								.setRegistryName("contained_lava"));
		event.getRegistry().register(new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(7.5f)
				.harvestTool(ToolType.PICKAXE).harvestLevel(3).lightValue(0)).setRegistryName("dragonite_ore"));
		event.getRegistry().register(new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(15.0f)
				.harvestTool(ToolType.PICKAXE).harvestLevel(3)).setRegistryName("dragon_block"));
		event.getRegistry().register(new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(5.0f)
				.sound(SoundType.STONE).harvestLevel(1)).setRegistryName("fossil_ore"));
		event.getRegistry()
				.register(new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(3.0f, 3.0f)
						.sound(SoundType.STONE).harvestLevel(1).harvestTool(ToolType.PICKAXE))
								.setRegistryName("dark_quartz_ore"));
	}

	@SubscribeEvent
	public static void registerBlockItems(final RegistryEvent.Register<Item> event) {
		event.getRegistry().register(
				new BlockItem(contained_lava, new Item.Properties().maxStackSize(1).group(VanillaItemGroup.instance))
						.setRegistryName("contained_lava"));
		event.getRegistry().register(
				new BlockItem(dragonite_ore, new Item.Properties().maxStackSize(64).group(VanillaItemGroup.instance))
						.setRegistryName("dragonite_ore"));
		event.getRegistry().register(
				new BlockItem(dragon_block, new Item.Properties().maxStackSize(64).group(VanillaItemGroup.instance))
						.setRegistryName("dragon_block"));
		event.getRegistry().register(
				new BlockItem(fossil_ore, new Item.Properties().maxStackSize(64).group(VanillaItemGroup.instance))
						.setRegistryName("fossil_ore"));
		event.getRegistry().register(
				new BlockItem(dark_quartz_ore, new Item.Properties().maxStackSize(64).group(VanillaItemGroup.instance))
						.setRegistryName("dark_quartz_ore"));
	}

}