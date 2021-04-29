package Ejercicios;

public class Hilo1 extends Thread{
	public void run() {
		for (int x = 1; x<=10; x++) {
			System.out.println(x);
		}
	}
}