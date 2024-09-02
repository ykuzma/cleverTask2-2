package ru.clevertec.core;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UtilsTest {

    @Test
    void isAllPositiveTest() {
        assertTrue(Utils.isAllPositiveNumbers("12", "0.001"));
        assertFalse(Utils.isAllPositiveNumbers("12", "0"));

    }

    @Test
    void isAllPositiveTestThrowException() {
        assertThrows(InputDataException.class, () -> Utils.isAllPositiveNumbers(new String[]{}));
        assertThrows(NumberFormatException.class, () -> Utils.isAllPositiveNumbers(new String[]{"bbkhb"}));
    }
}
