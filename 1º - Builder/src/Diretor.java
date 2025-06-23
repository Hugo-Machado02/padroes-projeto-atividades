// Classe responsável por "dirigir" o processo de construção
public class Diretor {
    private CelularBuilder builder;

    public Diretor(CelularBuilder builder) {
        this.builder = builder;
    }

    public Celular construirCelular() {
        builder.construirProcessador();
        builder.construirMemoriaRAM();
        builder.construirArmazenamento();
        builder.construirCamera();
        return builder.getCelular();
    }
}
