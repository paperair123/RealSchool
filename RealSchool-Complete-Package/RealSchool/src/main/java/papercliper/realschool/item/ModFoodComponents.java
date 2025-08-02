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
    public static final FoodComponent BAD_APPLE = new FoodComponent.Builder()
            .nutrition(6) // 食物恢复的饥饿值
            .saturationModifier(3.0f)
            .statusEffect(new StatusEffectInstance(StatusEffects.NAUSEA, 300), 0.8f)
            .alwaysEdible()
            .build();// 食物的饱和度
    public static final FoodComponent MEMORY_BREAD = new FoodComponent.Builder()
            .nutrition(5) // 食物恢复的饥饿值
            .saturationModifier(6.0f) // 食物的饱和度
            .statusEffect(new StatusEffectInstance(StatusEffects.REGENERATION, 200), 0.3f) // 吃下食物的效果，第一个值为效果时长，第二个值为出现该效果的几率
            .alwaysEdible() // 食物可以在任意时刻食用
            .build();

    public static final FoodComponent COOKED_RICE = new FoodComponent.Builder().nutrition(3).saturationModifier(0.6f).build();
    public static final FoodComponent RICE_BOWL = new FoodComponent.Builder().nutrition(10).saturationModifier(1.2f).build();
    public static final FoodComponent SANDWICH = new FoodComponent.Builder().nutrition(7).saturationModifier(0.8f).build();
    public static final FoodComponent HAMBURGER = new FoodComponent.Builder().nutrition(12).saturationModifier(1.4f).build();
    public static final FoodComponent PIZZA = new FoodComponent.Builder().nutrition(15).saturationModifier(1.6f).build();
    public static final FoodComponent STIR_FRIED_VEGETABLES = new FoodComponent.Builder().nutrition(8).saturationModifier(1.0f).build();
    public static final FoodComponent SPICY_FRIED_CHICKEN = new FoodComponent.Builder().nutrition(14).saturationModifier(1.5f).build();
    public static final FoodComponent SCRAMBLED_EGGS_WITH_TOMATO = new FoodComponent.Builder().nutrition(9).saturationModifier(1.1f).build();
    public static final FoodComponent POTATO_CHIPS = new FoodComponent.Builder().nutrition(4).saturationModifier(0.4f).build();
    public static final FoodComponent POPCORN = new FoodComponent.Builder().nutrition(5).saturationModifier(0.5f).build();
    public static final FoodComponent CHOCOLATE_BAR = new FoodComponent.Builder().nutrition(6).saturationModifier(0.7f).build();
    public static final FoodComponent MILK_TEA = new FoodComponent.Builder().nutrition(4).saturationModifier(0.5f).alwaysEdible().build();
    public static final FoodComponent COFFEE = new FoodComponent.Builder().nutrition(3).saturationModifier(0.4f).alwaysEdible().build();
    public static final FoodComponent JUICE = new FoodComponent.Builder().nutrition(2).saturationModifier(0.3f).alwaysEdible().build();
    public static final FoodComponent COLA = new FoodComponent.Builder().nutrition(2).saturationModifier(0.2f).alwaysEdible().build();

}