package com.daniel_yc.moleculecraft;

import net.minecraftforge.fml.common.FMLCommonHandler;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

import com.daniel_yc.moleculecraft.handler.ConfigurationHandler;
import com.daniel_yc.moleculecraft.item.ItemManager;
import com.daniel_yc.moleculecraft.proxy.ServerProxy;
import com.daniel_yc.moleculecraft.reference.Reference;
import com.daniel_yc.moleculecraft.texture.TextureManager;
import com.daniel_yc.moleculecraft.utility.Loghelper.LogHelper;

@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.VERSION)
public class MoleculeCraft {
	
	@Instance(Reference.MOD_ID)
	public static MoleculeCraft instance;

	@SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.SERVER_PROXY_CLASS)
	public static ServerProxy proxy;
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent event){
		ConfigurationHandler.init(event.getSuggestedConfigurationFile());
		FMLCommonHandler.instance().bus().register(new ConfigurationHandler());
		
		LogHelper.info("MoleculeCraft Pre Initialization Complete");
		
		
	}
	
	@EventHandler
	public void Init(FMLInitializationEvent event){
		ItemManager.DefineItems();
		ItemManager.RegisterItems();
		TextureManager.registerItemTextures();
		TextureManager.registerBlockTextures();
		
		
		LogHelper.info("MoleculeCraft Initialization Complete");
	}
	
	@EventHandler
	public void postInit(FMLPostInitializationEvent event){
		
		
		LogHelper.info("MoleculeCraft Post Initialization Complete");
	}

}
