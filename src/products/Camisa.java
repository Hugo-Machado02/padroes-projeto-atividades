package products;

public abstract class Camisa {
    private String fabrica;
    private String time;

    public Camisa(String fabrica, String time) {
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
