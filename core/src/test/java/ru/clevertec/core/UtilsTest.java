package ru.clevertec.core;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;


class UtilsTest {

    @Test
    void isAllPositiveTrue() {
        assertTrue(Utils.isAllPositiveNumbers("12", "0.001"));
    }

    @Test
    void isAllPositiveFalse() {
        assertFalse(Utils.isAllPositiveNumbers("12", "0"));
    }

    @Test
    void isAllPositiveTestThrowException() {
        assertThrows(IllegalArgumentException.class, () -> Utils.isAllPositiveNumbers(new String[]{}));

    }
}
