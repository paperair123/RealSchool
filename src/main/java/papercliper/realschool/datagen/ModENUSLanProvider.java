package papercliper.realschool.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;
import net.minecraft.registry.RegistryWrapper;
import papercliper.realschool.block.ModBlocks;
import papercliper.realschool.item.ModItems;

import java.util.concurrent.CompletableFuture;

public class ModENUSLanProvider extends FabricLanguageProvider {
    public ModENUSLanProvider(FabricDataOutput dataOutput,
                              CompletableFuture<RegistryWrapper.WrapperLookup> registryLookup) {
        super(dataOutput, "en_us", registryLookup);
    }

    @Override
    public void generateTranslations(RegistryWrapper.WrapperLookup registryLookup,
                                     TranslationBuilder translationBuilder) {
//      添加物品的英文翻译
        translationBuilder.add(ModItems.CHALK, "Chalk");
        translationBuilder.add(ModItems.BASKETBALL, "Basketball");
        translationBuilder.add(ModItems.CALCINED_GYPSUM, "Calcined Gypsum");
        translationBuilder.add(ModItems.RAW_GYPSUM, "Raw Gypsum");
        translationBuilder.add(ModItems.SLAKED_LIME_DUST, "Slaked Lime Dust");

//      添加方块的英文翻译
        translationBuilder.add(ModBlocks.CHALK_BLOCK, "Chalk Block");
        translationBuilder.add(ModBlocks.GYPSUM_ORE, "Gypsum Ore");
        translationBuilder.add(ModBlocks.LIMESTONE, "Limestone");
        translationBuilder.add(ModBlocks.GYPSUM_BLOCK, "Gypsum Block");

//      添加物品栏的英文翻译
        translationBuilder.add("itemGroup.realschool_group", "Real School");
    }
}
