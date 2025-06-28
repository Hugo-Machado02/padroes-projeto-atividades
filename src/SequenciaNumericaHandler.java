public class SequenciaNumericaHandler extends Handler {
    @Override
    public boolean valida(Login login) {
        for (int i = 0; i < login.getSenha().length() - 2; i++) {
            if (Character.isDigit(login.getSenha().charAt(i)) &&
                Character.isDigit(login.getSenha().charAt(i + 1)) &&
                Character.isDigit(login.getSenha().charAt(i + 2))) {
                int a = login.getSenha().charAt(i) - '0';
                int b = login.getSenha().charAt(i + 1) - '0';
                int c = login.getSenha().charAt(i + 2) - '0';

                if (a + 1 == b && b + 1 == c) {
                    System.out.println("--> A senha não pode conter 3 números consecutivos!\n\n");
                    return false;
                }
            }
        }
        return proximo == null || proximo.valida(login);
    }
}
