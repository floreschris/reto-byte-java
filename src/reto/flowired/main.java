package reto.flowired;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class main {
	Scanner component = new Scanner(System.in);

	public void Ejercicio1() {

		/*
		 * 1. BUSCAR LAS VOCALES Se deberá ingresar una cadena de caracteres. Se deberá
		 * desplegar en pantalla cuantas vocales fueron encontradas y cuantas de cada
		 * vocal. Ejemplo: Cadena ingresada: "Quiero Programar" Total de vocales= 7 De A
		 * = 2 De E = 1 De I = 1 De O = 2 De U = 1
		 */
		System.out.println("	     Ingresa tu texto			");
		System.out.println("----------------------------------------");
		String texto = component.nextLine().toLowerCase();

		int total_Vocales = 0;
		int total_Vocales_a = 0;
		int total_Vocales_e = 0;
		int total_Vocales_i = 0;
		int total_Vocales_o = 0;
		int total_Vocales_u = 0;
		System.out.println("----------------------------------------");

		for (char c : texto.toCharArray()) {
			switch (c) {
			case 'a':
				total_Vocales_a++;

				break;

			case 'e':
				total_Vocales_e++;
				break;
			case 'i':
				total_Vocales_i++;
				break;
			case 'o':
				total_Vocales_o++;
				break;
			case 'u':
				total_Vocales_u++;
				break;
			default:
				break;
			}
		}

		total_Vocales = total_Vocales_a + total_Vocales_e + total_Vocales_i + total_Vocales_o + total_Vocales_u;

		System.out.println(" 	Total de Vocales: " + total_Vocales);
		System.out.println("----------------------------------------");
		System.out.println("--->	Total de Vocales A: " + total_Vocales_a);
		System.out.println("--->	Total de Vocales E: " + total_Vocales_e);
		System.out.println("--->	Total de Vocales I: " + total_Vocales_i);
		System.out.println("--->	Total de Vocales O: " + total_Vocales_o);
		System.out.println("--->	Total de Vocales U: " + total_Vocales_u);
		System.out.println("----------------------------------------");
		component.close();
	}

	public void Ejercicio2() {
		/*
		 * 2. BUSCAR UNA CADENA Se deberá ingresar una cadena. Se deberá ingresar la
		 * cadena que se quiere buscar. Se deberá desplegar en pantalla cuantas
		 * ocurrencias fueron encontradas. Ejemplo: Cadena ingresada: "Quiero Programar"
		 * Cadena buscar: "org" Ocurrencias........ : 1
		 */
		System.out.print("Ingrese la cadena principal: ");
		String cadenaPrincipal = component.nextLine().toLowerCase();

		System.out.print("Ingrese la cadena a buscar: ");
		String cadenaBuscar = component.nextLine().toLowerCase();

		if (cadenaPrincipal.isEmpty() || cadenaBuscar.isEmpty()) {
			System.out.println("Error: Las cadenas no pueden ser vacías.");
			return;
		}

		int ocurrencias = 0;
		int pos = 0;

		while ((pos = cadenaPrincipal.indexOf(cadenaBuscar, pos)) != -1) {
			ocurrencias++;
			pos += cadenaBuscar.length();
		}

		System.out.println("\nOcurrencias: " + ocurrencias);
	}

	public void Ejercicio3() {

		/*
		 * 3. POSICIONAMIENTO DE CADENAS Se deberá ingresar una cadena con mas de una
		 * palabra. Se deberá desplegar en pantalla una nueva cadena que se formará con
		 * el orden inverso de la cadena ingresada. Ejemplo: Cadena ingresada:
		 * "Quiero Programar en una computadora" Cadena inversa:
		 * "computadora una en programar Quiero"
		 */

		System.out.println("	Ingrese un texto de palabras: ");
		System.out.println("----------------------------------------");
		String texto_de_palabras = component.nextLine();
		System.out.println("----------------------------------------");

		String[] palabras = texto_de_palabras.split(" ");

		for (int i = palabras.length - 1; i >= 0; i--) {
			System.out.print(palabras[i] + " ");
		}
	}

	public void Ejercicio4() {
		/*
		 * 4. POLINDROMO Se deberá indicar si la cadena ingresada es un palíndromo
		 * Ejemplo: Cadena: ANONA Mensaje: La cadena ANONA ingresada si es un
		 * palíndromo.
		 */
		System.out.println("	Ingrese una texto: ");
		System.out.println("--------------------------------------------------");

		String texto = component.nextLine();

		String texto_ingresado = texto.toLowerCase().replace("", "");
		String texto_invertido = new StringBuilder(texto_ingresado).reverse().toString();
		System.out.println("--------------------------------------------------");

		String respuesta = texto_ingresado.equalsIgnoreCase(texto_invertido)
				? "La palabra " + texto + " ingresada si es un palíndromo."
				: "La palabra " + texto + " ingresada no es un palíndromo.";
		System.out.println(respuesta);
		component.close();
	}

	public void Ejercicio6() {

		/*
		 * 6. ORDENAMIENTO Se deberá ingresar un conjunto de 5 números. Se deberá
		 * desplegar en pantalla el conjunto de números ordenados ascendentemente y
		 * descendentemente. Ejemplo: Ingrese número: 20 Ingrese número: 10 Ingrese
		 * número: 18 Ingrese número: 2 Ingrese número: 22
		 * 
		 */
		System.out.println("Bienvenido al ordenamiento de numero contables en Byte Solutions");
		int[] numeros = new int[5];

		for (int i = 0; i < numeros.length; i++) {
			System.out.print("Ingrese número --> " + (i + 1) + ": ");
			while (!component.hasNextInt()) {
				System.out.print("Error: Ingrese un número entero. ");
				component.next();
			}
			numeros[i] = component.nextInt();
		}

		for (int i = 0; i < numeros.length - 1; i++) {
			for (int j = 0; j < numeros.length - i - 1; j++) {
				if (numeros[j] > numeros[j + 1]) {
					int temp = numeros[j];
					numeros[j] = numeros[j + 1];
					numeros[j + 1] = temp;
				}
			}
		}
		System.out.println("-------------------------------------------");
		System.out.println("\nOrden ascendente:");
		System.out.println("-------------------------------------------");
		for (int numero : numeros) {
			System.out.print("Número: " + numero + " |");
		}

		System.out.println("\nOrden descendente:");
		System.out.println("-------------------------------------------");
		for (int i = numeros.length - 1; i >= 0; i--) {
			System.out.print("Número: " + numeros[i] + " |");
		}
	}

	public void Ejercicio7() {
		/*
		 * 7. FACTORES DE NUMEROS Se deberá ingresar un número mayor que 0 y menor que
		 * 100. Se deberá desplegar en pantalla los factores del número ingresado.
		 * Ejemplo: Ingrese número: 6 Factores: 6,3,2,1
		 */
		System.out.print("Ingrese un número entre 1 y 100: ");
		int numero = component.nextInt();

		if (numero < 1 || numero > 100) {
			System.out.println("Error: El número debe estar entre 1 y 100.");
			return;
		}

		List<Integer> factores = new ArrayList<>();
		for (int i = 1; i <= numero; i++) {
			if (numero % i == 0) {
				factores.add(i);
			}
		}

		System.out.println("\nFactores:");
		for (int factor : factores) {
			System.out.print(factor + "  ");
		}
	}

	public static void main(String[] args) {
		main m = new main();
		m.Ejercicio7();
	}

}
