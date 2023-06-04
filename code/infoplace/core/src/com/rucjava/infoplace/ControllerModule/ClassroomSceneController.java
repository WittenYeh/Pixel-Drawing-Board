package com.rucjava.infoplace.ControllerModule;

import com.rucjava.infoplace.ModelModule.CharactersModel;
import com.rucjava.infoplace.ModelModule.ModelUtils.BackgroundType;
import com.rucjava.infoplace.ObjectPool.ModelPool;

public class ClassroomSceneController extends BasicSceneController {
    CharactersModel charactersModel;

    public ClassroomSceneController() {
        super();
        this.charactersModel = ModelPool.charactersModelInject();
    }

    @Override
    public void changeBackgroundType() {
        backgroundModel.setBackgroundType(BackgroundType.CLASSROOM);
    }
}
