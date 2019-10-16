package clases;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import interfaces.IObserver;
import interfaces.IObserverPeriodico;

public class Periodico implements IObserverPeriodico {

	private int[] numeroAcertantes;
	private Set<Integer> numerosGanadores;


	public Periodico(){
		numeroAcertantes = new int[4];
	}

	public void show(){
		System.out.println("Numeros ganadores:\t" + numerosGanadores.toString() +".\n" +
				"Acertantes con tres aciertos:\t" + numeroAcertantes[0] +".\n" +
				"Acertantes con cuatro aciertos:\t" + numeroAcertantes[1] + ".\n" +
				"Acertantes con cinco aciertos:\t" + numeroAcertantes[2] + ".\n" +
				"Acertantes con seis aciertos:\t" + numeroAcertantes[3] + ".");
	}

	@Override
	public void updateJugadores(Set<Integer> numerosJugador) {
		numerosJugador.retainAll(numerosGanadores);
		int aciertos = numerosJugador.size();
		if (aciertos>=3) {
			numeroAcertantes[aciertos - 3] = numeroAcertantes[(aciertos - 3)] + 1;
		}
	}

	public void updatePrimitiva(Set<Integer> numerosGanadores){
		this.numerosGanadores = numerosGanadores;
	}
}
