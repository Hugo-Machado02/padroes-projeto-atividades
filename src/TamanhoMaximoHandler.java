public class TamanhoMaximoHandler extends Handler {
    @Override
    public boolean valida(Login login) {
        if(login.getSenha().length() > 16){
            System.out.println("--> A senha deve ter menos de 18 caracteres!\n\n");
            return false;
        }
        return proximo == null || proximo.valida(login);
    }
}
