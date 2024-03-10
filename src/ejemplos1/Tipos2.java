package Ejemplos.src.ejemplos1;

public class Tipos2 {
    public static void main(String[] args) {
        // Es equivalente a: byte numero1 = (byte)Short.parseShort("00000001", 2);
        byte numero1 = Byte.parseByte("0000001", 2);
        // NO es equivalente a: byte numero2 = Byte.parseByte("10000001", 2);
        byte numero2 = (byte)Short.parseShort("10000001", 2);
       
        System.out.println("Numero 1: "+numero1);
        System.out.println("Numero 2: "+numero2);
        
//        numero2 = Byte.parseByte("10000001", 2); // 129 no cabe en un byte
//        System.out.println("Numero 2: "+numero2);
        
        numero1 = 100;
        numero2 = 125;
        
//        byte suma = (byte) (numero1 + numero2);
//        System.out.println("Suma: "+ suma);
        
        System.out.println("Byte.MAX_VALUE: "  + Byte.MAX_VALUE);
    }
}
