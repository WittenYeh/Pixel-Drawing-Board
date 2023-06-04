package com.rucjava.infoplace.ControllerModule;

import com.rucjava.infoplace.ModelModule.ModelUtils.BackgroundType;

import javax.naming.ldap.BasicControl;

public class MainController {
    private BlackboardSceneController blackboardSceneController;
    private ClassroomSceneController classroomSceneController;
    private DeskSceneController deskSceneController;
    private BasicSceneController currentController;

    public MainController() {
        this.blackboardSceneController = new BlackboardSceneController();
        this.classroomSceneController = new ClassroomSceneController();
        this.deskSceneController = new DeskSceneController();
    }

    /**
     * switch controller
     * @param type figures our the target controller
     */
    public void setCurrentController(BackgroundType type) {
        this.currentController.cancelMainScene();   // 取消原本的控制器设置
        switch (type) {
            case BLACKBOARD: {
                this.currentController = blackboardSceneController;
                break;
            }
            case DESK: {
                this.currentController = deskSceneController;
                break;
            }
            case CLASSROOM: {
                this.currentController = classroomSceneController;
                break;
            }
        }
        currentController.setAsMainScene();
    }
}
