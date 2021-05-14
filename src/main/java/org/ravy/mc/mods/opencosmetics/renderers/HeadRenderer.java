package org.ravy.mc.mods.opencosmetics.renderers;

import net.minecraft.client.Minecraft;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.event.RenderPlayerEvent;
import org.ravy.mc.mods.opencosmetics.renderers.util.InterpolationUtil;

public class HeadRenderer extends RendererBase {


    public HeadRenderer(ResourceLocation texture, ModelBase model) {
        super(texture, model);
    }

    public void render(RenderPlayerEvent.Pre event, EntityPlayer player) {
        double scale = 1.0D;
        double rotationYaw = InterpolationUtil.interpolateRotation(player.prevRotationYawHead, player.rotationYawHead, event.partialRenderTick);
        double rotationPitch = InterpolationUtil.interpolateRotation(player.prevRotationPitch, player.rotationPitch, event.partialRenderTick);

        GlStateManager.scale(-scale, -scale, scale);
        GlStateManager.translate(0.0D, -(player.height - (player.isSneaking() ? 0.25D : 0.0D) - 0.38D) / scale, 0.0D);
        GlStateManager.rotate((float)(180.0D + rotationYaw), 0.0F, 1.0F, 0.0F);
        GlStateManager.rotate((float)rotationPitch, 1.0F, 0.0F, 0.0F);
        GlStateManager.translate(0.0D, -1.478D, 0.0D);

        Minecraft.getMinecraft().getTextureManager().bindTexture(this.texture);

        this.model.render((Entity) player, 0, 0, 0, 0, 0, 0.0625F);
        // x, y, z, width, height, depth
    }
}
