package ru.clevertec.api;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AppTest {

    @ParameterizedTest
    @MethodSource
    void shouldReturnCorrectString(String[] numbers, String expectedString) {

        String actual = App.checkIsNumberPositive(numbers);
        assertEquals(expectedString, actual);
    }

    private static Stream<Arguments> shouldReturnCorrectString(){
        return Stream.of(
                Arguments.of(new String[]{"12", "79"}, "All numbers are positive."),
                Arguments.of(new String[]{"-12", "79"}, "Some numbers are not positive.")

        );
    }
}
