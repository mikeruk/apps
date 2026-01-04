package tema05MultidimensionalArrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class P01CompareMatrices {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String[] dimensions = scanner.nextLine().split(" ");

        int[][] matrix1 = new int[Integer.parseInt(dimensions[0])][];

        for(int i = 0; i <= Integer.parseInt(dimensions[0]) - 1; i++){
            matrix1[i] = Arrays.stream(scanner.nextLine().split("\\s+"))
                    .mapToInt(Integer::parseInt)
                    .toArray();
        }

        dimensions = scanner.nextLine().split(" ");

        int[][] matrix2 = new int[Integer.parseInt(dimensions[0])][];

        for(int i = 0; i <= Integer.parseInt(dimensions[0]) - 1; i++){
            matrix2[i] = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
        }

        //System.out.println(matrix1.length);
        //System.out.println(matrix2.length);

        boolean isEqual = true;

        if(matrix2.length != matrix1.length){
            System.out.println("not equal");
            isEqual = false;
        } else if(matrix2.length == matrix1.length){

            for(int i = 0; i <= matrix1.length - 1; i++){
                if(matrix1[i].length != matrix2[i].length){

                    System.out.println("not equal");
                    isEqual = false;
                    break;
                } else {
                    for(int m = 0; m <= matrix1.length - 1; m++){

                        for(int k = 0; k <= matrix1[m].length -1; k++){
                            if(!isEqual){
                                break;
                            }

                            if(matrix1[m][k] != matrix2[m][k]){
                                System.out.println("not equal");
                                isEqual = false;
                                break;
                            }

                        }

                    }
                }
            }
        }


        if(isEqual){
            System.out.println("equal");

        }

    }



}
