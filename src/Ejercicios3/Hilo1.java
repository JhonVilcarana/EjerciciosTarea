package Ejercicios3;

public class Hilo1 extends Thread{
	private double numero;
	public Hilo1 (double numero) {
		this.numero=numero;
}
public void run() {
System.out.println(this.numero + " el factorial es " + factorial(this.numero));		
}
public double factorial(double n) {
	double resultado = 1;
	for (int i = 1; i <=n; i++) {
		resultado *=i;
	}
	return resultado;
}
}