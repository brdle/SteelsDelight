package net.onvoid.steelsdelight.proxy;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.onvoid.steelsdelight.SteelsDelight;
import net.onvoid.steelsdelight.common.SteelsDelightItems;

@Mod.EventBusSubscriber(modid = SteelsDelight.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class CommonProxy {

    public void start() {
        IEventBus modBus = FMLJavaModLoadingContext.get().getModEventBus();
        IEventBus forgeBus = MinecraftForge.EVENT_BUS;
        SteelsDelightItems.create(modBus);
    }
}
