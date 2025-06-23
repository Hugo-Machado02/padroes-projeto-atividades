public class PadraoBuilder {
    public static void main(String[] args) {
        // Celular para jogos
        CelularBuilder builderGamer = new CelularBuilderGamer();
        Diretor diretorGamer = new Diretor(builderGamer);
        Celular celularGamer = diretorGamer.construirCelular();
        celularGamer.exibirConfiguracao();

        System.out.println("--------------------------");

        // Celular básico
        CelularBuilder builderBasico = new CelularBuilderBasico();
        Diretor diretorBasico = new Diretor(builderBasico);
        Celular celularBasico = diretorBasico.construirCelular();
        celularBasico.exibirConfiguracao();
    }
}