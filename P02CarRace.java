package tema17ListsMoreExercises;

import java.util.Scanner;

public class P02CarRace {

	public static void main(String[] args) {
		  Scanner scan = new Scanner(System.in);

	        String input = scan.nextLine();

	        String[] splited = input.split("\\s+");

	        double sum1 = 0;
	        double sum2 = 0;

	        for (int i = 0; i < splited.length / 2; i++) {


	            if (Integer.parseInt(splited[i]) != 0) {
	                sum1 += Integer.parseInt(splited[i]);
	            } else {
	                sum1 *= 0.8;
	            }
	        }

	        for (int i = splited.length - 1; i > splited.length / 2; i--) {

	            if (Integer.parseInt(splited[i]) != 0) {
	                sum2 += Integer.parseInt(splited[i]);
	            } else {
	                sum2 *= 0.8;
	            }
	        }

	        if (sum1 < sum2) {
	            System.out.printf("The winner is left with total time: %.1f", sum1);
	        }else {
	            System.out.printf("The winner is right with total time: %.1f", sum2);
	        }

	}

}
