package application;

import java.util.Locale;
import java.util.Scanner;

import entities.rectangle;

public class Program {

//	Make a program to read the width and height values ​​of a rectangle.
//	Then, show on the screen the value of its area, perimeter and diagonal.
//	Use a class as shown below.
//	 [Rectangle] 
//	 - double Width e Height
//	 + Area() double
//	 + Perimeter() double
//	 + Diagonal() double

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		rectangle rect = new rectangle();
		

		System.out.print("Enter the widht of retangle: ");
		rect.width = sc.nextDouble();
		System.out.print("Enter the height of retangle: ");
		rect.height = sc.nextDouble();

		System.out.printf("Area: %.2f%n",  rect.area());
		System.out.printf("Perimeter: %.2f%n", rect.perimeter());
		System.out.printf("Diagonal: %.2f%n", rect.diagonal());
		
		
		sc.close();
	}

}
