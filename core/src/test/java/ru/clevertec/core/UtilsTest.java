package ru.clevertec.core;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;


class UtilsTest {
    static Utils util;
    @BeforeAll
    static void init() {
        util = new Utils();
    }

    @Test
    void isAllPositiveTrue() {

        assertTrue(util.isAllPositiveNumbers("12", "0.001"));
    }

    @Test
    void isAllPositiveFalse() {
        assertFalse(util.isAllPositiveNumbers("12", "0"));
    }

    @Test
    void isAllPositiveTestThrowException() {
        assertThrows(IllegalArgumentException.class, () -> util.isAllPositiveNumbers(new String[]{}));

    }
}
