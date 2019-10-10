package main;

import java.util.*;

import clases.Jugador;
import clases.LoteriaPrimitiva;
import clases.Periodico;
import interfaces.IObserver;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LoteriaPrimitiva loteria = new LoteriaPrimitiva();
		Periodico periodico = new Periodico();
		
		List<Jugador> jugadores = new ArrayList<Jugador>();
		jugadores.add(new Jugador("Jugador0", new HashSet<Integer>() {
			{this.add(1);
			this.add(2);
			this.add(3);
			this.add(4);
			this.add(5);
			this.add(6);}
		}));
		jugadores.add(new Jugador("Jugador1", new HashSet<Integer>() {
			{this.add(7);
			this.add(8);
			this.add(9);
			this.add(10);
			this.add(11);
			this.add(12);}
		}));
		
		loteria.registerObserver(periodico);
		
		for (Jugador j : jugadores) loteria.registerObserver(j);
		
		for (Jugador j : jugadores) j.registerObserver(j);
		
		loteria.nuevoSorteo();
		//periodico.show();
	}

}
