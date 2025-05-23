public class Retangulo implements Forma{
    private int largura;
    private int altura;

    public Retangulo(int largura, int altura) {
        this.largura = largura;
        this.altura = altura;
    }

    @Override
    public int area() {
        return largura * altura;
    }
}