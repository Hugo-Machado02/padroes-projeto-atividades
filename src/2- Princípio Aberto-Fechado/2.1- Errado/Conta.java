public class Conta {
    private String nome;
    private String cpf;
    private int tipoConta;

    public Conta(String nome, String cpf, String enderec, int tipoConta) {
        this.nome = nome;
        this.cpf = cpf;
        this.tipoConta = tipoConta;
    }

    public void calculaRendimento(){
        if(getTipoConta() == 1){
            System.out.println("Rendimento da conta poupança: 0.2%");
        }
        else if(getTipoConta() == 2){
            System.out.println("Rendimento da Conta Standard: 0.4%");
        }
        else if(getTipoConta() == 3){
            System.out.println("Rendimento da conta Gold: 1%");
        }
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public int getTipoConta() {
        return tipoConta;
    }
    public void setTipoConta(int tipoConta) {
        this.tipoConta = tipoConta;
    }
    
    
}
