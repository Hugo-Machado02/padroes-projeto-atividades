import java.util.ArrayList;
import java.util.List;

public class Plataforma implements Subject {
    private List<Observer> observers = new ArrayList<>();

    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notificarObservers(String titulo) {
        for (Observer observer : observers) {
            observer.notificar(titulo);
        }
    }

    public void publicarConteudo(String titulo) {
        System.out.println("\n==> Conteúdo Publicado: " + titulo);
        notificarObservers(titulo);
    }
}
