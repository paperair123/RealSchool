package papercliper.realschool.entity;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import papercliper.realschool.RealSchool;

public class ModEntities {

    public static final EntityType<StudentEntity> STUDENT = Registry.register(
            Registries.ENTITY_TYPE, Identifier.of(RealSchool.MOD_ID, "student"),
            EntityType.Builder.create(StudentEntity::new, SpawnGroup.CREATURE)
                    .dimensions(0.6f, 1.8f).build());

    public static void registerModEntities() {
        RealSchool.LOGGER.info("Registering Entities for " + RealSchool.MOD_ID);
    }
}


