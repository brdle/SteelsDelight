package net.onvoid.steelsdelight.common;

import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.onvoid.steelsdelight.SteelsDelight;
import vectorwing.farmersdelight.FarmersDelight;
import vectorwing.farmersdelight.common.item.KnifeItem;

public class SteelsDelightItems {

    private static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, SteelsDelight.MODID);

    public static final RegistryObject<Item> STEEL_KNIFE = ITEMS.register("steel_knife", () ->
            new KnifeItem(SteelsDelightTiers.STEEL, 0.5F, -2.0F, new Item.Properties()
                    .tab(FarmersDelight.CREATIVE_TAB)));

    public static void create(IEventBus bus) {
        ITEMS.register(bus);
    }
}
