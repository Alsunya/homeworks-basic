package homework22;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static ru.homeworks.homework22.Main.consistsOfOnesAndTwos;

class ConsistsOfOnesAndTwosTest {
    @Test
    void consistsOfOnesAndTwosPositiveTest() {
        int[] arr = {1, 1, 2, 1, 2, 2};
        Assertions.assertTrue(consistsOfOnesAndTwos(arr));
    }

    @Test
    void consistsOfOnesAndTwosNegativeWithDifferentDigitsTest() {
        int[] arr = {1, 2, 3, 1, 1, 3, 4};
        Assertions.assertFalse(consistsOfOnesAndTwos(arr));
    }

    @Test
    void consistsOfOnesAndTwosNegativeOnlyOnesTest() {
        int[] arr = {1, 1, 1, 1};
        Assertions.assertFalse(consistsOfOnesAndTwos(arr));
    }

    @Test
    void consistsOfOnesAndTwosNegativeOnlyTwosTest() {
        int[] arr = {2, 2, 2, 2};
        Assertions.assertFalse(consistsOfOnesAndTwos(arr));
    }
}
