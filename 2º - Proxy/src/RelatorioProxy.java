public class RelatorioProxy implements Relatorio{
    private Relatorio relatorio;
    private String username;
    private boolean admin;

    public RelatorioProxy(String username, boolean admin){
        this.username = username;        
        this.admin = admin;
        this.relatorio = new RelatorioProtegido();
    }

    @Override
    public void imprimirRelatorio(){
        if(admin){
            System.out.println("--> Acesso permitido! Gerando o relatório para o usuário "+ this.username +"...");
            System.out.println("\n\nRelatório:");
            this.relatorio.imprimirRelatorio();
        }
        else{
            System.out.println("--> Acesso negado! "+ this.username +", nao e um admin do sistema\n\n");
        }

    }

}