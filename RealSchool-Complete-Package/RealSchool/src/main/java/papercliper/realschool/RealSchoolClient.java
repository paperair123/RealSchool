package papercliper.realschool;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;
import papercliper.realschool.entity.ModEntities;
import papercliper.realschool.entity.client.StudentEntityRenderer;

public class RealSchoolClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        EntityRendererRegistry.register(ModEntities.STUDENT, StudentEntityRenderer::new);
    }
}