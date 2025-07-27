package papercliper.realschool.item;

import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import papercliper.realschool.RealSchool;
import papercliper.realschool.item.custom.Prospector;


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
