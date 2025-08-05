package papercliper.realschool.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.BlockTags;
import papercliper.realschool.block.ModBlocks;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagsProvider extends FabricTagProvider.BlockTagProvider {
    public ModBlockTagsProvider(FabricDataOutput output,
                                CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }
    @Override
    protected void configure(RegistryWrapper.WrapperLookup wrapperLookup) {
        getOrCreateTagBuilder(BlockTags.PICKAXE_MINEABLE)
//              需要镐子采集的方块
                .add(ModBlocks.CHALK_BLOCK)
                .add(ModBlocks.GYPSUM_ORE)
                .add(ModBlocks.LIMESTONE)
                .add(ModBlocks.GYPSUM_BLOCK)
                .add(ModBlocks.BAUXITE_ORE)
                .add(ModBlocks.COPPER_NICKEL_ORE);

        getOrCreateTagBuilder(BlockTags.NEEDS_STONE_TOOL)
//              需要石质工具采集的方块
                .add(ModBlocks.LIMESTONE)
                .add(ModBlocks.BAUXITE_ORE);
    }
}

