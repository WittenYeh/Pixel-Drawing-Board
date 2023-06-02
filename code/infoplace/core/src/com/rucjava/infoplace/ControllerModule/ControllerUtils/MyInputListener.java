package com.rucjava.infoplace.ControllerModule.ControllerUtils;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.scenes.scene2d.InputEvent;
import com.badlogic.gdx.scenes.scene2d.InputListener;

/** This class instance will be bound to main stage
 *  It handles the input event
 */
public class MyInputListener extends InputListener {
    private final String classTag;
    public MyInputListener() {
        this.classTag = this.getClass().getSimpleName();
    }
    @Override
    public boolean keyDown(InputEvent event, int keycode) {
        switch (keycode) {
            case Input.Keys.A: {
                Gdx.app.log(classTag, "User press A");
                this.sendKeyEvent(EventType.LEFT);
                break;
            }
            case Input.Keys.W: {
                Gdx.app.log(classTag, "User press A");
                this.sendKeyEvent(EventType.UP);
                break;
            }
            case Input.Keys.S: {
                Gdx.app.log(classTag, "User press A");
                this.sendKeyEvent(EventType.DOWN);
                break;
            }
            case Input.Keys.D: {
                Gdx.app.log(classTag, "User press A");
                this.sendKeyEvent(EventType.RIGHT);
                break;
            }
            case Input.Keys.ENTER: {
                Gdx.app.log(classTag, "User press Enter");
                this.sendKeyEvent(EventType.ENTER);
                break;
            }
            default: {
                Gdx.app.log(classTag, "User press " + String.valueOf(keycode));
                break;
            }
        }
        return super.keyDown(event, keycode);
    }
    // 将事件发送给事件处理组
    public void sendKeyEvent(EventType event) {

    }
}

