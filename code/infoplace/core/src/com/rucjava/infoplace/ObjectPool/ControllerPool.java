package com.rucjava.infoplace.ObjectPool;

import com.rucjava.infoplace.ControllerModule.ControllerUtils.MyInputListener;
import com.rucjava.infoplace.NetworkModule.SignalSender;

public class ControllerPool {
    private static SignalSender signalSender;
    private static MyInputListener inputListener;

    static {
        signalSender = new SignalSender();
        inputListener = new MyInputListener();
    }
    private ControllerPool() {}
    public static SignalSender signalSenderInject() {
        return signalSender;
    }
    public static MyInputListener inputListenerInject() { return inputListener; }
}
