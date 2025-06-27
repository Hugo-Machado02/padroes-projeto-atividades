public interface Subject {
    void addObserver(Observer observer, GeneroFilme genero);
    void removeObserver(Observer observer, GeneroFilme genero);
    void notificarObservers(String titulo, GeneroFilme genero);
}
