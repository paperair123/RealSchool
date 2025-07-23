package papercliper.realschool.mixin;

import net.minecraft.entity.mob.EndermanEntity;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Invoker;

// 这是一个 Mixin 类，它将注入到原版 Minecraft 的 EndermanEntity (末影人实体) 类中。
// Mixin 的作用是允许我们对原版类的行为进行修改或访问其非公开成员，而无需直接修改原版游戏文件。
@Mixin(EndermanEntity.class)
public interface EndermanEntityMixin {
    // @Invoker 注解用于创建一个“调用器”方法，允许我们从 Mixin 外部调用原版类中的非公开方法。
    // 它会自动生成一个方法体，使得我们可以像调用普通方法一样，调用 EndermanEntity 类中名为 "teleportTo" 的方法。
    // "teleportTo" 是末影人用于瞬移到指定坐标的内部方法。
    // 方法签名 (参数类型和返回类型) 必须与原版方法完全匹配。
    @Invoker("teleportTo")
    boolean invokeTeleportTo(double x, double y, double z);
}
