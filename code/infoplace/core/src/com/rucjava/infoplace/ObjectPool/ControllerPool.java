package com.rucjava.infoplace.ObjectPool;

import com.rucjava.infoplace.ControllerModule.NetworkModule.SignalSender;

public class ControllerPool {
    private static SignalSender signalSender;

    static {
        signalSender = new SignalSender();
    }
    private ControllerPool() {}
    public static SignalSender signalSenderInject() {
        return signalSender;
    }
}
