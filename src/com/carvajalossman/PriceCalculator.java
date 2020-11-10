package com.carvajalossman;

public class PriceCalculator {

    private String thirdDigit;
    private String fourthDigit;
    private String fifthDigit;
    private String sixthDigit;

    private boolean isPair;


    public PriceCalculator(FacturationCode code) {
        this.thirdDigit = code.getThirdDigit();
        this.fourthDigit = code.getFourthDigit();
        this.fifthDigit = code.getFifthDigit();
        this.sixthDigit = code.getSixthDigit();
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

    public float lateFee(){
        if(sixthDigit.equals("0")||sixthDigit.equals("9")){
            return 0;
        }
        if(sixthDigit.equals("1")||sixthDigit.equals("8")){
            return 0.05f;
        }
        if(sixthDigit.equals("2")||sixthDigit.equals("7")){
            return 0.1f;
        }
        if(sixthDigit.equals("3")||sixthDigit.equals("6")){
            return 0.15f;
        }
        if(sixthDigit.equals("4")||sixthDigit.equals("5")){
            return 0.2f;
        }
        return 0;
    }

}
