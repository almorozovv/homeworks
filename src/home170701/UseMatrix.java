package home170701;

public class UseMatrix {

    public static void main(String[] args) {

        int[][] matrix = {
                {0, 1, 0, 3},
                {4, 5, 6, 7},
                {8, -5, 9, 10},
        };

        matrixSum(matrix);

    }

    private static void matrixSum(int[][] matrix) {

        OUTER: for (int i = 0; i < matrix.length; i++) {
            int sum = 0;
            System.out.println("Number of row: " + i);
            for (int j = 0; j < matrix[i].length; j++) {
                sum += matrix[i][j];
                if (matrix[i][j] < 0) {
                    continue OUTER;
                }
            }
            System.out.println(sum);
        }
    }

}
