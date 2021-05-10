import java.util.Arrays;
import java.util.Scanner;

public class DiagonalDifference {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int[][] matrix = new int[n][n];

        for (int row = 0; row < n; row++) {
            matrix[row] = Arrays.stream(scanner.nextLine().split(" "))
                    .mapToInt(Integer::parseInt)
                    .toArray();
        }
        int sumOfFirstDiagonal = 0, sumOfSecondDiagonal = 0;

        int row = 0, col = 0;
        int firstSum = 0;

        while (row < n) {
            for (int r = 0; r < matrix.length; r++) {
                firstSum += (matrix[row++][col++]);
            }
        }
        int secondSum = 0;
        row = n - 1;
        col = 0;
        while (row >= 0) {
            for (int r = 0; r < matrix.length; r++) {
                secondSum += (matrix[row--][col++]);
            }
        }
        int totalSum = Math.abs(firstSum - secondSum);
        System.out.println(totalSum);
    }
}
