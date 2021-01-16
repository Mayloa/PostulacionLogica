package com.example.pruebaLogica;

import java.util.Scanner;

public class Prueba {

	@SuppressWarnings("resource")
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Ingresa los casos de prueba:");

		int casos = input.nextInt();
		input.nextLine();

		for (int i = 0; i < casos; i++) {
			System.out.println("Ingresa el valor de N para el caso " + (i + 1) + ":");
			int rows = input.nextInt();
		
			System.out.println("Ingresa el valor de M para el caso " + (i + 1) + ":");
			int columns = input.nextInt();
		

			if (rows == columns && rows > 1) {
				String direccion = (rows % 2 == 0) ? "L" : "R";
				System.out.println(direccion);
			
			} else if (rows > columns && columns > 1) {
				String direccion = (columns % 2 == 0) ? "U" : "D";
				System.out.println(direccion);
			
			} else if (columns > rows) {
				String direccion = (rows % 2 == 0) ? "L" : "R";
				System.out.println(direccion);
			
			} else if (columns == 1) {
				String direccion = (rows == 1) ? "R" : "D";
				System.out.println(direccion);
			}
		}
	}

}
