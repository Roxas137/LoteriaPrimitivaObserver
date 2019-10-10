package interfaces;

import java.util.List;

public interface ISubject {

    void nuevoSorteo();
    void registerObserver(IObserver observer);
    void unregisterObserver(IObserver observer);
    void notifyJugadores();

}
