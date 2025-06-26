package servico_passagemAerea;

public class ReservaAssentos {
    private static final int numFileiras = 32;
    private static final int assentosPorFileira = 6;
    private boolean[][] assentosOcupados;

    public ReservaAssentos() {
        assentosOcupados = new boolean[numFileiras][assentosPorFileira];
    }

    public boolean reservarAssento(int fileira, char letraAssento) {
        if (fileira < 1 || fileira > numFileiras) {
            System.err.println("Erro de Reserva: Fileira inválida.");
            return false;
        }
        int letraIndex = Character.toUpperCase(letraAssento) - 'A';
        if (letraIndex < 0 || letraIndex >= assentosPorFileira) {
            System.err.println("Erro de Reserva: Letra do assento inválida.");
            return false;
        }

        int fileiraIndex = fileira - 1;
        if (assentosOcupados[fileiraIndex][letraIndex]) {
            System.out.println(String.format("Assento %d%c já está ocupado.", fileira, letraAssento));
            return false;
        }

        assentosOcupados[fileiraIndex][letraIndex] = true;
        System.out.println(String.format("Assento %d%c reservado com sucesso!", fileira, letraAssento));
        return true;
    }

    public boolean verificarDisponibilidade(int fileira, char letraAssento) {
        if (fileira < 1 || fileira > numFileiras) return false;
        int letraIndex = Character.toUpperCase(letraAssento) - 'A';
        if (letraIndex < 0 || letraIndex >= assentosPorFileira) return false;

        return !assentosOcupados[fileira - 1][letraIndex];
    }
}
