package interfaces;

import java.util.Set;


public interface IObserverJugador {
	
	/*
	 * Metodo para calcular la cantidad de aciertos de un jugador
	 * @param numerosGanadores Lista de numeros ganadores del sorteo
	 * @return Devuelve la cantidad de aciertos de un jugador
	 */
	int numeroAciertos();
	void update(Set<Integer> numerosGanadores);
}
