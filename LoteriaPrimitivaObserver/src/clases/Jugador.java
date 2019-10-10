package clases;

import interfaces.JugadorInterface;

public class Jugador implements JugadorInterface {
	String nombre;
	int[] numeros;
	
	public Jugador(String nombre, int[] numeros) {
		this.nombre = nombre;
		this.numeros = numeros;
	}

	@Override
	public int numeroAciertos(int[] numerosGanadores) {
		// TODO Auto-generated method stub
		return 0;
	}
	
}
