package tema12WhileLoopUpr;

import java.util.Scanner;

public class P04Walking {

	public static void main(String[] args) {
		
		
		Scanner scanner = new Scanner(System.in);
		
		int goal = 10000;
		int stepsTotal = 0;;
		String input = "";
		while(stepsTotal < goal) {
			input = scanner.nextLine();
			if(input.equals("Going home")) {
				int steps = Integer.parseInt(scanner.nextLine());
				stepsTotal += steps;
				break;
			}
			
			int steps = Integer.parseInt(input);
			stepsTotal += steps;
			
		}
		
		if(stepsTotal >= goal) {
			System.out.println("Goal reached! Good job!");
			System.out.printf("%d steps over the goal!", stepsTotal - goal);
		} else if(input.equals("Going home")){
			System.out.printf("%d more steps to reach goal.", Math.abs(stepsTotal - goal));
		}
		

	}

}
