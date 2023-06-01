package com.rucjava.infoplace.ModelModule.ModelUtils;

public class Comments {
    private String nickName;
    private String content;
    Comments(String nickName, String content) {
        this.nickName = nickName;
        this.content = content;
    }
    String getNickName() {
        return this.nickName;
    }
    String getContent() {
        return this.content;
    }
}
