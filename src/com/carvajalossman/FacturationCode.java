package com.carvajalossman;

public class FacturationCode {
    private String facturationCode;
    private String firstDigit;
    private String secondDigit;
    private String thirdDigit;
    private String fourthDigit;
    private String fifthDigit;
    private String sixthDigit;

    public FacturationCode(String facturationCode) {
        this.facturationCode = facturationCode;
        this.firstDigit = facturationCode.substring(0,1);
        this.secondDigit = facturationCode.substring(1,2);
        this.thirdDigit = facturationCode.substring(2,3);
        this.fourthDigit = facturationCode.substring(3,4);
        this.fifthDigit = facturationCode.substring(4,5);
        this.sixthDigit = facturationCode.substring(5,6);
    }

    public String getFacturationCode() {
        return facturationCode;
    }

    public String getFirstDigit() {
        return firstDigit;
    }

    public String getSecondDigit() {
        return secondDigit;
    }

    public String getThirdDigit() {
        return thirdDigit;
    }

    public String getFourthDigit() {
        return fourthDigit;
    }

    public String getFifthDigit() {
        return fifthDigit;
    }

    public String getSixthDigit() {
        return sixthDigit;
    }
}
