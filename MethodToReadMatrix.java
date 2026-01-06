package tema05MultidimensionalArrays;

import java.util.Arrays;
import java.util.Scanner;

public class MethodToReadMatrix {

    public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    }

    public static int[][] readMatrix(int rows, Scanner scanner, String splitPattern){
        int[][] matrix = new int[rows][];
        for(int row = 0; row < rows; row++){
            matrix[row] = Arrays.stream(scanner.nextLine().split(splitPattern))
                    .mapToInt(Integer::parseInt)
                    .toArray();
        }

        return matrix;
    }

    public static char[][] readMatrix(int rows, int cols, Scanner scanner){

        char[][] matrix = new char[rows][cols];

        for(int row = 0; row < rows; row++){

            String line = scanner.nextLine();
            String[] elements = line.split("\\s+");
            for(int i = 0; i < elements.length; i++){
                char current = elements[i].charAt(0);
                matrix[row][i] = current;
            }
        }

        return matrix;
    }
}
