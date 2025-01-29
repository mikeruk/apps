package tema12ArraysExercise;

import java.util.Arrays;
import java.util.Scanner;

public class P08MagicSum {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		String array = scanner.nextLine();
		String[] s = array.split(" ");
		int[] arrayInt = Arrays.stream(s).mapToInt(var -> Integer.parseInt(var)).toArray();
		int n = Integer.parseInt(scanner.nextLine());
		
		
		for(int i = 0; i < s.length; i++) {
			
			for(int k =  i + 1; k < s.length; k++) {
				
				if((arrayInt[i] + arrayInt[k]) == n) {
					
					System.out.println(arrayInt[i] + " " + arrayInt[k]);
					
				}
				
			}
			
		}
	}

}
