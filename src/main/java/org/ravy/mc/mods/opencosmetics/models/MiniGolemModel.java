package org.ravy.mc.mods.opencosmetics.models;

// Made with Blockbench 3.8.4
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class MiniGolemModel extends ModelBase {
    private final ModelRenderer bb_main;

    public MiniGolemModel() {
        textureWidth = 16;
        textureHeight = 16;

        bb_main = new ModelRenderer(this);
        bb_main.setRotationPoint(0.0F, 24.0F, 0.0F);
        bb_main.cubeList.add(new ModelBox(bb_main, 0, 13, -7.5F, -14.0F, 0.0F, 1, 2, 1, 0.0F, true));
        bb_main.cubeList.add(new ModelBox(bb_main, 0, 5, -8.0F, -17.0F, -1.0F, 4, 3, 3, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 12, 0, -4.0F, -16.0F, 0.0F, 1, 3, 1, 0.0F, true));
        bb_main.cubeList.add(new ModelBox(bb_main, 12, 0, -9.0F, -16.0F, 0.0F, 1, 3, 1, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 0, 13, -5.5F, -14.0F, 0.0F, 1, 2, 1, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 0, 0, -7.0F, -18.0F, -2.0F, 2, 3, 2, 0.0F, false));
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        bb_main.render(f5);
    }

    public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }
}