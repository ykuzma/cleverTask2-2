package ru.clevertec.api;

import ru.clevertec.core.InputDataException;
import ru.clevertec.core.Utils;

public class App {
    public static void main(String[] args) {

        try {
            if(Utils.isAllPositiveNumbers("12", "79")) {
                System.out.println("All numbers are positive.");
            }else {
                System.out.println("Some numbers are not positive.");
            }
        }catch (NumberFormatException | InputDataException e) {
            System.out.println("Something went wrong! " + e.getMessage());
            e.printStackTrace();
        }
    }
}
