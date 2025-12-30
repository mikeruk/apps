package tema05MultidimensionalArrays;

import java.util.Scanner;

public class P03IntersectionOfTwoMatricesDrVar {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int rows = Integer.parseInt(scanner.nextLine());
        int cols = Integer.parseInt(scanner.nextLine());

        char[][] matrix1 = new char[rows][cols];
        char[][] matrix2 = new char[rows][cols];
        char[][] matrix3 = new char[rows][cols];

        for(int row = 0; row <= rows; row++){
            //a b c d
            String line = scanner.nextLine();

            //a ,b, c, d
            String[] elements = line.split("\\s+");
            //kak da gi napravim chars?
            //otgovoryt e - ot vseki edin element, koito e string,
            //trqbva da vzema elementa na nuleviq index
            // i tova go pravq s for loop
            for(int i = 0; i <= elements.length - 1; i++){
                char current = elements[i].charAt(0);
                matrix1[row][i] = current;
            }


            for(int i = 0; i <= elements.length - 1; i++){
                char current = elements[i].charAt(0);
                matrix2[row][i] = current;
            }
        }

        for (int k = 0; k <= matrix1.length - 1; k++){

            for(int l = 0; l <= matrix1[k].length - 1; l++){
                if(matrix1[k][l] == (matrix2[k][l])){

                    matrix3[k][l] = matrix1[k][l];
                }else{
                    matrix3[k][l] = '*';

                }
            }

        }

        for(int n = 0; n <= matrix3.length - 1; n++){
            for(int k = 0; k <= matrix3[n].length -1; k++){
                System.out.print(matrix3[n][k] +" ");
            }
            System.out.println();
        }


    }
}
