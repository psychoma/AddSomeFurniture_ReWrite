package me.henning1004.addsomefurniture.design;



import me.henning1004.addsomefurniture.Main;
import me.henning1004.addsomefurniture.register.RegisterTextures;

import org.getspout.spoutapi.block.design.GenericBlockDesign;
import org.getspout.spoutapi.block.design.Quad;
import org.getspout.spoutapi.block.design.SubTexture;

public class PsychoChairDesign extends GenericBlockDesign
{
	public PsychoChairDesign(Main plugin, int[] textureids){
		
		texture = RegisterTextures.texChair;
		setBoundingBox(0,0,0,1.0F,0.5F,1.0F).setQuadNumber(27);
		setTexture(plugin, texture.getTexture()).setMinBrightness(1F).setMaxBrightness(1F);
		SubTexture subTex0 = texture.getSubTexture(textureids[0]);
		SubTexture subTex1 = texture.getSubTexture(textureids[1]);
		SubTexture subTex2 = texture.getSubTexture(textureids[2]);
		SubTexture subTex3 = texture.getSubTexture(textureids[3]);
		SubTexture subTex4 = texture.getSubTexture(textureids[4]);
		SubTexture subTex5 = texture.getSubTexture(textureids[5]);
		
			Quad topB = new Quad(0, subTex1);
			topB.addVertex(3, 0.0F, 0.5F, 0.0F);
			topB.addVertex(2, 1.0F, 0.5F, 0.0F);
			topB.addVertex(1, 1.0F, 0.5F, 1.0F);
			topB.addVertex(0, 0.0F, 0.5F, 1.0F);
	        Quad topT = new Quad(1, subTex1);
	        topT.addVertex(3, 0.0F, 0.625F, 0.0F);
	        topT.addVertex(2, 1.0F, 0.625F, 0.0F);
	        topT.addVertex(1, 1.0F, 0.625F, 1.0F);
	        topT.addVertex(0, 0.0F, 0.625F, 1.0F);
	        Quad tops1 = new Quad(2, subTex2);
	        tops1.addVertex(3, 0.0F, 0.5F, 0.0F);
	        tops1.addVertex(2, 1.0F, 0.5F, 0.0F);
	        tops1.addVertex(1, 1.0F, 0.625F, 0.0F);
	        tops1.addVertex(0, 0.0F, 0.625F, 0.0F);
	        Quad tops2 = new Quad(3, subTex2);
	        tops2.addVertex(3, 1.0F, 0.5F, 0.0F);
	        tops2.addVertex(2, 1.0F, 0.5F, 1.0F);
	        tops2.addVertex(1, 1.0F, 0.625F, 1.0F);
	        tops2.addVertex(0, 1.0F, 0.625F, 0.0F);
	        Quad tops3 = new Quad(4, subTex2);
	        tops3.addVertex(3, 1.0F, 0.5F, 1.0F);
	        tops3.addVertex(2, 0.0F, 0.5F, 1.0F);
	        tops3.addVertex(1, 0.0F, 0.625F, 1.0F);
	        tops3.addVertex(0, 1.0F, 0.625F, 1.0F);
	        Quad tops4 = new Quad(5, subTex2);
	        tops4.addVertex(3, 0.0F, 0.5F, 1.0F);
	        tops4.addVertex(2, 0.0F, 0.5F, 0.0F);
	        tops4.addVertex(1, 0.0F, 0.625F, 0.0F);
	        tops4.addVertex(0, 0.0F, 0.625F, 1.0F);

			Quad leg1s1 = new Quad(6, subTex0);
			leg1s1.addVertex(3, 0.0F, 0.0F, 0.0F);
			leg1s1.addVertex(2, 0.125F, 0.0F, 0.0F);
			leg1s1.addVertex(1, 0.125F, 0.5F, 0.0F);
			leg1s1.addVertex(0, 0.0F, 0.5F, 0.0F);
			Quad leg1s2 = new Quad(7, subTex0);
			leg1s2.addVertex(3, 0.125F, 0.0F, 0.0F);
			leg1s2.addVertex(2, 0.125F, 0.0F, 0.125F);
			leg1s2.addVertex(1, 0.125F, 0.5F, 0.125F);
			leg1s2.addVertex(0, 0.125F, 0.5F, 0.0F);
			Quad leg1s3 = new Quad(8, subTex0);
			leg1s3.addVertex(3, 0.125F, 0.0F, 0.125F);
			leg1s3.addVertex(2, 0.0F, 0.0F, 0.125F);
			leg1s3.addVertex(1, 0.0F, 0.5F, 0.125F);
			leg1s3.addVertex(0, 0.125F, 0.5F, 0.125F);
			Quad leg1s4 = new Quad(9, subTex0);
			leg1s4.addVertex(3, 0.0F, 0.0F, 0.125F);
			leg1s4.addVertex(2, 0.0F, 0.0F, 0.0F);
			leg1s4.addVertex(1, 0.0F, 0.5F, 0.0F);
			leg1s4.addVertex(0, 0.0F, 0.5F, 0.125F);
			
			Quad leg2s1 = new Quad(10, subTex0);
			leg2s1.addVertex(3, 0.0F, 0.0F, 0.875F);
			leg2s1.addVertex(2, 0.125F, 0.0F, 0.875F);
			leg2s1.addVertex(1, 0.125F,0.5F, 0.875F);
			leg2s1.addVertex(0, 0.0F, 0.5F, 0.875F);
			Quad leg2s2 = new Quad(11, subTex0);
			leg2s2.addVertex(3, 0.125F, 0.0F, 0.875F);
			leg2s2.addVertex(2, 0.125F, 0.0F, 1.0F);
			leg2s2.addVertex(1, 0.125F,0.5F, 1.0F);
			leg2s2.addVertex(0, 0.125F,0.5F, 0.875F);
			Quad leg2s3 = new Quad(12, subTex0);
			leg2s3.addVertex(3, 0.125F, 0.0F, 1.0F);
			leg2s3.addVertex(2, 0.0F, 0.0F, 1.0F);
			leg2s3.addVertex(1, 0.0F, 0.5F, 1.0F);
			leg2s3.addVertex(0, 0.125F, 0.5F, 1.0F);
			Quad leg2s4 = new Quad(13, subTex0);
			leg2s4.addVertex(3, 0.0F, 0.0F, 1.0F);
			leg2s4.addVertex(2, 0.0F, 0.0F, 0.875F);
			leg2s4.addVertex(1, 0.0F, 0.5F, 0.875F);
			leg2s4.addVertex(0, 0.0F, 0.5F, 1.0F);
			
			Quad leg3s1 = new Quad(14, subTex0);
			leg3s1.addVertex(3, 0.875F, 0.0F, 0.875F);
			leg3s1.addVertex(2, 1.0F, 0.0F, 0.875F);
			leg3s1.addVertex(1, 1.0F, 0.5F, 0.875F);
			leg3s1.addVertex(0, 0.875F, 0.5F, 0.875F);
			Quad leg3s2 = new Quad(15, subTex0);
			leg3s2.addVertex(3, 1.0F, 0.0F, 0.875F);
			leg3s2.addVertex(2, 1.0F, 0.0F, 1.0F);
			leg3s2.addVertex(1, 1.0F,0.5F, 1.0F);
			leg3s2.addVertex(0, 1.0F,0.5F, 0.875F);
			Quad leg3s3 = new Quad(16, subTex0);
			leg3s3.addVertex(3, 1.0F, 0.0F, 1.0F);
			leg3s3.addVertex(2, 0.875F, 0.0F, 1.0F);
			leg3s3.addVertex(1, 0.875F, 0.5F, 1.0F);
			leg3s3.addVertex(0, 1.0F, 0.5F, 1.0F);
			Quad leg3s4 = new Quad(17, subTex0);
			leg3s4.addVertex(3, 0.875F, 0.0F, 1.0F);
			leg3s4.addVertex(2, 0.875F, 0.0F, 0.875F);
			leg3s4.addVertex(1, 0.875F, 0.5F, 0.875F);
			leg3s4.addVertex(0, 0.875F, 0.5F, 1.0F);
			
			Quad leg4s1 = new Quad(18, subTex0);
			leg4s1.addVertex(3, 0.875F, 0.0F, 0.0F);
			leg4s1.addVertex(2, 1.0F, 0.0F, 0.0F);
			leg4s1.addVertex(1, 1.0F, 0.5F, 0.0F);
			leg4s1.addVertex(0, 0.875F, 0.5F, 0.0F);
			Quad leg4s2 = new Quad(19, subTex0);
			leg4s2.addVertex(3, 1.0F, 0.0F, 0.0F);
			leg4s2.addVertex(2, 1.0F, 0.0F, 0.125F);
			leg4s2.addVertex(1, 1.0F, 0.5F, 0.125F);
			leg4s2.addVertex(0, 1.0F, 0.5F, 0.0F);
			Quad leg4s3 = new Quad(20, subTex0);
			leg4s3.addVertex(3, 1.0F, 0.0F, 0.125F);
			leg4s3.addVertex(2, 0.875F, 0.0F, 0.125F);
			leg4s3.addVertex(1, 0.875F, 0.5F, 0.125F);
			leg4s3.addVertex(0, 1.0F, 0.5F, 0.125F);
			Quad leg4s4 = new Quad(21, subTex0);
			leg4s4.addVertex(0, 0.875F, 0.0F, 0.125F);
			leg4s4.addVertex(1, 0.875F, 0.0F, 0.0F);
			leg4s4.addVertex(2, 0.875F, 0.5F, 0.0F);
			leg4s4.addVertex(3, 0.875F, 0.5F, 0.125F);
			
			Quad arm1s1 = new Quad(22, subTex3);
			arm1s1.addVertex(3, 0.0F, 0.625F, 0.125F);
			arm1s1.addVertex(2, 0.0F, 1.5F, 0.125F);
			arm1s1.addVertex(1, 1.0F, 1.5F, 0.125F);
			arm1s1.addVertex(0, 1.0F, 0.625F, 0.125F);
			Quad arm1s2 = new Quad(23, subTex3);
			arm1s2.addVertex(0, 0.0F, 0.625F, 0.0F);
			arm1s2.addVertex(1, 0.0F, 1.5F, 0.0F);
			arm1s2.addVertex(2, 1.0F, 1.5F, 0.0F);
			arm1s2.addVertex(3, 1.0F, 0.625F, 0.0F);
			Quad arm1s3 = new Quad(24, subTex4);
			arm1s3.addVertex(3, 1.0F, 0.625F, 0.0F);
			arm1s3.addVertex(2, 1.0F, 0.625F, 0.125F);
			arm1s3.addVertex(1, 1.0F, 1.5F, 0.125F);
			arm1s3.addVertex(0, 1.0F, 1.5F, 0.0F);
			Quad arm1s4 = new Quad(25, subTex4);
			arm1s4.addVertex(0, 0.0F, 0.625F, 0.0F);
			arm1s4.addVertex(1, 0.0F, 0.625F, 0.125F);
			arm1s4.addVertex(2, 0.0F, 1.5F, 0.125F);
			arm1s4.addVertex(3, 0.0F, 1.5F, 0.0F);
			
			Quad backT = new Quad(26, subTex5);
			backT.addVertex(0, 0.0F, 1.5F, 0.0F);
			backT.addVertex(1, 0.0F, 1.5F, 0.125F);
			backT.addVertex(2, 1.0F, 1.5F, 0.125F);
			backT.addVertex(3, 1.0F, 1.5F, 0.0F);
			setQuad(topT).setQuad(topB).setQuad(tops1).setQuad(tops2).setQuad(tops3).setQuad(tops4).setQuad(leg1s1).setQuad(leg1s2).setQuad(leg1s3).setQuad(leg1s4).setQuad(leg2s1).setQuad(leg2s2).setQuad(leg2s3).setQuad(leg2s4).setQuad(leg3s1).setQuad(leg3s2).setQuad(leg3s3).setQuad(leg3s4).setQuad(leg4s1).setQuad(leg4s2).setQuad(leg4s3).setQuad(leg4s4).setQuad(backT).setQuad(arm1s3).setQuad(arm1s4).setQuad(arm1s1).setQuad(arm1s2);
	}
}