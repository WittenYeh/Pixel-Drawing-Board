package com.rucjava.infoplace.RendererModule;

import com.badlogic.gdx.graphics.g2d.Sprite;
import com.rucjava.infoplace.ObjectPool.RendererPool;
import com.rucjava.infoplace.RendererModule.RenderUtils.ImageBox;

public final class BackgroundRenderer implements Renderable {
    private final ImageBox imageBox;
    private Sprite backgorundSprite;
    BackgroundRenderer() {
        this.imageBox = RendererPool.imageBoxInject();

    }
    public void render() {

    }
}
