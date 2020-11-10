package com.carvajalossman;

public class FacturationCode {
    private final char firstDigit;
    private final char secondDigit;
    private final char thirdDigit;
    private final char fourthDigit;
    private final char fifthDigit;
    private final char sixthDigit;

    public FacturationCode(String facturationCode) {
        this.firstDigit = facturationCode.charAt(0);
        this.secondDigit = facturationCode.charAt(1);
        this.thirdDigit = facturationCode.charAt(2);
        this.fourthDigit = facturationCode.charAt(3);
        this.fifthDigit = facturationCode.charAt(4);
        this.sixthDigit = facturationCode.charAt(5);
    }

    public char getFirstDigit() {
        return firstDigit;
    }

    public char getSecondDigit() {
        return secondDigit;
    }

    public char getThirdDigit() {
        return thirdDigit;
    }

    public char getFourthDigit() {
        return fourthDigit;
    }

    public char getFifthDigit() {
        return fifthDigit;
    }

    public char getSixthDigit() {
        return sixthDigit;
    }
}
