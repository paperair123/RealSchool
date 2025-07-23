# RealSchool模组开发手记

*上一次编辑日期：*
$$
2025年7月23日
$$

### 一、物品的注册

#### 一般物品的注册

###### 需要修改的文件

1.`papercliper/realschool/item/ModItems.java` （在这里编写物品属性）

2.`papercliper/realschool/item/ModItemGroups.java` （在这里将物品注册至物品栏）

3.`assets/realschool/lang/en_us.json` （英语语言文件）

4.`assets/realschool/lang/zh_cn.json` （中文语言文件）

5.`assets/realschool/models/item/(物品英文名).json` （在这里将物品与贴图绑定）

> [!NOTE]
>
> e.g.
>
> `assets/realschool/models/item/basketball.json`

6.`assets/realschool/textures/item/(物品英文名).png` （物品贴图）

> [!NOTE]
>
> e.g.
>
> `assets/realschool/textures/item/basketball.png`



#### 食品物品的注册

食品物品的注册与一般物品大致相同，但需要在`papercliper/realschool/item/ModFoodComponents.java`中编写食物组件，以下是一个代码示例。
```java
public static final FoodComponent PENCIL_COOKIE = new FoodComponent.Builder()
            .nutrition(2) // 食物恢复的饥饿值
            .saturationModifier(0.1f) // 食物的饱和度
//          吃下食物的效果，第一个值为效果时长(刻)，第二个值为出现该效果的几率
            .statusEffect(new StatusEffectInstance(StatusEffects.GLOWING, 300), 1.0f)
            .alwaysEdible() // 食物可以在任意时刻食用
            .build(); // 这是构建器模式的最后一步，它根据之前设置的所有属性，创建并返回一个完整的FoodComponent对象
```

在完成食物组件编写后，按照正常物品处理即可，但注册物品时应增加`food()`方法，以下是一个示例。
```java
public static final Item PENCIL_COOKIE = registerItems("pencil_cookie", new Item(new Item.Settings().food(ModFoodComponents.PENCIL_COOKIE)));
```

### 二、方块的注册

###### 需要修改的文件

1.`papercliper/realschool/block/ModBlocks.java` （在这里编写方块属性）

2.`papercliper/realschool/item/ModItemGroups.java` （在这里将方块注册至物品栏）

3.`assets/realschool/lang/en_us.json` （英语语言文件）

4.`assets/realschool/lang/zh_cn.json` （中文语言文件）

5.`assets/realschool/models/block/(方块英文名).json`（在这里将方块与贴图绑定）

> [!NOTE]
>
> e.g.
>
> `assets/realschool/models/block/chalk_block.json`

6.`assets/realschool/textures/block/(方块英文名).png` （方块贴图）

> [!CAUTION]
>
> 方块贴图的一般大小为16×16像素

> [!NOTE]
>
> e.g.
>
> `assets/realschool/models/block/chalk_block.png`

7.`assets/realschool/blockstates/(方块英文名).json` （在这里设置方块状态）

> [!NOTE]
>
> e.g.
>
> `assets/realschool/blockstates/chalk_block.json`

8.`assets/realschool/models/item/(方块英文名).json` （在这里将方块物品与贴图绑定）

> [!NOTE]
>
> e.g.
>
> `assets/realschool/models/item/chalk_block.json`



###### 一些细节

1.**方块**应在`data/realschool/loot_table/blocks/(方块英文名).json`中编写掉落物属性；

2.有需要的方块可在`data/minecraft/tags/block/mineable`目录下编写需要的开采工具类型；

### 三、数据生成

1.方块的数据生成在`papercliper/realschool/datagen/ModBlockTagsProvider.java`中编写；

2.物品的数据生成在`papercliper/realschool/datagen/ModItemTagsProvider.java`中编写；

3.英语语言文件的生成在`papercliper/realschool/datagen/ModENUSLanProvider.java`等文件中编写，如需编写其他语言的语言文件，则在`papercliper/realschool/datagen`目录下新建语言文件数据生成类，如编写中文语言文件，则将类命名为`ModZHCNLanProvider`，并将英语语言文件代码中的`super(dataOutput, "en-us", registryLookup);`修改为`super(dataOutput, "zh-cn", registryLookup);`即可；

4.模型的数据生成在`papercliper/realschool/datagen/ModModelsProvider.java`中编写；

5.配方的数据生成在`papercliper/realschool/datagen/ModRecipesProvider.java`中编写。

