package tema05MultidimensionalArrays;

import java.util.Arrays;
import java.util.Scanner;

public class P05MaxSumOf2x2SubmatrixDrVar {


    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        int[] dimentions = Arrays.stream(scanner.nextLine()
                        .split(",\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();
        String pattern = ",\\s+";

        int[][] matrix = readMatrix(dimentions[0], scanner,pattern);

        int maxSum = 0;
        int[][] newMatrix = new int[2][2];

        for(int i = 0; i <= matrix.length - 2; i++){

            for(int k = 0; k <= matrix[i].length - 2; k++){
                int el1 = matrix[i][k];
                int el2 = matrix[i][k+1];
                int el3 = matrix[i + 1][k];
                int el4 = matrix[i + 1][k+1];

                int currentSum = el1 + el2 + el3 + el4;
                if(maxSum < currentSum){
                    maxSum = currentSum;
                    newMatrix = new int[][]{
                            {el1, el2},
                            {el3, el4},
                    };
                }

            }


        }

        Arrays.stream(newMatrix).forEach(e -> {

            Arrays.stream(e).forEach(num -> System.out.print(num + " "));
            System.out.println();

        });
        System.out.println(maxSum);





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
}
