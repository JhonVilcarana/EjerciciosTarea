package Ejercicios2;

public class Hilo2 {
	private static int [] lista = {
			2,7,5,4,9,3,6,8,1,10
	};
public static void main(String[] args) {
	int S=0;
	for (int listas : lista) {
		S += Math.pow(listas, 3);
		Thread h1 = new Thread(new Hilo(listas));
		h1.start();
	}
	System.out.println("La suma de los cubos es = " + S);
}

}