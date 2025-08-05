package papercliper.realschool.world;

import net.minecraft.block.Blocks;
import net.minecraft.registry.Registerable;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.structure.rule.BlockMatchRuleTest;
import net.minecraft.structure.rule.RuleTest;
import net.minecraft.structure.rule.TagMatchRuleTest;
import net.minecraft.util.Identifier;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.FeatureConfig;
import net.minecraft.world.gen.feature.OreFeatureConfig;
import papercliper.realschool.RealSchool;
import papercliper.realschool.block.ModBlocks;

import java.util.List;

public class ModConfiguredFeatures {
    // 定义矿石生成的配置键
    public static final RegistryKey<ConfiguredFeature<?, ?>> GYPSUM_ORE_KEY = registerKey("gypsum_ore");
    public static final RegistryKey<ConfiguredFeature<?, ?>> BAUXITE_ORE_KEY = registerKey("bauxite_ore");
    public static final RegistryKey<ConfiguredFeature<?, ?>> COPPER_NICKEL_ORE_KEY = registerKey("copper_nickel_ore");

    public static void bootstrap(Registerable<ConfiguredFeature<?, ?>> context) {
        // 定义替换规则
        RuleTest stoneReplaceables = new TagMatchRuleTest(BlockTags.STONE_ORE_REPLACEABLES);
        RuleTest deepslateReplaceables = new TagMatchRuleTest(BlockTags.DEEPSLATE_ORE_REPLACEABLES);

        // 石膏矿石生成配置 (Y=30-80)
        List<OreFeatureConfig.Target> gypsumOreTargets = List.of(
                OreFeatureConfig.createTarget(stoneReplaceables, ModBlocks.GYPSUM_ORE.getDefaultState()),
                OreFeatureConfig.createTarget(deepslateReplaceables, ModBlocks.GYPSUM_ORE.getDefaultState())
        );

        // 铝土矿生成配置 (丛林和热带草原生物群系)
        List<OreFeatureConfig.Target> bauxiteOreTargets = List.of(
                OreFeatureConfig.createTarget(stoneReplaceables, ModBlocks.BAUXITE_ORE.getDefaultState()),
                OreFeatureConfig.createTarget(deepslateReplaceables, ModBlocks.BAUXITE_ORE.getDefaultState())
        );

        // 铜镍矿生成配置 (与铜矿伴生)
        List<OreFeatureConfig.Target> copperNickelOreTargets = List.of(
                OreFeatureConfig.createTarget(stoneReplaceables, ModBlocks.COPPER_NICKEL_ORE.getDefaultState()),
                OreFeatureConfig.createTarget(deepslateReplaceables, ModBlocks.COPPER_NICKEL_ORE.getDefaultState())
        );

        // 注册配置特征
        register(context, GYPSUM_ORE_KEY, Feature.ORE, new OreFeatureConfig(gypsumOreTargets, 9));
        register(context, BAUXITE_ORE_KEY, Feature.ORE, new OreFeatureConfig(bauxiteOreTargets, 7));
        register(context, COPPER_NICKEL_ORE_KEY, Feature.ORE, new OreFeatureConfig(copperNickelOreTargets, 6));
    }

    public static RegistryKey<ConfiguredFeature<?, ?>> registerKey(String name) {
        return RegistryKey.of(RegistryKeys.CONFIGURED_FEATURE, Identifier.of(RealSchool.MOD_ID, name));
    }

    private static <FC extends FeatureConfig, F extends Feature<FC>> void register(
            Registerable<ConfiguredFeature<?, ?>> context,
            RegistryKey<ConfiguredFeature<?, ?>> key,
            F feature,
            FC configuration) {
        context.register(key, new ConfiguredFeature<>(feature, configuration));
    }
}

