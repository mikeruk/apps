package tema05MultidimensionalArrays;

import java.util.Arrays;
import java.util.Scanner;

public class P03IntersectionOfTwoMatrices {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int rows = Integer.parseInt(scanner.nextLine());
        int cols = Integer.parseInt(scanner.nextLine());

        String[][] matrix1 = new String[rows][];
        String[][] matrix2 = new String[rows][];

        for(int i = 0; i <= rows - 1; i++){
            matrix1[i] = scanner.nextLine().split("\\s+");
        }
        for(int i = 0; i <= rows - 1; i++){
            matrix2[i] = scanner.nextLine().split("\\s+");
        }

        String[][] matrix3 = new String[rows][cols];
        for (int k = 0; k <= matrix1.length - 1; k++){

            for(int l = 0; l <= matrix1[k].length - 1; l++){
                if(matrix1[k][l].equals(matrix2[k][l])){

                    matrix3[k][l] = matrix1[k][l];
                }else{
                    matrix3[k][l] = "*";

                }
            }

        }

        for(int i = 0; i <= matrix3.length - 1; i++){
            for(int k = 0; k <= matrix3[i].length -1; k++){
                System.out.print(matrix3[i][k] +" ");
            }
            System.out.println();
        }


    }
}

//5
//2
//        1 2
//        3 4
//        5 6
//        7 8
//        9 1

//        0 2
//        3 1
//        1 6
//        7 4
//        1 1