public class CelularBuilderGamer implements CelularBuilder {
    private Celular celular;

    public CelularBuilderGamer() {
        this.celular = new Celular();
    }

    public void construirProcessador() {
        celular.setProcessador("Snapdragon 8 Gen 2");
    }

    public void construirMemoriaRAM() {
        celular.setMemoriaRAM("16GB");
    }

    public void construirArmazenamento() {
        celular.setArmazenamento("512GB");
    }

    public void construirCamera() {
        celular.setCamera("64MP");
    }

    public Celular getCelular() {
        return celular;
    }
}
