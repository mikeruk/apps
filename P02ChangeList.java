package tema17ListsExercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P02ChangeList {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" "))
				.map(var -> Integer.parseInt(var))
				.collect(Collectors.toList());
		//System.out.print(numbers);
		String input = scanner.nextLine();
		
		while(!input.equals("end")){
			
			String[] command = input.split(" ");
			
			if(command[0].equals("Delete")) {
				
				for(int i = 0; i <= numbers.size()-1; i++) {
					if(numbers.get(i) == Integer.parseInt(command[1])) {
						numbers.remove(i);
						i--;
					}
				}
				
				//numbers.remove(Integer.parseInt(command[1]));
				//System.out.print(numbers);
			}
			if(command[0].equals("Insert")) {
				numbers.add(Integer.parseInt(command[2]), Integer.parseInt(command[1]));
				//System.out.print(numbers);
			}
			
			input = scanner.nextLine();
			
		}
		for(Integer number:numbers) {
			System.out.print(number + " ");
		}

	}

}
