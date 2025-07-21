package papercliper.realschool.block;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import papercliper.realschool.RealSchool;

public class ModBlocks {
//  在这里添加方块
//  hardness为硬度;resistance为爆炸抗性
//  原版方块数据见官方文档
    public static final Block CHALK_BLOCK = register("chalk_block",
        new Block(AbstractBlock.Settings.create().requiresTool().strength(0.6f, 0.3f)));
    public static final Block GYPSUM_ORE = register("gypsum_ore",
        new Block(AbstractBlock.Settings.create().requiresTool().strength(0.75f, 1.5f)));
    public static final Block LIMESTONE = register("limestone",
        new Block(AbstractBlock.Settings.create().requiresTool().strength(1.25f, 4.0f)));
    public static final Block GYPSUM_BLOCK = register("gypsum_block",
        new Block(AbstractBlock.Settings.create().requiresTool().strength(1.5f, 6.0f)));

    public static void registerBlockItems(String id, Block block) {
        Item item = Registry.register(Registries.ITEM, Identifier.of(RealSchool.MOD_ID, id), new BlockItem(block, new Item.Settings()));
        if (item instanceof BlockItem) {
            ((BlockItem)item).appendBlocks(Item.BLOCK_ITEMS, item);
        }
    }
    public static Block register(String id, Block block) {
        registerBlockItems(id, block);
        return Registry.register(Registries.BLOCK, Identifier.of(RealSchool.MOD_ID, id), block);
    }
    public static void registerModBlocks() {
//      初始化注册方块方法
        RealSchool.LOGGER.info("Registering Blocks...");
    }
}
