package com.rucjava.infoplace.RendererModule.RenderUtils;

import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.utils.Disposable;
import com.rucjava.infoplace.RendererModule.ImageBox;
import com.rucjava.infoplace.ObjectPool.RendererPool;

public final class BackgroundRenderer implements Renderable {
    private final ImageBox imageBox;
    private Sprite backgorundSprite;
    BackgroundRenderer() {
        this.imageBox = RendererPool.imageBoxInject();

    }
    public void render() {

    }
}
