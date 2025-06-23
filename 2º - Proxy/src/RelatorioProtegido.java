public class RelatorioProtegido implements Relatorio{
    private String conteudo;

    public RelatorioProtegido() {
        this.conteudo = "Este é um relatório apenas para usuários admin: Relatórios Confidenciais!\n\n";
    }

    @Override
    public void imprimirRelatorio() {
        System.out.println(conteudo);
    }
}
