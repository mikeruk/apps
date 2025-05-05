package tema17ListsLab;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P03MergingLists {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		List<String> list1 = Arrays.stream(scanner.nextLine().split(" "))
				.collect(Collectors.toList());
		
		List<String> list2 = Arrays.stream(scanner.nextLine().split(" "))
				.collect(Collectors.toList());
		List<String> list3 = new ArrayList<>();
		
		
		int smallListSize = Math.min(list1.size(), list2.size());
		
		
		for(int i = 0; i < smallListSize; ++i) {
			
			System.out.print(list1.get(i) + " " + list2.get(i) + " ");
			
		}
		
		
		printTheRest(list1,smallListSize);
		printTheRest(list2,smallListSize);
			
	}
	
	private static void printTheRest(List<String> list, int beginIndex) {
        for (int i = beginIndex; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
		
	}
	
	

}
