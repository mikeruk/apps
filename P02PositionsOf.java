package tema05MultidimensionalArrays;

import java.util.Arrays;
import java.util.Scanner;

public class P02PositionsOf {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int[] dimensions = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();


        int[][] matrix = new int[dimensions[0]][];

        for(int i = 0; i <= dimensions[0] - 1; i++){
            matrix[i] = Arrays.stream(scanner.nextLine().split("\\s+"))
                    .mapToInt(Integer::parseInt)
                    .toArray();
        }

        int number = scanner.nextInt();
        boolean isFound = false;

        for(int i = 0; i <= matrix.length -1; i++){
            for(int k = 0; k <= matrix[i].length -1; k++){
                if(matrix[i][k] == number){
                    System.out.print(i + " " + k);
                    System.out.println();
                    isFound = true;
                }

            }

        }

        if(!isFound){
            System.out.println("not found");
        }




    }
}
