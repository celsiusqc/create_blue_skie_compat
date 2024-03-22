package net.celsiusqc.create_blue_skies_compat.item;

import net.celsiusqc.create_blue_skies_compat.CreateBlueSkiesCompat;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import static net.minecraftforge.registries.ForgeRegistries.Keys.ITEMS;


public class ModItems {

    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, CreateBlueSkiesCompat.MOD_ID);

    public static final RegistryObject<Item> CRUSHED_VENTIUM_ORE = ITEMS.register("crushed_ventium_ore",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> CRUSHED_HORIZONITE_ORE = ITEMS.register("crushed_horizonite_ore",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> CRUSHED_FALSITE_ORE = ITEMS.register("crushed_falsite_ore",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> CRUSHED_CHAROITE_ORE = ITEMS.register("crushed_charoite_ore",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> CRUSHED_AQUITE_ORE = ITEMS.register("crushed_aquite_ore",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> VENTIUM_SHEET = ITEMS.register("ventium_sheet",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> FALSITE_SHEET = ITEMS.register("falsite_sheet",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> HORIZONITE_SHEET = ITEMS.register("horizonite_sheet",
            () -> new Item(new Item.Properties()));





    public static void register (IEventBus eventBus) {
        ITEMS.register(eventBus);
    }

}
