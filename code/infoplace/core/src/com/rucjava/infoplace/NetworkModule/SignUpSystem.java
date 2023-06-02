package com.rucjava.infoplace.NetworkModule;

import com.rucjava.infoplace.ControllerModule.Reporter;
import com.rucjava.infoplace.ObjectPool.ControllerPool;

public class SignUpSystem {
    private SignalSender signalSender;

    public SignUpSystem() {

        this.signalSender = ControllerPool.signalSenderInject();
    }

    // 上传用户昵称, 密码，进行注册
    public void signUp(String nickName, String password){

    }

    // 向服务器发送一条请求，请求发送一封邮箱到 ruc.edu.cn 结尾的邮箱中
    public void requestEmail(String email) {
        if (!checkEmailValidity(email)) {
            Reporter.infoReport("Your Email should be end with \"ruc.edu.cn\"!");// TODO：报告给用户邮箱不合法
        }
    }

    // 邮箱应该以 ruc.edu.cn 结尾，合法返回 true
    private boolean checkEmailValidity(String email) {
        // TODO: 判断逻辑
        return false;
    }
}
