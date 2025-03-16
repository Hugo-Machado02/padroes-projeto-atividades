abstract class Pessoa {
    private String nome;
    private String telefone;
    private String cpf;
    private String endereco;
    private String nascimento;

    public Pessoa(String nome, String telefone, String cpf, String endereco, String nascimento) {
        this.nome = nome;
        this.telefone = telefone;
        this.cpf = cpf;
        this.endereco = endereco;
        this.nascimento = nascimento;
    }

    public void getNome(){
        System.out.println("Nome: " + this.nome);
    }

    public void getTelefone(){
        System.out.println("Nome: " + this.telefone);
    }

    public void getcpf(){
        System.out.println("CPF: " + this.cpf);
    }

    abstract void solicitaCadastro();

    abstract void solicitaProjeto();
}
