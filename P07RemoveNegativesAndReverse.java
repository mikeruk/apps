package tema17ListsLab;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P07RemoveNegativesAndReverse {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		
		List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" "))
				.map(Integer::parseInt)  // e kato .map(e -> Integer.parseInt(e))
				.collect(Collectors.toList());
		

		for(int i = 0; i <= numbers.size()-1; i++) {
			if(numbers.get(i) < 0) {
				numbers.remove(i);
				i--;
			}
		}
		
		if(numbers.isEmpty()) {
			System.out.println("empty");
		} else {
			Collections.reverse(numbers);
			System.out.println(numbers.toString().replaceAll("[\\[\\],]", ""));
			System.out.println(numbers.toString().replaceAll("[\\[,]", ""));
		}
		
		

	}

}
