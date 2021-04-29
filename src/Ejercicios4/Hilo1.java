package Ejercicios4;

public class Hilo1 extends Thread{
	 public String nombre;
	 public Hilo1 (String n) {
		this.nombre = n;
	}
	 int S=0;
	 public void run() {
		for (int i = 1; i <=3; i++) {
			System.out.println(this.nombre + " corrió " + i + " Km");
		}
	}
}