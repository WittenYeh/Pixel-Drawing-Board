package com.rucjava.infoplace.ModelModule;

import com.rucjava.infoplace.ModelModule.ModelUtils.Constants;

public class MainModel {
    private BackgroundModel backgroundModel;
    private CharacterModel characterModel;
    private DrawBoardModel GlobalDrawBoardModel;
    private

    public MainModel() {
        this.backgroundModel = new BackgroundModel();
        this.characterModel = new CharacterModel();

        this.drawBoardModel = new DrawBoardModel();
    }
}
