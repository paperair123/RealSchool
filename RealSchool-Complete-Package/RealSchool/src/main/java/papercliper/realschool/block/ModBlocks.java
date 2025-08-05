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
    public static final Block BLACKBOARD = register("blackboard",
        new Block(AbstractBlock.Settings.create().requiresTool().strength(2.0f, 6.0f).nonOpaque()));
    public static final Block MODULAR_DESK = register("modular_desk",
        new Block(AbstractBlock.Settings.create().requiresTool().strength(1.0f, 1.0f).nonOpaque()));
    public static final Block PODIUM = register("podium",
        new Block(AbstractBlock.Settings.create().requiresTool().strength(1.5f, 3.0f).nonOpaque()));
    public static final Block PROJECTOR = register("projector",
        new Block(AbstractBlock.Settings.create().requiresTool().strength(1.5f, 3.0f).nonOpaque()));
    public static final Block PROJECTOR_SCREEN = register("projector_screen",
        new Block(AbstractBlock.Settings.create().requiresTool().strength(0.5f, 0.5f).nonOpaque()));
    public static final Block CLASSROOM_LOCKER = register("classroom_locker",
        new Block(AbstractBlock.Settings.create().requiresTool().strength(1.5f, 3.0f).nonOpaque()));
    public static final Block LAB_BENCH = register("lab_bench",
        new Block(AbstractBlock.Settings.create().requiresTool().strength(1.5f, 3.0f).nonOpaque()));
    public static final Block MICROSCOPE = register("microscope",
        new Block(AbstractBlock.Settings.create().requiresTool().strength(0.5f, 0.5f).nonOpaque()));
    public static final Block ALCOHOL_LAMP = register("alcohol_lamp",
        new Block(AbstractBlock.Settings.create().requiresTool().strength(0.3f, 0.3f).nonOpaque()));
    public static final Block FUME_HOOD = register("fume_hood",
        new Block(AbstractBlock.Settings.create().requiresTool().strength(2.0f, 6.0f).nonOpaque()));
    public static final Block BOOKSHELF_WALL = register("bookshelf_wall",
        new Block(AbstractBlock.Settings.create().strength(1.5f, 3.0f)));
    public static final Block LENDING_DESK = register("lending_desk",
        new Block(AbstractBlock.Settings.create().strength(1.5f, 3.0f).nonOpaque()));
    public static final Block DIGITAL_READING_DESK = register("digital_reading_desk",
        new Block(AbstractBlock.Settings.create().requiresTool().strength(1.5f, 3.0f).nonOpaque()));
    public static final Block BASKETBALL_HOOP = register("basketball_hoop",
        new Block(AbstractBlock.Settings.create().requiresTool().strength(2.0f, 6.0f).nonOpaque()));
    public static final Block CLIMBING_WALL = register("climbing_wall",
        new Block(AbstractBlock.Settings.create().strength(1.0f, 1.0f).nonOpaque()));
    public static final Block SCOREBOARD = register("scoreboard",
        new Block(AbstractBlock.Settings.create().requiresTool().strength(1.5f, 3.0f).nonOpaque()));
    public static final Block RUBBER_TRACK = register("rubber_track",
        new Block(AbstractBlock.Settings.create().strength(0.5f, 0.5f)));
    public static final Block STAINLESS_STEEL_TRAY_RACK = register("stainless_steel_tray_rack",
        new Block(AbstractBlock.Settings.create().requiresTool().strength(1.0f, 1.0f).nonOpaque()));
    public static final Block SERVING_WINDOW = register("serving_window",
        new Block(AbstractBlock.Settings.create().requiresTool().strength(1.5f, 3.0f).nonOpaque()));
    public static final Block CANTEEN_TABLE = register("canteen_table",
        new Block(AbstractBlock.Settings.create().strength(1.0f, 1.0f).nonOpaque()));
    public static final Block BUNK_BED = register("bunk_bed",
        new Block(AbstractBlock.Settings.create().strength(0.8f, 0.8f).nonOpaque()));
    public static final Block WARDROBE = register("wardrobe",
        new Block(AbstractBlock.Settings.create().requiresTool().strength(1.5f, 3.0f).nonOpaque()));
    public static final Block STUDY_DESK = register("study_desk",
        new Block(AbstractBlock.Settings.create().requiresTool().strength(1.0f, 1.0f).nonOpaque()));
    public static final Block SCHOOL_NAMEPLATE = register("school_nameplate",
        new Block(AbstractBlock.Settings.create().requiresTool().strength(1.0f, 1.0f).nonOpaque()));
    public static final Block BULLETIN_BOARD = register("bulletin_board",
        new Block(AbstractBlock.Settings.create().strength(0.5f, 0.5f).nonOpaque()));
    public static final Block FLAGPOLE = register("flagpole",
        new Block(AbstractBlock.Settings.create().requiresTool().strength(1.0f, 1.0f).nonOpaque()));
    public static final Block BICYCLE_RACK = register("bicycle_rack",
        new Block(AbstractBlock.Settings.create().requiresTool().strength(1.0f, 1.0f).nonOpaque()));
    public static final Block VENDING_MACHINE = register("vending_machine",
        new Block(AbstractBlock.Settings.create().requiresTool().strength(1.5f, 3.0f).nonOpaque()));
    public static final Block TRASH_CAN = register("trash_can",
        new Block(AbstractBlock.Settings.create().requiresTool().strength(0.8f, 0.8f).nonOpaque()));
    public static final Block STREET_LAMP = register("street_lamp",
        new Block(AbstractBlock.Settings.create().requiresTool().strength(1.0f, 1.0f).nonOpaque()));
    public static final Block BAUXITE_ORE = register("bauxite_ore",
        new Block(AbstractBlock.Settings.create().requiresTool().strength(1.0f, 2.0f)));
    public static final Block COPPER_NICKEL_ORE = register("copper_nickel_ore",
        new Block(AbstractBlock.Settings.create().requiresTool().strength(1.5f, 3.0f)));
    public static final Block ALLOY_SMELTER = register("alloy_smelter",
        new Block(AbstractBlock.Settings.create().requiresTool().strength(3.5f, 6.0f).nonOpaque()));
    public static final Block KITCHEN_COUNTER = register("kitchen_counter",
        new Block(AbstractBlock.Settings.create().strength(1.5f, 3.0f).nonOpaque()));
    public static final Block BLENDER = register("blender",
        new Block(AbstractBlock.Settings.create().requiresTool().strength(1.0f, 1.0f).nonOpaque()));
    public static final Block CHEMICAL_REACTOR = register("chemical_reactor",
        new Block(AbstractBlock.Settings.create().requiresTool().strength(2.0f, 6.0f).nonOpaque()));
    public static final Block THREE_D_PRINTER = register("three_d_printer",
        new Block(AbstractBlock.Settings.create().requiresTool().strength(1.5f, 3.0f).nonOpaque()));

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

