package tema12ArraysExercise;

import java.util.Scanner;

public class P02CommonElements {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		String[] array1 = scanner.nextLine().split(" ");
		String[] array2 = scanner.nextLine().split(" ");
		
		
		for(String secondWord : array2) {
			for (String firstWord : array1) {
				if(secondWord.equals(firstWord)){
					System.out.print(secondWord + " ");
				}
		}
		
//		for(int i = 0; i <= s.length - 1; i++) {
//			for(int k = 0; k <= s2.length - 1; k++) {
//				if(s[i].equals(s2[k])) {
//					System.out.print(s2[k]+ " ");
//				}
//				
//			}
//			
//		}
	
	}
}
}
