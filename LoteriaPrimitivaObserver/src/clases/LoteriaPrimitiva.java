package clases;

import interfaces.IObserver;
import interfaces.IObserverPeriodico;
import interfaces.ISubject;

import java.util.*;

import java.util.stream.IntStream;

public class LoteriaPrimitiva implements ISubject {

	private Set<Integer> sorteo;
	private List<IObserver> lObservers;
	private IObserverPeriodico periodico;

    public LoteriaPrimitiva(){
        sorteo = new HashSet<>();
        lObservers = new ArrayList<>();
    }

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
		notifyPeriodico();
		notifyJugadores();
	}

	@Override
	public void registerObserver(IObserver observer) {
		lObservers.add(observer);
	}

	@Override
	public void registerPeriodico(IObserverPeriodico periodico){
	    this.periodico = periodico;
    }

	@Override
	public void unregisterObserver(IObserver observerJugador) {
		lObservers.remove(lObservers.indexOf(observerJugador));
	}

	public void notifyJugadores() {
		for (IObserver j : lObservers){
			j.update(sorteo);
		}
	}

	public void notifyPeriodico(){
	    periodico.updatePrimitiva(sorteo);
    }

}
