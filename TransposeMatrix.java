import java.util.Arrays;
public class TransposeMatrix {

    static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            System.out.println(Arrays.toString(row));
        }
    }

    public static void main(String[] args) {

        int[][] list = {{1, 2, 3}, {4, 5, 6}};
        int line = list.length;
        int column = list[0].length;
        int[][] transpose = new int[column][line];

        for (int i = 0; i < column; i++) {
            for (int j = 0; j < line; j ++) {
                transpose[i][j] = list[j][i];
            }
        }
        System.out.println("Original Matrix: ");
        printMatrix(list);
        System.out.println("Transpose of Matrix: ");
        printMatrix(transpose);
    }
}
