package tema07SetsAndMapsAdvancedLab;

import java.util.*;

public class P05AverageStudentsGrades {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        //String[] input = scanner.nextLine().split("\\s+");
        Map<String, List<Double>> students = new TreeMap<>();

        for(int i = 0; i <= n - 1; i++){
            String[] input = scanner.nextLine().split("\\s+");
            if(!students.containsKey(input[0])){
                students.put(input[0], new ArrayList<>());
                students.get(input[0]).add(Double.valueOf(input[1]));
            } else{
                students.get(input[0]).add(Double.valueOf(input[1]));
            }


        }

        students.entrySet().stream().forEach(e -> {
            double avg = e.getValue().stream().mapToDouble(Double::doubleValue).average().orElse(0.0);
            System.out.print(String.format("%s -> ", e.getKey()));
            for(double num: e.getValue()){
                System.out.printf("%.2f ",num);
            }
            System.out.printf("(avg: %.2f)%n", avg);


        });


    }
}
