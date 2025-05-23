import java.util.Scanner;

public class Login {
    private static Login instancia;
    private String usuario;
    private String senha;

    private Login() {}

    public static Login getInstancia() {
        if (instancia == null) {
            instancia = new Login();
        }
        return instancia;
    }

    public boolean autenticacao(String usuario, String senha) {
        Scanner scan = new Scanner(System.in);

        if (this.usuario == null || this.senha == null) {
            this.usuario = usuario;
            this.senha = senha;
        }

        if (!this.usuario.equals(usuario) || !this.senha.equals(senha)) {
            System.out.println("Usuário ou senha incorretos.");
            return false;
        }

        Captcha captcha = new Captcha();
        String codigoGerado = captcha.gerarCodigo(6);
        System.out.println("Código do Capchat: " + codigoGerado);
        System.out.print("Digite o Códgio do Capchat: ");
        String codigoDigitado = scan.nextLine();

        if (!codigoGerado.equals(codigoDigitado)) {
            System.out.println("Código incorreto! O usuário pode ser um Bot.");
            return false;
        }

        return true;
    }
}
