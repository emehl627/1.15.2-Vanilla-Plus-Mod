package com.randomturtle067.vanillaplusmod;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.randomturtle067.vanillaplusmod.init.iteminit;
import com.randomturtle067.vanillaplusmod.world.gen.DarkQuartzOreGenerator;
import com.randomturtle067.vanillaplusmod.world.gen.DragoniteOreGenerator;
import com.randomturtle067.vanillaplusmod.world.gen.FossilOreGenerator;

import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLLoadCompleteEvent;
import net.minecraftforge.fml.event.server.FMLServerStartingEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;


@Mod("vanillaplusmod")
@Mod.EventBusSubscriber(modid = VanillaPlusMod.MOD_ID, bus = Bus.MOD)
public class VanillaPlusMod
{
    // Directly reference a log4j logger.
    public static final Logger LOGGER = LogManager.getLogger();
    public static final String MOD_ID = "vanillaplusmod";
    public static VanillaPlusMod instance;
    
    public VanillaPlusMod() 
    {
    	final IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
        modEventBus.addListener(this::setup);
        modEventBus.addListener(this::doClientStuff);
        instance = this;
       
        MinecraftForge.EVENT_BUS.register(this);
    }

    private void setup(final FMLCommonSetupEvent event)
    {

    }

    private void doClientStuff(final FMLClientSetupEvent event) 
    {
 
    }

    @SubscribeEvent
    public void onServerStarting(FMLServerStartingEvent event) 
    {
        // do something when the server starts
    }
    
    @SubscribeEvent
    public static void loadCompleteEvent(FMLLoadCompleteEvent event)
    {
    	DragoniteOreGenerator.generateOre();
    }
    
    @SubscribeEvent
    public static void loadCompleteEvent1(FMLLoadCompleteEvent event)
    {
    	FossilOreGenerator.generateOre();
    }
    
    @SubscribeEvent
    public static void loadCompleteEvent2(FMLLoadCompleteEvent event)
    {
    	DarkQuartzOreGenerator.generateOre();
    }
    

	public static Logger getLogger() {
		return LOGGER;
	}
	 
	public static class VanillaItemGroup extends ItemGroup
	{
		public static final VanillaItemGroup instance = new VanillaItemGroup(ItemGroup.GROUPS.length,"VanillaPlusMod");
		private VanillaItemGroup(int index, String label) 
		{
			super(index,label);
		}
		
		@Override
		public ItemStack createIcon()
		{
			//Change This
			return new ItemStack(iteminit.logo);
		}
	}
} 
