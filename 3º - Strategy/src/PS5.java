public class PS5 {
    private MidiaStrategy midia;

    public PS5(){
        System.out.println("\n\n--> PS5 Iniciado!\n\n");
    }

    public void startMidia() {
        midia.iniciarMidia();
    }

    public void setMidia(MidiaStrategy midia){
        this.midia = midia;
    }
}
