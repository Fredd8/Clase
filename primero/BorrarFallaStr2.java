package EjemplosArrayList.primero;
import java.util.ArrayList;
 
public class BorrarFallaStr2 {
 
    public static void main(String a[]){
         
        String removeElem = "Perl";
        
        ArrayList<String> myList = new ArrayList<String>();
 
// Esta lista la hace bien, ninguno se repite:
//        myList.add("Java");
//        myList.add("Kotlin");
//        myList.add("Perl");
//        myList.add("Oracle");
//        myList.add("Perl");
//        myList.add("C++");
//        myList.add("Perl");
        
// Cambiar el 2 a Perl y volver a probar
// Ya no borra todos los elementos Perl, el índice que corresponde al segundo que es igual, se lo salta
 
        myList.add("Perl");
        myList.add("Java");
        myList.add("Perl");
        myList.add("Perl");
        myList.add("Oracle");
        myList.add("Perl");
        myList.add("C++");
        myList.add("Perl");

        
        System.out.println("Antes de borrar:");
        System.out.println(myList);
             
        for(int i=0;i<myList.size();i++) {      
                if(removeElem.equals(myList.get(i)))
                	myList.remove(i);            
        }
           
        System.out.println("Después de borrar:");
        System.out.println(myList);
    }
}
