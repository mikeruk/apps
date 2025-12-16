package tema07SetsAndMapsAdvancedLab;

import java.text.DecimalFormat;
import java.util.*;
import java.util.stream.Collectors;

public class P08AcademyGraduation {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, double[]> studentsData = new TreeMap<>();

        int numberOfStudents = Integer.parseInt(scanner.nextLine());

        while (numberOfStudents-- > 0){
            String name = scanner.nextLine();
            double[] scoreInfo =  Arrays.stream(scanner.nextLine().split("\\s+"))
                    .mapToDouble(Double::parseDouble).toArray();

            studentsData.put(name,scoreInfo);

        }

        for (Map.Entry<String, double[]> entry : studentsData.entrySet()) {
            String k = entry.getKey();
            double[] v = entry.getValue();
            double sum = 0;
            for (double v1 : v) {
                sum += v1;
            }

            DecimalFormat format = new DecimalFormat("0.################");
            System.out.printf("%s is graduated with %s%n", k, format.format(sum/v.length));
        }
    }
}
