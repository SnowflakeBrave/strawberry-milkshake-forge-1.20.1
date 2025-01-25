package net.starglobe.strawberrymilkshake.item;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import net.starglobe.strawberrymilkshake.StrawberryMilkshake;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, StrawberryMilkshake.MOD_ID);

    public static final RegistryObject<CreativeModeTab> FURNITURE_TAB = CREATIVE_MODE_TABS.register("strawberrymilkshake_furniture_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.PAINTBRUSH.get()))
                    .title(Component.translatable("creativetab.strawberrymilkshake_furniture_tab"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModItems.PAINTBRUSH.get());
                    })
                    .build());

    public static final RegistryObject<CreativeModeTab> ENTITY_TAB = CREATIVE_MODE_TABS.register("strawberrymilkshake_entity_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(Items.DIAMOND))
                    .title(Component.translatable("creativetab.strawberrymilkshake_entity_tab"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(Items.DIAMOND);
                    })
                    .build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
