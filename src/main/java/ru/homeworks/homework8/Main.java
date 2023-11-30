package src.main.java.ru.homeworks.homework8;

public class Main {
    public static void main(String[] args) {
        String[][] wrongSizeArray = {
                {"2", "3"},
                {"3", "9"}};
        String[][] wrongDataArray = {
                {"7", "Row 0 Col 1", "Row 0 Col 2", "Row 0 Col 3"},
                {"Row 1 Col 0", "Row 1 Col 1", "Row 1 Col 2", "Row 1 Col 3"},
                {"Row 2 Col 0", "Row 2 Col 1", "Row 2 Col 2", "Row 2 Col 3"},
                {"Row 3 Col 0", "Row 3 Col 1", "Row 3 Col 2", "Row 3 Col 3"}};
        String[][] correctDataArray = {
                {"4", "7", "2", "4"},
                {"0", "7", "1", "8"},
                {"4", "5", "0", "2"},
                {"3", "1", "2", "9"}};

        //sum(wrongSizeArray);
        //sum(wrongDataArray);
        System.out.println(sum(correctDataArray));
    }
    public static int sum(String[][] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array.length != 4 | array[i].length != 4)
                    throw new AppArraySizeException("Передан массив размера != [4][4]");
                try {
                    sum += Integer.parseInt(array[i][j]);
                }catch (NumberFormatException e){
                    throw new AppArrayDataException("В ячейке [" + i + "][" + j + "] хранятся данные неверного типа.");
                }
            }
        }
        return sum;
    }
}
