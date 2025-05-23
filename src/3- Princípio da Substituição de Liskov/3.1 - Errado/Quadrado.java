public class Quadrado extends FormaErrada {
    public Quadrado(int lado) {
        super(lado, lado);
    }

    @Override
    public void setLargura(int largura) {
        this.largura = largura;
        this.altura = largura;
    }

    @Override
    public void setAltura(int altura) {
        this.altura = altura;
        this.largura = altura;
    }
}