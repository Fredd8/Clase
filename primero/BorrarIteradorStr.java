package EjemplosArrayList.primero;
import java.util.ArrayList;
import java.util.Iterator;
 
public class BorrarIteradorStr {
 
    public static void main(String a[]){
         
        String removeElem = "Perl";
        
        ArrayList<String> myList = new ArrayList<String>();
        
        myList.add("Java");
        myList.add("Perl");
        myList.add("Perl");
        myList.add("Oracle");
        myList.add("Perl");
        myList.add("C++");
        myList.add("Perl");
        
        System.out.println("Antes de borrar:");
        System.out.println(myList);
        
        Iterator<String> itr = myList.iterator();
        while(itr.hasNext()){
            if(removeElem.equals(itr.next())){
                itr.remove();
            }
        }
        
        System.out.println("Después de borrar:");
        System.out.println(myList);
    }
}
