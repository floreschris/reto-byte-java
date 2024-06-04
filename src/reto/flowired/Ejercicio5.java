package reto.flowired;

import java.util.Scanner;

public class Ejercicio5 {

	/*
	 * 5. CAJERO AUTOMÁTICO Se deberá ingresar un monto que desea sacar del cajero.
	 * Se deberá desplegar en pantalla el detalle de billetes que el cajero va a
	 * devolver. Ejemplo: Monto a retirar: 118.00 Billetes de 100 = 1 Billetes de 50
	 * = 0 Billetes de 20 = 0 Billetes de 10 = 1 Billetes de 5 = 1 Billetes de 1 = 3
	 */
	public static void main(String[] args) {

		Scanner component = new Scanner(System.in);

		System.out.print("Ingrese el monto a retirar: ");
		double monto = component.nextDouble();

		if (monto <= 0) {
			System.out.println("Error: El monto debe ser un número positivo mayor que cero.");
			return;
		}

		int[] denominaciones = { 100, 50, 20, 10, 5, 1 };
		int[] billetes_Entregados = new int[denominaciones.length];
		double monto_Disponible = 1000;

		while (monto > 0) {
			for (int i = 0; i < denominaciones.length; i++) {
				int cantidadBilletes = (int) Math.floor(monto / denominaciones[i]);
				cantidadBilletes = Math.min(cantidadBilletes, (int) (monto_Disponible / denominaciones[i]));

				monto -= cantidadBilletes * denominaciones[i];
				monto_Disponible -= cantidadBilletes * denominaciones[i];
				billetes_Entregados[i] += cantidadBilletes;

				if (cantidadBilletes > 0) {
					System.out.println("Billetes de " + denominaciones[i] + " = " + cantidadBilletes);
				}
			}
		}

	}
}
