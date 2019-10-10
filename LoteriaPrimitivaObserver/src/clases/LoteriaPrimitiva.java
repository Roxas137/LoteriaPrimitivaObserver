package clases;

import interfaces.ISubject;

import java.util.List;

import java.util.ArrayList;
import java.util.Random;
import java.util.stream.IntStream;

public class LoteriaPrimitiva implements ISubject {

	@Override
	/**
	 * Permite obtener un listado de 6 numeros aleatorios que conforman los numeros ganadores del sorteo.
	 * @sorteo: listado de los numeros ganadores
	 */
	public List<Integer> nuevoSorteo() {
		ArrayList<Integer> sorteo = new ArrayList<>(6);
		Random r = new Random();
		IntStream iS = r.ints(1, 50);
		for (int i = 0; i < 6; i++){
			sorteo.set(i, iS.toArray()[i]);
		}
		return sorteo;
	}

}
