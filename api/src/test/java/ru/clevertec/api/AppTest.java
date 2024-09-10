package ru.clevertec.api;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.mockito.Mockito;
import ru.clevertec.core.Utils;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

class AppTest {

    @ParameterizedTest
    @MethodSource
    void shouldReturnCorrectString(String[] numbers, String expectedString, boolean mockReturn) {
        Utils util = Mockito.mock(Utils.class);
        when(util.isAllPositiveNumbers(numbers)).thenReturn(mockReturn);

        String actual = App.checkIsNumberPositive(util, numbers);
        assertEquals(expectedString, actual);
    }

    @Test
    void whenThrowException_shouldReturnCorrectString() {
        Utils util = Mockito.mock(Utils.class);
        when(util.isAllPositiveNumbers()).thenThrow(new IllegalArgumentException("Empty Array"));

        String actual = App.checkIsNumberPositive(util);
        assertEquals("Something went wrong! Empty Array", actual);
    }

    private static Stream<Arguments> shouldReturnCorrectString(){
        return Stream.of(
                Arguments.of(new String[]{"12", "79"}, "All numbers are positive.", true),
                Arguments.of(new String[]{"-12", "79"}, "Some numbers are not positive.", false)

        );
    }
}
