package tema12ArraysExercise;

import java.util.Arrays;
import java.util.Scanner;

public class P05TopIntegerDrugVariant {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

       // int topInteger = Integer.MIN_VALUE;

        int[] array = Arrays.stream(scan.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        for (int i = 0; i < array.length ; i++) {
        	
            boolean isItBigger = true;
            
            for (int j = i + 1; j < array.length; j++) {
                if(array[i] <= array[j]) {
                    isItBigger = false;
                }
            }
            if(isItBigger) {
                System.out.print(array[i] + " ");
            }
        }

	}

}
