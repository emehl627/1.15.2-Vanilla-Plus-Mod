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

public class DarkQuartzOreGenerator {
	public static void generateOre() 
	{
		for (Biome biome : ForgeRegistries.BIOMES) 
		{
				if (biome == Biomes.NETHER) 
				{
					biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.withConfiguration(
							new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NETHERRACK, Blockinit.dark_quartz_ore.getDefaultState(), 12)).withPlacement(Placement.COUNT_RANGE.configure(
							new CountRangeConfig(20, 5, 5, 254))));
				}
				
		}
	}
}