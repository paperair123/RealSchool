package papercliper.realschool.item.custom;

import net.minecraft.advancement.criterion.Criteria;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;
import net.minecraft.stat.Stats;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.util.UseAction;
import net.minecraft.world.World;
import net.minecraft.entity.effect.StatusEffect;

import java.util.List;
import java.util.Random;

public class JuiceItem extends Item {
    // 定义可能的正面效果列表
    private static final List<RegistryEntry<StatusEffect>> POSITIVE_EFFECTS = List.of(
            StatusEffects.SPEED,           // 速度
            StatusEffects.HASTE,           // 急迫
            StatusEffects.STRENGTH,        // 力量
            StatusEffects.JUMP_BOOST,      // 跳跃提升
            StatusEffects.REGENERATION,    // 再生
            StatusEffects.RESISTANCE,      // 抗性提升
            StatusEffects.FIRE_RESISTANCE, // 火焰保护
            StatusEffects.WATER_BREATHING, // 水下呼吸
            StatusEffects.NIGHT_VISION,    // 夜视
            StatusEffects.HEALTH_BOOST,    // 生命提升
            StatusEffects.ABSORPTION,      // 伤害吸收
            StatusEffects.SATURATION,      // 饱和
            StatusEffects.LUCK            // 幸运
    );

    public JuiceItem(Settings settings) {
        super(settings);
    }

    @Override
    public ItemStack finishUsing(ItemStack stack, World world, LivingEntity user) {
        super.finishUsing(stack, world, user);
        
        if (user instanceof ServerPlayerEntity serverPlayer) {
            Criteria.CONSUME_ITEM.trigger(serverPlayer, stack);
            serverPlayer.incrementStat(Stats.USED.getOrCreateStat(this));
        }

        if (!world.isClient) {
            // 随机选择一个正面效果
            Random random = new Random();
            RegistryEntry<StatusEffect> randomEffect = POSITIVE_EFFECTS.get(random.nextInt(POSITIVE_EFFECTS.size()));
            
            // 给予15秒的效果（300 ticks）
            StatusEffectInstance effectInstance = new StatusEffectInstance(randomEffect, 300, 0);
            user.addStatusEffect(effectInstance);
        }

        if (user instanceof PlayerEntity && !((PlayerEntity)user).getAbilities().creativeMode) {
            stack.decrement(1);
        }

        // 返回空瓶子
        if (user instanceof PlayerEntity player && stack.isEmpty()) {
            return new ItemStack(Items.GLASS_BOTTLE);
        }

        return stack;
    }

    public int getMaxUseTime(ItemStack stack) {
        return 32; // 与药水相同的使用时间
    }

    @Override
    public UseAction getUseAction(ItemStack stack) {
        return UseAction.DRINK; // 使用饮用动作
    }

    public SoundEvent getDrinkSound() {
        return SoundEvents.ENTITY_GENERIC_DRINK; // 饮用音效
    }

    @Override
    public SoundEvent getEatSound() {
        return SoundEvents.ENTITY_GENERIC_DRINK; // 饮用音效
    }

    @Override
    public TypedActionResult<ItemStack> use(World world, PlayerEntity user, Hand hand) {
        user.setCurrentHand(hand);
        return TypedActionResult.consume(user.getStackInHand(hand));
    }
}

