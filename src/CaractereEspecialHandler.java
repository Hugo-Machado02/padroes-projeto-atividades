public class CaractereEspecialHandler extends Handler{

    @Override
    public boolean valida(Login login) {
        if (!login.getSenha().matches(".*[@#$%&*!?].*")) {
            System.out.println("--> A senha deve conter ao menos um Caractere Especial (@#$%&*!?)!\n\n");
            return false;
        }
        return proximo == null || proximo.valida(login);
    }
}