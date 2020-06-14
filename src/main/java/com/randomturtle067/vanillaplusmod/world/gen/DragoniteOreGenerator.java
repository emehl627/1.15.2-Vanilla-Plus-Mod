package com.randomturtle067.vanillaplusmod.world.gen;

import com.randomturtle067.vanillaplusmod.init.Blockinit;

import net.minecraft.block.Blocks;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.Biomes;
import net.minecraft.world.gen.GenerationStage;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.ReplaceBlockConfig;
import net.minecraft.world.gen.placement.CountRangeConfig;
import net.minecraft.world.gen.placement.Placement;
import net.minecraftforge.registries.ForgeRegistries;

public class DragoniteOreGenerator {
	public static void generateOre() 
	{
		for (Biome biome : ForgeRegistries.BIOMES) 
		{
			//The End
			if (biome == Biomes.THE_END) 
			{
				biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.EMERALD_ORE.withConfiguration(
						new ReplaceBlockConfig(Blocks.END_STONE.getDefaultState(),Blockinit.dragonite_ore.getDefaultState())).withPlacement(Placement.COUNT_RANGE.configure(
						new CountRangeConfig(75, 5, 5, 70))));
			}
			
			//End Barrens
			if (biome == Biomes.END_BARRENS) 
			{
				biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.EMERALD_ORE.withConfiguration(
						new ReplaceBlockConfig(Blocks.END_STONE.getDefaultState(),Blockinit.dragonite_ore.getDefaultState())).withPlacement(Placement.COUNT_RANGE.configure(
						new CountRangeConfig(75, 5, 5, 70))));
			}
			
			//End Highlands
			if (biome == Biomes.END_HIGHLANDS) 
			{
				biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.EMERALD_ORE.withConfiguration(
						new ReplaceBlockConfig(Blocks.END_STONE.getDefaultState(),Blockinit.dragonite_ore.getDefaultState())).withPlacement(Placement.COUNT_RANGE.configure(
						new CountRangeConfig(75, 5, 5, 70))));
			}
			
			//End Midlands
			if (biome == Biomes.END_MIDLANDS) 
			{
				biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.EMERALD_ORE.withConfiguration(
						new ReplaceBlockConfig(Blocks.END_STONE.getDefaultState(),Blockinit.dragonite_ore.getDefaultState())).withPlacement(Placement.COUNT_RANGE.configure(
						new CountRangeConfig(75, 5, 5, 70))));
			}
			
			//Small End Islands
			if (biome == Biomes.SMALL_END_ISLANDS) 
			{
				biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.EMERALD_ORE.withConfiguration(
						new ReplaceBlockConfig(Blocks.END_STONE.getDefaultState(),Blockinit.dragonite_ore.getDefaultState())).withPlacement(Placement.COUNT_RANGE.configure(
						new CountRangeConfig(200, 5, 5, 70))));
			}
		}
	}
}