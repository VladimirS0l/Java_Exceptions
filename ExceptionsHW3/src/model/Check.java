package model;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Check {

    private static String dateFormat;

    public static boolean checkLength(String str){
        if(str.length() > 0 && str.length() < 15){
            return true;
        }
        return false;
    }

    public static boolean checkNum(int str){
        String s = Integer.toString(str);
        for (int i = 0; i < s.length(); i++) {
            if(!Character.isDigit(s.charAt(i))){
                return false;
            }
        }
        return true;
    }

    public static boolean checkChar(Character ch) {
        if (ch == 'f' || ch == 'm'){
            return true;
        }return false;
    }

    public static boolean checkStr(String str){
        for (int i = 0; i < str.length(); i++) {
            if(Character.isDigit(str.charAt(i))){
                return false;
            }
        }
        return true;
    }

    public static boolean containsWhiteSpace(String str){
        if(str != null){
            for(int i = 0; i < str.length(); i++){
                if(Character.isWhitespace(str.charAt(i))){
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean isValid(String dateStr) {
        String dateFormat = ("dd/mm/yyyy");
        DateFormat sdf = new SimpleDateFormat(dateFormat);
        sdf.setLenient(false);
        try {
            sdf.parse(dateStr);
        } catch (ParseException e) {
            return false;
        }
        return true;
    }   
}
