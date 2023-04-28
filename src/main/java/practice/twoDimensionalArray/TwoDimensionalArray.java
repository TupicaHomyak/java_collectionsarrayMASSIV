package practice.twoDimensionalArray;
public class TwoDimensionalArray {
    public static final char SYMBOL = 'X';
    public static char[][] getTwoDimensionalArray(int size) {
        char[][] numbers = new char[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if  (i == j || size - 1 == i + j) {
                    numbers[i][j] = SYMBOL;
                } else {
                    numbers[i][j] = ' ';
                }
                System.out.print("[" + numbers[i][j] + "]");
            }
            System.out.println();
        }
        return numbers;
    }
}
