package application;

import java.util.Locale;
import java.util.Scanner;

import entities.student;

public class Program {

//	Make a program to read a student's name and the three grades he got in the three quarters of the year 
//	(the first quarter is worth 30 and the second and third are worth 35 each).
//	At the end, show the student's final grade for the year.
//	Also say whether the student is approved (pass) or not (failed) and, if not,
//	how many points are left for the student to obtain the minimum to pass 
//	(which is 60% of the grade).
//	You must create a Student class to solve this problem

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		student data = new student();

		System.out.printf("Name: ");
		data.name = sc.nextLine();

		System.out.printf("Fist note: ");
		data.grades1 = sc.nextDouble();
		System.out.printf("Second note: ");
		data.grades2 = sc.nextDouble();
		System.out.printf("third note: ");
		data.grades3 = sc.nextDouble();

		System.out.printf("\nFINAL GRADE: %.2f", data.finalGrade());
		System.out.println("\n" + data.approved());

		if (data.approved() != "PASS") {
			System.out.println(data.minimum());
		}

		sc.close();
	}

}