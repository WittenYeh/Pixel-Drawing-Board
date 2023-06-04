package com.rucjava.infoplace.ControllerModule.ControllerUtils;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.scenes.scene2d.InputEvent;
import com.badlogic.gdx.scenes.scene2d.InputListener;
import com.rucjava.infoplace.ObjectPool.ControllerPool;

/** This class instance will be bound to main stage
 *  It handles the input event, and send the event to the current event to
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
                this.sendEvent(EventType.Left, null);
                break;
            }
            case Input.Keys.W: {
                Gdx.app.log(classTag, "User press A");
                this.sendEvent(EventType.Up,null);
                break;
            }
            case Input.Keys.S: {
                Gdx.app.log(classTag, "User press A");
                this.sendEvent(EventType.Down, null);
                break;
            }
            case Input.Keys.D: {
                Gdx.app.log(classTag, "User press A");
                this.sendEvent(EventType.Right, null);
                break;
            }
            case Input.Keys.ENTER: {
                Gdx.app.log(classTag, "User press Enter");
                this.sendEvent(EventType.Enter, null);
                break;
            }
            default: {
                Gdx.app.log(classTag, "User press " + String.valueOf(keycode));
                break;
            }
        }
        return super.keyDown(event, keycode); // return false by default, because keyUp function is not used in this programme
    }

    // this function should sendEvent
    @Override
    public boolean touchDown(InputEvent event, float x, float y, int pointer, int button) {
        // send touchDown event
        sendEvent(EventType.TouchDown, new Vector2(x, y));
        return true; // return true to activate the touchUp function
    }

    @Override
    public void touchUp(InputEvent event, float x, float y, int pointer, int button) {
        sendEvent(EventType.TouchUp, new Vector2(x, y));
    }

    // set add a event to currentEvent
    public void sendEvent(EventType eventType, Vector2 position) {
        ControllerPool.cancelControllerEvent();
        ControllerPool.setControllerEvent(new ControllerEvent(eventType, position));
    }
}

