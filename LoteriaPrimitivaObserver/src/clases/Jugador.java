package clases;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;
import interfaces.IObserver;
import interfaces.IObserverPeriodico;
import interfaces.ISubject;
import interfaces.ISubjectJugador;

public class Jugador implements IObserver, ISubjectJugador{
	private String nombre;
	private Set<Integer> numeros;
	private Set<Integer> numerosGanadores;
	private IObserverPeriodico periodico;

	public Jugador(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public int numeroAciertos() {
		numerosGanadores.retainAll(numeros);
		return numerosGanadores.size();
	}

	@Override
	public void update(Set<Integer> numerosGanadores) {
		this.numerosGanadores=numerosGanadores;
		numeros = new HashSet<Integer>();
		Random r = new Random();
		while(numeros.size()<6){
			numeros.add(r.nextInt(49)+1);
		}

		notifyPeriodico();
	}

	@Override
	public void registerPeriodico(IObserverPeriodico observer) {
		// TODO Auto-generated method stub
		periodico = observer;
	}

	@Override
	public void unregisterPeriodico(IObserverPeriodico periodico) {

	}

	public void notifyPeriodico(){
		periodico.updateJugadores(numeros);
	}
}
