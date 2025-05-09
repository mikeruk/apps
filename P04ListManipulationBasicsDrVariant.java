package tema17ListsLab;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class P04ListManipulationBasicsDrVariant {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
        String[] array = sc.nextLine().split(" ");
        List<Integer> list = new ArrayList<>();
        parsingOfList(array, list);
 
        String[] command = sc.nextLine().split(" ");
        while (!command[0].equals("end")){
          switch (command[0]){
              case "Add":
                  list.add(Integer.parseInt(command[1]));
                  break;
              case "Remove":
                  list.remove((Integer)(Integer.parseInt(command[1])));
                  break;
              case "RemoveAt":
                  int index = Integer.parseInt(command[1]);
                  list.remove(index);
                  break;
              case "Insert":
                  int index1 = Integer.parseInt(command[2]);
                  int digit = Integer.parseInt(command[1]);
                  list.add(index1, digit);
                  break;
          }
            command = sc.nextLine().split(" ");
        }
 
        for (int print : list) {
            System.out.print(print + " ");
        }

	}
	
	public static List parsingOfList(String[] someArray, List<Integer> someList){
        for (int i = 0; i < someArray.length; i++) {
            someList.add(Integer.parseInt(someArray[i]));
        }
        return someList;
    }

}
