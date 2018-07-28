package com.sda.mvc.model;

public enum  Fatigue {
    SLEEPING("sleeping"), TIRED("tired");
    private String string;

    Fatigue(String string) {
        this.string = string;
    }
}
