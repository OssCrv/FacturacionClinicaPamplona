package com.carvajalossman;

public class Pacient {
    private boolean isAffiliate;

    public Pacient(String code) {
        this.isAffiliate = (code.equals("1"));
    }

    public boolean isAffiliate() {
        return isAffiliate;
    }
}
