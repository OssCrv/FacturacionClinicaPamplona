package com.carvajalossman;

public class CodeValidator {

    public static boolean isValid(String code){
        if(code.length() == 6 && isInteger(code)
        &&(code.substring(0,1).equals("1") || code.substring(0,1).equals("2"))){
            return true;
        }
        return false;
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
