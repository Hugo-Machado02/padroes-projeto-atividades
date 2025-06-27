import java.util.List;

public class GameCollectionIterator implements GameIterator {
    private List<Game> games;
    private int index = 0;

    public GameCollectionIterator(GameCollection collection) {
        this.games = collection.getGames();
    }

    @Override
    public boolean temProximo() {
        return index < games.size();
    }

    @Override
    public Game next() {
        return games.get(index++);
    }
}
