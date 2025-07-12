package papercliper.realschool.item;

import net.minecraft.item.ItemGroup;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;
import papercliper.realschool.RealSchool;

public class ModItemGroups {
    public static final RegistryKey<ItemGroup> REALSCHOOL_GROUP = register("realschool_group");
    private static RegistryKey<ItemGroup> register(String id){
        return RegistryKey.of(RegistryKeys.ITEM_GROUP, Identifier.of(RealSchool.MOD_ID, id));
    }
}
