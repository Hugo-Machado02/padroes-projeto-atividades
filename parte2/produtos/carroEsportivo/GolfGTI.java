package parte2.produtos.carroEsportivo;

import parte2.interfaces.ICarroEsportivo;

public class GolfGTI implements ICarroEsportivo{
    private String modelo;
    private String ano;

    public GolfGTI() {
        this.modelo = "Volkswagen Golf GTI";
        this.ano = "2020";
    }

    @Override
    public void imprimeDescricao() {
        System.out.println("--> Criação: Carro Esportivo "+ this.modelo +" ano "+ this.ano +"\n\n");
    }
}
