package tema11WhileLoop;

import java.util.Scanner;

public class P08GraduationPt2 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		String input = scanner.nextLine();
		double grade = Double.parseDouble(scanner.nextLine());
		
		int gradeCounter = 1;
		int excludedCounter = 0;
		
		double allGrades = 0;
		
		boolean isPassed = true;
		boolean excluded = true;
		
		while(isPassed) {
			if(grade >= 4) {
				allGrades += grade;
				gradeCounter++;
				if(gradeCounter > 12) {
					break;
				}
				grade = Double.parseDouble(scanner.nextLine());
			} else if(excludedCounter < 2){
				excludedCounter++;
			} else {
				isPassed = false;
				System.out.printf("%s has been excluded at %d grade", input, gradeCounter);
			}
		}
		
		if(isPassed) {
			double avgGrade = allGrades / 12.00;
			System.out.printf("%s graduated. Average grade: %.2f", input, avgGrade);
		}

	}

}
