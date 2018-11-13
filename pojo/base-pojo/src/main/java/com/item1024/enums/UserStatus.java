package com.item1024.enums;

public enum UserStatus {
    ONLINE(1, "已登陆"),
    UNLINE(0, "未登录");

    private int status;
    private String des;

    UserStatus(int status, String des) {
        this.status = status;
        this.des = des;
    }

    public int getStatus() {
        return status;
    }

    public String getDes() {
        return des;
    }
}
