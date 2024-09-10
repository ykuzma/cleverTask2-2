package ru.clevertec.api;

import ru.clevertec.core.Utils;

public class App {
    public static void main(String[] args) {

        System.out.println(checkIsNumberPositive(new Utils(),"12", "79"));
    }

    public static String checkIsNumberPositive(Utils util, String... str) {

        try {
            if(util.isAllPositiveNumbers(str)) {
               return "All numbers are positive.";
            }else {
                return "Some numbers are not positive.";
            }
        }catch (IllegalArgumentException e) {
            return "Something went wrong! " + e.getMessage();
        }
    }
}
