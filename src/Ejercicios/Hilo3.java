package Ejercicios;

public class Hilo3 {

static Hilo1 h1;
	
	public static void main(String[] args) {
		h1  = new Hilo1();
		Thread h2 = new Thread(new Hilo2());
		h1.start();
		h2.start();
	}
	}