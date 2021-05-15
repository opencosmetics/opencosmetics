package org.ravy.mc.mods.opencosmetics;

import net.minecraft.util.ResourceLocation;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import org.ravy.mc.mods.opencosmetics.models.HeadDummyModel;
import org.ravy.mc.mods.opencosmetics.renderers.HeadRenderer;

@Mod(modid = org.ravy.mc.mods.opencosmetics.OpenCosmetics.MODID, version = org.ravy.mc.mods.opencosmetics.OpenCosmetics.VERSION)
public class OpenCosmetics
{
    public static final String MODID = "opencosmetics";
    public static final String VERSION = "1.0";
    
    @EventHandler
    public void init(FMLInitializationEvent event)
    {
        // MinecraftForge.EVENT_BUS.register(new HeadRenderer(new ResourceLocation("opencosmetics", "textures/red.png"), new HeadDummyModel()));
    }
}
