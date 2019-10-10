package interfaces;

import java.util.List;


public interface IObserverJugador {
	
	/*
	 * Metodo para calcular la cantidad de aciertos de un jugador
	 * @param numerosGanadores Lista de numeros ganadores del sorteo
	 * @return Devuelve la cantidad de aciertos de un jugador
	 */
	int numeroAciertos(List<Integer> numerosGanadores);
}
