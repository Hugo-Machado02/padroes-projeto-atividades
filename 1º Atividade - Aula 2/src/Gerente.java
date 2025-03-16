public class Gerente extends Funcionario implements Autenticavel, Fornecedor, Departamento{

    //Metods
    public double calcSalario(){
        System.out.println("Calculo do Sarário do Gerente");
        return 0;
    }

    public void login(){
        System.out.println("Login do Gerente Realizado");
    }

    public void realizaPedido(){
        System.out.println("O Gerente realizou um pedido");
    }

    public void criaDepartamento(){
        System.out.println("O Gerente Criou um departamento");
    }

    public void cadastraFuncionario(){
        System.out.println("O Gerente cadastrou um funcionário");
    }

}
