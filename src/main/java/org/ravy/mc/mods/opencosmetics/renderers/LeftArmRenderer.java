package org.ravy.mc.mods.opencosmetics.renderers;

import net.minecraft.client.Minecraft;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.event.RenderPlayerEvent;
import org.ravy.mc.mods.opencosmetics.renderers.util.InterpolationUtil;

public class LeftArmRenderer extends RendererBase {


    public LeftArmRenderer(ResourceLocation texture, ModelBase model) {
        super(texture, model);
    }

    public void render(RenderPlayerEvent.Pre event, EntityPlayer player) {
        double scale = 1D;
        double rotationYaw = InterpolationUtil.interpolateRotation(player.prevRenderYawOffset, player.renderYawOffset, event.partialRenderTick);

        GlStateManager.scale(-scale, -scale, scale);

        GlStateManager.translate(0.0D, -((player.height - 0.54) - (player.isSneaking() ? 0.2D : 0.0D)) / scale, 0.0D);

        GlStateManager.rotate((float)(180.0D + rotationYaw), 0.0F, 1.0F, 0.0F);

        ModelRenderer leftArm = event.renderer.getMainModel().bipedLeftArm;

        GlStateManager.rotate((float)((leftArm.rotateAngleX * 180D) / Math.PI), 1.0F, 0.0F, 0.0F);
        GlStateManager.rotate((float)((leftArm.rotateAngleZ * 180D) / Math.PI), 0.0F, 0.0F, 1.0F);


        GlStateManager.translate(0.35D, -0.9D, 0.0D);

        Minecraft.getMinecraft().getTextureManager().bindTexture(this.texture);

        this.model.render((Entity) player, 0, 0, 0, 0, 0, 0.0625F);
        // x, y, z, width, height, depth
    }
}
