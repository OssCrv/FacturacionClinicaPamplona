package com.carvajalossman;

import java.lang.reflect.Array;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        FacturationCode facturationCode;
        PriceCalculator priceCalculator;

        String code = "393446";

        do {
            Scanner teclado = new Scanner(System.in);
            code = teclado.nextLine();
        }while(!CodeValidator.isValid(code));

        facturationCode = new FacturationCode(code);

        priceCalculator = new PriceCalculator(
                facturationCode.getThirdDigit(),
                facturationCode.getFourthDigit(),
                facturationCode.getFifthDigit(),
                facturationCode.getSixthDigit()
        );

        Pacient pacient;
        pacient = new Pacient(facturationCode.getFirstDigit());
        System.out.println(facturationCode.getFirstDigit() +
                facturationCode.getSecondDigit() +
                facturationCode.getThirdDigit() +
                facturationCode.getFourthDigit() +
                facturationCode.getFifthDigit() +
                facturationCode.getSixthDigit()+
                "    " +
                Service.getService(facturationCode.getSecondDigit())+
                "    " +
                Integer.parseInt(Service.getPrice(facturationCode.getSecondDigit()))+
                "    " +priceCalculator.CalculateDiscount(pacient)+"    "+
                Integer.parseInt(Service.getPrice(facturationCode.getSecondDigit()))*(1-priceCalculator.CalculateDiscount(pacient))
        );








    }
}
