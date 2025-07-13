package papercliper.realschool.item;

import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import papercliper.realschool.RealSchool;

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
                    entries.add(ModItems.CHALK);
                    entries.add(ModItems.BASKETBALL);
                    entries.add(Items.DIAMOND);
                }).build());
    public static void registerModItemGroups() {
        RealSchool.LOGGER.info("Registering Item Groups...");
    }
}
