package ru.clevertec.core;

import ru.clevertec.StringUtils;
import java.util.Arrays;

public class Utils {

    public static boolean isAllPositiveNumbers(String...str) throws NumberFormatException, InputDataException {
        if(str.length == 0) throw new InputDataException("Input data cannot be empty. Array length - " + str.length);

        return Arrays.stream(str)
                .allMatch(StringUtils :: isPositiveNumber);
    }
}
