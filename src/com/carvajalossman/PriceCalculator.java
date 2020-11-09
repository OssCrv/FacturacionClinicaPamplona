package com.carvajalossman;

public class PriceCalculator {

    private String thirdDigit;
    private String fourthDigit;
    private String fifthDigit;
    private String sixthDigit;

    private boolean isPair;


    public PriceCalculator(String thirdDigit, String fourthDigit, String fifthDigit, String sixthDigit) {
        this.thirdDigit = thirdDigit;
        this.fourthDigit = fourthDigit;
        this.fifthDigit = fifthDigit;
        int sum;
        sum = Integer.parseInt(thirdDigit) + Integer.parseInt(fourthDigit) + Integer.parseInt(fifthDigit);

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


}
