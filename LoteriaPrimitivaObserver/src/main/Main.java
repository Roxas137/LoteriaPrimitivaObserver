package main;

import java.util.*;

import clases.Jugador;
import clases.LoteriaPrimitiva;
import clases.Periodico;
import interfaces.IObserver;


public class Main {

	public static void main(String[] args) {
		LoteriaPrimitiva loteria = new LoteriaPrimitiva();
		Periodico periodico = new Periodico();
		
		List<Jugador> jugadores = new ArrayList<Jugador>();

		for (int i = 0; i < 4000000; i++){
			jugadores.add(new Jugador("Jugador"+i));
		}
		
		loteria.registerPeriodico(periodico);
		
		for (Jugador j : jugadores) loteria.registerObserver(j);

		for (Jugador j : jugadores) j.registerPeriodico(periodico);

		loteria.nuevoSorteo();
		periodico.show();
	}

}
