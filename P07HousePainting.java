package FirstStepsInCodingMoreExercises;

import java.util.Scanner;

public class P07HousePainting {

	public static void main(String[] args) {
		
		
		
		Scanner scanner = new Scanner(System.in);
		double x = Double.parseDouble(scanner.nextLine());
		double y = Double.parseDouble(scanner.nextLine());
		double h = Double.parseDouble(scanner.nextLine());
		
		double sideWallFace = x * y;
		double sideWindowFace = 1.5 * 1.5;
		double sideWallFaceNeto = sideWallFace - sideWindowFace;
		double backWallFace = x * x;
		double frontDoorFace = 1.2 * 2;
		double frontWallFaceNeto = backWallFace - frontDoorFace;
		
		double roofSide = x * y;
		double roofFront = x * h / 2;
		
		double paintSiedeWallsLitres = sideWallFaceNeto * 2 / 3.4;
		double frontBackWallsLitres = (backWallFace + frontWallFaceNeto) / 3.4;
		
		double roofSideLitre = roofSide * 2 / 4.3;
		double roofFrontBackLitre = roofFront * 2 / 4.3;
		
		double totalGreenPaintLitre = paintSiedeWallsLitres + frontBackWallsLitres;
		double totalRedPaintLitres = roofSideLitre + roofFrontBackLitre;
		
		System.out.printf("%.2f \n", totalGreenPaintLitre);
		System.out.printf("%.2f", totalRedPaintLitres);
		

	}

}
