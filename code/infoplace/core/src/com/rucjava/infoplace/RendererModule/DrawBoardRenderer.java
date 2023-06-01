package com.rucjava.infoplace.RendererModule;

import com.badlogic.gdx.graphics.glutils.ShapeRenderer;
import com.rucjava.infoplace.ObjectPool.RendererPool;

public final class DrawBoardRenderer implements Renderable {
    private final ShapeRenderer shapeRenderer;

    public DrawBoardRenderer() {
        this.shapeRenderer = RendererPool.shapeRendererInject();
    }
    public void render() {

    }
}
