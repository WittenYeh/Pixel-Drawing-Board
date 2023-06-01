package com.rucjava.infoplace.RendererModule;

import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.utils.Disposable;
import com.rucjava.infoplace.RendererModule.RenderUtils.Renderable;
import com.rucjava.infoplace.RendererModule.RenderUtils.RendererStack;

public class Renderer implements Renderable, Disposable {
    private SpriteBatch batch;
    private RendererStack rendererStack;

    public Renderer() {
        this.batch = new SpriteBatch();
        this.rendererStack = new RendererStack();
    }

    public void render() {
        this.batch.begin();
        this.rendererStack.render();
        this.batch.end();
    }

    @Override
    public void dispose() {
        this.batch.dispose();
    }
}
