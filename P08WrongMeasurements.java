package tema05MultidimensionalArrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class P08WrongMeasurements {

    public static void main(String[] args) {


        Scanner read = new Scanner(System.in);

        int rows = Integer.parseInt(read.nextLine());
        int[][] matrix = new int[rows][];

        for (int row = 0; row < rows; row++) {
            matrix[row] = readArray(read, "\\s+");
        }
        int[] indexes = readArray(read, "\\s+");
        int indexesToRemove = matrix[indexes[0]][indexes[1]];

        List<int[]> wrongIndex = new ArrayList<>();
        List<Integer> validIndex = new ArrayList<>();


        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {

                if (matrix[row][col] == indexesToRemove) {
                    wrongIndex.add(new int[]{row, col});
                    validIndex.add(getValidIndex(matrix, row, col));
                }
            }
        }
        for (int index = 0; index < wrongIndex.size(); index++) {
            int [] lastIndex = wrongIndex.get(index);
            matrix [lastIndex[0]][lastIndex[1]] = validIndex.get(index);
        }
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                System.out.print(matrix [row][col] + " ");
            }
            System.out.println();
        }


    }

    private static int getValidIndex(int[][] matrix, int row, int col) {

        int sum = 0;
        int wrongValue = matrix[row][col];

        if (isInBounds(matrix,row - 1,col) && wrongValue != matrix[row - 1][col]){
            sum += matrix [row - 1][col];
        }
        if (isInBounds(matrix,row +1,col) && wrongValue != matrix[row + 1][col]){
            sum += matrix [row + 1][col];
        }
        if (isInBounds(matrix,row,col - 1) && wrongValue != matrix[row][col - 1]){
            sum += matrix [row][col - 1];
        }
        if (isInBounds(matrix,row,col + 1) && wrongValue != matrix[row][col + 1]){
            sum += matrix [row][col + 1];
        }

        return sum;
    }

    private static boolean isInBounds(int[][] matrix, int row, int col) {
        return row >= 0 && row < matrix.length && col >= 0 && col < matrix[row].length;
    }

    private static int[] readArray(Scanner read, String separator) {
        return Arrays.stream(read.nextLine().split(separator))
                .mapToInt(Integer::parseInt)
                .toArray();
    }
}

