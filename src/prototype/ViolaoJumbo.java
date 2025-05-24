package prototype;
public class ViolaoJumbo extends ViolaoPrototype{
    public ViolaoJumbo() {
        this.tipo = "Jumbo";
        this.descricao = "O violão jumbo ficou famoso nas mãos de Elvis Presley, mas, apesar de ser bem parecido com o tipo clássico, a grande diferença está em seu corpo mais largo e na base mais arredondada. É mais fácil de encontrar modelos eletroacústicos e com cordas de aço. O som gerado pelo violão jumbo é mais grave e encorpado";
    }

    public ViolaoJumbo(ViolaoJumbo violao) {
        this.tipo = violao.getTipo();
        this.descricao = violao.getDescricao();
    }

    @Override
    public ViolaoPrototype clonar(){
        return(new ViolaoJumbo(this));
    }

}
