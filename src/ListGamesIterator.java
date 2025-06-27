public class ListGamesIterator implements GameIterator {
    private GameCollection listaJogos;
    private int posicaoAtual;

    public ListGamesIterator(GameCollection listaJogos) {
        this.listaJogos = listaJogos;
        this.posicaoAtual = 0;
    }

    @Override
    public boolean temProximo() {
        return posicaoAtual < listaJogos.getTotalGames();
    }

    @Override
    public Game proximo() {
        if (temProximo()) {
            Game jogo = listaJogos.getGame(posicaoAtual);
            posicaoAtual++;
            return jogo;
        }
        return null;
    }
}