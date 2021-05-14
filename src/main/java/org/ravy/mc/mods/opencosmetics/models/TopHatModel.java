package org.ravy.mc.mods.opencosmetics.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class TopHatModel extends ModelBase {
    private final ModelRenderer bb_main;

    public TopHatModel() {
        textureWidth = 64;
        textureHeight = 32;

        bb_main = new ModelRenderer(this);
        bb_main.setRotationPoint(0.0F, 24.0F, 0.0F);
        bb_main.cubeList.add(new ModelBox(bb_main, 24, 6, -4.5F, -9.0F, -4.5F, 9, 1, 9, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 0, 0, -3.0F, -19.0F, -3.0F, 6, 10, 6, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 0, 16, -3.5F, -11.0F, -3.5F, 7, 2, 7, 0.0F, false));
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
