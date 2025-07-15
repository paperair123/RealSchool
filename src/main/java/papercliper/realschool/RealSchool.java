package papercliper.realschool;

import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import papercliper.realschool.block.ModBlocks;
import papercliper.realschool.item.ModItemGroups;
import papercliper.realschool.item.ModItems;

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
		LOGGER.info("Initialization complete!");
	}
}