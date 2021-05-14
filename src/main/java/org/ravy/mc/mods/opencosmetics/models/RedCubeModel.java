package org.ravy.mc.mods.opencosmetics.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class RedCubeModel extends ModelBase {
    private final ModelRenderer bb_main;
    private final ModelRenderer cube_r1;

    public RedCubeModel() {
        textureWidth = 16;
        textureHeight = 16;

        bb_main = new ModelRenderer(this);
        bb_main.setRotationPoint(0.0F, 24.0F, 0.0F);


        cube_r1 = new ModelRenderer(this);
        cube_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
        bb_main.addChild(cube_r1);
        setRotationAngle(cube_r1, -0.6109F, 0.0F, 0.0F);
        cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 0, -2.0F, -8.0F, -7.0F, 4, 4, 4, 0.0F, false));
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
