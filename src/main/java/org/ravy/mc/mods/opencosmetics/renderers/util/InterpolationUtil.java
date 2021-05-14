package org.ravy.mc.mods.opencosmetics.renderers.util;

public class InterpolationUtil {
    public static float interpolateRotation(float val1, float val2, float progress) {
        float rotation = (val1 + (val2 - val1) * progress) % 360.0F;
        if (rotation < 0.0F)
            rotation += 360.0F;
        return rotation;
    }
}
