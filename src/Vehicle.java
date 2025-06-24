public class Vehicle {
    private int id;
    private String model;
    private int year;

    public Vehicle(int id, String model, int year) {
        this.id = id;
        this.model = model;
        this.year = year;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getModel() {
        return this.model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return this.year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
