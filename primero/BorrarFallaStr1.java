package EjemplosArrayList.primero;
import java.util.ArrayList;
 
public class BorrarFallaStr1 {
 
    public static void main(String a[]){
         
        String removeElem = "Perl";
        
        ArrayList<String> myList = new ArrayList<String>();
        
        myList.add("Java");
        myList.add("Unix");
        myList.add("Oracle");
        myList.add("C++");
        myList.add("Perl");
        
        System.out.println("Antes de borrar:");
        System.out.println(myList);
        
        for(String it:myList) {      
            if(removeElem.equals(it))
            	myList.remove(it);            
        }
                       
        System.out.println("Después de borrar:");
        System.out.println(myList);
    }
}
