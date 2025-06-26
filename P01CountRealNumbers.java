package tema24assocArraysMapsLambdaApiLAB;

import java.text.DecimalFormat;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class P01CountRealNumbers {

	public static void main(String[] args) {
		
		
		Scanner scanner = new Scanner(System.in);
		
		String[] numbers = scanner.nextLine().split(" ");
		
		
		Map<String, Integer> checkList = new TreeMap<>();
		
		for(int i = 0; i <= numbers.length-1; i++) {
			if(!checkList.containsKey(numbers[i])) {
				checkList.put(numbers[i], 1);
				
			} else {
				checkList.put(numbers[i], checkList.get(numbers[i]) + 1);
			}
		}
		
		
		for(Map.Entry<String, Integer> entry: checkList.entrySet()) {
			System.out.printf("%s -> %d%n", entry.getKey(),entry.getValue());
		}

	}

}
