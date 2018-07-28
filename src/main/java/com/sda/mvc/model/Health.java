package com.sda.mvc.model;

public enum Health {
    DEAD("dead"), HEALTHY("healthy");

    private String string;

    Health(String string) {
        this.string = string;
    }
}
