package parte2_modificado.produtos.carroEsportivo;

import parte2_modificado.interfaces.ICarroEsportivo;

public class PulseAbarth implements ICarroEsportivo{
    private String modelo;
    private String ano;

    public PulseAbarth() {
        this.modelo = "Toyota Pulse Abarth";
        this.ano = "2022";
    }

    @Override
    public void imprimeDescricao() {
        System.out.println("--> Criação: Carro Esportivo "+ this.modelo +" ano "+ this.ano +"\n\n");
    }
}
