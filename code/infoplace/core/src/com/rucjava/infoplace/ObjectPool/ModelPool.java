package com.rucjava.infoplace.ObjectPool;

import com.badlogic.gdx.graphics.g3d.Model;
import com.rucjava.infoplace.ModelModule.BackgroundModel;
import com.rucjava.infoplace.ModelModule.CharactersModel;
import com.rucjava.infoplace.ModelModule.DrawBoardModel;
import com.rucjava.infoplace.ModelModule.ModelUtils.Constants;

public class ModelPool {
    static private BackgroundModel backgroundModel;
    static private CharactersModel charactersModel;
    static private DrawBoardModel globalDrawBoardModel;
    static private DrawBoardModel ownDrawboardModel;
    private static ModelPool modelPool;

    static {
        backgroundModel = new BackgroundModel();
        charactersModel = new CharactersModel();
        globalDrawBoardModel = new DrawBoardModel(Constants.DefaultGlobalDrawBoardRowNum,
                Constants.DefaultGlobalDrawBoardColNum);
        ownDrawboardModel = new DrawBoardModel(Constants.DefaultPixelNumPerUser, Constants.DefaultPixelNumPerUser);
    }

    public static BackgroundModel backgroundModelInject() {
        return backgroundModel;
    }
    public static CharactersModel charactersModelInject() {
        return charactersModel;
    }
    public static DrawBoardModel globalDrawBoardModelInject() {
        return globalDrawBoardModel;
    }
    public static DrawBoardModel ownDrawBoardModelInject() {
        return ownDrawboardModel;
    }
}
