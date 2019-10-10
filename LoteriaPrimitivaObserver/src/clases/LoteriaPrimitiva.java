package clases;

import interfaces.IObserver;
import interfaces.ISubject;

import java.util.*;

import java.util.stream.IntStream;

public class LoteriaPrimitiva implements ISubject {

	Set<Integer> sorteo;
	List<IObserver> lObservers;



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
	public void registerObserver(IObserver observer) {
		lObservers.add(observer);
	}

	@Override
	public void unregisterObserver(IObserver observerJugador) {
		lObservers.remove(lObservers.indexOf(observerJugador));
	}

	@Override
	public void notifyJugadores() {
		for (IObserver j : lObservers){
			j.update(sorteo);
		}
	}

}
