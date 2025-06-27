public interface GameCollection {
    GameIterator criaIterator();
    int getTotalGames();
    Game getGame(int index);
}