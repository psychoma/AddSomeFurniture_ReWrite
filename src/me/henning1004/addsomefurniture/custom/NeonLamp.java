package me.henning1004.addsomefurniture.custom;

import me.henning1004.addsomefurniture.Main;
import me.henning1004.addsomefurniture.design.NeonLampDesign;
import me.henning1004.addsomefurniture.register.RegisterTextures;

import org.getspout.spoutapi.block.design.GenericCubeBlockDesign;
import org.getspout.spoutapi.material.block.GenericCubeCustomBlock;

public class NeonLamp extends GenericCubeCustomBlock {
	@SuppressWarnings("unused")
	private Main plugin;
	
	public NeonLamp(Main plugin,String name, int[] textureids) {
		super(plugin, name, false, new GenericCubeBlockDesign(plugin, RegisterTextures.texOther, textureids));
		this.setBlockDesign(new NeonLampDesign(plugin, textureids));
		this.setHardness(4F);
		this.plugin = plugin;
	}
}









