package tema19ObjectsAndClasses;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class P05Students {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		
		String input = scanner.nextLine();
		List<Student> students = new ArrayList<>();
		
		while(!input.equals("end")) {
			
			String[] tokens = input.split("\\s+");
			
			String firstName = tokens[0];
			String lastName = tokens[1];
			int age = Integer.parseInt(tokens[2]);
			String homeTown = tokens[3];
			
			Student currentStudent = new Student(firstName, lastName, age, 
					homeTown);
			students.add(currentStudent);
			
			
			input = scanner.nextLine();
			


		}
		
		
		String homeTownCheck = scanner.nextLine();
		for(Student student: students) {
			if(student.getHometown().equals(homeTownCheck)) {
				System.out.println(student);
			}
			
		}
		
		
	}
	
	
	 public static class Student{
		private String firstName;
		private String lastName;
		private int age;
		private String homeTown;
		
		
		public Student(String firstName, String lastName,
				int age, String homeTown) {
			
			this.firstName = firstName;
			this.lastName = lastName;
			this.age = age;
			this.homeTown = homeTown;
		}
		
		public String getHometown() {
			return this.homeTown;
		}
		
		
		public String toString() {
			return this.firstName + " "
					+ this.lastName + " is " 
					+ this.age + " years old";
		}
	}
	 
	 
}

