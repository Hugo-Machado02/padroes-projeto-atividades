public class Produto {
    public String nome;
    public double valor;

    public Produto(String nome, double valor) {
        this.nome = nome;
        this.valor = valor;
    }

    public void calculaDesconto(double valor){
        System.out.println("Calcula o desconto do valor "+ valor +" e devolve ao front-end o valor do desconto");
    }
}
