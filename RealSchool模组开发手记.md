# RealSchool模组开发手记

*上一次编辑日期：*
$$
2025年7月16日
$$

### 一、物品的注册

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



