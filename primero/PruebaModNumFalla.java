package EjemplosArrayList.primero;
import java.util.*; 
public class PruebaModNumFalla { 
	public static void main(String[] args) { 
		
		ArrayList<Integer> numeros = new ArrayList<Integer>(); 

		numeros.add(1); 
		numeros.add(2);
		numeros.add(3); 
		numeros.add(4);
		
		System.out.println("Ha introducido: " + numeros.size() + " números:"); 
		System.out.println(numeros); //Muestra el arrayList completo 
		
		Iterator <Integer>it = numeros.iterator(); 
		
		// Ojo, que no cambiamos nada así
		while(it.hasNext()) {
			Integer pInteger = it.next();
			if (pInteger == 2) {
				pInteger = 100;
				System.out.println(pInteger);
			}
		}
		
		it = numeros.iterator(); 
		while(it.hasNext())			
			System.out.println(it.next()); 		
		
		for (int i=0; i < numeros.size(); i++) {
			int num = numeros.get(i);
			if (num == 100) num = 400;
			System.out.println(num);				
		}
		
		it = numeros.iterator(); // Para volver al principio 
		while(it.hasNext())			
			System.out.println(it.next()); 
	} 
}
