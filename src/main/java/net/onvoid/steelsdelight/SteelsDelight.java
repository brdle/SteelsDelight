package net.onvoid.steelsdelight;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.common.ForgeTagHandler;
import net.minecraftforge.fml.DistExecutor;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.ForgeRegistries;
import net.onvoid.steelsdelight.proxy.ClientProxy;
import net.onvoid.steelsdelight.proxy.CommonProxy;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.function.Supplier;

@Mod("steelsdelight")
public class SteelsDelight
{
    public static final String MODID = "steelsdelight";
    public static SteelsDelight instance;
    public static CommonProxy proxy;
    private static final Logger LOGGER = LogManager.getLogger();
    public static final Supplier<Ingredient> steelIngredient = () -> Ingredient.of(ForgeTagHandler.makeWrapperTag(ForgeRegistries.ITEMS, new ResourceLocation("forge", "ingots/steel")));

    public SteelsDelight() {
        instance = this;
        proxy = DistExecutor.safeRunForDist(() -> ClientProxy::new, () -> CommonProxy::new);
        proxy.start();
    }
}
