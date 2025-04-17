package tema17ListsExercise;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class P03HouseParty {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int n = Integer.parseInt(scanner.nextLine());
		
		List<String> guests = new ArrayList<>();
		
		for(int i = 1; i <= n; i++) {
			
			String[] command = scanner.nextLine().split("\\s+");
			
			if(command.length == 3) {
				if(guests.contains(command[0])) {
					System.out.println(command[0] + " is already in the list!");
					continue;
				} else {
					guests.add(command[0]);
				}
			}
			
			if(command.length == 4) {
				if(guests.contains(command[0])) {
					String currentGuest = command[0];
					guests.remove(currentGuest);
					
					
				} else {
					
					System.out.println(command[0] + " is not in the list!");
				}
				
			}
			
		}
		
		if(!guests.isEmpty()) {
			for(int i = 0; i <= guests.size()-1; i++) {
				System.out.println(guests.get(i));
			}
		}
		

	}

}
