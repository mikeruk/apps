package tema17ListsMoreExercises;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P04MixedUpLists {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		List<Integer> firstList  = Arrays.stream(scanner.nextLine()
				.split(" ")).map(var -> Integer.parseInt(var))
				.collect(Collectors.toList());
		
		List<Integer> secondList  = Arrays.stream(scanner.nextLine()
				.split(" ")).map(var -> Integer.parseInt(var))
				.collect(Collectors.toList());
		
		int smallerListCount = Math.min(firstList.size(), secondList.size()); 
				
		
		List<Integer> combinedList  = new ArrayList<>(smallerListCount);
		
		Collections.reverse(secondList);
		
		for (int i = 0; i < smallerListCount; i++)
        {
            combinedList.add(firstList.get(i));
            combinedList.add(secondList.get(i));
        }
		
		 int constraintOne = 0;
         int constraintTwo = 0;
         
         if (firstList.size() > secondList.size())
         {
             constraintOne = firstList.get(firstList.size() - 1);
             constraintTwo = firstList.get(firstList.size() - 2);
         }
         else
         {
             constraintOne = secondList.get(secondList.size() - 1);
             constraintTwo = secondList.get(secondList.size() - 2);
         }
         
         
         int smallerConstraintNum = Math.min(constraintTwo, constraintOne);
         int biggerConstraintNum = Math.max(constraintTwo, constraintOne);

         
         
		List<Integer> listToPrint  = new ArrayList<>(20);
		
		for(int i = 0; i <= combinedList.size()-1; i++) {
			
			if(combinedList.get(i) > smallerConstraintNum && combinedList.get(i) < biggerConstraintNum) {
				listToPrint.add(i);
			}
		}
		
		
		//listToPrint = combinedList.Where(n -> n > smallerConstraintNum && n < biggerConstraintNum).toList();
		
		
		Collections.sort(listToPrint);

		
		System.out.println(listToPrint);
		
		
		
		
	}

}
