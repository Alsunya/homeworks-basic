package homework22;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static ru.homeworks.homework22.Main.trimArrayAfterLastDigitOne;

class TrimArrayAfterLastDigitOneTest {
    @Test
    void trimArrayAfterLastDigitOnePositiveTest() {
        int[] arr = {1, 2, 3, 1, 1, 3, 4};
        Assertions.assertArrayEquals(new int[]{3, 4}, trimArrayAfterLastDigitOne(arr));
    }

    @Test
    void shouldThrowAnExceptionTest() {
        int[] arr = {3, 2, 3, 6, 3, 3, 4};
        Assertions.assertThrowsExactly(RuntimeException.class, () -> trimArrayAfterLastDigitOne(arr));
    }

    @Test
    void trimArrayAfterLastDigitOneReturnEmptyArrayTest() {
        int[] arr = {1, 2, 3, 1};
        Assertions.assertArrayEquals(new int[]{}, trimArrayAfterLastDigitOne(arr));
    }
}
