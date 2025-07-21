package papercliper.realschool.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;
import papercliper.realschool.block.ModBlocks;
import papercliper.realschool.item.ModItems;

public class ModModelsProvider extends FabricModelProvider {
    public ModModelsProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
//      在这里添加六面贴图相同的方块的模型的生成方法
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.CHALK_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.GYPSUM_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.LIMESTONE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.GYPSUM_BLOCK);
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
//      在这里添加物品的模型的生成方法
        itemModelGenerator.register(ModItems.CHALK, Models.GENERATED);
        itemModelGenerator.register(ModItems.BASKETBALL, Models.GENERATED);
        itemModelGenerator.register(ModItems.CALCINED_GYPSUM, Models.GENERATED);
        itemModelGenerator.register(ModItems.RAW_GYPSUM, Models.GENERATED);
        itemModelGenerator.register(ModItems.SLAKED_LIME_DUST, Models.GENERATED);
    }
}
