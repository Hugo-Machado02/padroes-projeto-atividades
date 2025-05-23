public class ContaCorrente extends Conta implements Rendimento{
    public ContaCorrente(String nome, String cpf) {
        super(nome, cpf);
    }
    public void CalculoRendimentos(){
        System.out.println("Rendimento da conta poupança: 0.25%");
    }
}
