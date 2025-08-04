# RealSchool模组开发手记

*上一次编辑日期：*
$$
2025年8月5日
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
&nbsp;
#### 燃料物品的注册

​	燃料物品涉及Minecraft源代码中私有变量的修改，有两种方法可以添加燃烧物。

###### 方法一：Mixin

以下是使用Mixin注册的代码示例。
```java
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
    @Shadow private static volatile @Nullable Map<Item, Integer> *fuelTimes*;

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
        *fuelTimes*.put(ModItems.*EXERCISE_BOOK*, 100);
    }
}
```
​	接下来按照一般物品的注册方法进行注册。



###### 方法二：Fabric API

使用Fabric API进行燃料物品注册，只需要在模组主文件的`onInitialize()`方法下添加代码
```java
FuelRegistry.INSTANCE.add(ModItems.<需要添加的物品>, <可燃烧时长，单位为tick>);
```
即可。
&nbsp;

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

### 五、Tags

​	Tags是游戏中很重要的一个概念。它代表了一类物品的集合，如”木板“、”羊毛“、”床“等具有多种材质或颜色的方块或物品；也可以表示”矿石“等一类方块。当然，我们也可以自定义一个Tag，将部分物品列入Tag中，这对于配方表的制定和物品的判定有很大的帮助。

​	模组的Tags可以和原版一样，分成Block和Item两类。分别位于`papercliper/realschool/tags/ModBlockTags.java`和`papercliper/realschool/tags/ModItemTags.java`文件中。以下是BlockTags的代码文件示例。

文件`papercliper/realschool/tags/ModBlockTags.java`
```java
package papercliper.realschool.tags;

import net.minecraft.block.Block;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;
import papercliper.realschool.RealSchool;

public class ModBlockTags {
    public static final TagKey<Block> ORE_LIST = of("ore_list");// 这一行就是我们自定义的Tag的名称
    private static TagKey<Block> of(String id) {
        return TagKey.of(RegistryKeys.BLOCK, Identifier.of(RealSchool.MOD_ID, id));
    }
    public static void registerModBlockTags() {
        RealSchool.LOGGER.info("Registering Block Tags...");
    }
}
```

​	与此同时，我们需要在数据生成器内完成Tags内容的添加和数据生成。

文件`papercliper/realschool/datagen/ModBlockTagsProvider.java`
```java
package papercliper.realschool.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.BlockTags;
import papercliper.realschool.block.ModBlocks;
import papercliper.realschool.tags.ModBlockTags;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagsProvider extends FabricTagProvider.BlockTagProvider {
    public ModBlockTagsProvider(FabricDataOutput output,
                                CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }
    @Override
    protected void configure(RegistryWrapper.WrapperLookup wrapperLookup) {
        getOrCreateTagBuilder(BlockTags.PICKAXE_MINEABLE)
//              需要镐子采集的方块
                .add(ModBlocks.CHALK_BLOCK)
                .add(ModBlocks.GYPSUM_ORE)
                .add(ModBlocks.LIMESTONE)
                .add(ModBlocks.GYPSUM_BLOCK)
                .add(ModBlocks.BAUXITE_ORE)
                .add(ModBlocks.COPPER_NICKEL_ORE);

        getOrCreateTagBuilder(BlockTags.NEEDS_STONE_TOOL)
//              需要石质工具采集的方块
                .add(ModBlocks.LIMESTONE)
                .add(ModBlocks.BAUXITE_ORE);

        getOrCreateTagBuilder(ModBlockTags.ORE_LIST)
//              自定义的矿石列表标签，用于探矿器探测矿石
//              模组矿石
                .add(ModBlocks.GYPSUM_ORE)
                .add(ModBlocks.BAUXITE_ORE)
                .add(ModBlocks.COPPER_NICKEL_ORE)
//              原版主世界的矿石
                .forceAddTag(BlockTags.COAL_ORES)
                .forceAddTag(BlockTags.IRON_ORES)
                .forceAddTag(BlockTags.GOLD_ORES)
                .forceAddTag(BlockTags.DIAMOND_ORES)
                .forceAddTag(BlockTags.EMERALD_ORES)
                .forceAddTag(BlockTags.LAPIS_ORES)
                .forceAddTag(BlockTags.REDSTONE_ORES)
                .forceAddTag(BlockTags.COPPER_ORES);
    }
}
```

​	这样，我们就定义了一个标签”ore_list“，包含了模组和原版主世界中的所有矿石。
