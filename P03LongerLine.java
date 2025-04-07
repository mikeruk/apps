package tema15MethodsExerciseMoreExc;

import java.util.Scanner;

public class P03LongerLine {
	
	public static void main(String[] args) {
		
		 Scanner scanner = new Scanner(System.in);
		 
		 	double point1X = Double.parseDouble(scanner.nextLine());
	        double point1Y = Double.parseDouble(scanner.nextLine());
	        double point2X = Double.parseDouble(scanner.nextLine());
	        double point2Y = Double.parseDouble(scanner.nextLine());
	        double point3x = Double.parseDouble(scanner.nextLine());
	        double point3Y = Double.parseDouble(scanner.nextLine());
	        double point4X = Double.parseDouble(scanner.nextLine());
	        double point4Y = Double.parseDouble(scanner.nextLine());
		 
	        printLongerLine(point1X, point1Y, point2X, point2Y, point3x, point3Y, point4X, point4Y);
	    }
	


    static double lineLength (double x1, double y1, double x2, double y2)
    {
        return Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
    }

    static double distanceToCenter(double x, double y)
    {
        return Math.sqrt(Math.pow((0 - x), 2) + Math.pow((0 - y), 2));
    }

    static void printClosestPointFirst(double x1, double y1, double x2, double y2)
    {
        if (distanceToCenter(x1, y1) > distanceToCenter(x2, y2))
        {
        	System.out.printf("(%.0f, %.0f)", x2, y2);
        	System.out.printf("(%.0f, %.0f)", x1, y1);
            //System.out.println("(" + x2 + ", " + y2 + ")");
            //System.out.println("(" + x1 + ", " + y1 + ")");
        }
        else
        {
        	System.out.printf("(%.0f, %.0f)", x1, y1);
        	System.out.printf("(%.0f, %.0f)", x2, y2);
        	//System.out.print("(" + x1 + ", " + y1+")");
        	//System.out.println("(" + x2 + ", " + y2 + ")");
        }
    }

    static void printLongerLine(double x1, double y1, double x2, double y2, double x3, double y3, double x4, double y4)
    {
        if (lineLength(x1, y1, x2, y2) >= lineLength(x3, y3, x4, y4))
        {
            printClosestPointFirst(x1, y1, x2, y2);
        }
        else if (lineLength(x1, y1, x2, y2) < lineLength(x3, y3, x4, y4))
        {
            printClosestPointFirst(x3, y3, x4, y4);
        }
    }


	 
	   
	}
