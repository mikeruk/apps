package tema17ListsLab;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;



public class P01SumAdjacentEqualNumbers {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		List<Double> names = new ArrayList<>();
		
		String[] myString = scanner.nextLine().split(" ");
		
		for(String s: myString) {
			names.add(Double.parseDouble(s));
		}
		
		
		for(int i = 0; i < names.size() - 1; i++) {

			if(names.get(i).equals(names.get(i+1))) {
				double sum = names.get(i) + names.get(i+1);
				names.set(i, sum);
				names.remove(i+1);
				i = -1;
				//i--; taka e greshno
			}
		} 
		
		DecimalFormat decimalFormat = new DecimalFormat("0.#");
		for(Double number: names) {
			System.out.print(decimalFormat.format(number) + " ");
		}
	}

}
