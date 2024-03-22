package net.celsiusqc.create_blue_skies_compat.item;

import net.celsiusqc.create_blue_skies_compat.CreateBlueSkiesCompat;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.ModList;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;


public class ModCreativeModTab {

    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, CreateBlueSkiesCompat.MOD_ID);


    public static final RegistryObject<CreativeModeTab> CREATE_BLUE_SKIES_COMPAT_TAB = CREATIVE_MODE_TABS.register("create_blue_skies_compat",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.CRUSHED_VENTIUM_ORE.get()))
                    .title(Component.translatable("creativetab.create_blue_skies_compat_tab"))
                    .displayItems((pParameters, pOutput) -> {


                        if (ModList.get().isLoaded("blue_skies") && ModList.get().isLoaded("create")) {
                            pOutput.accept(ModItems.CRUSHED_VENTIUM_ORE.get());
                            pOutput.accept(ModItems.CRUSHED_HORIZONITE_ORE.get());
                            pOutput.accept(ModItems.CRUSHED_FALSITE_ORE.get());
                            pOutput.accept(ModItems.CRUSHED_CHAROITE_ORE.get());
                            pOutput.accept(ModItems.CRUSHED_AQUITE_ORE.get());
                            pOutput.accept(ModItems.VENTIUM_SHEET.get());
                            pOutput.accept(ModItems.FALSITE_SHEET.get());
                            pOutput.accept(ModItems.HORIZONITE_SHEET.get());
                        }


                    })
                    .build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register((eventBus));
    }


}
