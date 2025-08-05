package papercliper.realschool.world;

import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.minecraft.world.biome.BiomeKeys;
import net.minecraft.world.gen.GenerationStep;

public class ModWorldGeneration {
    public static void generateModWorldGen() {
        // 石膏矿石 - 在所有主世界生物群系中生成
        BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(),
                GenerationStep.Feature.UNDERGROUND_ORES, ModPlacedFeatures.GYPSUM_ORE_PLACED_KEY);

        // 铝土矿 - 只在丛林和热带草原生物群系中生成
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(
                BiomeKeys.JUNGLE, BiomeKeys.SPARSE_JUNGLE, BiomeKeys.BAMBOO_JUNGLE,
                BiomeKeys.SAVANNA, BiomeKeys.SAVANNA_PLATEAU, BiomeKeys.WINDSWEPT_SAVANNA),
                GenerationStep.Feature.UNDERGROUND_ORES, ModPlacedFeatures.BAUXITE_ORE_PLACED_KEY);

        // 铜镍矿 - 在所有主世界生物群系中生成（与铜矿伴生）
        BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(),
                GenerationStep.Feature.UNDERGROUND_ORES, ModPlacedFeatures.COPPER_NICKEL_ORE_PLACED_KEY);
    }
}

