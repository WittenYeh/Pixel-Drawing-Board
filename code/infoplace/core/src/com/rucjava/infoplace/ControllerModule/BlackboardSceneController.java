package com.rucjava.infoplace.ControllerModule;

import com.badlogic.gdx.Gdx;
import com.rucjava.infoplace.ModelModule.ModelUtils.Constants;
import com.rucjava.infoplace.ObjectPool.ModelPool;

public class BlackboardSceneController extends DrawBoardController {
    public BlackboardSceneController() {
        super(Constants.DefaultGlobalDrawBoardRowNum, Constants.DefaultGlobalDrawBoardColNum,
                Gdx.graphics.getHeight(), Gdx.graphics.getWidth());
    }

    /** Blackboard Scene is used to show global draw board
     */
    @Override
    public void initDrawBoard() {
        this.drawBoardModel = ModelPool.globalDrawBoardModelInject();
    }
}
