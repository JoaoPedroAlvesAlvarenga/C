package com.pdr.pag94;

import java.util.Scanner;

public class E4 {
	private static Scanner sc;
	private static int r;
	public static double pi = 3.14;
	
	public static void main(String[] args) {
		sc = new Scanner(System.in);
		
		System.out.print("Marquinhos: ");
		r = sc.nextInt();

		double diametro = 2 * r;
		double perimetro = 2 * pi * r;
		double area = pi * r * r;
		double volume = 4/3 * pi * r * r * r;
		
		System.out.println(diametro);
		System.out.println(perimetro);
		System.out.println(area);
		System.out.println(volume);
	
	}
}