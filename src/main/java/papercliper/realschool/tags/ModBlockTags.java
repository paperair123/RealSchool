package papercliper.realschool.tags;

import net.minecraft.block.Block;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;
import papercliper.realschool.RealSchool;

public class ModBlockTags {
    public static final TagKey<Block> ORE_LIST = of("ore_list");
    private static TagKey<Block> of(String id) {
        return TagKey.of(RegistryKeys.BLOCK, Identifier.of(RealSchool.MOD_ID, id));
    }
    public static void registerModBlockTags() {
        RealSchool.LOGGER.info("Registering Block Tags...");
    }
}
