package com.rucjava.infoplace.ObjectPool;

import com.rucjava.infoplace.ModelModule.NetworkModule.SignalSender;

public class ControllerPool {
    private static SignalSender signalSender;

    static {
        signalSender = new SignalSender();
    }

    public static SignalSender signalSenderInject() {
        return signalSender;
    }
}
