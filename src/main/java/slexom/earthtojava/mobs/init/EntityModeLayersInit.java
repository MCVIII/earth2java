package slexom.earthtojava.mobs.init;

import net.minecraft.client.model.Dilation;
import net.minecraft.client.render.entity.model.EntityModelLayer;
import slexom.earthtojava.mobs.client.renderer.entity.model.*;

public class EntityModeLayersInit {
    public static EntityModelLayer BOULDERING_ZOMBIE_ENTITY_MODEL_LAYER;
    public static EntityModelLayer FANCY_CHICKEN_ENTITY_MODEL_LAYER;
    public static EntityModelLayer HORNED_SHEEP_ENTITY_MODEL_LAYER;
    public static EntityModelLayer JOLLY_LLAMA_ENTITY_MODEL_LAYER;
    public static EntityModelLayer JUMBO_RABBIT_ENTITY_MODEL_LAYER;
    public static EntityModelLayer LOBBER_ZOMBIE_ENTITY_MODEL_LAYER;
    public static EntityModelLayer SKELETON_WOLF_ENTITY_MODEL_LAYER;
    public static EntityModelLayer VILER_WITCH_ENTITY_MODEL_LAYER;

    public static void init() {
        FANCY_CHICKEN_ENTITY_MODEL_LAYER = RegisterHelper.registerEntityModelLayer(EntityTypesInit.FANCY_CHICKEN_REGISTRY_NAME, FancyChickenModel.getTexturedModelData());
        HORNED_SHEEP_ENTITY_MODEL_LAYER = RegisterHelper.registerEntityModelLayer(EntityTypesInit.HORNED_SHEEP_REGISTRY_NAME, HornedSheepModel.getTexturedModelData());
        JOLLY_LLAMA_ENTITY_MODEL_LAYER = RegisterHelper.registerEntityModelLayer(EntityTypesInit.JOLLY_LLAMA_REGISTRY_NAME, JollyLlamaModel.getTexturedModelData(Dilation.NONE));
        JUMBO_RABBIT_ENTITY_MODEL_LAYER = RegisterHelper.registerEntityModelLayer(EntityTypesInit.JUMBO_RABBIT_REGISTRY_NAME, JumboRabbitModel.getTexturedModelData());
        SKELETON_WOLF_ENTITY_MODEL_LAYER = RegisterHelper.registerEntityModelLayer(EntityTypesInit.SKELETON_WOLF_REGISTRY_NAME, SkeletonWolfModel.getTexturedModelData());
        BOULDERING_ZOMBIE_ENTITY_MODEL_LAYER = RegisterHelper.registerEntityModelLayer(EntityTypesInit.BOULDERING_ZOMBIE_REGISTRY_NAME, BoulderingZombieModel.getTexturedModelData());
        LOBBER_ZOMBIE_ENTITY_MODEL_LAYER = RegisterHelper.registerEntityModelLayer(EntityTypesInit.LOBBER_ZOMBIE_REGISTRY_NAME, LobberZombieModel.getTexturedModelData());
        VILER_WITCH_ENTITY_MODEL_LAYER = RegisterHelper.registerEntityModelLayer(EntityTypesInit.VILER_WITCH_REGISTRY_NAME, VilerWitchModel.getTexturedModelData());
    }

}
