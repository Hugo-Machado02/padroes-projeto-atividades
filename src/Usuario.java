public class Usuario implements Observer{
    private String nome;

    public Usuario(String nome) {
        this.nome = nome;
    }

    @Override
    public void notificar(String titulo) {
        System.out.println("-> " + nome + ", nossa Plataforma adicionou um novo conteúdo: " + titulo);
    }
}