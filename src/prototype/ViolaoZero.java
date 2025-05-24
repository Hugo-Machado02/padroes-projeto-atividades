package prototype;
public class ViolaoZero extends ViolaoPrototype{
    public ViolaoZero() {
        this.tipo = "Zero";
        this.descricao = "Esse tipo de violao e  categorizado como Parlor, com estrutura menor e sendo mais indicado para uso casual, não tanto profissional e possui uma estrutura confortável para tocar por bastante tempo";
    }

    public ViolaoZero(ViolaoZero violao) {
        this.tipo = violao.getTipo();
        this.descricao = violao.getDescricao();
    }

    @Override
    public ViolaoPrototype clonar(){
        return(new ViolaoZero(this));
    }
}