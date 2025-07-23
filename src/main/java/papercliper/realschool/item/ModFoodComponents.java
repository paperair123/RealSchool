package papercliper.realschool.item;

import net.minecraft.component.type.FoodComponent;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;

public class ModFoodComponents {
    public static final FoodComponent PENCIL_COOKIE = new FoodComponent.Builder()
            .nutrition(2) // 食物恢复的饥饿值
            .saturationModifier(0.1f) // 食物的饱和度
//          吃下食物的效果，第一个值为效果时长，第二个值为出现该效果的几率
            .statusEffect(new StatusEffectInstance(StatusEffects.GLOWING, 300), 1.0f)
            .alwaysEdible() // 食物可以在任意时刻食用
            .build();

}
