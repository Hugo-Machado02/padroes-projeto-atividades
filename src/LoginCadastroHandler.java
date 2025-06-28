import java.util.Arrays;
import java.util.List;

public class LoginCadastroHandler extends Handler {
    private List<String> listaLoginsValidos = Arrays.asList("admin", "hsilva", "shayra.kelly");

    @Override
    public boolean valida(Login login) {
        if (!listaLoginsValidos.contains(login.getUsuario())) {
            System.out.println("Login não está cadastrado.");
            return false;
        }
        return proximo == null || proximo.valida(login);
    }
}
