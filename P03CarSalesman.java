package tema21ObjectsAndClassesMoreExc;


import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class P03CarSalesman {

	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        Map<String, Engine> engines = parseEngines(scanner);
	        List<Car> cars = parseCars(scanner, engines);

	        cars.forEach(System.out::println);
	    }

	    private static List<Car> parseCars(Scanner scanner, Map<String, Engine> engines) {
	        String carRegex = "^(?<model>\\S+)\\s(?<engine>\\S+)(?:\\s(?<weight>\\d+))?(?:\\s(?<color>\\S+))?$";
	        Pattern carPattern = Pattern.compile(carRegex);

	        int carsCount = Integer.parseInt(scanner.nextLine().trim());

	        return IntStream
	                .range(0, carsCount)
	                .mapToObj(i -> {
	                    String line = scanner.nextLine().trim();
	                    Matcher matcher = carPattern.matcher(line);

	                    if (!matcher.matches()) {
	                        throw new IllegalArgumentException("Invalid car: " + line);
	                    }

	                    String model = matcher.group("model");
	                    String engineType = matcher.group("engine");
	                    String weight = matcher.group("weight");
	                    String color = matcher.group("color");
	                    Engine engine = engines.get(engineType);

	                    Objects.requireNonNull(engine, () -> "Engine type not found: " + line);

	                    return new Car(model, engine, weight, color);
	                })
	                .collect(Collectors.toList());
	    }

	    private static Map<String, Engine> parseEngines(Scanner scanner) {
	        String engineRegex = "^(?<type>\\S+)\\s(?<power>\\d+)(?:\\s(?<displacement>\\d+))?(?:\\s(?<efficiency>\\S+))?$";
	        Pattern enginePattern = Pattern.compile(engineRegex);

	        int enginesCount = Integer.parseInt(scanner.nextLine().trim());

	        return IntStream
	                .range(0, enginesCount)
	                .mapToObj(i -> {
	                    String line = scanner.nextLine().trim();
	                    Matcher matcher = enginePattern.matcher(line);

	                    if (!matcher.matches()) {
	                        throw new IllegalArgumentException("Invalid engine: " + line);
	                    }

	                    String type = matcher.group("type");
	                    String power = matcher.group("power");
	                    String displacement = matcher.group("displacement");
	                    String efficiency = matcher.group("efficiency");

	                    return new Engine(type, power, displacement, efficiency);
	                })
	                .collect(Collectors.toMap(Engine::getModel, e -> e));
	    }
	    
	    public static class Engine {
	        private String model;
	        private String power;
	        private String displacement;
	        private String efficiency;

	        public Engine(String model, String power, String displacement, String efficiency) {
	            this.model = model;
	            this.power = power;
	            this.displacement = (displacement != null) ? displacement : "n/a";
	            this.efficiency = (efficiency != null) ? efficiency : "n/a";
	        }

	        public String getModel() {
	            return model;
	        }

	        @Override
	        public String toString() {
	            return model + ":" + System.lineSeparator() +
	                    "Power: " + power + System.lineSeparator() +
	                    "Displacement: " + displacement + System.lineSeparator() +
	                    "Efficiency: " + efficiency;
	        }
	    }
	    
	    public static class Car {
	        private String model;
	        private Engine engine;
	        private String weight;
	        private String color;

	        public Car(String model, Engine engine, String weight, String color) {
	            this.model = model;
	            this.engine = engine;
	            this.weight = (weight != null) ? weight : "n/a";
	            this.color = (color != null) ? color : "n/a";
	        }

	        @Override
	        public String toString() {
	            return model + ":" + System.lineSeparator() +
	                    engine + System.lineSeparator() +
	                    "Weight: " + weight + System.lineSeparator() +
	                    "Color: " + color;
	        }
	    }
	    
	    
	    
	}
