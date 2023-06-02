package com.rucjava.infoplace.ObjectPool;

import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.utils.Scaling;
import com.badlogic.gdx.utils.viewport.ScalingViewport;
import com.rucjava.infoplace.ControllerModule.ControllerUtils.MyInputListener;
import com.rucjava.infoplace.ModelModule.ModelUtils.Constants;

/**
 *  StagePool 组织思路：
 *  首先，Stage 即可以用于绘图，也可以用于
 */
public class StagePool {
    private static MyInputListener inputListener;
    private static Stage classRoomStage;
    private static Stage deskStage;
    private static Stage blackboardStage;

    static {
        inputListener = new MyInputListener();
        classRoomStage = new Stage(new ScalingViewport(Scaling.fit, Constants.ClassroomWidth, Constants.ClassroomHeight));
        deskStage = new Stage(new ScalingViewport(Scaling.fit, Constants.DeskWidth, Constants.DeskHeight));
        blackboardStage = new Stage(new ScalingViewport(Scaling.fit, Constants.BlackboardWidth, Constants.BlackboardHeight));
        classRoomStage.addListener(inputListener);
        deskStage.addListener(inputListener);
        blackboardStage.addListener(inputListener);
    }

    private StagePool() {}
    public Stage classRoomStageInject() {
        return classRoomStage;
    }
    public Stage deskStageInject() {
        return deskStage;
    }
    public Stage blackboardStageInject() {
        return blackboardStage;
    }
}
