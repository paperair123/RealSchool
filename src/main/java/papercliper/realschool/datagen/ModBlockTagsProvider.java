package papercliper.realschool.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.BlockTags;
import papercliper.realschool.block.ModBlocks;
import papercliper.realschool.tags.ModBlockTags;

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

        getOrCreateTagBuilder(ModBlockTags.ORE_LIST)
//              自定义的矿石列表标签，用于探矿器探测矿石
//              模组矿石
                .add(ModBlocks.GYPSUM_ORE)
                .add(ModBlocks.BAUXITE_ORE)
                .add(ModBlocks.COPPER_NICKEL_ORE)
//              原版主世界的矿石
                .forceAddTag(BlockTags.COAL_ORES)
                .forceAddTag(BlockTags.IRON_ORES)
                .forceAddTag(BlockTags.GOLD_ORES)
                .forceAddTag(BlockTags.DIAMOND_ORES)
                .forceAddTag(BlockTags.EMERALD_ORES)
                .forceAddTag(BlockTags.LAPIS_ORES)
                .forceAddTag(BlockTags.REDSTONE_ORES)
                .forceAddTag(BlockTags.COPPER_ORES);
    }
}

