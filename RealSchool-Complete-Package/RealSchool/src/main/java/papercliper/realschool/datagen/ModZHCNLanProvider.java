package papercliper.realschool.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;
import net.minecraft.registry.RegistryWrapper;
import papercliper.realschool.block.ModBlocks;
import papercliper.realschool.item.ModItems;
import papercliper.realschool.entity.ModEntities;

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
        translationBuilder.add(ModItems.CHALK.getTranslationKey(), "粉笔");
        translationBuilder.add(ModItems.BASKETBALL.getTranslationKey(), "篮球");
        translationBuilder.add(ModItems.CALCINED_GYPSUM.getTranslationKey(), "熟石膏");
        translationBuilder.add(ModItems.RAW_GYPSUM.getTranslationKey(), "生石膏");
        translationBuilder.add(ModItems.SLAKED_LIME_DUST.getTranslationKey(), "熟石灰粉");
        translationBuilder.add(ModItems.PENCIL_COOKIE.getTranslationKey(), "铅笔饼干");
        translationBuilder.add(ModItems.EXERCISE_BOOK.getTranslationKey(), "练习册");
        translationBuilder.add(ModItems.PROSPECTOR.getTranslationKey(), "探矿者");
        translationBuilder.add(ModItems.BAD_APPLE.getTranslationKey(), "坏苹果");
        translationBuilder.add(ModItems.MEMORY_BREAD.getTranslationKey(), "记忆面包");
        translationBuilder.add(ModItems.QUICKLIME.getTranslationKey(), "生石灰");
        translationBuilder.add(ModItems.SLAKED_LIME.getTranslationKey(), "熟石灰");
        translationBuilder.add(ModItems.ALUMINUM_INGOT.getTranslationKey(), "铝锭");
        translationBuilder.add(ModItems.NICKEL_INGOT.getTranslationKey(), "镍锭");
        translationBuilder.add(ModItems.STAINLESS_STEEL_INGOT.getTranslationKey(), "不锈钢锭");
        translationBuilder.add(ModItems.RICE.getTranslationKey(), "大米");
        translationBuilder.add(ModItems.CHILI.getTranslationKey(), "辣椒");
        translationBuilder.add(ModItems.TEA_LEAF.getTranslationKey(), "茶叶");
        translationBuilder.add(ModItems.COFFEE_BEAN.getTranslationKey(), "咖啡豆");
        translationBuilder.add(ModItems.COOKED_RICE.getTranslationKey(), "米饭");
        translationBuilder.add(ModItems.RICE_BOWL.getTranslationKey(), "米饭碗");
        translationBuilder.add(ModItems.SANDWICH.getTranslationKey(), "三明治");
        translationBuilder.add(ModItems.HAMBURGER.getTranslationKey(), "汉堡包");
        translationBuilder.add(ModItems.PIZZA.getTranslationKey(), "披萨");
        translationBuilder.add(ModItems.STIR_FRIED_VEGETABLES.getTranslationKey(), "炒青菜");
        translationBuilder.add(ModItems.SPICY_FRIED_CHICKEN.getTranslationKey(), "香辣炸鸡");
        translationBuilder.add(ModItems.SCRAMBLED_EGGS_WITH_TOMATO.getTranslationKey(), "番茄炒蛋");
        translationBuilder.add(ModItems.POTATO_CHIPS.getTranslationKey(), "薯片");
        translationBuilder.add(ModItems.POPCORN.getTranslationKey(), "爆米花");
        translationBuilder.add(ModItems.CHOCOLATE_BAR.getTranslationKey(), "巧克力棒");
        translationBuilder.add(ModItems.MILK_TEA.getTranslationKey(), "奶茶");
        translationBuilder.add(ModItems.COFFEE.getTranslationKey(), "咖啡");
        translationBuilder.add(ModItems.JUICE.getTranslationKey(), "果汁");
        translationBuilder.add(ModItems.COLA.getTranslationKey(), "可乐");
        translationBuilder.add(ModItems.TEXTBOOK.getTranslationKey(), "教科书");
        translationBuilder.add(ModItems.EXPERIMENT_KIT.getTranslationKey(), "实验工具包");
        translationBuilder.add(ModItems.PEEKING_POTION.getTranslationKey(), "偷窥药水");
        translationBuilder.add(ModItems.FOCUS_POTION.getTranslationKey(), "专注药水");
        translationBuilder.add(ModItems.HARMONICA.getTranslationKey(), "口琴");
        translationBuilder.add(ModItems.TRIANGLE.getTranslationKey(), "三角铁");
        translationBuilder.add(ModItems.STUDENT_ID.getTranslationKey(), "学生证");
        translationBuilder.add(ModItems.CANTEEN_CARD.getTranslationKey(), "饭卡");
        translationBuilder.add(ModItems.DISTILLED_WATER.getTranslationKey(), "蒸馏水");
        translationBuilder.add(ModItems.FLUORESCENT_POWDER.getTranslationKey(), "荧光粉");

