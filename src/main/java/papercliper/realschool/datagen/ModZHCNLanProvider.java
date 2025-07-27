package papercliper.realschool.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;
import net.minecraft.registry.RegistryWrapper;
import papercliper.realschool.block.ModBlocks;
import papercliper.realschool.item.ModItems;

import java.util.concurrent.CompletableFuture;

public class ModZHCNLanProvider extends FabricLanguageProvider {
    public ModZHCNLanProvider(FabricDataOutput dataOutput,
                              CompletableFuture<RegistryWrapper.WrapperLookup> registryLookup) {
        super(dataOutput, "zh_cn", registryLookup);
    }

    @Override
    public void generateTranslations(RegistryWrapper.WrapperLookup registryLookup,
                                     TranslationBuilder translationBuilder) {
//      添加物品的中文翻译
        translationBuilder.add(ModItems.CHALK, "粉笔");
        translationBuilder.add(ModItems.BASKETBALL, "篮球");
        translationBuilder.add(ModItems.CALCINED_GYPSUM, "熟石膏");
        translationBuilder.add(ModItems.RAW_GYPSUM, "生石膏");
        translationBuilder.add(ModItems.SLAKED_LIME_DUST, "熟石灰粉");
        translationBuilder.add(ModItems.PENCIL_COOKIE, "铅笔饼干");
        translationBuilder.add(ModItems.EXERCISE_BOOK, "必刷题");
        translationBuilder.add(ModItems.PROSPECTOR, "探矿器");
        translationBuilder.add(ModItems.BAD_APPLE, "虫蚀苹果");
        translationBuilder.add(ModItems.MEMORY_BREAD, "记忆面包");

//      添加方块的中文翻译
        translationBuilder.add(ModBlocks.CHALK_BLOCK, "粉笔块");
        translationBuilder.add(ModBlocks.GYPSUM_ORE, "石膏矿石");
        translationBuilder.add(ModBlocks.LIMESTONE, "石灰石");
        translationBuilder.add(ModBlocks.GYPSUM_BLOCK, "石膏块");

//      添加物品栏的中文翻译
        translationBuilder.add("itemGroup.realschool_group", "真实学校");
    }
}
