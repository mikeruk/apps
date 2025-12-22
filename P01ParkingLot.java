package tema07SetsAndMapsAdvancedLab;

import java.util.*;

public class P01ParkingLot {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        Set<String> cars = new LinkedHashSet<>();
        while(!input.equals("END")){
            String[] tokens = input.split(",\\s+");
            if(tokens[0].equals("IN")){
                cars.add(tokens[1]);
            } else if(tokens[0].equals("OUT")){
                cars.remove(tokens[1]);
            }
            input = scanner.nextLine();
        }
        if(cars.isEmpty()){
            System.out.println("Parking Lot is Empty");
        } else{
            for(String car: cars){
                System.out.println(car);
            }
        }




    }
}
