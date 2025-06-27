public class Usuario implements Observer{
    private String nome;

    public Usuario(String nome) {
        this.nome = nome;
    }

    @Override
    public void notificar(String titulo, GeneroFilme genero) {
        System.out.println("-> " + nome + ", novo filme de " + genero + ": " + titulo);
    }
}