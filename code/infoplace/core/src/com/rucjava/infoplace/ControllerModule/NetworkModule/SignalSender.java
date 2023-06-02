package com.rucjava.infoplace.ControllerModule.NetworkModule;

import com.rucjava.infoplace.ControllerModule.NetworkModule.NetworkUtils.InfoType;
import com.rucjava.infoplace.ControllerModule.Reporter;

public class SignalSender {
    // 用户邮箱被用来唯一地识别一个用户，在发送信息给服务端的时候，在字符串前加上用户邮箱告知是哪台客户端发送了邮箱
    // 同时，处于网络安全考虑，为了防止他人修改程序伪造其它用户发送信息，应该增加一些安全措施（再议）
    public String userEmail;
    // TODO: 初始化
    public SignalSender() {

    }
    public void setUserEmail(String email) {
        this.userEmail = email;
    }
    // TODO：发送信号到服务端
    public void send(InfoType infoType, String... args) {
        // 发送信号，可以考虑用将 userEmail, infoType 和所有 args 连接到一起发送

        // 处理信号丢失
        if(!waitResponse()) {
            Reporter.infoReport("Unable to connect to server, please connect again!");
        }
    }
    // TODO：等待相应，发送以后等待响应
    // 等待一段时间，等待服务端的确认收到响应，如果服务端没有发回确认响应，返回 false，否则返回 true
    private boolean waitResponse() {
        return false;
    }
}
