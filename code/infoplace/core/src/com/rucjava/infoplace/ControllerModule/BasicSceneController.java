package com.rucjava.infoplace.ControllerModule;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.utils.Scaling;
import com.badlogic.gdx.utils.viewport.ScalingViewport;
import com.rucjava.infoplace.ModelModule.BackgroundModel;
import com.rucjava.infoplace.ModelModule.ModelUtils.Constants;
import com.rucjava.infoplace.ObjectPool.ControllerPool;
import com.rucjava.infoplace.ObjectPool.ModelPool;

abstract public class BasicSceneController {
    protected Stage stage;
    protected BackgroundModel backgroundModel;
    abstract protected void changeBackgroundType();

    protected BasicSceneController() {
        this.stage = new Stage(new ScalingViewport(Scaling.fit, Constants.RelativeBlackboardWidth, Constants.RelativeBlackboardHeight));
        this.backgroundModel = ModelPool.backgroundModelInject();
    }

    public void setAsMainScene() {
        this.stage.addListener(ControllerPool.inputListenerInject());
        Gdx.input.setInputProcessor(this.stage);
        changeBackgroundType();
    }

    public void cancelMainScene() {
        this.stage.removeListener(ControllerPool.inputListenerInject());
    }

    /**
     * resetStage function is used to reset all actors, this function is slow, use it as less as possible
     */
    public void resetStage() {
        this.stage.dispose();
        this.stage = new Stage(new ScalingViewport(Scaling.fit, Constants.RelativeBlackboardWidth, Constants.RelativeBlackboardHeight));
        this.setAsMainScene();
    }   // reset stage will make the stage become main scene
}
