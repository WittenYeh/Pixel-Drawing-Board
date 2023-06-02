package com.rucjava.infoplace.NetworkModule;

import com.rucjava.infoplace.ObjectPool.ControllerPool;

public class LogInSystem {
    private SignalSender signalSender;
    public LogInSystem() {
        this.signalSender = ControllerPool.signalSenderInject();
    }

    // 向服务器发送一条请求，要求登入账号, 直接用邮箱登入
    public void logIn(String email, String password) {

    }
}
