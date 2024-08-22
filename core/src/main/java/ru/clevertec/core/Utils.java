package ru.clevertec;

import ru.clevertec.StringUtils;

public class Utils {


    public boolean isAllPositiveNumbers(String...str) {
        if(str == null || str.length == 0) {
            return false;
        }
        StringUtils stringUtils = new StringUtils();
        for (String s: str) {
            if (!stringUtils.isPositiveNumber(s)) {
                return false;
            }
        }
        return true;
    }


}
