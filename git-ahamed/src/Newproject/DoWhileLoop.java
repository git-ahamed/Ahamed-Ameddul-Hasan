package Newproject;

import java.util.Scanner;

public class DoWhileLoop {
	public static void main(String[] args) {
		int number;
		Scanner reader=new Scanner(System.in);
		do {
			System.out.println("Enter Value of x: ");
			number=reader.nextInt();
			number++;
		System.out.println("Value of X is:" +number);
		}while(number<11);
	}

}
