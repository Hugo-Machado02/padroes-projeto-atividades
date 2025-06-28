public class NumeroHander extends Handler{

    @Override
    public boolean valida(Login login) {
        if (!login.getSenha().matches(".*\\d.*")) {
            System.out.println("--> A senha deve conter ao menos uma letra Maiúscula!\n\n");
            return false;
        }
        return proximo == null || proximo.valida(login);
    }
}