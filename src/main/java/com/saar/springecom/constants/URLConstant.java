package com.saar.springecom.constants;

public enum URLConstant {
    LOGIN("login"),
    REG("registration"),
    DASHBOARD("dashboard");

    private String pageName;

    URLConstant(String pageName) {
        this.pageName = pageName;
    }

    public String getVal(){
        return pageName;
    }
}
