package tema12ArraysExercise;

import java.util.Arrays;
import java.util.Scanner;



public class P09KaminoFactory {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int sample = Integer.parseInt(scanner.nextLine());
		String input = scanner.nextLine();
		int maxCount = Integer.MIN_VALUE;
		int count = 1;
		int winnerSample = 0;
		int startPoint = 0;
		int arraySum = 0;
		int maxSum = Integer.MIN_VALUE;
		
		int[] arrayWinner = new int[sample];
		int newStart = 0;
		for(int k = 1; k <= sample; k++) {
			

			while(!input.equals("Clone them!")) {
				
				
				
				int[] array = Arrays.stream(input.split("!")).mapToInt(var -> Integer.parseInt(var)).toArray();
				
				for(int i = 1; i < array.length; i++) {
					
					for(int index: array) {
						arraySum += array[i];
					}
					
					
					if(array[i-1] == array[i]) {
						
						count++;
						winnerSample = k;
						startPoint = i - count-1;
						if(count > maxCount) {
							maxCount = count;
							newStart = startPoint;
							arrayWinner = array;
						} else if (count == maxCount && arraySum > maxSum && startPoint == newStart){
							arrayWinner = array;
							
						}
					} else {
						count = 0;
					}
					
					if(arraySum > maxSum) {
						maxSum = arraySum;
					}
					
					
				}
				
				
				input = scanner.nextLine();
				
			}
			
			for(int idx: arrayWinner) {
				System.out.print(arrayWinner[idx] + " ");
				
			}
			
			
		}
		
		
				
		
		
		

	}

}
