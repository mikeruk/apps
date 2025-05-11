package tema17ListsLab;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P05ListManipulationAdvanced {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
        String[] array = sc.nextLine().split(" ");
        List<Integer> list = new ArrayList<>();
        parsingOfList(array, list);
 
        String[] command = sc.nextLine().split(" ");
        while (!command[0].equals("end")){
          switch (command[0]){
              case "Contains": 
            	  boolean contains = false;
            	  for(int i = 0; i <= list.size()-1; i++) {
            		  if(list.get(i).equals(Integer.parseInt(command[1]))) {
            			  contains = true;
            		  } 
            	  }
            	  if(contains) {
        			  System.out.println("Yes");
        		  }else {
        			  System.out.println("No such number");
        		  }
                  break;
              case "Print":
            	  if(command[1].equals("even")) {
            		  for(int i = 0; i <= list.size()-1; i++) {
               		   int num1 = list.get(i);
               		   if(num1 % 2 == 0) {
               			   System.out.print(num1 + " ");
               		   }
            		  }
            		  System.out.println();
            	  }
            	  if(command[1].equals("odd")) {
            		  for(int i = 0; i <= list.size()-1; i++) {
               		   int num1 = list.get(i);
               		   if(num1 % 2 != 0) {
               			   System.out.print(num1 + " ");
               		   }
            		  }
            		  System.out.println();
            	  }
            	 
                  break;
              case "Get":
            	  int sum = 0;
            	  if(command[1].equals("sum")) {
            		  for(int i = 0; i <= list.size()-1; i++) {
            			  sum += list.get(i);
               		  }
            		  System.out.println(sum);
            	  }
                  break;
              case "Filter":
            	  int num = Integer.parseInt(command[2]);
                  if(command[1].equals(">=")) {
                	  for(int i = 0; i <= list.size()-1; i++) {
            			  if(list.get(i).compareTo(num) >= 0) {
            				  System.out.print(list.get(i) + " ");
            			  }
               		  }
                	  System.out.println();
                  }
                  if(command[1].equals("<=")) {
                	  for(int i = 0; i <= list.size()-1; i++) {
            			  if(list.get(i).compareTo(num) <= 0) {
            				  System.out.print(list.get(i) + " ");
            			  }
               		  }
                	  System.out.println();
                  }
                  if(command[1].equals("<")) {
                	  for(int i = 0; i <= list.size()-1; i++) {
            			  if(list.get(i).compareTo(num) < 0) {
            				  System.out.print(list.get(i) + " ");
            			  }
               		  }
                	  System.out.println();
                  }
                  if(command[1].equals(">")) {
                	  for(int i = 0; i <= list.size()-1; i++) {
            			  if(list.get(i).compareTo(num) > 0) {
            				  System.out.print(list.get(i) + " ");
            			  }
               		  }
                	  System.out.println();
                  }
                  break;
          }
            command = sc.nextLine().split(" ");
        }
 
//        for (int print : list) {
//            System.out.print(print + " ");
//        }

		

	}
	
	public static List parsingOfList(String[] someArray, List<Integer> someList){
        for (int i = 0; i < someArray.length; i++) {
            someList.add(Integer.parseInt(someArray[i]));
        }
        return someList;
    }


}
