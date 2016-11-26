package elementicraft.commons;
import org.lwjgl.opengl.GL11;

import elementicraft.client.earth_elemental;
import elementicraft.client.fire_elemental;
import elementicraft.client.model_elem_test;
import elementicraft.client.water_elemental;
import elementicraft.common.entity.elem_feu;
import elementicraft.common.entity.elem_terre;
import elementicraft.common.entity.elem_test;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderLivingBase;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.util.ResourceLocation;

//renderliving pour les modele personaliser
public class render_terre extends RenderLiving{
	//enplacement du texturemapping du mob 
	public final ResourceLocation texture = new ResourceLocation("elementicraft","textures/mob/earth-elemental.png");
	
	//Rendu de l'élément avec son moteur de rendu
	public render_terre(earth_elemental earth_elemental, float shadow){
		super(Minecraft.getMinecraft().getRenderManager(), earth_elemental,shadow);
	}


	public void doRender(EntityLiving entity, double x, double y, double z, float f1, float f2)

	{
		super.doRender((EntityLiving)entity, x, y, z, f1, f2);

		

	}
	
	 protected int shouldRenderPass(EntityLiving entityLiving, int par2, float par3)
	 {
	 return this.shouldRenderPass((elem_terre)entityLiving, par2, par3);
	 }
	
	// différente méthode pour récupérer la texture
	protected ResourceLocation getEntityTexture(EntityLiving entity) {
		// TODO Auto-generated method stub
		return this.getElemTestTexture((elem_terre)entity);
	}
	protected ResourceLocation getElemTestTexture(elem_terre entity) {
		// TODO Auto-generated method stub
		return texture;
	}

	@Override
	protected ResourceLocation getEntityTexture(Entity entity) {
		// TODO Auto-generated method stub
		return this.getElemTestTexture((elem_terre)entity);	}


}
