package papercliper.realschool.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;
import papercliper.realschool.block.ModBlocks;
import papercliper.realschool.item.ModItems;

public class ModModelsProvider extends FabricModelProvider {
    public ModModelsProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
//      在这里添加六面贴图相同的方块的模型的生成方法
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.CHALK_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.GYPSUM_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.LIMESTONE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.GYPSUM_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.BLACKBOARD);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.MODULAR_DESK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.PODIUM);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.PROJECTOR);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.PROJECTOR_SCREEN);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.CLASSROOM_LOCKER);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.LAB_BENCH);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.MICROSCOPE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.ALCOHOL_LAMP);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.FUME_HOOD);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.BOOKSHELF_WALL);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.LENDING_DESK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.DIGITAL_READING_DESK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.BASKETBALL_HOOP);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.CLIMBING_WALL);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.SCOREBOARD);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.RUBBER_TRACK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.STAINLESS_STEEL_TRAY_RACK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.SERVING_WINDOW);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.CANTEEN_TABLE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.BUNK_BED);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.WARDROBE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.STUDY_DESK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.SCHOOL_NAMEPLATE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.BULLETIN_BOARD);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.FLAGPOLE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.BICYCLE_RACK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.VENDING_MACHINE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.TRASH_CAN);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.STREET_LAMP);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.BAUXITE_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.COPPER_NICKEL_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.ALLOY_SMELTER);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.KITCHEN_COUNTER);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.BLENDER);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.CHEMICAL_REACTOR);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.THREE_D_PRINTER);
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
//      在这里添加物品的模型的生成方法
        itemModelGenerator.register(ModItems.CHALK, Models.GENERATED);
        itemModelGenerator.register(ModItems.BASKETBALL, Models.GENERATED);
        itemModelGenerator.register(ModItems.CALCINED_GYPSUM, Models.GENERATED);
        itemModelGenerator.register(ModItems.RAW_GYPSUM, Models.GENERATED);
        itemModelGenerator.register(ModItems.SLAKED_LIME_DUST, Models.GENERATED);
        itemModelGenerator.register(ModItems.PENCIL_COOKIE, Models.GENERATED);
        itemModelGenerator.register(ModItems.EXERCISE_BOOK, Models.GENERATED);
        itemModelGenerator.register(ModItems.PROSPECTOR, Models.GENERATED);
        itemModelGenerator.register(ModItems.BAD_APPLE, Models.GENERATED);
        itemModelGenerator.register(ModItems.MEMORY_BREAD, Models.GENERATED);
        itemModelGenerator.register(ModItems.QUICKLIME, Models.GENERATED);
        itemModelGenerator.register(ModItems.SLAKED_LIME, Models.GENERATED);
        itemModelGenerator.register(ModItems.ALUMINUM_INGOT, Models.GENERATED);
        itemModelGenerator.register(ModItems.NICKEL_INGOT, Models.GENERATED);
        itemModelGenerator.register(ModItems.STAINLESS_STEEL_INGOT, Models.GENERATED);
        itemModelGenerator.register(ModItems.RICE, Models.GENERATED);
        itemModelGenerator.register(ModItems.CHILI, Models.GENERATED);
        itemModelGenerator.register(ModItems.TEA_LEAF, Models.GENERATED);
        itemModelGenerator.register(ModItems.COFFEE_BEAN, Models.GENERATED);
        itemModelGenerator.register(ModItems.COOKED_RICE, Models.GENERATED);
        itemModelGenerator.register(ModItems.RICE_BOWL, Models.GENERATED);
        itemModelGenerator.register(ModItems.SANDWICH, Models.GENERATED);
        itemModelGenerator.register(ModItems.HAMBURGER, Models.GENERATED);
        itemModelGenerator.register(ModItems.PIZZA, Models.GENERATED);
        itemModelGenerator.register(ModItems.STIR_FRIED_VEGETABLES, Models.GENERATED);
        itemModelGenerator.register(ModItems.SPICY_FRIED_CHICKEN, Models.GENERATED);
        itemModelGenerator.register(ModItems.SCRAMBLED_EGGS_WITH_TOMATO, Models.GENERATED);
        itemModelGenerator.register(ModItems.POTATO_CHIPS, Models.GENERATED);
        itemModelGenerator.register(ModItems.POPCORN, Models.GENERATED);
        itemModelGenerator.register(ModItems.CHOCOLATE_BAR, Models.GENERATED);
        itemModelGenerator.register(ModItems.MILK_TEA, Models.GENERATED);
        itemModelGenerator.register(ModItems.COFFEE, Models.GENERATED);
        itemModelGenerator.register(ModItems.JUICE, Models.GENERATED);
        itemModelGenerator.register(ModItems.COLA, Models.GENERATED);
        itemModelGenerator.register(ModItems.TEXTBOOK, Models.GENERATED);
        itemModelGenerator.register(ModItems.EXPERIMENT_KIT, Models.GENERATED);
        itemModelGenerator.register(ModItems.PEEKING_POTION, Models.GENERATED);
        itemModelGenerator.register(ModItems.FOCUS_POTION, Models.GENERATED);
        itemModelGenerator.register(ModItems.HARMONICA, Models.GENERATED);
        itemModelGenerator.register(ModItems.TRIANGLE, Models.GENERATED);
        itemModelGenerator.register(ModItems.STUDENT_ID, Models.GENERATED);
        itemModelGenerator.register(ModItems.CANTEEN_CARD, Models.GENERATED);
        itemModelGenerator.register(ModItems.DISTILLED_WATER, Models.GENERATED);
        itemModelGenerator.register(ModItems.FLUORESCENT_POWDER, Models.GENERATED);
    }
}
