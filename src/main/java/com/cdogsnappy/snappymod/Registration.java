package com.cdogsnappy.snappymod;

import com.cdogsnappy.snappymod.blocks.ModBlocks;
import com.cdogsnappy.snappymod.items.ModItems;
import com.cdogsnappy.snappymod.sounds.ModSounds;
import net.minecraftforge.eventbus.api.IEventBus;

public class Registration {
    public static void register(IEventBus eventBus){
        ModItems.ITEMS.register(eventBus);
        ModSounds.SOUNDS.register(eventBus);
        ModBlocks.BLOCKS.register(eventBus);
    }
}
