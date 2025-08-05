package papercliper.realschool.item;

import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import papercliper.realschool.RealSchool;
import papercliper.realschool.block.ModBlocks;

public class ModItemGroups {
//    原版注册方法↓
//    public static final RegistryKey<ItemGroup> REALSCHOOL_GROUP = register("realschool_group");
//    private static RegistryKey<ItemGroup> register(String id){
//        return RegistryKey.of(RegistryKeys.ITEM_GROUP, Identifier.of(RealSchool.MOD_ID, id));
//    }
//    public static void registerModItemGroups(){
//        Registry.register(Registries.ITEM_GROUP, REALSCHOOL_GROUP,
//                ItemGroup.create(ItemGroup.Row.TOP,
//                        7).displayName(Text.translatable("itemGroup.realschool_group"))
//                        .icon(() -> new ItemStack(ModItems.CHALK)).entries((displayContext, entries) -> {entries.add(ModItems.CHALK);}).build());
//        RealSchool.LOGGER.info("Registering Item Groups...");
//    }
//    20250712:注册物品栏
    public static final ItemGroup REALSCHOOL_GROUP = Registry.register(Registries.ITEM_GROUP, Identifier.of(RealSchool.MOD_ID, "realschool_group"),
        ItemGroup.create(null, -1).displayName(Text.translatable("itemGroup.realschool_group"))
                .icon(() -> new ItemStack(ModItems.CHALK))
                .entries((displayContext, entries) -> {
//                  在这里为物品栏添加物品
//                  从上到下的顺序为物品栏中物品排列顺序
//                  方块在前物品在后
//                  添加方块___BEGIN___
                    entries.add(ModBlocks.CHALK_BLOCK);
                    entries.add(ModBlocks.GYPSUM_ORE);
                    entries.add(ModBlocks.LIMESTONE);
                    entries.add(ModBlocks.GYPSUM_BLOCK);
                    entries.add(ModBlocks.BAUXITE_ORE);
                    entries.add(ModBlocks.COPPER_NICKEL_ORE);
                    entries.add(ModBlocks.BLACKBOARD);
                    entries.add(ModBlocks.MODULAR_DESK);
                    entries.add(ModBlocks.PODIUM);
                    entries.add(ModBlocks.PROJECTOR);
                    entries.add(ModBlocks.PROJECTOR_SCREEN);
                    entries.add(ModBlocks.CLASSROOM_LOCKER);
                    entries.add(ModBlocks.LAB_BENCH);
                    entries.add(ModBlocks.MICROSCOPE);
                    entries.add(ModBlocks.ALCOHOL_LAMP);
                    entries.add(ModBlocks.FUME_HOOD);
                    entries.add(ModBlocks.BOOKSHELF_WALL);
                    entries.add(ModBlocks.LENDING_DESK);
                    entries.add(ModBlocks.DIGITAL_READING_DESK);
                    entries.add(ModBlocks.BASKETBALL_HOOP);
                    entries.add(ModBlocks.CLIMBING_WALL);
                    entries.add(ModBlocks.SCOREBOARD);
                    entries.add(ModBlocks.RUBBER_TRACK);
                    entries.add(ModBlocks.STAINLESS_STEEL_TRAY_RACK);
                    entries.add(ModBlocks.SERVING_WINDOW);
                    entries.add(ModBlocks.CANTEEN_TABLE);
                    entries.add(ModBlocks.BUNK_BED);
                    entries.add(ModBlocks.WARDROBE);
                    entries.add(ModBlocks.STUDY_DESK);
                    entries.add(ModBlocks.SCHOOL_NAMEPLATE);
                    entries.add(ModBlocks.BULLETIN_BOARD);
                    entries.add(ModBlocks.FLAGPOLE);
                    entries.add(ModBlocks.BICYCLE_RACK);
                    entries.add(ModBlocks.VENDING_MACHINE);
                    entries.add(ModBlocks.TRASH_CAN);
                    entries.add(ModBlocks.STREET_LAMP);
                    entries.add(ModBlocks.ALLOY_SMELTER);
                    entries.add(ModBlocks.KITCHEN_COUNTER);
                    entries.add(ModBlocks.BLENDER);
                    entries.add(ModBlocks.CHEMICAL_REACTOR);
                    entries.add(ModBlocks.THREE_D_PRINTER);
//                  添加方块___END___
//                  添加物品___BEGIN___
                    entries.add(ModItems.CHALK);
                    entries.add(ModItems.BASKETBALL);
                    entries.add(ModItems.RAW_GYPSUM);
                    entries.add(ModItems.CALCINED_GYPSUM);
                    entries.add(ModItems.SLAKED_LIME_DUST);
                    entries.add(ModItems.QUICKLIME);
                    entries.add(ModItems.SLAKED_LIME);
                    entries.add(ModItems.ALUMINUM_INGOT);
                    entries.add(ModItems.NICKEL_INGOT);
                    entries.add(ModItems.STAINLESS_STEEL_INGOT);
                    entries.add(ModItems.RICE);
                    entries.add(ModItems.CHILI);
                    entries.add(ModItems.TEA_LEAF);
                    entries.add(ModItems.COFFEE_BEAN);
                    entries.add(ModItems.COOKED_RICE);
                    entries.add(ModItems.RICE_BOWL);
                    entries.add(ModItems.SANDWICH);
                    entries.add(ModItems.HAMBURGER);
                    entries.add(ModItems.PIZZA);
                    entries.add(ModItems.STIR_FRIED_VEGETABLES);
                    entries.add(ModItems.SPICY_FRIED_CHICKEN);
                    entries.add(ModItems.SCRAMBLED_EGGS_WITH_TOMATO);
                    entries.add(ModItems.POTATO_CHIPS);
                    entries.add(ModItems.POPCORN);
                    entries.add(ModItems.CHOCOLATE_BAR);
                    entries.add(ModItems.MILK_TEA);
                    entries.add(ModItems.COFFEE);
                    entries.add(ModItems.JUICE);
                    entries.add(ModItems.COLA);
                    entries.add(ModItems.TEXTBOOK);
                    entries.add(ModItems.EXPERIMENT_KIT);
                    entries.add(ModItems.PEEKING_POTION);
                    entries.add(ModItems.FOCUS_POTION);
                    entries.add(ModItems.HARMONICA);
                    entries.add(ModItems.TRIANGLE);
                    entries.add(ModItems.STUDENT_ID);
                    entries.add(ModItems.CANTEEN_CARD);
                    entries.add(ModItems.PENCIL_COOKIE);
                    entries.add(ModItems.EXERCISE_BOOK);
                    entries.add(ModItems.PROSPECTOR);
                    entries.add(ModItems.BAD_APPLE);
                    entries.add(ModItems.MEMORY_BREAD);
//                  添加物品___END___
                }).build());
    public static void registerModItemGroups() {
//      初始化注册物品栏方法
        RealSchool.LOGGER.info("Registering Item Groups...");
    }
}
