package clases;

import interfaces.IObserverJugador;

public class Jugador implements IObserverJugador {
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
