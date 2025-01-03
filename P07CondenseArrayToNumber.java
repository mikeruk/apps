package tema11ArraysLab;

import java.util.Arrays;
import java.util.Scanner;

public class P07CondenseArrayToNumber {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
        int[] input = Arrays.stream(sc.nextLine().split(" ")).mapToInt(e -> Integer.parseInt(e)).toArray();
        
        while (input.length > 1) {
            int[] condensed = new int[input.length - 1];
            for (int i = 0; i < condensed.length; i++) {
                condensed[i] = input[i] + input[i + 1];
            }
            input = condensed;
            // array input pridobiva 
            //dyljinata i stoinostite na array condensed
        }
        System.out.println(input[0]);
		

	}

}
