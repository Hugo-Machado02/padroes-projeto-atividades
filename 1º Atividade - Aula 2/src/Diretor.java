public class Diretor extends Funcionario implements Autenticavel, Fornecedor, Departamento{

    //Metods
    public double calcSalario(){
        System.out.println("Calculo do Sarário do Diretor");
        return 0;
    }

    public void login(){
        System.out.println("Login do Diretor Realizado");
    }

    public void realizaPedido(){
        System.out.println("O Diretor realizou um pedido");
    }

    public void criaDepartamento(){
        System.out.println("O Diretor Criou um departamento");
    }

    public void cadastraFuncionario(){
        System.out.println("O Diretor cadastrou um funcionário");
    }
}
