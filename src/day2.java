
		import java.util.Scanner;

		public class day2 {

		    public static void main(String[] args) {

		        // 1. Variables & Data Types
		        int age;
		        double salary;
		        char grade;
		        boolean isStudent;

		        // 2. Scanner for Input
		        Scanner sc = new Scanner(System.in);

		        // 3. Taking Input
		        System.out.print("Enter your age: ");
		        age = sc.nextInt();

		        System.out.print("Enter your salary: ");
		        salary = sc.nextDouble();

		        System.out.print("Enter your grade: ");
		        grade = sc.next().charAt(0);

		        System.out.print("Are you a student (true/false): ");
		        isStudent = sc.nextBoolean();

		        // 4. Output
		        System.out.println("\n----- YOUR DETAILS -----");
		        System.out.println("Age: " + age);
		        System.out.println("Salary: " + salary);
		        System.out.println("Grade: " + grade);
		    
		    System.out.println("Student: " + isStudent);

		        // 5. Simple Calculation
		        int nextYearAge = age + 1;
		        System.out.println("Your age next year will be: " + nextYearAge);

		        sc.close();
		    }
		


	}


