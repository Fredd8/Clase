package EjemplosArrayList.primero.borrado;

import java.util.ArrayList;
import java.util.Iterator;

public class RemoveVsRemovall {

	public static void main(String[] args){
        ArrayList<String> source = new ArrayList<>();
        ArrayList<String> toRemove = new ArrayList<>();
        
        for(int i = 0; i < 30000; i++){
            String s = String.valueOf(System.nanoTime());
            source.add(s);
            if(i % 2 == 0) toRemove.add(s);           
        }
         
      
        for(int i = 0; i < 10; i++)
               System.out.println(source.get(i));
        
        System.out.println(); 
        
        for(int i = 0; i < 10; i++)
                   System.out.println(toRemove.get(i));   
        
        
        long startTime = System.nanoTime();
        removeList1(source, toRemove);
        //removeList2(source, toRemove);
        long endTime = System.nanoTime();
        System.out.println("diff: " + (endTime - startTime) * 1e-9);
    }

	static void removeList1(ArrayList<String> source, ArrayList<String> toRemove) {
		source.removeAll(toRemove);
	}

	static void removeList2(ArrayList<String> source, ArrayList<String> toRemove) {
		for (String s : toRemove) {
			source.remove(s);
		}
	}

}