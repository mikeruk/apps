package tema17ListsLab;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P02GaussTrick {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		List<Integer> myList = new ArrayList<>();
		
		String[] myString = scanner.nextLine().split(" ");
		
		for(String index:myString) {
			myList.add(Integer.parseInt(index));
		}	

		
		for(int i = 0; i <= myList.size()/2; i++) {
			int sum = myList.get(i) + myList.get(myList.size()-1);
			if(i == myList.size()-1) {
				break;
			}
			myList.set(i, sum);
			myList.remove(myList.size()-1);
			
		}
		
		for(int i = 0; i <= myList.size()-1; i++) {
			System.out.print(myList.get(i) + " ");
			
		}
		
//		for (Integer number :  myList) {
//            System.out.print(myList + " ");
//        }
	}

}
