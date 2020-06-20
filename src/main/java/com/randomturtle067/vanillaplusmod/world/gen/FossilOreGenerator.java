package com.randomturtle067.vanillaplusmod.world.gen;

import com.randomturtle067.vanillaplusmod.init.Blockinit;

import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.Biomes;
import net.minecraft.world.gen.GenerationStage;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.OreFeatureConfig;
import net.minecraft.world.gen.placement.CountRangeConfig;
import net.minecraft.world.gen.placement.Placement;
import net.minecraftforge.registries.ForgeRegistries;

public class FossilOreGenerator {
	public static void generateOre() 
	{
		for (Biome biome : ForgeRegistries.BIOMES) 
		{
				biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.withConfiguration(
						new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE, Blockinit.fossil_ore.getDefaultState(), 10)).withPlacement(Placement.COUNT_RANGE.configure(
						new CountRangeConfig(10, 5, 5, 30))));
				
				if (biome == Biomes.DESERT) 
				{
					biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.withConfiguration(
							new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE, Blockinit.fossil_ore.getDefaultState(), 10)).withPlacement(Placement.COUNT_RANGE.configure(
							new CountRangeConfig(15, 5, 5, 30))));
				}
				
		}
	}
}