public class MainObserver {
    public static void main(String[] args) {
        Plataforma plataforma = new Plataforma();

        Observer hugo = new Usuario("Hugo Machado");
        Observer shayra = new Usuario("Shayra Kelly");
        Observer joselio = new Usuario("Joselio");
        Observer myckael = new Usuario("Myckael");
        Observer marcos = new Usuario("Marcos");

        // Inscrições por gênero
        plataforma.addObserver(hugo, GeneroFilme.acao);
        plataforma.addObserver(hugo, GeneroFilme.ficcao_cientifica);
        plataforma.addObserver(shayra, GeneroFilme.comedia);
        plataforma.addObserver(marcos, GeneroFilme.acao);
        plataforma.addObserver(joselio, GeneroFilme.terror);
        plataforma.addObserver(myckael, GeneroFilme.acao);

        plataforma.publicarConteudo("Vingadores - Ultimato", GeneroFilme.ficcao_cientifica);
        plataforma.publicarConteudo("Star Wars: A Ascensão Skywalker", GeneroFilme.ficcao_cientifica);
        plataforma.publicarConteudo("It - A Coisa", GeneroFilme.terror);
        plataforma.publicarConteudo("Deadpool", GeneroFilme.comedia);

        plataforma.removeObserver(shayra, GeneroFilme.comedia);
        plataforma.publicarConteudo("Homem-Aranha", GeneroFilme.comedia);
    }
}
