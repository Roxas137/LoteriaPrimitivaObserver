package clases;

import java.util.List;

import interfaces.IObserverJugador;

public class Jugador implements IObserverJugador {
	String nombre;
	List<Integer> numeros;
	
	public Jugador(String nombre, List<Integer> numeros) {
		this.nombre = nombre;
		this.numeros = numeros;
	}

	@Override
	public int numeroAciertos(List<Integer> numerosGanadores) {
		numerosGanadores.retainAll(numeros);
		return numerosGanadores.size();
	}
	
}
