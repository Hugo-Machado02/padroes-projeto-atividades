import java.util.Scanner;

public class AtividadeSingleton{

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Login login = Login.getInstancia();

        System.out.println("========================== Sistema de Login ==========================");
        System.out.print("Digite o Usuario: ");
        String usuario = scan.nextLine();
        
        System.out.print("Digite a Senha: ");
        String senha = scan.nextLine();

        Boolean validaAutenticacao = login.autenticacao(usuario, senha, scan);
        
        if (validaAutenticacao) {
            System.out.println("Login realizado com sucesso!");
        } else {
            System.out.println("Usuário ou senha inválido");
        }
        System.out.println("======================================================================");
    }
}