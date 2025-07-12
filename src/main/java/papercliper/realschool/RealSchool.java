package papercliper.realschool;

import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import papercliper.realschool.item.ModItemGroups;
import papercliper.realschool.item.ModItems;

public class RealSchool implements ModInitializer {
	public static final String MOD_ID = "realschool";

	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
//		所有方法都需要在此处调用以完成初始化

//      注册物品组
		ModItems.registerModItems();
//		注册物品栏
		ModItemGroups.registerModItemGroups();
		LOGGER.info("Hello Fabric world!");
	}
}