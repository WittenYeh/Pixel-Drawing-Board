package com.rucjava.infoplace.ObjectPool;

import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;
import com.rucjava.infoplace.RendererModule.ImageBox;

import java.awt.*;

public class RendererPool {
    private final static SpriteBatch batch;
    private final static ImageBox imageBox;
    private final static ShapeRenderer shapeRenderer;

    static {
        batch = new SpriteBatch();
        imageBox = new ImageBox();
        shapeRenderer = new ShapeRenderer();
    }
    public static SpriteBatch batchInject() {
        return batch;
    }
    public static ImageBox imageBoxInject() {
        return imageBox;
    }
    public static ShapeRenderer shapeRendererInject() {
        return shapeRenderer;
    }
}
