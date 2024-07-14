package Tema0602ProverkiUprajnenie2;

import java.util.Scanner;

public class P08FuelTankPart2 {

	public static void main(String[] args) {

			Scanner scanner = new Scanner(System.in);
			String tipGorivo = scanner.nextLine();
			double litri = Double.parseDouble(scanner.nextLine());
			String karta = scanner.nextLine();
			
			double bezinPrice = 2.22;
			double diselPrice = 2.33;
			double gasPrice = 0.93;
			
			double CenaSotsypkaBenzin = bezinPrice - 0.18;
			double CenaSotsypkaDisel = diselPrice - 0.12;
			double CenaSotsypkaGas = gasPrice - 0.08;
			
			double BenzinPriceNormal = bezinPrice * litri;
			double dieselPriceNormal = diselPrice * litri;
			double gasPriceNormal = gasPrice * litri;
			
			double krainaCenaGorivo = 0;
			double krainaCenaGorivoVolume = 0;
			
			if(tipGorivo.equals("Gas")){
				if(karta.equals("Yes")) {
					krainaCenaGorivo = CenaSotsypkaGas * litri;
					if(litri >= 20 && litri <= 25) {
						krainaCenaGorivoVolume = krainaCenaGorivo - (krainaCenaGorivo*0.08);
					} else if(litri > 25) {
						krainaCenaGorivoVolume = krainaCenaGorivo - (krainaCenaGorivo*0.1);
					} else {
						krainaCenaGorivoVolume =  krainaCenaGorivo;
					}
				} else if(karta.equals("No")) {
					if(litri >= 20 && litri <= 25) {
						krainaCenaGorivo = krainaCenaGorivoVolume;
						krainaCenaGorivoVolume = gasPriceNormal - (gasPriceNormal*0.08);
					} else if(litri > 25) {
						krainaCenaGorivo = krainaCenaGorivoVolume;
						krainaCenaGorivoVolume = krainaCenaGorivo - (krainaCenaGorivo*0.1);
					} else {
						krainaCenaGorivoVolume = gasPriceNormal;
					}
				}
			} else if (tipGorivo.equals("Diesel")){
				if(karta.equals("Yes")) {
					krainaCenaGorivo = CenaSotsypkaDisel * litri;
					if(litri >= 20 && litri <= 25) {
						krainaCenaGorivoVolume = krainaCenaGorivo - (krainaCenaGorivo*0.08);
					} else if(litri > 25) {
						krainaCenaGorivoVolume = krainaCenaGorivo - (krainaCenaGorivo*0.1);
					} else {
						krainaCenaGorivoVolume = krainaCenaGorivo;
					}
				} else if(karta.equals("No")) {
					if(litri >= 20 && litri <= 25) {
						krainaCenaGorivo = krainaCenaGorivoVolume;
						krainaCenaGorivoVolume = dieselPriceNormal - (dieselPriceNormal*0.08);
					} else if(litri > 25) {
						krainaCenaGorivo = krainaCenaGorivoVolume;
						krainaCenaGorivoVolume = dieselPriceNormal - (dieselPriceNormal*0.1);
					} else {
						krainaCenaGorivoVolume = dieselPriceNormal;
					}
				}
			} else if (tipGorivo.equals("Gasoline")){
				if(karta.equals("Yes")) {
					krainaCenaGorivo = CenaSotsypkaBenzin * litri;
					if(litri >= 20 && litri <= 25) {
						krainaCenaGorivoVolume = krainaCenaGorivo - (krainaCenaGorivo*0.08);
					} else if(litri > 25) {
						krainaCenaGorivoVolume = krainaCenaGorivo - (krainaCenaGorivo*0.1);
					} else {
						krainaCenaGorivoVolume = krainaCenaGorivo;
					}
				} else if(karta.equals("No")) {
					if(litri >= 20 && litri <= 25) {
						krainaCenaGorivo = krainaCenaGorivoVolume;
						krainaCenaGorivoVolume = BenzinPriceNormal - (BenzinPriceNormal*0.08);
					} else if(litri > 25) {
						krainaCenaGorivo = krainaCenaGorivoVolume;
						krainaCenaGorivoVolume = BenzinPriceNormal - (BenzinPriceNormal*0.1);
					} else {
						krainaCenaGorivo = BenzinPriceNormal;
					}
				}
			}
			System.out.printf("%.2f lv.",krainaCenaGorivoVolume);
			
		}
}


