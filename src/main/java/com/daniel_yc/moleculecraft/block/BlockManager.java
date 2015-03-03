package com.daniel_yc.moleculecraft.block;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class BlockManager {

	public static Block TestBlock;
	public static Block TimeMachine;
	
	
	public static void DefineBlocks(){
		
		TestBlock = new TestBlock(Material.rock);
		TimeMachine = new TimeMachine(Material.rock);
		
		
	}
	
	public static void RegisterBlocks(){
		
		GameRegistry.registerBlock(TestBlock, "TestBlock");
		GameRegistry.registerBlock(TimeMachine, "TimeMachine");
		
		
		
		
	}
	
	
	
}
