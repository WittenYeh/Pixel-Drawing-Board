package com.rucjava.infoplace.ControllerModule;

import com.rucjava.infoplace.ModelModule.ModelUtils.BackgroundType;
import com.rucjava.infoplace.ObjectPool.ModelPool;

public class DeskSceneController extends DrawBoardController {
    public DeskSceneController() {
        super();
    }

    @Override
    public void initDrawBoard() {
        this.drawBoardModel = ModelPool.ownDrawBoardModelInject();
    }
}
