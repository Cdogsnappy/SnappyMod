package com.cdogsnappy.snappymod.sounds;

import com.cdogsnappy.snappymod.SnappyMod;
import net.minecraft.sounds.SoundEvent;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModSounds {
    public static final DeferredRegister<SoundEvent> SOUNDS = DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, SnappyMod.MODID);

    //public static final RegistryObject<SoundEvent> sound = SOUNDS.register("dream_sweet", () ->
            //new SoundEvent())
}
