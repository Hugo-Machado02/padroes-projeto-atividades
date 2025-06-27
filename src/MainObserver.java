public class MainObserver {
    public static void main(String[] args) {
        Plataforma plataforma = new Plataforma();

        Observer hugo = new Usuario("Hugo Machado");
        Observer shayra = new Usuario("Shayra Kelly");
        Observer joselio = new Usuario("Joselio");
        Observer myckael = new Usuario("Myckael");
        Observer marcos = new Usuario("Marcos");

        plataforma.addObserver(hugo);
        plataforma.addObserver(shayra);
        plataforma.addObserver(marcos);

        plataforma.publicarConteudo("The Flash - Temporada 5");

        plataforma.addObserver(joselio);
        plataforma.addObserver(myckael);

        plataforma.publicarConteudo("Vingadores - Ultimato");

        plataforma.removeObserver(shayra);

        plataforma.publicarConteudo("Star Wars: A Asacensao Skywalker");
    }
}
