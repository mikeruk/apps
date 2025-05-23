package tema17ListsMoreExercises;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class P03TakeSkipRope {

	public static void main(String[] args) {
		
		 Scanner scanner = new Scanner(System.in);
	        String input = scanner.nextLine();
	        List<Character> numbers = new ArrayList<>();
	        List<Character> characters = new ArrayList<>();
	        for (int i = 0; i < input.length(); i++) {

	            if (input.charAt(i) >= 48 && input.charAt(i) <= 57) {
	                numbers.add(input.charAt(i));
	            } else {
	                characters.add(input.charAt(i));
	            }
	        }
	        List<Integer> takeList = new ArrayList<>();
	        List<Integer> skipList = new ArrayList<>();
	        for (int i = 0; i < numbers.size(); i++) {
	            int numToAdd = Character.getNumericValue(numbers.get(i));
	            if (i % 2 == 0) {
	                takeList.add(numToAdd);
	            } else {
	                skipList.add(numToAdd);
	            }
	        }
	        String string = characters.toString()
	                .substring(1, 3 * characters.size() - 1)
	                .replaceAll(", ", "");

	        takePartsOfString(string, takeList, skipList);

	    }

	    private static void takePartsOfString(String string, List<Integer> takeList, List<Integer> skipList) {
	        StringBuilder newString = new StringBuilder();
	        for (int i = 0; i < takeList.size(); i++) {
	            int take = takeList.get(i);
	            for (int j = 0; j < take; j++) {
	                if (string.length() == 0) {
	                    break;
	                }
	                newString.append(string.charAt(0));
	                string = string.substring(1);
	            }

	            for (int j = 0; j < skipList.get(i); j++) {

	                if (string.length() == 0) {
	                    break;
	                }
	                string = string.substring(1);
	            }
	        }
	        System.out.println(newString);
		
		
		
	}

}
