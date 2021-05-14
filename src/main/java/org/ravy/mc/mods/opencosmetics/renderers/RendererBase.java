package org.ravy.mc.mods.opencosmetics.renderers;

import net.minecraft.client.Minecraft;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.event.RenderPlayerEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public abstract class RendererBase {
    final ResourceLocation texture;
    final ModelBase model;

    public RendererBase(ResourceLocation texture, ModelBase model) {
        this.texture = texture;
        this.model = model;
    }

    @SubscribeEvent
    public void onPlayerRender(RenderPlayerEvent.Pre event) {
        EntityPlayer player = event.entityPlayer;

        double distance = event.entity.getDistanceSqToEntity((Entity) (Minecraft.getMinecraft()).thePlayer);
        if (distance > 4096.0D)
            return;

        GlStateManager.pushMatrix();
        GlStateManager.translate(event.x, event.y, event.z);

        this.render(event, player);

        GlStateManager.popMatrix();
    }

    public abstract void render(RenderPlayerEvent.Pre event, EntityPlayer player);
}
