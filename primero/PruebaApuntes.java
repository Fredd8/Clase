package EjemplosArrayList.primero;
import java.util.*;

public class PruebaApuntes {

	public static void main(String[] args) {
		ArrayList<String> nombres = new ArrayList<String>();
		
		nombres.add("Ana"); 
		nombres.add("Luisa"); 
		nombres.add("Felipe"); 
		System.out.println(nombres); // [Ana, Luisa, Felipe] 
		
		nombres.add(3, "Pablo"); //Se pone Pablo en la segunda posicion y desplaza a Ana y los demás
		System.out.println(nombres); // [Ana, Pablo, Luisa, Felipe] 
		
		/***************************************************************************************************/
		// Esto fallaria, set  tiene que tener una posicion que este ocupada por un elemento ya
		//nombres.set(5, "Pablo"); //Se pone Pablo en la segunda posicion y desplaza a Ana y los demás
		// Exception in thread "main" java.lang.IndexOutOfBoundsException: Index: 9, Size: 4 
		
		// Esto fallaria
		//nombres.add(5, "Pablo"); //Se pone Pablo en la segunda posicion y desplaza a Ana y los demás
		// Exception in thread "main" java.lang.IndexOutOfBoundsException: Index: 9, Size: 4 
		// Sin embargo, si añadimos con add en la posión que toca, no habrá problema.
		// nombres.add(3, "Pablo");
		/***************************************************************************************************/
				
		nombres.remove(0); // Borra a Ana
		System.out.println(nombres); // [Pablo, Luisa, Felipe] 
		
		System.out.println("Borramos a Ana por indice");
		nombres.add(0, "Ana"); // Aniade a Ana de nuevo
		System.out.println(nombres); // [Ana, Pablo, Luisa, Felipe] 
		
		System.out.println("Borramos a Ana por nombre");
		nombres.remove("Ana"); // Borramos a Ana de nuevo
		System.out.println(nombres); // [Pablo, Luisa, Felipe] 
		
		nombres.set(0,"Alfonso"); //Sustituye a Pablo, eliminandolo
		System.out.println(nombres); // [Alfonso, Luisa, Felipe] 
		
		String s = nombres.get(1); //Recoge Luisa
		System.out.println(s);
		
		String ultimo = nombres.get(nombres.size()-1); //Recoge el ultimo
		System.out.println(ultimo); // Felipe 
		
		// Aniade estos 3 al final
		nombres.add("Juan"); 
		nombres.add("Fernando"); 
		nombres.add("Maria");
		
		System.out.println(nombres);
		
		int pos;
		
		if ((pos = nombres.indexOf("Fernando")) != -1)
			System.out.println("Encontrado Fernando en la posición " + pos);
		else
			System.out.println("El elemento Fernando no está en la lista");
		
		if ((pos = nombres.indexOf("Pepe")) != -1)
			System.out.println("Encontrado Pepe en la posición " + pos);
		else
			System.out.println("El elemento Pepe no está en la lista");
		
		// Ahora imprimimos todos, uno por linea:
		System.out.println();
		System.out.println("Con for normal");
		
		System.out.println();
		for (int i=0;i< nombres.size();i++) {
			System.out.println(nombres.get(i));
		}
		
		System.out.println();
		System.out.println("Con for each");
		System.out.println();
		
		for (String nom:nombres) {
			System.out.println(nom);
		}

		System.out.println();
		System.out.println("Con iterador");
		System.out.println();
		
		Iterator <String>it = nombres.iterator(); 
		
		while(it.hasNext()) 
			System.out.println(it.next() + " ");
	}

}
