import java.util.Arrays;
import java.util.Scanner;

public class MatrixOfPalindromes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] rowsAndCols = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
        int rows = rowsAndCols[0];
        int cols = rowsAndCols[1];

        String[][] matrix = new String[rows][cols];
        fillMatrix(matrix);
        Arrays.stream(matrix).forEach(r -> {
            Arrays.stream(r).forEach(e -> System.out.print(e + " "));
            System.out.println();
        });

    }

    private static void fillMatrix(String[][] matrix) {
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                matrix[row][col] = String.format("%c%c%c", 97 + row, 97 + row + col, 97 + row);
            }
        }
    }
}
