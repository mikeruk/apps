package tema17ListsMoreExercises;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P01Messaging {

	private static final int ArrayList = 0;

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		
		
		String[] arrayNumbers = scanner.nextLine().split(" ");
		//String arrayNumbers = scanner.nextLine();
		
		//String[] sss =  arrayNumbers.split(" ");
		
		
		List<String> message = Arrays.stream(scanner.nextLine().split(""))
				.collect(Collectors.toList());
		
		int index = 0;
		String word = "";
		
		List<Integer> numbers = new ArrayList<>();
//		List<String> ss = Arrays.stream(arrayNumbers.split(""))
//				.collect(Collectors.toList());
		
		for(int i = 0; i <= arrayNumbers.length-1; i++) {
			
			String[] strDigits = arrayNumbers[i].split("");
			
			for(int k = 0; k <= strDigits.length-1; k++) {
				int num = Integer.parseInt(strDigits[k]);
				numbers.add(k, num);
			}
			
			for(int l = 0; l <= numbers.size()-1; l++) {
				index += numbers.get(l);
			}
			
			while(index > message.size()) {
				index -= message.size();
			}
			word += message.get(index).toString();
			//System.out.println(message.get(index));
			
			message.remove(index);
			//System.out.print(message);
			index = 0;
			numbers.removeAll(numbers);
		}
		System.out.print(word);
		
    }
}
