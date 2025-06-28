public class TamanhoMinimoHandler extends Handler {
    @Override
    public boolean valida(Login login) {
        if(login.getSenha().length() < 8){
            System.out.println("--> A senha deve ter pelo menos 8 caracteres!\n\n");
            return false;
        }
        return proximo == null || proximo.valida(login);
    }
}
