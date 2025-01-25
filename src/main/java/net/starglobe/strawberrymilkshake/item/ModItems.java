package net.starglobe.strawberrymilkshake.item;

import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.starglobe.strawberrymilkshake.StrawberryMilkshake;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, StrawberryMilkshake.MOD_ID);

    public static final RegistryObject<Item> PAINTBRUSH = ITEMS.register("paintbrush",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> LOADED_PAINTBRUSH = ITEMS.register("loaded_paintbrush",
            () -> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
