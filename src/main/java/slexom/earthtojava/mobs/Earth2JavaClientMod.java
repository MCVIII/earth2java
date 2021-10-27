package slexom.earthtojava.mobs;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.event.client.ClientSpriteRegistryCallback;
import net.minecraft.client.render.TexturedRenderLayers;
import net.minecraft.util.Identifier;
import slexom.earthtojava.mobs.init.EntityModeLayersInit;
import slexom.earthtojava.mobs.init.renderer.RendererInit;

public class Earth2JavaClientMod implements ClientModInitializer {

    @Override
    public void onInitializeClient() {
        EntityModeLayersInit.init();
        RendererInit.init();
    }
}
