package servico_passagemAerea;

public class ClasseVoo {
    private static final double precoEconomica = 500.00;
    private static final double percentualExecutiva = 2.50;
    private static final double percentualPrimeiraClasse = 1.50;

    public String getClassePorFileira(int fileira) {
        if (fileira >= 1 && fileira <= 3) {
            return "Primeira Classe";
        } else if (fileira >= 4 && fileira <= 8) {
            return "Executiva";
        } else if (fileira >= 9 && fileira <= 32) {
            return "Economica";
        }
        return "Inválida";
    }

    public double calcularPrecoPorClasse(String classe) {
        switch (classe) {
            case "Economica":
                return precoEconomica;
            case "Executiva":
                return precoEconomica + (precoEconomica * percentualExecutiva);
            case "Primeira Classe":
                double precoExecutiva = precoEconomica + (precoEconomica * percentualExecutiva);
                return precoExecutiva + (precoExecutiva * percentualPrimeiraClasse);
            default:
                System.err.println("Classe de voo desconhecida: " + classe);
                return 0.0;
        }
    }
}
