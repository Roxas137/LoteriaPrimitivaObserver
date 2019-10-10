package interfaces;

import java.util.List;

public interface ISubject {

    void nuevoSorteo();
    void registerJugador(IObserverJugador observerJugador);
    void unregisterJugador(IObserverJugador observerJugador);
    void notifyJugadores();

}
