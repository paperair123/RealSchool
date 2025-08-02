package papercliper.realschool.world;

import net.minecraft.registry.Registerable;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.util.Identifier;
import net.minecraft.world.gen.YOffset;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.PlacedFeature;
import net.minecraft.world.gen.placementmodifier.HeightRangePlacementModifier;
import net.minecraft.world.gen.placementmodifier.CountPlacementModifier;
import net.minecraft.world.gen.placementmodifier.SquarePlacementModifier;
import papercliper.realschool.RealSchool;

import java.util.List;

public class ModPlacedFeatures {
    // 定义放置特征的注册键
    public static final RegistryKey<PlacedFeature> GYPSUM_ORE_PLACED_KEY = registerKey("gypsum_ore_placed");
    public static final RegistryKey<PlacedFeature> BAUXITE_ORE_PLACED_KEY = registerKey("bauxite_ore_placed");
    public static final RegistryKey<PlacedFeature> COPPER_NICKEL_ORE_PLACED_KEY = registerKey("copper_nickel_ore_placed");

    public static void bootstrap(Registerable<PlacedFeature> context) {
        var configuredFeatureRegistryEntryLookup = context.getRegistryLookup(RegistryKeys.CONFIGURED_FEATURE);

        // 石膏矿石放置 - Y=30到Y=80，每个区块8个矿脉
        register(context, GYPSUM_ORE_PLACED_KEY, 
                configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.GYPSUM_ORE_KEY),
                ModOrePlacement.modifiersWithCount(8, 
                        HeightRangePlacementModifier.uniform(YOffset.fixed(30), YOffset.fixed(80))));

        // 铝土矿放置 - Y=0到Y=64，每个区块6个矿脉
        register(context, BAUXITE_ORE_PLACED_KEY,
                configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.BAUXITE_ORE_KEY),
                ModOrePlacement.modifiersWithCount(6,
                        HeightRangePlacementModifier.uniform(YOffset.fixed(0), YOffset.fixed(64))));

        // 铜镍矿放置 - Y=-16到Y=112，每个区块4个矿脉（与铜矿相似的分布）
        register(context, COPPER_NICKEL_ORE_PLACED_KEY,
                configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.COPPER_NICKEL_ORE_KEY),
                ModOrePlacement.modifiersWithCount(4,
                        HeightRangePlacementModifier.uniform(YOffset.fixed(-16), YOffset.fixed(112))));
    }

    public static RegistryKey<PlacedFeature> registerKey(String name) {
        return RegistryKey.of(RegistryKeys.PLACED_FEATURE, Identifier.of(RealSchool.MOD_ID, name));
    }

    private static void register(Registerable<PlacedFeature> context, RegistryKey<PlacedFeature> key,
                                RegistryEntry<ConfiguredFeature<?, ?>> configuration,
                                List<net.minecraft.world.gen.placementmodifier.PlacementModifier> modifiers) {
        context.register(key, new PlacedFeature(configuration, List.copyOf(modifiers)));
    }
}