//      添加方块的中文翻译
        translationBuilder.add(ModBlocks.CHALK_BLOCK, "粉笔块");
        translationBuilder.add(ModBlocks.GYPSUM_ORE, "石膏矿");
        translationBuilder.add(ModBlocks.LIMESTONE, "石灰石");
        translationBuilder.add(ModBlocks.GYPSUM_BLOCK, "石膏块");
        translationBuilder.add(ModBlocks.BLACKBOARD, "黑板");
        translationBuilder.add(ModBlocks.MODULAR_DESK, "组合式课桌");
        translationBuilder.add(ModBlocks.PODIUM, "讲台");
        translationBuilder.add(ModBlocks.PROJECTOR, "投影仪");
        translationBuilder.add(ModBlocks.PROJECTOR_SCREEN, "投影幕布");
        translationBuilder.add(ModBlocks.CLASSROOM_LOCKER, "教室储物柜");
        translationBuilder.add(ModBlocks.LAB_BENCH, "实验台");
        translationBuilder.add(ModBlocks.MICROSCOPE, "显微镜");
        translationBuilder.add(ModBlocks.ALCOHOL_LAMP, "酒精灯");
        translationBuilder.add(ModBlocks.FUME_HOOD, "通风橱");
        translationBuilder.add(ModBlocks.BOOKSHELF_WALL, "书架墙");
        translationBuilder.add(ModBlocks.LENDING_DESK, "借阅台");
        translationBuilder.add(ModBlocks.DIGITAL_READING_DESK, "电子阅览桌");
        translationBuilder.add(ModBlocks.BASKETBALL_HOOP, "篮球架");
        translationBuilder.add(ModBlocks.CLIMBING_WALL, "攀岩墙");
        translationBuilder.add(ModBlocks.SCOREBOARD, "记分牌");
        translationBuilder.add(ModBlocks.RUBBER_TRACK, "橡胶跑道");
        translationBuilder.add(ModBlocks.STAINLESS_STEEL_TRAY_RACK, "不锈钢餐盘架");
        translationBuilder.add(ModBlocks.SERVING_WINDOW, "打饭窗口");
        translationBuilder.add(ModBlocks.CANTEEN_TABLE, "餐桌");
        translationBuilder.add(ModBlocks.BUNK_BED, "单人床");
        translationBuilder.add(ModBlocks.WARDROBE, "衣柜");
        translationBuilder.add(ModBlocks.STUDY_DESK, "书桌");
        translationBuilder.add(ModBlocks.SCHOOL_NAMEPLATE, "校名牌匾");
        translationBuilder.add(ModBlocks.BULLETIN_BOARD, "公告栏");
        translationBuilder.add(ModBlocks.FLAGPOLE, "旗杆");
        translationBuilder.add(ModBlocks.BICYCLE_RACK, "自行车停放架");
        translationBuilder.add(ModBlocks.VENDING_MACHINE, "自动售货机");
        translationBuilder.add(ModBlocks.TRASH_CAN, "垃圾桶");
        translationBuilder.add(ModBlocks.STREET_LAMP, "路灯");
        translationBuilder.add(ModBlocks.BAUXITE_ORE, "铝土矿");
        translationBuilder.add(ModBlocks.COPPER_NICKEL_ORE, "铜镍矿");
        translationBuilder.add(ModBlocks.ALLOY_SMELTER, "合金熔炉");
        translationBuilder.add(ModBlocks.KITCHEN_COUNTER, "厨房工作台");
        translationBuilder.add(ModBlocks.BLENDER, "搅拌机");
        translationBuilder.add(ModBlocks.CHEMICAL_REACTOR, "化学反应器");
        translationBuilder.add(ModBlocks.THREE_D_PRINTER, "3D打印机");

//      添加物品栏的中文翻译
        translationBuilder.add("itemGroup.realschool_group", "真实校园");

//      添加实体的中文翻译
        translationBuilder.add(ModEntities.STUDENT.getTranslationKey(), "学生");
    }
}


