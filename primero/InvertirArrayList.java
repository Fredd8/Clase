package EjemplosArrayList.primero;
import java.util.*;

public class InvertirArrayList {

	public static void main(String[] args) {
		ArrayList<String> nombres = new ArrayList<String>();
		ArrayList<String> aux;

		nombres.add("Ana");
		nombres.add("Luisa");
		nombres.add("Felipe");
		nombres.add("Pablo");
		nombres.add("Lola");
		nombres.add("Pedro");
		nombres.add("Jose");
		nombres.add("Angel");
		nombres.add("Susana");
		
		System.out.println("nombres " + nombres);

		System.out.println("\nLlamamos a invertir\n");
		
		aux = invertir1(nombres);
	
		System.out.println(aux.get(0));

		// Comprobación si la copia es superficial o profunda:
		// Modificamos las a por A en el primer elemento del ArrayList aux
		aux.set(0, aux.get(0).replace("a", "A"));

		System.out.println("nombres " + nombres);
		System.out.println("aux " + aux);
		// Vemos que son dos ArrayList diferentes
		
		System.out.println("\nLlamamos a invertir2\n");
		invertir2(nombres);

		System.out.println("nombres " + nombres);
		
		System.out.println("\nLlamamos a invertir3\n");

		invertir3(nombres);

		System.out.println("nombres " + nombres);

		System.out.println("\nLlamamos a invertir4\n");

		invertir4(nombres);

		System.out.println("nombres " + nombres);

	}

	public static ArrayList<String> invertir1(ArrayList<String> a_nombres) {
		ArrayList<String> resultado = new ArrayList<String>();

		for (int i = a_nombres.size() - 1; i >= 0; i--)
			resultado.add(a_nombres.get(i));

		return resultado;
	}

	public static void invertir2(ArrayList<String> nombres) {
		for (int i = nombres.size() - 1; i >= 0; i--) {
			nombres.add(nombres.get(i));
			nombres.remove(i);
		}

	}

	public static void invertir3(ArrayList<String> nombres) {
		int j, tam = nombres.size();
		String aux = "";
		
		j = tam-1;
		for (int i = 0; i < tam/2; i++) {
			aux = nombres.get(i);		
			nombres.set(i, nombres.get(j));	
			nombres.set(j--, aux);	
		}

	}

	public static void invertir4(ArrayList<String> nombres) {
		Collections.reverse(nombres);
	}
}
