package papercliper.realschool.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.server.recipe.RecipeExporter;
import net.minecraft.data.server.recipe.RecipeProvider;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.data.server.recipe.ShapelessRecipeJsonBuilder;
import net.minecraft.item.ItemConvertible;
import net.minecraft.item.Items;
import net.minecraft.recipe.CampfireCookingRecipe;
import net.minecraft.recipe.Ingredient;
import net.minecraft.recipe.RecipeSerializer;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.util.Identifier;
import papercliper.realschool.RealSchool;
import papercliper.realschool.block.ModBlocks;
import papercliper.realschool.item.ModItems;

import java.util.List;
import java.util.concurrent.CompletableFuture;

public class ModRecipesProvider extends FabricRecipeProvider {
    private static final List<ItemConvertible> CALCINED_GYPSUM = List.of(ModItems.RAW_GYPSUM,
            ModBlocks.GYPSUM_ORE);
    private static final List<ItemConvertible> SLAKED_LIME_DUST = List.of(ModBlocks.LIMESTONE);
//  以上是可烧制物品的集合

    public ModRecipesProvider(FabricDataOutput output,
                              CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    public void generate(RecipeExporter exporter) {
//      在这里编写可互相转化的物品的配方，详见模组开发手记3.5.1中的内容
        offerReversibleCompactingRecipes(exporter, RecipeCategory.MISC, ModItems.CHALK,
                RecipeCategory.BUILDING_BLOCKS, ModBlocks.CHALK_BLOCK);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.MISC, ModItems.CALCINED_GYPSUM,
                RecipeCategory.BUILDING_BLOCKS, ModBlocks.GYPSUM_BLOCK);

//      在这里编写熔炉配方，详见模组开发手记3.5.2中的内容
        offerSmelting(exporter, CALCINED_GYPSUM, RecipeCategory.MISC, ModItems.CALCINED_GYPSUM,
                0.7f, 200, "calcined_gypsum");
        offerSmelting(exporter, SLAKED_LIME_DUST, RecipeCategory.MISC, ModItems.SLAKED_LIME_DUST,
                0.35f, 200, "slaked_lime_dust");

//      在这里编写高炉配方，详见模组开发手记3.5.2中的内容
        offerBlasting(exporter, CALCINED_GYPSUM, RecipeCategory.MISC, ModItems.CALCINED_GYPSUM,
                0.7f, 100, "calcined_gypsum");
        offerBlasting(exporter, SLAKED_LIME_DUST, RecipeCategory.MISC, ModItems.SLAKED_LIME_DUST,
                0.35f, 100, "slaked_lime_dust");

//      在这里编写营火配方，详见模组开发手记3.5.3中的内容
        offerFoodCookingRecipe(exporter, "campfire_cooking",
                RecipeSerializer.CAMPFIRE_COOKING, CampfireCookingRecipe::new,
                600, ModItems.RAW_GYPSUM, ModItems.CALCINED_GYPSUM, 0.35f);

//      在这里编写有序合成配方，详见模组开发手记3.5.4中的内容
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, Items.SUGAR, 3)
                .pattern("###")
                .input('#', Ingredient.ofItems(Items.BEETROOT))
                .criterion("has_beetroot", RecipeProvider.conditionsFromItem(Items.BEETROOT))
                .offerTo(exporter, Identifier.of(RealSchool.MOD_ID, "beetroot_to_sugar"));
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.BASKETBALL, 1)
                .pattern("XXX")
                .pattern("XYX")
                .pattern("XXX")
                .input('X', Ingredient.ofItems(Items.LEATHER))
                .input('Y', Ingredient.ofItems(Items.SLIME_BALL))
                .criterion("has_leather", RecipeProvider.conditionsFromItem(Items.LEATHER))
                .criterion("has_slime_ball", RecipeProvider.conditionsFromItem(Items.SLIME_BALL))
                .offerTo(exporter, Identifier.of(RealSchool.MOD_ID, "basketball_recipe"));
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.EXERCISE_BOOK, 1)
                .pattern("SSS")
                .pattern("PPP")
                .pattern("PPP")
                .input('S', Ingredient.ofItems(Items.STRING))
                .input('P', Ingredient.ofItems(Items.PAPER))
                .criterion("has_paper", RecipeProvider.conditionsFromItem(Items.PAPER))
                .criterion("has_string", RecipeProvider.conditionsFromItem(Items.STRING))
                .offerTo(exporter, Identifier.of(RealSchool.MOD_ID, "exercise_book"));

//      在这里编写无序合成配方，详见模组开发手记3.5.4中的内容
        ShapelessRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CHALK_BLOCK, 3)
                .input(ModItems.CHALK)
                .criterion("has_chalk", RecipeProvider.conditionsFromItem(ModItems.CHALK))
                .offerTo(exporter, Identifier.of(RealSchool.MOD_ID, "chalk_to_chalk_block"));
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.CHALK, 1)
                .input(ModItems.CALCINED_GYPSUM)
                .input(ModItems.SLAKED_LIME_DUST)
                .criterion("has_calcined_gypsum",
                        RecipeProvider.conditionsFromItem(ModItems.CALCINED_GYPSUM))
                .criterion("has_slaked_lime_dust",
                        RecipeProvider.conditionsFromItem(ModItems.SLAKED_LIME_DUST))
                .offerTo(exporter, Identifier.of(RealSchool.MOD_ID,
                        "calcined_gypsum_and_slaked_lime_dust_to_chalk"));
        ShapelessRecipeJsonBuilder.create(RecipeCategory.FOOD, ModItems.PENCIL_COOKIE, 1)
                .input(Items.COOKIE)
                .input(Items.YELLOW_DYE)
                .input(Items.PINK_DYE)
                .input(Items.STICK)
                .criterion("has_cookie", RecipeProvider.conditionsFromItem(Items.COOKIE))
                .offerTo(exporter, Identifier.of(RealSchool.MOD_ID, "pencil_cookie"));
    }
}
