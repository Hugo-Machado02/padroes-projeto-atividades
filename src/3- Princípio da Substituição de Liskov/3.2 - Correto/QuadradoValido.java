public class QuadradoValido implements Forma {
    private int lado;

    public QuadradoValido(int lado) {
        this.lado = lado;
    }

    @Override
    public int area() {
        return lado * lado;
    }
}