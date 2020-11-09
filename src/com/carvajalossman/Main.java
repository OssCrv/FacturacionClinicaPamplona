package com.carvajalossman;

import java.lang.reflect.Array;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        FacturationCode facturationCode;
        PriceCalculator priceCalculator;

        String code = "193456";
        //Scanner teclado = new Scanner(System.in);
        //String codigo = teclado.nextLine();

        facturationCode = new FacturationCode(code);

        priceCalculator = new PriceCalculator(
                facturationCode.getThirdDigit(),
                facturationCode.getFourthDigit(),
                facturationCode.getFifthDigit(),
                facturationCode.getSixthDigit());

        if(facturationCode.getFirstDigit() == "1" || facturationCode.getFirstDigit() == "2" ){
            Pacient pacient;
            pacient = new Pacient(facturationCode.getFirstDigit());
        }

        System.out.println(facturationCode.getFirstDigit() +
                facturationCode.getSecondDigit() +
                facturationCode.getThirdDigit() +
                facturationCode.getFourthDigit() +
                facturationCode.getFifthDigit() +
                facturationCode.getSixthDigit()+
                "    " +
                Service.getService(facturationCode.getSecondDigit())+
                "    " +
                Integer.parseInt(Service.getPrice(facturationCode.getSecondDigit()))
        );






    }
}
