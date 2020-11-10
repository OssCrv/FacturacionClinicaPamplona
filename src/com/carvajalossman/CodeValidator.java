package com.carvajalossman;

public class CodeValidator {

    public static boolean isValid(String code){
        return code.length() == 6 && isInteger(code) && (code.charAt(0) == '1' || code.charAt(0) == '2') && code.charAt(1) != '0';
    }


    public static boolean isInteger(String numero){
        try{
            Integer.parseInt(numero);
            return true;
        }catch(NumberFormatException e){
            return false;
        }
    }
}
