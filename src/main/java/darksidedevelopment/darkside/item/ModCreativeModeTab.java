package darksidedevelopment.darkside.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeModeTab {
    public static final CreativeModeTab DARKSIDE_TAB = new CreativeModeTab("darksidetab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.DARK.get());
        }
    };
}
