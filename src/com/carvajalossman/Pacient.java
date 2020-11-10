package com.carvajalossman;

public class Pacient {
    private final boolean isAffiliate;

    public Pacient(char code) {
        this.isAffiliate = code == '1';
    }

    public boolean isAffiliate() {
        return isAffiliate;
    }
}
