package EjemplosArrayList.primero;
import java.util.ArrayList;
 
public class BorrarFallaNum1 {
 
    public static void main(String a[]){
         
    	Integer removeElem = 2;
        
        ArrayList<Integer> myList = new ArrayList<Integer>();
        
        myList.add(1);
        myList.add(2);
        myList.add(3);
        myList.add(4);
        myList.add(5);
        
        System.out.println("Antes de borrar:");
        System.out.println(myList);
        
        for(Integer it:myList) {      
            if(removeElem.equals(it))
            	myList.remove(it);            
        }
                       
        System.out.println("Después de borrar:");
        System.out.println(myList);
    }
}
