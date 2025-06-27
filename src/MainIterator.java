public class MainIterator {

    public static void main(String[] args) {
        GameCollection collection = new GameCollection();

        collection.addGame(new Game("God of War"));
        collection.addGame(new Game("The Last of Us"));
        collection.addGame(new Game("Spider-Man: Miles Morales"));

        GameIterator iterator = collection.iterator();

        System.out.println("Jogos na coleção:");
        while (iterator.temProximo()) {
            Game game = iterator.next();
            System.out.println("- " + game.getNome());
        }
    }
}