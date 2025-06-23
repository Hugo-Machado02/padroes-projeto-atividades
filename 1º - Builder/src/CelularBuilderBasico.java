public class CelularBuilderBasico implements CelularBuilder {
    private Celular celular;

    public CelularBuilderBasico() {
        this.celular = new Celular();
    }

    public void construirProcessador() {
        celular.setProcessador("Snapdragon 480");
    }

    public void construirMemoriaRAM() {
        celular.setMemoriaRAM("4GB");
    }

    public void construirArmazenamento() {
        celular.setArmazenamento("64GB");
    }

    public void construirCamera() {
        celular.setCamera("13MP");
    }

    public Celular getCelular() {
        return celular;
    }
}
