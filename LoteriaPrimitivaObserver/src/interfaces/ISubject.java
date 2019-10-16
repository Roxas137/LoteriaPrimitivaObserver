package interfaces;

import java.util.List;

public interface ISubject {

    void registerObserver(IObserver observer);
    void registerPeriodico(IObserverPeriodico periodico);
    void unregisterObserver(IObserver observer);

}
