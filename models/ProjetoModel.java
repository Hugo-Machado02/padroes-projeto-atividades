package models;

public class ProjetoModel {
    private String titulo;
    private String dataInicio;
    private String dataFim;

    public ProjetoModel(String titulo, String dataInicio, String dataFim){
        this.titulo = titulo;
        this.dataInicio = dataInicio;
        this.dataFim = dataFim;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(String dataInicio) {
        this.dataInicio = dataInicio;
    }

    public String getDataFim() {
        return dataFim;
    }

    public void setDataFim(String dataFim) {
        this.dataFim = dataFim;
    }

    
    
}
