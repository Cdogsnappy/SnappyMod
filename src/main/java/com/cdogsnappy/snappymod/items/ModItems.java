package com.cdogsnappy.snappymod.items;

import com.cdogsnappy.snappymod.SnappyMod;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.RecordItem;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, SnappyMod.MODID);



    public void makeRecord(String name, RegistryObject<SoundEvent> sound){
        ITEMS.register(name, () ->
                new RecordItem(0,sound,new Item.Properties().rarity(Rarity.EPIC).fireResistant(), 1));

    }
}
