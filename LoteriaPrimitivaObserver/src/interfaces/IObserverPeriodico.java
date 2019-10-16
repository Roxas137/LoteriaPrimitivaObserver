package interfaces;

import java.util.Set;

public interface IObserverPeriodico {

    void updatePrimitiva(Set<Integer> numerosGanadores);
    void updateJugadores(Set<Integer> numerosJugadores);

}
