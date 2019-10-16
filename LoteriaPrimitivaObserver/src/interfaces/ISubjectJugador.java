package interfaces;

public interface ISubjectJugador {

    void registerPeriodico(IObserverPeriodico periodico);
    void unregisterPeriodico(IObserverPeriodico periodico);

}
