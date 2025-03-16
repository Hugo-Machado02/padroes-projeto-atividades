public class Cliente extends Pessoa implements Autenticavel{
    public Cliente(String nome, String telefone, String cpf, String endereco, String nascimento) {
        super(nome, telefone, cpf, endereco, nascimento);
    }

    public void login(){
        System.out.println("Login do Cliente Realizado");
    }

    public void solicitaCadastro(){
        System.out.println("O cliente solicitou um cadastro");
    }

    public void solicitaProjeto(){
        System.out.println("O cliente solicitou um projeto");
    }
}
