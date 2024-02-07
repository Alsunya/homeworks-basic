package Homework22;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static ru.homeworks.Homework22.Main.consistsOfOnesAndTwos;

public class ConsistsOfOnesAndTwosTest {
    @Test
    public void consistsOfOnesAndTwosPositiveTest(){
        int[] arr = {1, 1, 2, 1, 2, 2};
        Assertions.assertTrue(consistsOfOnesAndTwos(arr));
    }
    @Test
    public void consistsOfOnesAndTwosNegativeWithDifferentDigitsTest(){
        int[] arr = {1, 2, 3, 1, 1, 3, 4};
        Assertions.assertFalse(consistsOfOnesAndTwos(arr));
    }
    @Test
    public void consistsOfOnesAndTwosNegativeOnlyOnesTest(){
        int[] arr = {1, 1, 1, 1};
        Assertions.assertFalse(consistsOfOnesAndTwos(arr));
    }
    @Test
    public void consistsOfOnesAndTwosNegativeOnlyTwosTest(){
        int[] arr = {2, 2, 2, 2};
        Assertions.assertFalse(consistsOfOnesAndTwos(arr));
    }
}
