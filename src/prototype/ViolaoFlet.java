package prototype;
public class ViolaoFlet extends ViolaoPrototype{
    public ViolaoFlet() {
        this.tipo = "Flet";
        this.descricao = "A palavra flat, do inglês, pode significar “plano” ou “liso”. É justamente essa a principal característica desse tipo de violão: sua caixa acústica é bastante fina! O violão flet é muito utilizado por músicos profissionais e na maioria dos casos é tocado com cordas de nylon. O timbre gerado por esse tipo de violão é mais suave. Vale lembrar que, por ser encontrado quase sempre em modelos elétricos, precisa de amplificação";
    }

    public ViolaoFlet(ViolaoFlet violao) {
        this.tipo = violao.getTipo();
        this.descricao = violao.getDescricao();
    }

    @Override
    public ViolaoPrototype clonar(){
        return(new ViolaoFlet(this));
    }
}
