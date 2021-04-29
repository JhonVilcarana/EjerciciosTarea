package Ejercicios3;

public class Hilo2 {

	public static void main(String[] args) {
		Thread h1 = new Thread(new Hilo1(3));
		h1.start();
	}
}