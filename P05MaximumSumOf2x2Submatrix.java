package tema05MultidimensionalArrays;

import java.util.Arrays;
import java.util.Scanner;

public class P05MaximumSumOf2x2Submatrix {

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        int[] dimentions = Arrays.stream(scanner.nextLine()
                .split(",\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();
        String pattern = ",\\s+";

        int[][] matrix = readMatrix(dimentions[0], scanner,pattern);

        System.out.println();

        int maxNum = Integer.MIN_VALUE;
        int sum = 0;
        int win1 = 0;
        int win2 = 0;
        int win3 = 0;
        int win4 = 0;
        for(int i = 0; i <= matrix.length - 2; i++){

            for(int k = 0; k <= matrix[i].length - 2; k++){
                int el1 = matrix[i][k];
                int el2 = matrix[i][k+1];
                for (int l = k; l <= matrix[i+1].length - 2; l++){
                    int el3 = matrix[i+1][l];
                    int el4 = matrix[i+1][l+1];

                    sum = el1+el2+el3+el4;
                    if(sum > maxNum){
                        maxNum = sum;
                        win1 = el1;
                        win2 = el2;
                        win3 = el3;
                        win4 = el4;
                    }
                    break;



                }
            }


        }

        System.out.println(win1 + " " + win2);
        System.out.println(win3 + " " + win4);
        System.out.println(maxNum);





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
