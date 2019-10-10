package clases;

import java.util.Set;
import interfaces.IObserverJugador;

public class Jugador implements IObserverJugador {
	String nombre;
	Set<Integer> numeros;
	Set<Integer> numerosGanadores;

	public Jugador(String nombre, Set<Integer> numeros) {
		this.nombre = nombre;
		this.numeros = numeros;
	}

	@Override
	public int numeroAciertos() {
		numerosGanadores.retainAll(numeros);
		return numerosGanadores.size();
	}

	@Override
	public void update(Set<Integer> numerosGanadores) {
		this.numerosGanadores=numerosGanadores;
	}


}
