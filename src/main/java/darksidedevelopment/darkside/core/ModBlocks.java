package darksidedevelopment.darkside.core;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.registries.IForgeRegistry;

public class ModBlocks {

    public static final deferredRegister<Block> BLOCKS = deferredRegister.create(forgeRegistries.BLOCKS, darkside.MOD_ID);
    public static final deferredRegister<Block> BLOCK = deferredRegister.create(forgeRegistries.BLOCKS)
    public static final RegistryObject<Block> MOD_BLOCK = BLOCKS.register("mod_block", () -> new Block(BlockBehaviour.properties.of(Material.STONE)));


}
