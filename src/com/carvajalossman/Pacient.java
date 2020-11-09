package com.carvajalossman;

public class Pacient {
    private boolean isAffiliate;

    public Pacient(String code) {
        this.isAffiliate = (code == "1");
    }

    public boolean isAffiliate() {
        return isAffiliate;
    }
}
