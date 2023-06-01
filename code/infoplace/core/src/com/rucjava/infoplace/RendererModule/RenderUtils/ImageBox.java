package com.rucjava.infoplace.RendererModule.RenderUtils;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.utils.Disposable;

import java.util.HashMap;

public class ImageBox implements Disposable {
    private HashMap<String, Sprite> images;
    public ImageBox() {
        this.images = new HashMap<>();
        initialize();
    }
    private void initialize() {

    }
    public void put(String str, Sprite img) {
        this.images.put(str, img);
    }
    public Sprite get(String str) {
        return this.images.get(str);
    }

    public void dispose() {
        for (Sprite image : images.values())
            image.getTexture().dispose();
    }
}
