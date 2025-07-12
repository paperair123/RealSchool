package papercliper.realschool.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.util.Identifier;
import org.jetbrains.annotations.NotNull;
import papercliper.realschool.RealSchool;


public class ModItems {
    public static final Item CHALK = registerItems("chalk", new Item(new Item.Settings()));

    public static final Item BASKETBALL = registerItems("basketball", new Item(new Item.Settings()));

//    注册物品
    private static Item registerItems(String id, Item item){
//        弃用的注册策略⬇
//        return Registry.register(Registries.ITEM, RegistryKey.of(Registries.ITEM.getKey(), Identifier.of(RealSchool.MOD_ID, id)), item);
//        注册策略⬇
        return Registry.register(Registries.ITEM, Identifier.of(RealSchool.MOD_ID, id), item);
    }

    private static void addItemToItemGroup(FabricItemGroupEntries fabricItemGroupEntries){
//        在这里将物品添加到物品栏
        fabricItemGroupEntries.add(CHALK);
        fabricItemGroupEntries.add(BASKETBALL);
    }
    public static void registerModItems(){
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(ModItems::addItemToItemGroup);
//        注册物品输出日志
        RealSchool.LOGGER.info("Registering Items");
    }
}
