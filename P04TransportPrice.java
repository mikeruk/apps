package Tema0602ProverkiUprajnenie2;

import java.util.Scanner;

public class P04TransportPrice {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		double km = Double.parseDouble(scanner.nextLine());
		String tarifa = scanner.nextLine();
		double razhodTaksi = 0;
		double razhodBus = 0;
		double razhodVlak = 0;
		
		
		if(km < 20) {
			if(tarifa.equals("day")) {
				razhodTaksi = 0.7 + km * 0.79;
				System.out.printf("%.2f", razhodTaksi);
			} else if(tarifa.equals("night")){
				razhodTaksi = 0.7 + km * 0.90;
				System.out.printf("%.2f", razhodTaksi);
			}
		} else if(km < 100 && km >= 20) {
			if(tarifa.equals("day")) {
				razhodTaksi = 0.7 + km * 0.79;
				razhodBus = km * 0.09;
				if(razhodTaksi < razhodBus) {
					System.out.printf("%.2f", razhodTaksi);
				} else if(razhodBus < razhodTaksi) {
					System.out.printf("%.2f", razhodBus);
				}
				
			} else if(tarifa.equals("night")) {
				razhodTaksi = 0.7 + km * 0.90;
				razhodBus = km * 0.09;
				if(razhodTaksi < razhodBus) {
					System.out.printf("%.2f", razhodTaksi);
				} else if(razhodBus < razhodTaksi) {
					System.out.printf("%.2f", razhodBus);
				}
			}
		} else if(km >= 100) {
			if(tarifa.equals("day")) {
				razhodTaksi = 0.7 + km * 0.79;
				razhodBus = km * 0.09;
				razhodVlak = km * 0.06;
				double smallest = Math.min(razhodTaksi, Math.min(razhodBus, razhodVlak));
				System.out.printf("%.2f", smallest);
			} else if(tarifa.equals("night")) {
				razhodTaksi = 0.7 + km * 0.90;
				razhodBus = km * 0.09;
				razhodVlak = km * 0.06;
				double smallest2 = Math.min(razhodTaksi, Math.min(razhodBus, razhodVlak));
				System.out.printf("%.2f", smallest2);
			}
		}
	}

}
