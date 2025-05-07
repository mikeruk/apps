package tema17ListsLab;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P04ListManipulationBasics {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" "))
				.map(Integer::parseInt)
				.collect(Collectors.toList());
		
		String input = "";
		
		String first = "";
		String second = "";
		String third = "";
		input = scanner.nextLine();
		
		while(!input.equals("end")) {
			
			
			addNumber(input, first, second,  numbers);
			
			removeNumber(input, first, second, numbers);
			
			removeAtIndex(input, first, second,numbers);
			
			insert(input, first, second, numbers, third);
			
			input = scanner.nextLine();
			
		}
		for(int i = 0; i <= numbers.size()-1; i++) {
			System.out.print(numbers.get(i) + " ");
		}
		
		
	}
	
	public static void insert(String input, String first, String second, List<Integer> numbers, String third) {
		first = input.split(" ")[0];
		second = input.split(" ")[1];
		if(first.equals("Insert")) {
			third = input.split(" ")[2];
			numbers.add(Integer.parseInt(third), Integer.parseInt(second));
		}
	}
	
	public static void removeAtIndex(String input, String first, String second, List<Integer> numbers) {
		first = input.split(" ")[0];
		second = input.split(" ")[1];
		if(first.equals("RemoveAt")) {
			numbers.remove(Integer.parseInt(second));
		}
	}
	
	
	public static void removeNumber(String input, String first, String second, List<Integer> numbers) {
		
		first = input.split(" ")[0];
		second = input.split(" ")[1];
		if(first.equals("Remove")) {
			for(int i = 0; i <= numbers.size()-1; i++) {
				if(numbers.get(i).equals(Integer.parseInt(second))) {
					numbers.remove(i);
				}
			}
		}
		
	}
	
	public static void addNumber(String input, String first, String second, List<Integer> numbers) {
		
		first = input.split(" ")[0];
		second = input.split(" ")[1];
		if(first.equals("Add")) {
			numbers.add(Integer.parseInt(second));
		}

	}

}
