package tema09DataTypesAndVariablesExercise;

import java.util.Scanner;

public class P11Snowballs {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int n = Integer.parseInt(scanner.nextLine());
		
		double maxNum = Double.MIN_VALUE;
		int snowballSnow = 0;
		double snowballTime = 0;
		double snowballQuality = 0;
		double snowballValue1 = 0;
		double snowballValue2 = 0;
		double getQuality = 0;
		int getSnow = 0;
		double getTime = 0;
		
		for(int i = 1; i <= n; i++) {
			
			snowballSnow = Integer.parseInt(scanner.nextLine());
			snowballTime = Integer.parseInt(scanner.nextLine());
			snowballQuality = Double.parseDouble(scanner.nextLine());
			
			snowballValue1 = (snowballSnow / snowballTime);
			snowballValue2 = Math.pow(snowballValue1, snowballQuality);
			
			if(snowballValue2 >= maxNum) {
				maxNum = snowballValue2;
				getSnow = snowballSnow;
				getTime = snowballTime;
				getQuality = snowballQuality;
			}
			
		}
		
		System.out.printf("%d : %.0f = %.0f (%.0f)",getSnow, getTime, maxNum, getQuality);

	}

}
