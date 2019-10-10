package clases;

import java.util.Set;
import interfaces.IObserver;
import interfaces.ISubject;

public class Jugador implements IObserver, ISubject {
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

	@Override
	public void nuevoSorteo() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void registerObserver(IObserver observer) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void unregisterObserver(IObserver observer) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void notifyJugadores() {
		// TODO Auto-generated method stub
		
	}


}
