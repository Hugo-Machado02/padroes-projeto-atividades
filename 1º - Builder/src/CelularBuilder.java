// Interface que define os passos da construção do celular
public interface CelularBuilder {
    void construirProcessador();
    void construirMemoriaRAM();
    void construirArmazenamento();
    void construirCamera();
    Celular getCelular();
}
