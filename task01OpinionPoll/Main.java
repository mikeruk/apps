package tema14DefiningClassesExerc.task01OpinionPoll;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        List<Person> people = new ArrayList<>();

        for( int i = 0; i <= n - 1; i++){
            String[] tokens = scanner.nextLine().split("\\s+");
            Person person = new Person(tokens[0], Integer.valueOf(tokens[1]));
            people.add(person);
        }

//        people.stream().filter(p -> p.getAge() > 30)
//                .sorted((e1, e2) -> Integer.compare(e1.getName().charAt(0), e2.getName().charAt(0)))
//                .forEach(person -> System.out.printf("%s - %d%n", person.getName(), person.getAge()));

        people.stream().filter(p -> p.getAge() > 30)
                .sorted((e1, e2) -> e1.getName().compareTo(e2.getName()))
                .forEach(person -> System.out.printf("%s - %d%n", person.getName(), person.getAge()));

    }
}
