package ru.clevertec.core;

import ru.clevertec.StringUtils;
import java.util.Arrays;

public class Utils {

    public boolean isAllPositiveNumbers(String...str) throws NumberFormatException, InputDataException {
        if(str.length == 0) throw new InputDataException("Input data cannot be empty. Array length - " + str.length);

        StringUtils stringUtils = new StringUtils();

        return Arrays.stream(str)
                .allMatch(stringUtils :: isPositiveNumber);
    }
}
