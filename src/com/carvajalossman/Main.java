package com.carvajalossman;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        FacturationCode facturationCode;
        PriceCalculator priceCalculator;
        String code;

        do {
            System.out.println("Por favor ingrese el código del paciente: ");
            Scanner keyboard = new Scanner(System.in);
            code = keyboard.nextLine();
        }while(!CodeValidator.isValid(code));

        facturationCode = new FacturationCode(code);
        priceCalculator = new PriceCalculator(facturationCode);
        Pacient pacient = new Pacient(facturationCode.getFirstDigit());

        System.out.println("El paciente ha recibido el servicio de "+
                Service.getService(facturationCode.getSecondDigit())+
                " el cuál tiene un costo de " +
                Integer.parseInt(Service.getPrice(facturationCode.getSecondDigit()))+
                ". \nEl paciente tiene una variación de " +(int)(priceCalculator.CalculateDiscount(pacient)*100)+"% el cuál cambia el valor a "+
                Integer.parseInt(Service.getPrice(facturationCode.getSecondDigit()))*(1-priceCalculator.CalculateDiscount(pacient))+
                " más un adicional por mora del " + (int)(priceCalculator.lateFee()*100)+"% teniendo finalmente un costo de: "+
                Integer.parseInt(Service.getPrice(facturationCode.getSecondDigit()))*(1-priceCalculator.CalculateDiscount(pacient))*(1+priceCalculator.lateFee())+"$ Pesos"
        );


    }
}
