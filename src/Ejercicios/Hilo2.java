package Ejercicios;

public class Hilo2 extends Thread{

	public void run() {
		for (int x = 10; x >=1; x--) {
			System.out.println(x);
		}
	}

}