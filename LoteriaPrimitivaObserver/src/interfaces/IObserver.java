package interfaces;

import java.util.Set;


public interface IObserver {
	
	/**
	 * Metodo para calcular la cantidad de aciertos de un jugador
	 * @param numerosGanadores Lista de numeros ganadores del sorteo
	 */
	void update(Set<Integer> numerosGanadores);

	int numeroAciertos();
}
