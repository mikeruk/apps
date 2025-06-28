package tema24assocArraysMapsLambdaApiLAB;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class P02WordSynonyms {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int n = Integer.parseInt(scanner.nextLine());
		
		List<String> synonyms = new ArrayList<>();
		//ArrayList<String> synonymssss = new ArrayList<>();
		Map<String, List<String>> dictionary = new LinkedHashMap<>();
		
		//String word = scanner.nextLine();
		for(int i = 0; i < n; i++) {
			String word = scanner.nextLine();
			String currentSynonym = scanner.nextLine();
			
			dictionary.putIfAbsent(word, new ArrayList<>());
			dictionary.get(word).add(currentSynonym);
			
		}
		
		for(Map.Entry<String, List<String>> entry: dictionary.entrySet()){
			//String currentWord = entry.getKey();
			System.out.printf("%s - %s%n", entry.getKey(), String.join(", ", entry.getValue()));
		}
		
		
	}

}
