package com.teammetallurgy.metallurgy.precious;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = MetallurgyPrecious.MODID, version = MetallurgyPrecious.VERSION, dependencies = MetallurgyPrecious.DEPS)
public class MetallurgyPrecious {

    public static final String MODID = "metallurgy_precious";
    public static final String VERSION = "5.0.0";
    public static final String DEPS = "required-after:metallurgy_base";
    
    @EventHandler
    public void preInit(FMLPreInitializationEvent event) {

    }
    
    @EventHandler
    public void init(FMLInitializationEvent event) {

    }
    
    @EventHandler
    public void postInit(FMLPostInitializationEvent event) {

    }
}
