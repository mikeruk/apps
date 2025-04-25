package tema17ListsExercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P06CardsGame {

	public static void main(String[] args) {
		
		
		Scanner scanner = new Scanner(System.in);
		
		List<Integer> hand1 = Arrays
				.stream(scanner.nextLine()
						.split("\\s+")).map(var -> Integer.parseInt(var))
				.collect(Collectors.toList());
		
		List<Integer> hand2 = Arrays
				.stream(scanner.nextLine()
						.split("\\s+")).map(var -> Integer.parseInt(var))
				.collect(Collectors.toList());
		
		int limit = hand1.size();
		int sum = 0;
		
		for(int i = 0; i <= limit-1; i++) {
			
			if(hand1.get(0) > hand2.get(0)) {
				hand1.add(hand1.get(0));
				hand1.remove(0);
				hand1.add(hand2.get(0));
				hand2.remove(0);
			} else if(hand2.get(0) > hand1.get(0)) {
				hand2.add(hand2.get(0));
				hand2.remove(0);
				hand2.add(hand1.get(0));
				hand1.remove(0);
			} else if(hand2.get(0).equals(hand1.get(0))) {
				hand2.remove(0);
				hand1.remove(0);
			}
			
			if(hand1.size() >= hand2.size()) {
				limit = hand1.size();
			} else if(hand2.size() >= hand1.size()) {
				limit = hand2.size();
			}
			
			i--;
			if(hand1.isEmpty() || hand2.isEmpty()) {
				break;
			}
			
			//System.out.println(hand2);
		}

		
		if(hand1.isEmpty()) {
			for(int i = 0; i <= hand2.size()-1; i++) {
				
				sum += hand2.get(i);
			}
			//System.out.println(hand2);
			System.out.println("Second player wins! Sum: " + sum);
			
		} else if(hand2.isEmpty()) {
			
			for(int i = 0; i <= hand1.size()-1; i++) {
				sum += hand1.get(i);
			}
			//System.out.println(hand1);
			System.out.println("First player wins! Sum: " + sum);
		}
		
	}
	
	

}
