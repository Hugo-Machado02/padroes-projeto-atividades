import java.util.ArrayList;
import java.util.List;

public class ListGames implements GameCollection {
    private List<Game> jogos;

    public ListGames() {
        this.jogos = new ArrayList<>();
    }

    public void addGame(Game jogo) {
        jogos.add(jogo);
        System.out.println("--> Game Adicionado à coleção: " + jogo.getNome());
    }

    @Override
    public GameIterator criaIterator() {
        return new ListGamesIterator(this);
    }

    @Override
    public Game getGame(int index) {
        if (index >= 0 && index < jogos.size()) {
            return jogos.get(index);
        }
        return null;
    }

    @Override
    public int getTotalGames() {
        return jogos.size();
    }
}