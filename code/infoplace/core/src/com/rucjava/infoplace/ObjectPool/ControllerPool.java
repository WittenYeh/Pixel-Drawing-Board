package com.rucjava.infoplace.ObjectPool;

import com.rucjava.infoplace.ControllerModule.ControllerUtils.ControllerEvent;
import com.rucjava.infoplace.ControllerModule.ControllerUtils.MyInputListener;
import com.rucjava.infoplace.NetworkModule.SignalSender;

public class ControllerPool {
    private static SignalSender signalSender;
    private static MyInputListener inputListener;

    private static ControllerEvent controllerEvent;

    static {
        signalSender = new SignalSender();
        inputListener = new MyInputListener();
        controllerEvent = null;
    }
    private ControllerPool() {}
    public static SignalSender signalSenderInject() {
        return signalSender;
    }
    public static MyInputListener inputListenerInject() { return inputListener; }

    public static boolean isControllerEventHappen() {
        return controllerEvent != null;
    }

    public static void cancelControllerEvent() {
        controllerEvent = null;
    }

    public static ControllerEvent getControllerEvent() {
        return controllerEvent;
    }

    public static void setControllerEvent(ControllerEvent event) {
        controllerEvent = event;
    }
}
