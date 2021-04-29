package Ejercicios2;

public class Hilo extends Thread{
	private int listas;
	public Hilo (int listas) {
		this.listas=listas;
	}
	public void run() {
		System.out.println(this.listas + " al cubo " + Math.pow(this.listas, 3) );
	}
	}

