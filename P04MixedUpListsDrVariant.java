package tema17ListsMoreExercises;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P04MixedUpListsDrVariant {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		List<Integer> numbers1 = Arrays.stream(scanner.nextLine().split("\\s+"))
				.map(var -> Integer.parseInt(var))
				.collect(Collectors.toList());
		
		List<Integer> numbers2 = Arrays.stream(scanner.nextLine().split("\\s+"))
				.map(var -> Integer.parseInt(var))
				.collect(Collectors.toList());
		
		List<Integer> numbers3 = new ArrayList<>();
		
		int limit = 0;
		if(numbers1.size() > numbers2.size()) {
			limit = numbers1.size();
		}else {
			limit = numbers2.size();
		}
		
		
		while(limit > 2) {
			numbers3.add(numbers1.get(0));
			numbers1.remove(0);
			
			numbers3.add(numbers2.get(numbers2.size()-1));
			numbers2.remove(numbers2.size()-1);
			limit--;
		}
		
		
		int max = 0;
		int min = 0;
		int range = 0;
		
		if(numbers1.isEmpty()) {
			max = Math.max(numbers2.get(0), numbers2.get(1));
			min = Math.min(numbers2.get(0), numbers2.get(1));
			
		} else {
			max = Math.max(numbers1.get(0), numbers1.get(1));
			min = Math.min(numbers1.get(0), numbers1.get(1));
		}
		
		Collections.sort(numbers3);
		for(int i = 0; i <= numbers3.size()-1; i++) {
			
			if(numbers3.get(i) > min && numbers3.get(i) < max) {
				
				System.out.print(numbers3.get(i).toString() + " ");
			}
		}
	}

}
