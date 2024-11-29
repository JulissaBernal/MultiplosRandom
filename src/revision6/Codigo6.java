package revision6;

import java.util.Scanner;

public class Codigo6 {
//Entre una lista de numeros random muestra cuales son multipos de 5 o 7 de acuerdo la opcion
//Los muestra entre[]

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);//se crea escaner
		int[] n = new int[20];//falta el new

	    for (int i = 0; i < 20; i++) {//le falta un +
	      n[i] = (int)(Math.random() * 381) + 20;
//	      System.out.print(n[i] + " ");//le falta el out
	    }
	    
	    System.out.println("\n¿Qué números quiere resaltar? ");//falta el n
	    System.out.print("(1 – los múltiplos de 5, 2 – los múltiplos de 7): ");
//	    int opcion = Integer.parseInt(System.console().readLine());//falta )
	    int opcion=s.nextInt();
	    int multiplo = (opcion == 1) ? 5 : 7;
	    
	    for (int e : n) {//es for no existe foreach en java y se cambia a numero el e
		      if (e % multiplo == 0) {
		        System.out.print("[" + e + "] ");
		      }else {
		        System.out.print(e + " ");//es out
		      }
	    }
	    
	}//main
}
