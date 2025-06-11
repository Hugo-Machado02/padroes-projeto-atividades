package parte2_modificado.produtos.carroEsportivo;

import parte2_modificado.interfaces.ICarroEsportivo;

public class GRSupra implements ICarroEsportivo{
    private String modelo;
    private String ano;

    public GRSupra() {
        this.modelo = "Toyota GR Supra";
        this.ano = "2019";
    }

    @Override
    public void imprimeDescricao() {
        System.out.println("--> Criação: Carro Esportivo "+ this.modelo +" ano "+ this.ano +"\n\n");
    }
}
