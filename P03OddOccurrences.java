package tema24assocArraysMapsLambdaApiLAB;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class P03OddOccurrences {

	public static void main(String[] args) {
		
		
		Scanner scanner = new Scanner(System.in);
		
		String[] words = scanner.nextLine().toLowerCase().split(" ");
		
		Map<String, Integer> counts = new LinkedHashMap<>();
		
		for(int i = 0; i <= words.length-1; i++) {
			
			if(!counts.containsKey(words[i].toLowerCase())) {
				counts.put(words[i], 1);
			} else {
				counts.put(words[i], counts.get(words[i])+1);
			}
			
		}
		
		List<String> collectAllStrings = new ArrayList<>();
		
		for(Map.Entry<String, Integer> entry: counts.entrySet()) {
			if(entry.getValue() % 2 != 0) {
				collectAllStrings.add(entry.getKey());
			}
		}
		System.out.print(String.join(", ", collectAllStrings));

	}

}
