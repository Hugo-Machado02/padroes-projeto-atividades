public class ItemFolha implements ItemComponent{
    private String nome;
    private double valor;

    public ItemFolha(String nome, double valor){
        this.nome = nome;
        this.valor = valor;
    }

    public String getNome() {
        return nome;
    }

    public double getValor(){
        return valor;
    }

    public void exibirDetalhes(){
        System.out.println("Item: " + this.getNome());
        System.out.println("Valor: " + this.getValor());
    }
}
