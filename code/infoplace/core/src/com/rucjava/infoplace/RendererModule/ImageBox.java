package com.rucjava.infoplace.RendererModule;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.utils.Disposable;

import java.util.HashMap;

public class ImageBox implements Disposable {
    private HashMap<String, Texture> images;
    public ImageBox() {
        this.images = new HashMap<>();
    }

    public void initialize() {

    }
    public void put(String str, Texture img) {
        this.images.put(str, img);
    }
    public Texture get(String str, Texture img) {
        return this.images.get(str);
    }

    public void dispose() {
        for (Texture image : images.values())
            image.dispose();
    }
}
