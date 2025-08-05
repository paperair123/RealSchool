package papercliper.realschool.entity.client;

import net.minecraft.client.render.entity.BipedEntityRenderer;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.render.entity.model.BipedEntityModel;
import net.minecraft.client.render.entity.model.EntityModelLayers;
import net.minecraft.util.Identifier;
import papercliper.realschool.RealSchool;
import papercliper.realschool.entity.StudentEntity;

public class StudentEntityRenderer extends BipedEntityRenderer<StudentEntity, BipedEntityModel<StudentEntity>> {
    private static final Identifier TEXTURE = Identifier.of(RealSchool.MOD_ID, "textures/entity/student.png");

    public StudentEntityRenderer(EntityRendererFactory.Context ctx) {
        super(ctx, new BipedEntityModel<>(ctx.getPart(EntityModelLayers.PLAYER)), 0.5f);
    }

    @Override
    public Identifier getTexture(StudentEntity entity) {
        return TEXTURE;
    }
}


