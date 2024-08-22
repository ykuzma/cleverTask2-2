package ru.clevertec;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import ru.clevertec.Utils;

import static org.junit.jupiter.api.Assertions.*;

public class UtilsTest {

    static Utils utils;

    @BeforeAll
    static void initUtils(){
        utils = new Utils();
    }

    @Test
    void isAllPositiveTest() {
        assertTrue(utils.isAllPositiveNumbers("12", "0.001"));
        assertFalse(utils.isAllPositiveNumbers("12", "0"));
    }
}
