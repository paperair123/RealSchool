package papercliper.realschool.world;

import net.minecraft.world.gen.placementmodifier.*;

import java.util.List;

public class ModOrePlacement {
    // 创建带有计数和高度范围的放置修饰符
    public static List<PlacementModifier> modifiersWithCount(int count, PlacementModifier heightModifier) {
        return List.of(
                CountPlacementModifier.of(count), // 每个区块的生成次数
                SquarePlacementModifier.of(), // 在区块内随机分布
                heightModifier // 高度范围限制
        );
    }

    // 创建稀有矿石的放置修饰符（使用稀有度而不是固定计数）
    public static List<PlacementModifier> modifiersWithRarity(int rarity, PlacementModifier heightModifier) {
        return List.of(
                RarityFilterPlacementModifier.of(rarity), // 稀有度控制
                SquarePlacementModifier.of(),
                heightModifier
        );
    }
}

