package com.rucjava.infoplace.ControllerModule;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.utils.Scaling;
import com.badlogic.gdx.utils.viewport.ScalingViewport;
import com.rucjava.infoplace.ModelModule.ModelUtils.Constants;
import com.rucjava.infoplace.ObjectPool.ControllerPool;

public class DeskScene implements Mainable {
    private Stage stage;
    @Override
    public void setAsMainScene() {
        this.stage = new Stage(new ScalingViewport(Scaling.fit, Constants.RelativeDeskWidth, Constants.RelativeDeskHeight));
        this.stage.addListener(ControllerPool.inputListenerInject());
        Gdx.input.setInputProcessor(this.stage);
    }
    @Override
    public void changeBackgroundType() {

    }
}
