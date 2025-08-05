package papercliper.realschool.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricDynamicRegistryProvider;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.RegistryKeys;
import papercliper.realschool.world.ModConfiguredFeatures;

import java.util.concurrent.CompletableFuture;

public class ModConfiguredFeatureProvider extends FabricDynamicRegistryProvider {
    public ModConfiguredFeatureProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup registries, Entries entries) {
        entries.addAll(registries.getWrapperOrThrow(RegistryKeys.CONFIGURED_FEATURE));
    }

    @Override
    public String getName() {
        return "Configured Features";
    }
}

