package com.daniel_yc.moleculecraft.item;

import com.daniel_yc.moleculecraft.MoleculeCraft;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemModule extends Item {

	public ItemModule(){
		super();
		this.setCreativeTab(MoleculeCraft.MoleculeTab);
		this.setUnlocalizedName("Module");
	}
}
