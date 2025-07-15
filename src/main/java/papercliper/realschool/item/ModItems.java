package papercliper.realschool.item;

import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import papercliper.realschool.RealSchool;


public class ModItems {
    public static final Item CHALK = registerItems("chalk", new Item(new Item.Settings()));

    public static final Item BASKETBALL = registerItems("basketball", new Item(new Item.Settings()));

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
