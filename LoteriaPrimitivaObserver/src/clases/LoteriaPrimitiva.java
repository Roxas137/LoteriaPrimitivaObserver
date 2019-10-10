package clases;

import interfaces.IObserverJugador;
import interfaces.ISubject;

import java.util.*;

import java.util.stream.IntStream;

public class LoteriaPrimitiva implements ISubject {

	Set<Integer> sorteo;
	List<IObserverJugador> lObservers;



	@Override
	/**
	 * Permite obtener un listado de 6 numeros aleatorios que conforman los numeros ganadores del sorteo.
	 * @sorteo: listado de los numeros ganadores
	 */
	public void nuevoSorteo() {
		sorteo = new HashSet<Integer>();
		Random r = new Random();
		r.setSeed(0);
		while(sorteo.size()<6){
			sorteo.add(r.nextInt(49)+1);
		}
		notifyJugadores();
	}

	@Override
	public void registerJugador(IObserverJugador observerJugador) {
		lObservers.add(observerJugador);
	}

	@Override
	public void unregisterJugador(IObserverJugador observerJugador) {
		lObservers.remove(lObservers.indexOf(observerJugador));
	}

	@Override
	public void notifyJugadores() {
		for (IObserverJugador j : lObservers){
			j.update(sorteo);
		}
	}

}
