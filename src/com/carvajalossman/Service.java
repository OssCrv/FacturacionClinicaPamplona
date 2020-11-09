package com.carvajalossman;

public class Service {

    private static final String[][] serviceList ={
            {"Digito", "Servicio", "Costo"},
            {"1", "Radiología", "85000"},
            {"2", "Ecografía", "55250"},
            {"3", "Laboratorio Clínico", "128900"},
            {"4", "Consulta Externa", "56000"},
            {"5", "Consulta Especializada", "390000"},
            {"6", "Radiología-Laboratorio", "200000"},
            {"7", "Tratamiento Dental", "100000"},
            {"8", "Prueba Covid-19 PCR", "150000"},
            {"9", "Prueba Covid-19 Anticuerpos", "80000"}
    };

    public static String getService(String code){
        return serviceList[Integer.parseInt(code)][1];
    }

    public static String getPrice(String code){
        return serviceList[Integer.parseInt(code)][2];
    }

}
