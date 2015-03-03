package com.daniel_yc.moleculecraft.block;

import com.daniel_yc.moleculecraft.MoleculeCraft;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.BlockPos;
import net.minecraft.util.EnumFacing;
import net.minecraft.world.World;

public class TimeMachine extends Block {
	

	protected TimeMachine(Material materialIn) {
		super(materialIn);
		this.setCreativeTab(MoleculeCraft.MoleculeTab);
		this.setUnlocalizedName("TimeMachine");
	}
	
	public boolean onBlockActivated(World worldIn, BlockPos pos, IBlockState state, EntityPlayer playerIn, EnumFacing side, float hitX, float hitY, float hitZ)
    {
		if(worldIn.provider.isDaytime()){
		worldIn.setWorldTime(18000);
		}else{
			worldIn.setWorldTime(1000);
		}
        return false;
    }

}
