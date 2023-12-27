package src.main.java.ru.homeworks.homework11;

public class Sort {
    public static int[] sort(int[] array) {
        int changed;
        for (int j = 0; j < array.length; j++) {
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] > array[i + 1]) {
                    changed = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = changed;
                }
            }
        }
        return array;
    }
}
