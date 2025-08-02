package papercliper.realschool.item;

import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import papercliper.realschool.RealSchool;
import papercliper.realschool.item.custom.Prospector;
import papercliper.realschool.item.custom.JuiceItem;


public class ModItems {
    public static final Item CHALK = registerItems("chalk", new Item(new Item.Settings()));
    public static final Item BASKETBALL = registerItems("basketball", new Item(new Item.Settings()));
    public static final Item RAW_GYPSUM = registerItems("raw_gypsum", new Item(new Item.Settings()));
    public static final Item CALCINED_GYPSUM = registerItems("calcined_gypsum", new Item(new Item.Settings()));
    public static final Item SLAKED_LIME_DUST = registerItems("slaked_lime_dust", new Item(new Item.Settings()));
    public static final Item PENCIL_COOKIE = registerItems("pencil_cookie", new Item(new Item.Settings().food(ModFoodComponents.PENCIL_COOKIE)));
    public static final Item EXERCISE_BOOK = registerItems("exercise_book", new Item(new Item.Settings()));
    public static final Item PROSPECTOR = registerItems("prospector", new Prospector(new Item.Settings().maxDamage(127)));
    public static final Item BAD_APPLE = registerItems("bad_apple", new Item(new Item.Settings().food(ModFoodComponents.BAD_APPLE)));
    public static final Item MEMORY_BREAD = registerItems("memory_bread", new Item(new Item.Settings().food(ModFoodComponents.MEMORY_BREAD)));

    public static final Item QUICKLIME = registerItems("quicklime", new Item(new Item.Settings()));
    public static final Item SLAKED_LIME = registerItems("slaked_lime", new Item(new Item.Settings()));
    public static final Item ALUMINUM_INGOT = registerItems("aluminum_ingot", new Item(new Item.Settings()));
    public static final Item NICKEL_INGOT = registerItems("nickel_ingot", new Item(new Item.Settings()));
    public static final Item STAINLESS_STEEL_INGOT = registerItems("stainless_steel_ingot", new Item(new Item.Settings()));

    public static final Item RICE = registerItems("rice", new Item(new Item.Settings()));
    public static final Item CHILI = registerItems("chili", new Item(new Item.Settings()));
    public static final Item TEA_LEAF = registerItems("tea_leaf", new Item(new Item.Settings()));
    public static final Item COFFEE_BEAN = registerItems("coffee_bean", new Item(new Item.Settings()));

    public static final Item COOKED_RICE = registerItems("cooked_rice", new Item(new Item.Settings().food(ModFoodComponents.COOKED_RICE)));
    public static final Item RICE_BOWL = registerItems("rice_bowl", new Item(new Item.Settings().food(ModFoodComponents.RICE_BOWL)));
    public static final Item SANDWICH = registerItems("sandwich", new Item(new Item.Settings().food(ModFoodComponents.SANDWICH)));
    public static final Item HAMBURGER = registerItems("hamburger", new Item(new Item.Settings().food(ModFoodComponents.HAMBURGER)));
    public static final Item PIZZA = registerItems("pizza", new Item(new Item.Settings().food(ModFoodComponents.PIZZA)));
    public static final Item STIR_FRIED_VEGETABLES = registerItems("stir_fried_vegetables", new Item(new Item.Settings().food(ModFoodComponents.STIR_FRIED_VEGETABLES)));
    public static final Item SPICY_FRIED_CHICKEN = registerItems("spicy_fried_chicken", new Item(new Item.Settings().food(ModFoodComponents.SPICY_FRIED_CHICKEN)));
    public static final Item SCRAMBLED_EGGS_WITH_TOMATO = registerItems("scrambled_eggs_with_tomato", new Item(new Item.Settings().food(ModFoodComponents.SCRAMBLED_EGGS_WITH_TOMATO)));
    public static final Item POTATO_CHIPS = registerItems("potato_chips", new Item(new Item.Settings().food(ModFoodComponents.POTATO_CHIPS)));
    public static final Item POPCORN = registerItems("popcorn", new Item(new Item.Settings().food(ModFoodComponents.POPCORN)));
    public static final Item CHOCOLATE_BAR = registerItems("chocolate_bar", new Item(new Item.Settings().food(ModFoodComponents.CHOCOLATE_BAR)));
    public static final Item MILK_TEA = registerItems("milk_tea", new JuiceItem(new Item.Settings().maxCount(16)));
    public static final Item COFFEE = registerItems("coffee", new JuiceItem(new Item.Settings().maxCount(16)));
    public static final Item JUICE = registerItems("juice", new JuiceItem(new Item.Settings().maxCount(16)));
    public static final Item COLA = registerItems("cola", new JuiceItem(new Item.Settings().maxCount(16)));

    public static final Item TEXTBOOK = registerItems("textbook", new Item(new Item.Settings()));
    public static final Item EXPERIMENT_KIT = registerItems("experiment_kit", new Item(new Item.Settings()));
    public static final Item PEEKING_POTION = registerItems("peeking_potion", new Item(new Item.Settings()));
    public static final Item FOCUS_POTION = registerItems("focus_potion", new Item(new Item.Settings()));
    public static final Item HARMONICA = registerItems("harmonica", new Item(new Item.Settings()));
    public static final Item TRIANGLE = registerItems("triangle", new Item(new Item.Settings()));
    public static final Item STUDENT_ID = registerItems("student_id", new Item(new Item.Settings()));
    public static final Item CANTEEN_CARD = registerItems("canteen_card", new Item(new Item.Settings()));

    public static final Item DISTILLED_WATER = registerItems("distilled_water", new Item(new Item.Settings()));
    public static final Item FLUORESCENT_POWDER = registerItems("fluorescent_powder", new Item(new Item.Settings()));

//  注册物品
    private static Item registerItems(String id, Item item){
//        弃用的注册策略⬇
//        return Registry.register(Registries.ITEM, RegistryKey.of(Registries.ITEM.getKey(), Identifier.of(RealSchool.MOD_ID, id)), item);
//        注册策略⬇
        return Registry.register(Registries.ITEM, Identifier.of(RealSchool.MOD_ID, id), item);
    }

    public static void registerModItems(){
//      初始化注册物品方法
        RealSchool.LOGGER.info("Registering Items...");
    }
}
