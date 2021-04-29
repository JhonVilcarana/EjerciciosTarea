package Ejercicios4;

public class Hilo2 {

	private static String [] guepardos = {"guepardo 1", "guepardo 2",
			"guepardo 3" , "guepardo 4"};
	
public static void main(String[] args) {
	for (String guepardo : guepardos) {
		
		Thread h1 = new Thread (new Hilo1 (guepardo));
		h1.start();
	}
}
}