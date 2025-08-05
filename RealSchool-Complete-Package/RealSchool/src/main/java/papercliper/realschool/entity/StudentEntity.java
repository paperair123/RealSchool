package papercliper.realschool.entity;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.ai.goal.*;
import net.minecraft.entity.passive.PassiveEntity;
import net.minecraft.entity.passive.VillagerEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

public class StudentEntity extends PassiveEntity {

    public StudentEntity(EntityType<? extends PassiveEntity> entityType, World world) {
        super(entityType, world);
    }

    @Override
    protected void initGoals() {
        // 基础AI行为
        this.goalSelector.add(0, new SwimGoal(this));
        this.goalSelector.add(1, new EscapeDangerGoal(this, 2.0));
        this.goalSelector.add(2, new LookAtEntityGoal(this, PlayerEntity.class, 6.0f));
        this.goalSelector.add(3, new WanderAroundFarGoal(this, 1.0));
        this.goalSelector.add(4, new LookAroundGoal(this));
    }

    @Nullable
    @Override
    public PassiveEntity createChild(ServerWorld world, PassiveEntity entity) {
        return ModEntities.STUDENT.create(world);
    }
}

