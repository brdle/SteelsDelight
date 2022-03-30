package net.onvoid.steelsdelight.common;

import net.minecraft.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.onvoid.steelsdelight.SteelsDelight;
import vectorwing.farmersdelight.FarmersDelight;
import vectorwing.farmersdelight.items.KnifeItem;

public class CoppersDelightItems {

    private static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, SteelsDelight.MODID);

    public static final RegistryObject<Item> COPPER_KNIFE = ITEMS.register("copper_knife", () ->
            new KnifeItem(CoppersDelightTiers.COPPER, 0.5F, -2.0F, new Item.Properties()
                    .tab(FarmersDelight.ITEM_GROUP)));

    public static void create(IEventBus bus) {
        ITEMS.register(bus);
    }
}
