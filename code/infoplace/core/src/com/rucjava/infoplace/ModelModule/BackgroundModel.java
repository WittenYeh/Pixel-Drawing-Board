package com.rucjava.infoplace.ModelModule;

import com.badlogic.gdx.scenes.scene2d.Stage;
import com.rucjava.infoplace.ModelModule.ModelUtils.BackgroundType;
import com.rucjava.infoplace.ModelModule.ModelUtils.Constants;

public class BackgroundModel {
    private BackgroundType backgroundType;
    private final float posX;
    private final float posY;
    public BackgroundModel() {
        this.posX = Constants.DefaultBottomLayerPosX;
        this.posY = Constants.DefaultBottomLayerPosY;
    }
    public void setBackgroundType(BackgroundType type) {
        this.backgroundType = type;
    }
    public BackgroundType getBackgroundType() {
        return this.backgroundType;
    }
}
