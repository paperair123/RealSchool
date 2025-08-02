package papercliper.realschool;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.registry.FuelRegistry;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import papercliper.realschool.block.ModBlocks;
import papercliper.realschool.item.ModItemGroups;
import papercliper.realschool.item.ModItems;
import papercliper.realschool.entity.ModEntities;
import papercliper.realschool.mixin.GrassColorsMixin;
import papercliper.realschool.world.ModWorldGeneration;

public class RealSchool implements ModInitializer {
	public static final String MOD_ID = "realschool";

	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
//		调用各类的初始化方法
		LOGGER.info("Start initializing...");
//      调用物品初始化方法
		ModItems.registerModItems();
//		调用物品栏初始化方法
		ModItemGroups.registerModItemGroups();
//		调用方块初始化方法
		ModBlocks.registerModBlocks();
		ModEntities.registerModEntities();
//		调用世界生成初始化方法
//		ModWorldGeneration.generateModWorldGen();

//		___以下为测试用代码___
//		获取当前的草地颜色映射数组
//		int[] colorMap = GrassColorsMixin.getColorMap();
// 		记录当前草地颜色映射数组的长度到日志中
//		LOGGER.info("Grass color map length: " + colorMap.length);

// 		创建一个新的整型数组，长度为 128
//		int[] newColorMap = new int[128];
// 		通过 Mixin 设置草地颜色映射数组为新创建的数组
//		GrassColorsMixin.setColorMap(newColorMap);
// 		再次记录设置后草地颜色映射数组的长度到日志中，确认修改是否成功
// 		使用 {} 占位符是 SLF4J (LOGGER) 推荐的日志格式，避免字符串拼接的开销
//		LOGGER.info("Grass color map length: {}", GrassColorsMixin.getColorMap().length);
//		使用FabricAPI注册燃料物品↓
//		FuelRegistry.INSTANCE.add(ModItems.EXERCISE_BOOK, 100);
//		___以上为测试用代码___

		LOGGER.info("Initialization complete!");
	}
}