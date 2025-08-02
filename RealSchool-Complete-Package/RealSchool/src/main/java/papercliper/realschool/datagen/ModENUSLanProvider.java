package papercliper.realschool.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;
import net.minecraft.registry.RegistryWrapper;
import papercliper.realschool.block.ModBlocks;
import papercliper.realschool.entity.ModEntities;
import papercliper.realschool.item.ModItems;

import java.util.concurrent.CompletableFuture;

public class ModENUSLanProvider extends FabricLanguageProvider {
    public ModENUSLanProvider(FabricDataOutput dataOutput,
                              CompletableFuture<RegistryWrapper.WrapperLookup> registryLookup) {
        super(dataOutput, "en_us", registryLookup);
    }

    @Override
    public void generateTranslations(RegistryWrapper.WrapperLookup registryLookup,
                                     TranslationBuilder translationBuilder) {
//      添加物品的英文翻译
         translationBuilder.add(ModItems.CHALK.getTranslationKey(), "Chalk");
        translationBuilder.add(ModItems.BASKETBALL.getTranslationKey(), "Basketball");
        translationBuilder.add(ModItems.CALCINED_GYPSUM.getTranslationKey(), "Calcined Gypsum");
        translationBuilder.add(ModItems.RAW_GYPSUM.getTranslationKey(), "Raw Gypsum");
        translationBuilder.add(ModItems.SLAKED_LIME_DUST.getTranslationKey(), "Slaked Lime Dust");
        translationBuilder.add(ModItems.PENCIL_COOKIE.getTranslationKey(), "Pencil Cookie");
        translationBuilder.add(ModItems.EXERCISE_BOOK.getTranslationKey(), "Exercise Book");
        translationBuilder.add(ModItems.PROSPECTOR.getTranslationKey(), "Prospector");
        translationBuilder.add(ModItems.BAD_APPLE.getTranslationKey(), "Bad Apple");
        translationBuilder.add(ModItems.MEMORY_BREAD.getTranslationKey(), "Memory Bread");
        translationBuilder.add(ModItems.QUICKLIME.getTranslationKey(), "Quicklime");
        translationBuilder.add(ModItems.SLAKED_LIME.getTranslationKey(), "Slaked Lime");
        translationBuilder.add(ModItems.ALUMINUM_INGOT.getTranslationKey(), "Aluminum Ingot");
        translationBuilder.add(ModItems.NICKEL_INGOT.getTranslationKey(), "Nickel Ingot");
        translationBuilder.add(ModItems.STAINLESS_STEEL_INGOT.getTranslationKey(), "Stainless Steel Ingot");
        translationBuilder.add(ModItems.RICE.getTranslationKey(), "Rice");
        translationBuilder.add(ModItems.CHILI.getTranslationKey(), "Chili");
        translationBuilder.add(ModItems.TEA_LEAF.getTranslationKey(), "Tea Leaf");
        translationBuilder.add(ModItems.COFFEE_BEAN.getTranslationKey(), "Coffee Bean");
        translationBuilder.add(ModItems.COOKED_RICE.getTranslationKey(), "Cooked Rice");
        translationBuilder.add(ModItems.RICE_BOWL.getTranslationKey(), "Rice Bowl");
        translationBuilder.add(ModItems.SANDWICH.getTranslationKey(), "Sandwich");
        translationBuilder.add(ModItems.HAMBURGER.getTranslationKey(), "Hamburger");
        translationBuilder.add(ModItems.PIZZA.getTranslationKey(), "Pizza");
        translationBuilder.add(ModItems.STIR_FRIED_VEGETABLES.getTranslationKey(), "Stir-fried Vegetables");
        translationBuilder.add(ModItems.SPICY_FRIED_CHICKEN.getTranslationKey(), "Spicy Fried Chicken");
        translationBuilder.add(ModItems.SCRAMBLED_EGGS_WITH_TOMATO.getTranslationKey(), "Scrambled Eggs with Tomato");
        translationBuilder.add(ModItems.POTATO_CHIPS.getTranslationKey(), "Potato Chips");
        translationBuilder.add(ModItems.POPCORN.getTranslationKey(), "Popcorn");
        translationBuilder.add(ModItems.CHOCOLATE_BAR.getTranslationKey(), "Chocolate Bar");
        translationBuilder.add(ModItems.MILK_TEA.getTranslationKey(), "Milk Tea");
        translationBuilder.add(ModItems.COFFEE.getTranslationKey(), "Coffee");
        translationBuilder.add(ModItems.JUICE.getTranslationKey(), "Juice");
        translationBuilder.add(ModItems.COLA.getTranslationKey(), "Cola");
        translationBuilder.add(ModItems.TEXTBOOK.getTranslationKey(), "Textbook");
        translationBuilder.add(ModItems.EXPERIMENT_KIT.getTranslationKey(), "Experiment Kit");
        translationBuilder.add(ModItems.PEEKING_POTION.getTranslationKey(), "Peeking Potion");
        translationBuilder.add(ModItems.FOCUS_POTION.getTranslationKey(), "Focus Potion");
        translationBuilder.add(ModItems.HARMONICA.getTranslationKey(), "Harmonica");
        translationBuilder.add(ModItems.TRIANGLE.getTranslationKey(), "Triangle");
        translationBuilder.add(ModItems.STUDENT_ID.getTranslationKey(), "Student ID");
        translationBuilder.add(ModItems.CANTEEN_CARD.getTranslationKey(), "Canteen Card");
        translationBuilder.add(ModItems.DISTILLED_WATER.getTranslationKey(), "Distilled Water");
        translationBuilder.add(ModItems.FLUORESCENT_POWDER.getTranslationKey(), "Fluorescent Powder");



//      添加方块的英文翻译
        translationBuilder.add(ModBlocks.CHALK_BLOCK.getTranslationKey(), "Chalk Block");
        translationBuilder.add(ModBlocks.GYPSUM_ORE.getTranslationKey(), "Gypsum Ore");
        translationBuilder.add(ModBlocks.LIMESTONE.getTranslationKey(), "Limestone");
        translationBuilder.add(ModBlocks.GYPSUM_BLOCK.getTranslationKey(), "Gypsum Block");
        translationBuilder.add(ModBlocks.BLACKBOARD.getTranslationKey(), "Blackboard");
        translationBuilder.add(ModBlocks.MODULAR_DESK.getTranslationKey(), "Modular Desk");
        translationBuilder.add(ModBlocks.PODIUM.getTranslationKey(), "Podium");
        translationBuilder.add(ModBlocks.PROJECTOR.getTranslationKey(), "Projector");
        translationBuilder.add(ModBlocks.PROJECTOR_SCREEN.getTranslationKey(), "Projector Screen");
        translationBuilder.add(ModBlocks.CLASSROOM_LOCKER.getTranslationKey(), "Classroom Locker");
        translationBuilder.add(ModBlocks.LAB_BENCH.getTranslationKey(), "Lab Bench");
        translationBuilder.add(ModBlocks.MICROSCOPE.getTranslationKey(), "Microscope");
        translationBuilder.add(ModBlocks.ALCOHOL_LAMP.getTranslationKey(), "Alcohol Lamp");
        translationBuilder.add(ModBlocks.FUME_HOOD.getTranslationKey(), "Fume Hood");
        translationBuilder.add(ModBlocks.BOOKSHELF_WALL.getTranslationKey(), "Bookshelf Wall");
        translationBuilder.add(ModBlocks.LENDING_DESK.getTranslationKey(), "Lending Desk");
        translationBuilder.add(ModBlocks.DIGITAL_READING_DESK.getTranslationKey(), "Digital Reading Desk");
        translationBuilder.add(ModBlocks.BASKETBALL_HOOP.getTranslationKey(), "Basketball Hoop");
        translationBuilder.add(ModBlocks.CLIMBING_WALL.getTranslationKey(), "Climbing Wall");
        translationBuilder.add(ModBlocks.SCOREBOARD.getTranslationKey(), "Scoreboard");
        translationBuilder.add(ModBlocks.RUBBER_TRACK.getTranslationKey(), "Rubber Track");
        translationBuilder.add(ModBlocks.STAINLESS_STEEL_TRAY_RACK.getTranslationKey(), "Stainless Steel Tray Rack");
        translationBuilder.add(ModBlocks.SERVING_WINDOW.getTranslationKey(), "Serving Window");
        translationBuilder.add(ModBlocks.CANTEEN_TABLE.getTranslationKey(), "Canteen Table");
        translationBuilder.add(ModBlocks.BUNK_BED.getTranslationKey(), "Bunk Bed");
        translationBuilder.add(ModBlocks.WARDROBE.getTranslationKey(), "Wardrobe");
        translationBuilder.add(ModBlocks.STUDY_DESK.getTranslationKey(), "Study Desk");
        translationBuilder.add(ModBlocks.SCHOOL_NAMEPLATE.getTranslationKey(), "School Nameplate");
        translationBuilder.add(ModBlocks.BULLETIN_BOARD.getTranslationKey(), "Bulletin Board");
        translationBuilder.add(ModBlocks.FLAGPOLE.getTranslationKey(), "Flagpole");
        translationBuilder.add(ModBlocks.BICYCLE_RACK.getTranslationKey(), "Bicycle Rack");
        translationBuilder.add(ModBlocks.VENDING_MACHINE.getTranslationKey(), "Vending Machine");
        translationBuilder.add(ModBlocks.TRASH_CAN.getTranslationKey(), "Trash Can");
        translationBuilder.add(ModBlocks.STREET_LAMP.getTranslationKey(), "Street Lamp");
        translationBuilder.add(ModBlocks.BAUXITE_ORE.getTranslationKey(), "Bauxite Ore");
        translationBuilder.add(ModBlocks.COPPER_NICKEL_ORE.getTranslationKey(), "Copper Nickel Ore");
        translationBuilder.add(ModBlocks.ALLOY_SMELTER.getTranslationKey(), "Alloy Smelter");
        translationBuilder.add(ModBlocks.KITCHEN_COUNTER.getTranslationKey(), "Kitchen Counter");
        translationBuilder.add(ModBlocks.BLENDER.getTranslationKey(), "Blender");
        translationBuilder.add(ModBlocks.CHEMICAL_REACTOR.getTranslationKey(), "Chemical Reactor");
        translationBuilder.add(ModBlocks.THREE_D_PRINTER.getTranslationKey(), "3D Printer");

//      添加物品栏的英文翻译
        translationBuilder.add("itemGroup.realschool_group", "Real School");

//      添加实体的英文翻译
        translationBuilder.add(ModEntities.STUDENT.getTranslationKey(), "Student");
    }
}