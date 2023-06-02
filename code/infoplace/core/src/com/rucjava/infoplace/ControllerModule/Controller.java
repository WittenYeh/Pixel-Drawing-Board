package com.rucjava.infoplace.ControllerModule;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.rucjava.infoplace.ObjectPool.StagePool;

import javax.swing.plaf.nimbus.State;

public class Controller {
    Stage backgroundStage;
    public Controller() {
        switchToClassroom();  // initially, switch to classroom scene first
    }
    public void switchToClassroom() {
        this.backgroundStage = StagePool.classRoomStageInject();
        Gdx.input.setInputProcessor(backgroundStage);
    }
    public void switchToDesk() {
        this.backgroundStage = StagePool.deskStageInject();
        Gdx.input.setInputProcessor(backgroundStage);
    }
    public void switchToBlackboard() {
        this.backgroundStage = StagePool.blackboardStageInject();
        Gdx.input.setInputProcessor(backgroundStage);
    }
}
