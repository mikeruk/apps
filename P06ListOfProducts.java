package tema17ListsLab;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P06ListOfProducts {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int n = Integer.parseInt(scanner.nextLine());
		
		List<String> products = new ArrayList<>();
		
		for(int i = 0; i < n; i++) {
			String currentProduct = scanner.nextLine();
			products.add(currentProduct);
		}
		
//		String currentItem = scanner.nextLine();
//		List<String> productsList = new ArrayList<>(Arrays
//				.stream(currentItem.split(" "))
//				.collect(Collectors.toList()));
		

		Collections.sort(products);
		
		for(int i = 0; i <= products.size() - 1; i++) {
			System.out.printf("%d.%s%n",i+1, products.get(i));
		}
		
		
	}

}
