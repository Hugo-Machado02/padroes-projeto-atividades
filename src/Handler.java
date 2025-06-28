public abstract class Handler {
    protected Handler proximo;

    public Handler setProximo(Handler handler) {
        this.proximo = handler;
        return handler;
    }

    public abstract boolean valida(Login login);
}
