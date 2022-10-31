package darksidedevelopment.darkside.item;

import darksidedevelopment.darkside.Darkside;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, Darkside.MOD_ID);

    public static final RegistryObject<Item> DARK = ITEMS.register("dark",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.DARKSIDE_TAB)));

    public static void  register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }


}
