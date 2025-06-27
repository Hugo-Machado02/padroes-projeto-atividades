import java.util.*;

public class Plataforma implements Subject {
    private Map<GeneroFilme, List<Observer>> observersPorGenero = new HashMap<>();

    @Override
    public void addObserver(Observer observer, GeneroFilme genero) {
        observersPorGenero.computeIfAbsent(genero, k -> new ArrayList<>()).add(observer);
    }

    @Override
    public void removeObserver(Observer observer, GeneroFilme genero) {
        List<Observer> observers = observersPorGenero.get(genero);
        if (observers != null) {
            observers.remove(observer);
        }
    }

    @Override
    public void notificarObservers(String titulo, GeneroFilme genero) {
        List<Observer> observers = observersPorGenero.get(genero);
        if (observers != null) {
            for (Observer observer : observers) {
                observer.notificar(titulo, genero);
            }
        }
    }

    public void publicarConteudo(String titulo, GeneroFilme genero) {
        System.out.println("\n==> Conteúdo Publicado: " + titulo + " (" + genero + ")");
        notificarObservers(titulo, genero);
    }
}
