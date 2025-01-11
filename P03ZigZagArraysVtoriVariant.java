package tema12ArraysExercise;

import java.util.Scanner;

public class P03ZigZagArraysVtoriVariant {

	public static void main(String[] args) {
		
		
		Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine()); 
        int[] array1 = new int[n]; 
        int[] array2 = new int[n];
        
        for (int row = 0; row < n; row++) {
            String input = scanner.nextLine(); 
            int firstNumber = Integer.parseInt(input.split(" ")[0]);
            int secondNumber = Integer.parseInt(input.split(" ")[1]);
            
            if((row + 1) % 2 == 0) {
                array1[row] = secondNumber;
                array2[row] = firstNumber;
            } else {
                array1[row] = firstNumber;
                array2[row] = secondNumber;
            }

        }

      
        for (int number : array1) {
            System.out.print(number + " ");
        }

        System.out.println();
       
        for (int number : array2 ) {
            System.out.print(number + " ");
        }

	}

}
