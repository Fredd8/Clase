package Expresiones.src.expresiones;

public class Expresiones {

	public static void main(String[] args) {
		System.out.println("\nEjercicio 1\n");
		
		float A=5, B=25, C=10, D;
		//int A=5, B=25, C=10;
		System.out.println("A + B / C -> " + (A + B / C));
		System.out.println("(A + B) / C -> " + (A + B) / C);
		System.out.println("A + B % C -> " + (A + B % C));
		
		System.out.println("\nEjercicio 2\n");
		
		A=4;
		B=5;
		C=1;
		
		System.out.println(B * A - B * B / 4 * C);
		System.out.println((A * B) / 3 *3); 
		System.out.println(( ( ( B + C ) / 2 * A + 10 ) * 3 * B ) - 6);
		
		System.out.println("\nEjercicio3\n");
		
		float m = 9, n=1, p=2, q=8, r=1;
		int a= 1, b=-5, c=6;
		
		System.out.println("(m+n)/(p-q) -> " + (m+n)/(p-q));
		System.out.println("Ecuación segundo grado");
		
		System.out.print("(-b+(Math.pow(Math.pow(b, 2) - 4*a*c, 1/2)))/(2*a) -> ");	
		System.out.println((-b+(Math.pow(Math.pow(b, 2) - 4*a*c, 1/2)))/(2*a));	
		System.out.print("(-b-(Math.pow(Math.pow(b, 2) - 4*a*c, 1/2)))/(2*a) -> ");	
		System.out.println((-b-(Math.pow(Math.pow(b, 2) - 4*a*c, 1/2)))/(2*a));
		
		/*System.out.println((-b+(Math.sqrt((Math.pow(b, 2) - 4*a*c))))/(2*a));
		System.out.println((-b-(Math.sqrt((Math.pow(b, 2) - 4*a*c))))/(2*a));*/
		
		System.out.println("((m+n)/p)/((a-r)/5) -> " + ((m+n)/p)/((a-r)/5));
		
		System.out.println("\nEjercicio 4\n");
		
		A=3;		B=4;		C=2;
		
		System.out.println("((A * B) < (B + C)) && (A==C)) -> " + (((A * B) < (B + C)) && (A==C)));
		
		A=2;		B=5;		C=3;	D=5;
		
		System.out.println("((A + B) > C) || ((B / D > B)) -> " + (((A + B) > C) || ((B / D > B)))); 
		
		A=4;		B=2;		C=3;
		
		System.out.println("(A/B) * C + (A / B) -> " + ((A/B) * C + (A / B)));
		
		double X=1, Y=4, Z=10, PI=3.141592, E=2.718281;
		
		System.out.println();
		System.out.println("PI*X*X > Y || 2*PI*X <= Z -> " +  (PI*X*X > Y || 2*PI*X <= Z));
		System.out.println("X>3 && Y==4 || X+Y <= Z" + (X>3 && Y==4 || X+Y<=Z));
		System.out.println("X>3 && (Y==4 || X+Y<=Z)" + (X>3 && (Y==4 || X+Y<=Z)));
		System.out.println("!( Y/2==2*X) && !( Y<PI-E*Z) -> " + (!( Y/2==2*X) && !( Y<PI-E*Z)));
		
		A=5;		B=4;  C=3; 	X=0.05; 	Y=2.3;
		
		System.out.println("A==B%C -> " + (A==B%C) );
		System.out.println("6/C < C%6 -> " + (6/C < C%6 ));
		System.out.println("C + B - 1 != A || B >= -B * A && A * A<=10 ->" + (C + B - 1 != A || B >= -B * A && A * A<=10));
		System.out.println("B % A / C -> " + (B % A / C) );
		System.out.println("!(X * A > Y/B) -> " + (!(X * A > Y/B)));
		
		System.out.println("\nEjercicio 5\n");
		
		//expresión que sólo permita valores entre 1 y 10. 
		int x=3;
		
		System.out.println("x>=1 && x<=10 -> " + (x>=1 && x<=10));
		//expresión que permita valores entre 1 y 3, y 5 a 7 exclusivamente
		System.out.println("x>=1 && x<=3 || x>=5 && x<=7 " + (x>=1 && x<=3 || x>=5 && x<=7));
		//expresión que permita edades entre 18 y 25 años
		System.out.println("x>=18 && x<=25 " + (x>=18 && x<=25));
		
		System.out.println("\nEjercicio 6\n");
		
		System.out.println("7==4+3 || 6<2 && 5>=8 -> " + (7==4+3 || 6<2 && 5>=8));
		System.out.println("(7==4+3 || 6<2) && 5>=8 -> " + ((7==4+3 || 6<2) && 5>=8));
		 
	}

}
