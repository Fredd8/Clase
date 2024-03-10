package EjemplosArrayList.primero;
import java.util.*; 
public class PruebaModCadFalla { 
	public static void main(String[] args) { 
		
		ArrayList<String> nombres = new ArrayList<String>(); 

		nombres.add("uno"); 
		nombres.add("dos");
		nombres.add("tres"); 
		nombres.add("cuatro");
		
		System.out.println("Ha introducido: " + nombres.size() + " números:"); 
		System.out.println(nombres); //Muestra el arrayList completo 
		
		Iterator <String>it = nombres.iterator(); 
		
		// Ojo, que no cambiamos nada así	
		while(it.hasNext()) {
			String pString = it.next();
			if (pString.equals("dos")) {
				//pString = "prueba";
				pString = pString.replace('d', 'D');
				System.out.println("pString " + pString);
			}
		}
		
		System.out.println();
		
		it = nombres.iterator(); 
		while(it.hasNext()) 	
			System.out.println(it.next()); 
		
	} 
}
