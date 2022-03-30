package net.onvoid.steelsdelight;

import mezz.jei.api.IModPlugin;
import mezz.jei.api.JeiPlugin;
import mezz.jei.api.MethodsReturnNonnullByDefault;
import mezz.jei.api.constants.VanillaTypes;
import mezz.jei.api.registration.IRecipeRegistration;
import net.minecraft.client.Minecraft;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.onvoid.steelsdelight.common.CoppersDelightItems;
import vectorwing.farmersdelight.FarmersDelight;
import vectorwing.farmersdelight.utils.TextUtils;
import javax.annotation.ParametersAreNonnullByDefault;

@JeiPlugin
@ParametersAreNonnullByDefault
@MethodsReturnNonnullByDefault
@SuppressWarnings("unused")
public class JEIPlugin implements IModPlugin
{
    private static final ResourceLocation ID = new ResourceLocation(FarmersDelight.MODID, "jei_plugin");
    private static final Minecraft MC = Minecraft.getInstance();

    @Override
    public void registerRecipes(IRecipeRegistration registration) {
        registration.addIngredientInfo(new ItemStack(CoppersDelightItems.COPPER_KNIFE.get()), VanillaTypes.ITEM, TextUtils.getTranslation("jei.info.knife"));
    }

    @Override
    public ResourceLocation getPluginUid() {
        return ID;
    }
}