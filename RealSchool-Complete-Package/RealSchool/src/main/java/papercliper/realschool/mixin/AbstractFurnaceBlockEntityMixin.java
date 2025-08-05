package papercliper.realschool.mixin;

import net.minecraft.block.entity.AbstractFurnaceBlockEntity;
import net.minecraft.item.Item;
import org.jetbrains.annotations.Nullable;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;
import papercliper.realschool.item.ModItems;

import java.util.Map;

// 这是一个 Mixin 类，它将注入到原版 Minecraft 的 AbstractFurnaceBlockEntity 类中。
// AbstractFurnaceBlockEntity 是熔炉、高炉、烟熏炉等所有烧炼方块实体的抽象父类。
// 对它进行注入，意味着对所有这些烧炼设备都生效。
@Mixin(AbstractFurnaceBlockEntity.class)
public abstract class AbstractFurnaceBlockEntityMixin {

//  @Shadow 注解用于声明一个“影子”字段，它代表了原版类中的一个同名字段。
//  这样你就可以在 Mixin 中访问（读取或修改）原版类的私有或保护级别字段，而无需直接修改原版代码。
//  'fuelTimes' 是原版游戏中存储所有燃料及其燃烧时间的静态 Map。
//  'volatile' 和 '@Nullable' 是原版字段可能带有的修饰符，通常在这里照抄即可。
    @Shadow private static volatile @Nullable Map<Item, Integer> fuelTimes;

//  注解用于在原版方法的特定位置注入代码。
//  method = "createFuelTimeMap": 指定了要注入的原版方法名称。
//  这个方法通常在游戏启动时被调用，用于构建燃料时间映射表。
//  at = @At("TAIL"): 指定了注入的位置。
//  "TAIL" 意味着代码将在原版方法执行的“尾部”（即方法即将返回之前）被执行。
//  CallbackInfoReturnable<Map<Item, Integer>> cir: 这是 Mixin 注入方法的标准参数。
//  'cir' 用于访问原版方法的返回结果（如果方法有返回值的话）并在需要时修改它。
    @Inject(method = "createFuelTimeMap", at = @At("TAIL"))
    private static void addFuelItems(CallbackInfoReturnable<Map<Item, Integer>> cir) {
//      这行代码通过之前 @Shadow 声明的 'fuelTimes' 字段，向原版燃料时间 Map 中添加自定义燃料。
//      ModItems.EXERCISE_BOOK: 这是模组中“纸质练习册”物品的引用。
//      100: 这是为纸质练习册设置的燃烧时间，单位是游戏刻 (ticks)。
//      这意味着每个纸质练习册在熔炉中能燃烧 100 刻（即 5 秒）。
        fuelTimes.put(ModItems.EXERCISE_BOOK, 100);
        fuelTimes.put(ModItems.TEXTBOOK, 200);
    }
}