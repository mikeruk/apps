package tema12WhileLoopUpr;

import java.util.Scanner;

public class P02ExamPreparation {

	public static void main(String[] args) {
		
		
		Scanner scanner = new Scanner(System.in);
		
		int grade = Integer.parseInt(scanner.nextLine());
		String input = scanner.nextLine();
		
		double totalScore = 0;
		int unsuccessful = 0;
		int tasks = 0;
		String lastTaskName = "";
		
		while(!input.equals("Enough")) {
			int score = Integer.parseInt(scanner.nextLine());
			if(score <= 4) {
				unsuccessful++;
			}
			
			if(unsuccessful == grade) {
				break;
			}
			
			totalScore += score;
			lastTaskName = input;
			input = scanner.nextLine();
			tasks++;
		}
		
		double avg = totalScore / tasks;
		
		if(input.equals("Enough")) {
			System.out.printf("Average score: %.2f%n", avg);
			System.out.printf("Number of problems: %d%n", tasks);
			System.out.printf("Last problem: %s%n", lastTaskName);
		}
		
		if(unsuccessful == grade) {
			System.out.printf("You need a break, %d poor grades.", grade);
		}

	}

}
