package EjemplosArrayList.primero;
import java.util.*; 
public class ApuntesMedia { 
	public static void main(String[] args) { 
		Scanner teclado = new Scanner(System.in); 
		ArrayList<Integer> numeros = new ArrayList<Integer>(); 
		int n; 
		
		System.out.println("Introduce números enteros. 0 para acabar: "); 
		System.out.println("Numero: "); 
		n = teclado.nextInt(); 
		
		while (n != 0) { 
			numeros.add(n); 
			System.out.println("Numero: "); 
			n = teclado.nextInt(); 				
		}; 
		
		teclado.close();
		
		System.out.println("Ha introducido: " + numeros.size() + " números:"); 
		System.out.println(numeros); //Muestra el arrayList completo 
		
		double suma = 0; 
		
		for(Integer i: numeros) 
			suma = suma + i; 
		
		System.out.println("Suma: " + suma); 
		System.out.println("Media: " + suma/numeros.size()); 
		teclado.close();	

		for (int num:numeros) {
			System.out.println(num);
		}
	} 
}
