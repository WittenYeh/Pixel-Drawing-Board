package com.rucjava.infoplace.ModelModule;

import com.rucjava.infoplace.ModelModule.ModelUtils.Constants;

public class MainModel {
    private BackgroundModel backgroundModel;
    private CharactersModel charactersModel;
    private DrawBoardModel globalDrawBoardModel;
    private DrawBoardModel ownDrawboardModel;
    public MainModel() {
        this.backgroundModel = new BackgroundModel();
        this.charactersModel = new CharactersModel();
        this.globalDrawBoardModel = new DrawBoardModel(Constants.DefaultGlobalDrawBoardRowNum,
                                                       Constants.DefaultGlobalDrawBoardColNum);
        this.ownDrawboardModel = new DrawBoardModel(Constants.DefaultPixelNumPerUser, Constants.DefaultPixelNumPerUser);
    }
    public BackgroundModel getBackgroundModel() { return this.backgroundModel; }
    public CharactersModel getCharactersModel() { return this.charactersModel; }
    public DrawBoardModel getOwnDrawboardModel() { return this.ownDrawboardModel; }
    public DrawBoardModel getGlobalDrawBoardModel() { return this.globalDrawBoardModel; }
}
