package tema17ListsExercise;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class P04ListOperations {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		List<Integer> myList = new ArrayList<>();
		
		String[] numbers = scanner.nextLine().split(" ");
		for(int i = 0; i <= numbers.length-1; i++) {
			myList.add(Integer.parseInt(numbers[i]));
		}
		
		String input = scanner.nextLine();
		
		//System.out.print(myList);
		
		while(!input.equals("End")) {
			
			String[] command = input.split(" ");
			
			if(command[0].equals("Add")) {
				int num = Integer.parseInt(command[1]);
				if(num < 0 && num > myList.size()-1) {
					System.out.println("Invalid index");
				} else {
					myList.add(Integer.parseInt(command[1]));
				}
				
				//System.out.println(myList);
			}
			if(command[0].equals("Remove")) {
				int num = Integer.parseInt(command[1]);
				if(num < 0 || num > myList.size()-1) {
					System.out.println("Invalid index");
				} else {
					myList.remove(Integer.parseInt(command[1]));
				}
				
				//System.out.println(myList);
			}
			if(command[0].equals("Shift") && command[1].equals("left")) {
				
				for(int i = 1; i <= Integer.parseInt(command[2]); i++) {
					int beLast = myList.get(0);
					myList.add(beLast);
					myList.remove(0);
				}
				//System.out.println(myList);
				
			}
			
			if(command[0].equals("Shift") && command[1].equals("right")) {
				for(int i = 1; i <= Integer.parseInt(command[2]); i++) {
					int beFirst = myList.get(myList.size()-1);
					myList.add(0, beFirst);
					myList.remove(myList.size()-1);
				}
				//System.out.println(myList);
			}
			
			if(command[0].equals("Insert")) {
				int num = Integer.parseInt(command[2]);
				if(num < 0 && num > myList.size()-1) {
					System.out.println("Invalid index");
				} else {
					myList.add(Integer.parseInt(command[2]), Integer.parseInt(command[1]));
				}
				//System.out.println(myList);
			}
			
			
			input = scanner.nextLine(); 
			
		}
		myList.forEach(index -> System.out.print(index + " "));
		
	}

}
