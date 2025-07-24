package papercliper.realschool.mixin;

import net.minecraft.world.biome.GrassColors;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;


// 这是一个 Mixin 类，它将注入到原版 Minecraft 的 GrassColors (草地颜色) 类中。
// Mixin 允许我们修改或访问原版类的私有成员。
@Mixin(GrassColors.class)
public interface GrassColorsMixin {
    // @Accessor 注解用于创建对原版类私有字段的访问器（getter）方法。
    // 它会自动生成一个方法体，使得在其他地方可以像调用普通方法一样获取 GrassColors 类中名为 "colorMap" 的私有字段的值。
    // "colorMap" 是原版 Minecraft 存储草地颜色数据的私有数组。
    @Accessor("colorMap")
    static int[] getColorMap() {
        // 这行代码实际上永远不会被执行，因为 Mixin 会在运行时动态地替换掉这个方法。
        // 如果 Mixin 应用失败，就会抛出此断言错误，用于调试。
        throw new AssertionError("Mixin failed to apply");
    }

    // @Accessor 注解也用于创建对原版类私有字段的设置器（setter）方法。
    // 它会自动生成一个方法体，使得在其他地方可以像调用普通方法一样修改 GrassColors 类中名为 "colorMap" 的私有字段的值。
    @Accessor("colorMap")
    static void setColorMap(int[] colorMap) {
        // 同上，这行代码也永远不会被执行，是 Mixin 应用失败时的调试提示。
        throw new AssertionError("Mixin failed to apply");
    }
}
