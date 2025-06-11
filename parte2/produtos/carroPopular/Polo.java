package parte2.produtos.carroPopular;

import parte2.interfaces.ICarroPopular;

public class Polo implements ICarroPopular{
    private String modelo;
    private String ano;

    public Polo() {
        this.modelo = "Volkswagen Polo";
        this.ano = "2017";
    }

    @Override
    public void imprimeDescricao() {
        System.out.println("--> Criação: Carro Popular "+ this.modelo +" ano "+ this.ano +"\n\n");
    }
}
