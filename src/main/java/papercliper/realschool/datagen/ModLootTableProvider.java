package papercliper.realschool.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.minecraft.block.Block;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.loot.LootTable;
import net.minecraft.loot.entry.ItemEntry;
import net.minecraft.loot.entry.LootPoolEntry;
import net.minecraft.loot.function.ApplyBonusLootFunction;
import net.minecraft.loot.function.SetCountLootFunction;
import net.minecraft.loot.provider.number.UniformLootNumberProvider;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.RegistryWrapper;
import papercliper.realschool.block.ModBlocks;
import papercliper.realschool.item.ModItems;

import java.util.concurrent.CompletableFuture;

public class ModLootTableProvider extends FabricBlockLootTableProvider {
    public ModLootTableProvider(FabricDataOutput dataOutput,
                                CompletableFuture<RegistryWrapper.WrapperLookup> registryLookup) {
        super(dataOutput, registryLookup);
    }

    @Override
    public void generate() {
//      普通方块掉落物
        addDrop(ModBlocks.CHALK_BLOCK);
        addDrop(ModBlocks.LIMESTONE);
        addDrop(ModBlocks.GYPSUM_BLOCK);

//      掉落物只有一个的矿石方块
//      addDrop(ModBlocks.GYPSUM_ORE, oreDrops(ModBlocks.GYPSUM_ORE, ModItems.RAW_GYPSUM));

//      有至少一个掉落物的矿石方块
        addDrop(ModBlocks.GYPSUM_ORE, copperOreLikeDrops(ModBlocks.GYPSUM_ORE,
                ModItems.RAW_GYPSUM));
    }

//  模仿铜矿掉落规则
    public LootTable.Builder copperOreLikeDrops(Block drop, Item dropItem) {
        RegistryWrapper.Impl<Enchantment> impl = this.registryLookup
                .getWrapperOrThrow(RegistryKeys.ENCHANTMENT);
        return this.dropsWithSilkTouch(
                drop,
                (LootPoolEntry.Builder<?>)this.applyExplosionDecay(
                        drop,
                        ItemEntry.builder(dropItem)
//                              采集单个矿石的掉落物个数区间
                                .apply(SetCountLootFunction
                                        .builder(UniformLootNumberProvider.create(2.0F, 5.0F)))
                                .apply(ApplyBonusLootFunction
                                        .oreDrops(impl.getOrThrow(Enchantments.FORTUNE)))
                )
        );
    }
}
