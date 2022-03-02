package tema10ForLoopUpr2;

import java.util.Scanner;

public class P04Grades {

	public static void main(String[] args) {
		
	
		Scanner scanner = new Scanner(System.in);
		
		
		int n = Integer.parseInt(scanner.nextLine());
		
		
		double avg = 0;
		double gradeSoFar = 0;
		
		
		double poor = 0;
		double average = 0;
		double good = 0;
		double veryGood = 0;
		
		double percentPoor = 0;
		double percentAverage = 0;
		double percentGood = 0;
		double percentVeryGood = 0;
		
		
		for(int i = 1; i <= n; i++) {
			double grade = Double.parseDouble(scanner.nextLine());
			if(grade <= 2.99) {
				poor++;
				gradeSoFar += grade;
				avg = gradeSoFar / n;
				percentPoor = poor / n * 100;
			} else if(grade <= 3.99) {
				average++;
				gradeSoFar += grade;
				avg = gradeSoFar / n;
				percentAverage = average / n * 100;
			} else if(grade <= 4.99) {
				good++;
				gradeSoFar += grade;
				percentGood = good / n * 100;
			} else if(grade >= 5) {
				veryGood++;
				gradeSoFar += grade;
				avg = gradeSoFar / n;
				percentVeryGood = veryGood / n * 100;
			}
		}
		
		System.out.printf("Top students: %.2f%%%n", percentVeryGood);
		System.out.printf("Between 4.00 and 4.99: %.2f%%%n", percentGood);
		System.out.printf("Between 3.00 and 3.99: %.2f%%%n", percentAverage);
		System.out.printf("Fail: %.2f%%%n", percentPoor);
		System.out.printf("Average: %.2f%n", avg);
	}

}
