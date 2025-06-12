package tema19ObjectsAndClasses;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import tema19ObjectsAndClasses.P05Students.Student;

public class P06Students2 {

public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		
		String input = scanner.nextLine();
		List<Student> students = new ArrayList<>();
		
		String firstName = "";
		String lastName = "";
		int age = 0;
		String homeTown = "";
		
		
		while(!input.equals("end")) {
			
			String[] tokens = input.split("\\s+");
			firstName = tokens[0];
			lastName = tokens[1];
			age = Integer.parseInt(tokens[2]);
			homeTown = tokens[3];
			
			if(!isStudentExisting(firstName,lastName, age, homeTown, students)) {
				Student currentStudent = new Student(firstName, lastName, age, 
						homeTown);
				students.add(currentStudent);
			}
			
			input = scanner.nextLine();
		}

		String homeTownCheck = scanner.nextLine();
		
		for(Student student: students) {
			if(student.getHometown().equals(homeTownCheck)) {
				System.out.println(student);
			}
			
		}
		
		
		
	}
	
	private static boolean isStudentExisting(String firstName, 
			String lastName, int age, String homeTown, List<Student> students) {
		
		for(Student student: students) {
			
			boolean isFirstNameEqual = student.getFirstName(firstName).equals(firstName);
			boolean isLastNameEqual = student.getLastName(lastName).equals(lastName);
			if(isFirstNameEqual && isLastNameEqual){
				student.setHomeTown(homeTown);
				student.setAge(age);
				
				return true;
			} 
		}
		return false;
		
	}
	
	
	 static class Student{
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
		
		public void setHomeTown(String homeTown) {
			this.homeTown = homeTown;
		}
		
		public String getFirstName(String firstName) {
			//this.firstName = firstName;
			return this.firstName;
		}
		
		public String getLastName(String lasttName) {
			//this.firstName = firstName;
			return this.lastName;
		}
		
		public String toString() {
			return this.firstName + " "
					+ this.lastName + " is " 
					+ this.age + " years old";
		}
		
		public void setAge(int age) {
			this.age = age;
		}
	}
	 
	 
}

