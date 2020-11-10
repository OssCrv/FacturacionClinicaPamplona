package com.carvajalossman;

public class PriceCalculator {

    private final char sixthDigit;

    private final boolean isPair;


    public PriceCalculator(FacturationCode code) {
        char thirdDigit = code.getThirdDigit();
        char fourthDigit = code.getFourthDigit();
        char fifthDigit = code.getFifthDigit();
        this.sixthDigit = code.getSixthDigit();
        int sum;
        sum = (int) thirdDigit + (int) fourthDigit + (int) fifthDigit;

        this.isPair = (sum % 2 == 0);
    }

    public float CalculateDiscount(Pacient pacient){
        float discount = 0;

        if(isPair){
            if(pacient.isAffiliate()) {
                discount = 0.15f;
            } else {
                discount = -0.15f;
            }
        }else{
            if(pacient.isAffiliate()) {
                discount = 0.25f;
            }
        }
        return discount;
    }

    public float lateFee(){
        if(sixthDigit == '0' || sixthDigit == '9'){
            return 0;
        }
        if(sixthDigit == '1' || sixthDigit == '8'){
            return 0.05f;
        }
        if(sixthDigit == '2' || sixthDigit == '7'){
            return 0.1f;
        }
        if(sixthDigit == '3' ||sixthDigit == '6'){
            return 0.15f;
        }
        if(sixthDigit == '4' || sixthDigit == '5'){
            return 0.2f;
        }
        return 0;
    }

}
