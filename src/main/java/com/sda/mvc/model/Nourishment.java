package com.sda.mvc.model;

public enum Nourishment {
    SATURATED("saturated"), HUNGRY("hungry");
    private String string;

    Nourishment(String string) {
        this.string = string;
    }
}
