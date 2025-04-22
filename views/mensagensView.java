package views;

public class mensagensView {
    public void cadastroProjeto(int result){
        if(result == 200){
            System.out.println("\n-> Projeto cadastrado com Sucesso!");
        }else if (result == 500){
            System.out.println("\n -> Cadastro interrompido! Todos os elementos devem ser preenchidos!");

        } else if (result == 501){
            System.out.println("\n -> projeto com o mesmo nome já cadastrado!");
            
        } else{
            System.out.println("\n -> Nao foi possivel cadastrar o Projeto!");
        }
    }
    public void result (boolean result){
        if(result == true){
            System.out.println("\n-> Projeto cadastrado com Sucesso!");
        }else{
            System.out.println("\n -> Nao foi possivel cadastrar o Projeto!");

        }
    }
}