> [!IMPORTANT]
>
> 1.如果是可逆配方，则调用`offerReversibleCompactingRecipes()`方法，以下是一个示例，可参考编写类似配方。
>
> *“9个粉笔可以合成1个粉笔块，1个粉笔块也可以”合成“9个粉笔。”*以下是该需求的代码实现。
>
> ```java
> offerReversibleCompactingRecipes(exporter, RecipeCategory.MISC, ModItems.CHALK, RecipeCategory.BUILDING_BLOCKS, ModBlocks.CHALK_BLOCK);
> ```
>
> 该方法的具体实现见`net/minecraft/data/server/recipe/RecipeProvider.java`中的第489至495行；
>
> 2.如果是熔炉配方，则调用`offerSmelting()`方法，以下是一个示例，可参考编写类似配方。
>
> *”熟石膏需要通过生石膏烧制而成。“*以下是该需求的代码实现。
>
> ```java
> offerSmelting(exporter, CALCINED_GYPSUM, RecipeCategory.MISC, ModItems.CALCINED_GYPSUM, 0.7f, 200, "calcined_gypsum");
> ```
>
> 高炉配方编写方法与熔炉相似，只需要将`offerSmelting()`方法替换为`offerBlasting()`，并适当减小”烹饪时间(`cookingTime`)“的值即可。
>
> 3.如果是营火配方，则调用`offerFoodCookingRecipe()`方法，以下是一个示例，可参考编写类似配方。
>
> *”熟石膏也可以使用营火由生石膏烧制而成。“*以下是该需求的代码实现。
>
> ```java
> offerFoodCookingRecipe(exporter, "campfire_cooking", RecipeSerializer.CAMPFIRE_COOKING, CampfireCookingRecipe::new, 600, ModItems.RAW_GYPSUM, ModItems.CALCINED_GYPSUM, 0.35f);
> ```
> 4.如果是有序合成配方，则调用`ShapedRecipeJsonBuilder.create()`方法，以下是一个示例，可参考编写类似配方。
>
> *”创建一个名为 `realschool:beetroot_to_sugar` 的**有序合成配方**。当玩家的背包里有**甜菜根**时，这个配方就会解锁。这个配方的形状是1x3，需要**3个甜菜根**，合成后会得到**3个糖**。这个配方在配方书中属于**杂项**类别。“*以下是该需求的代码实现。
>
> ```java
> ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, Items.SUGAR, 3)
>      .pattern("###")
>      .input('#', Ingredient.ofItems(Items.BEETROOT))
>      .criterion("has_item", RecipeProvider.*conditionsFromItem(Items.BEETROOT))
>      .offerTo(exporter, Identifier.of(RealSchool.MOD_ID, "beetroot_to_sugar"));
> ```
> `.pattern()`设置了配方在工作台中要求的形状，如需多排，则每一排都需要分别调用`.pattern()`；
>
> `.input()`将对应的材料与占位符绑定，如需多种材料合成，则需要为每一种材料分别调用`.input()`；
>
> `.criterion()`为使用该配方的条件，示例中的条件为背包中拥有至少1个甜菜根
>
> `.offerTo()`设置了该配方的名称和导出路径
>
> 无序合成配方与有序合成配方类似，在无需合成配方中，`.pattern()`不需要调用，`.input()`中直接填写原料，如`ModItems.CALCINED_GYPSUM`；

在所有数据编写完毕后，运行Gradle中的Data Generation任务完成数据生成。

### 四、使用Mixin修改游戏的源代码

​	Mixin可以在Minecraft的源代码中插入我们自己写的代码，从而达到修改或增加游戏功能的目的。不过使用Mixin可能会调用到游戏原有的方法或者访问一些私有字段，若同时安装多个模组可能会导致冲突，所以不应该在模组开发中大量使用Mixin。

###### 如何使用Mixin

​	使用Mixin需要编辑2个文件，分别为`papercliper/realschool/mixin/ExampleMixin.java`和`realschool.mixins.json`，以下是一个Mixin的示例。
```java
package papercliper.realschool.mixin;

import net.minecraft.server.MinecraftServer;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(MinecraftServer.class) // 表示注入的类为位于MinecraftServer.java中
public class ExampleMixin {
    @Inject(at = @At("HEAD"), method = "loadWorld")
    // "inject"为插入注解 "method"表示插入的方法 "HEAD"表示在方法的第一行插入代码
    private void init(CallbackInfo info) {
       System.out.println("Hello Minecraft!");
    }
}
```
```json
{
  "required": true,
  "package": "papercliper.realschool.mixin",
  "compatibilityLevel": "JAVA_21",
  "mixins": [
    "ExampleMixin"
  ],
  "injectors": {
    "defaultRequire": 1
  },
  "overwrites": {
    "requireAnnotations": true
  }
}
```

​	以上代码实现了在游戏加载世界过程中在控制台输出”Hello Minecraft!“的功能，实际上会在控制台输出`[Server thread/INFO] (Minecraft) [STDOUT]: Hello Minecraft!`

