package com.tms.lesson5;

public enum POSITION {
    WORKER(1),
    DIRECTOR(2);
    private final int kf;

    POSITION(int kf) {
        this.kf = kf;
    }

    public int getKf() {
        return kf;
    }
}
