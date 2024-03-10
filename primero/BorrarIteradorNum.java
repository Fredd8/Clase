package EjemplosArrayList.primero;
import java.util.ArrayList;
import java.util.Iterator;
 
public class BorrarIteradorNum {
 
    public static void main(String a[]){
         
        Integer removeElem = 1;
        ArrayList<Integer> myList = new ArrayList<Integer>();
        
        myList.add(3);
        myList.add(1);
        myList.add(1);
        myList.add(7);
        myList.add(1);
        
        System.out.println("Before remove:");
        System.out.println(myList);
        Iterator<Integer> itr = myList.iterator();
        while(itr.hasNext()){
            if(removeElem == itr.next()){
                itr.remove();
            }
        }
        System.out.println("After remove:");
        System.out.println(myList);
    }
}
