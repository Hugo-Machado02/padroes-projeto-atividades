public class Triangulo {
    protected int largura;
    protected int altura;

    public Triangulo(int largura, int altura) {
        this.largura = largura;
        this.altura = altura;
    }

    public void setLargura(int largura){
        this.largura = largura;
    }
    
    public void setAltura(int altura){
        this.altura = altura;
    }

    public int getLargura(){
        return largura;
    }
    public int getAltura(){
        return altura;
    }

    public int area(){
        return largura * altura;
    }
}