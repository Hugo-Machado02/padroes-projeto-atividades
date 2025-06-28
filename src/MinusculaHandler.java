public class MinusculaHandler extends Handler{

    @Override
    public boolean valida(Login login) {
        if (!login.getSenha().matches(".*[a-z].*")) {
            System.out.println("--> A senha deve conter ao menos uma letra Minuscula!\n\n");
            return false;
        }
        return proximo == null || proximo.valida(login);
    }
}