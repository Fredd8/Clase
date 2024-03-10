package EjemplosArrayList.primero;

import java.util.*;

// Pendiente de hacer
public class ApuntesMediaFunc {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		ArrayList<Integer> numeros = new ArrayList<Integer>();

		rellenaLista(teclado, numeros);
		teclado.close();

		System.out.println("Ha introducido: " + numeros.size() + " números:");
		System.out.println(numeros); // Muestra el arrayList completo

		System.out.println("Media: " + calculaMedia(numeros));
		teclado.close();

		for (int num : numeros) {
			System.out.println(num);
		}
	}

	public static void rellenaLista(Scanner sc, ArrayList<Integer> listaNum) {
		int n;

		System.out.println("Introduce números enteros. 0 para acabar: ");
		System.out.println("Numero: ");
		n = Integer.parseInt(sc.nextLine());

		while (n != 0) {
			listaNum.add(n);
			System.out.println("Numero: ");
			n = Integer.parseInt(sc.nextLine());
		}
	}

	public static double calculaMedia(ArrayList<Integer> listaNum) {
		double suma = 0;

		for (Integer i : listaNum)
			suma = suma + i;

		System.out.println("Suma: " + suma);

		// System.out.println("Media: " + suma / listaNum.size());

		return suma / listaNum.size();
	}
}
