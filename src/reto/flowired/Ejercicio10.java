package reto.flowired;

public class Ejercicio10 {
	public static int fibonacci(int n) {
		if (n == 0 || n == 1) {
			return n;
		} else {
			return fibonacci(n - 1) + fibonacci(n - 2);
		}
	}

	public static int conejos(int meses) {
		return fibonacci(meses);
	}

	public static void main(String[] args) {
		int parejasConejos = conejos(12);
		System.out.println("Cantidad de parejas de conejos después de un año: " + parejasConejos);
	}
}
