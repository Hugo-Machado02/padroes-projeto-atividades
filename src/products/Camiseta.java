package products;

public abstract class Camiseta {
    private String fabrica;
    private String time;

    public Camiseta(String fabrica, String time) {
        this.fabrica = fabrica;
        this.time = time;
    }

    public String getFabrica() {
        return fabrica;
    }

    public String getTime() {
        return time;
    }
}
