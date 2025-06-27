import java.util.ArrayList;
import java.util.List;

public class GameCollection {
    private List<Game> games = new ArrayList<>();

    public void addGame(Game game) {
        games.add(game);
    }

    public GameIterator iterator() {
        return new GameCollectionIterator(this);
    }

    // Acesso interno usado pelo iterador
    public List<Game> getGames() {
        return games;
    }
}
