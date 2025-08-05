package papercliper.realschool.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.item.Items;
import net.minecraft.registry.RegistryWrapper;
import org.jetbrains.annotations.Nullable;
import papercliper.realschool.item.ModItems;
import papercliper.realschool.tags.ModItemTags;

import java.util.concurrent.CompletableFuture;

public class ModItemTagsProvider extends FabricTagProvider.ItemTagProvider {
    public ModItemTagsProvider(FabricDataOutput output,
                               CompletableFuture<RegistryWrapper.WrapperLookup> completableFuture) {
        super(output, completableFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup wrapperLookup) {
        getOrCreateTagBuilder(ModItemTags.SUGAR_TAG)
//              在这里添加可用来合成糖的物品
                .add(Items.BEETROOT)
                .add(ModItems.BAD_APPLE)
                .add(ModItems.COOKED_RICE)
                .add(ModItems.RICE);

    }
}


