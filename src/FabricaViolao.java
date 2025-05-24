import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import prototype.*;

class FabricaViolao {
    private int contador;
    private Map<Integer, ViolaoPrototype> violoesPrototipos;
    private ArrayList<ViolaoPrototype> violoesFabricados;

    public FabricaViolao() {
        this.contador = 0;
        this.violoesPrototipos = new HashMap<>();
        this.violoesFabricados = new ArrayList<>();
        newPrototipo(new ViolaoClassico());
        newPrototipo(new ViolaoFolk());
        newPrototipo(new ViolaoFlet());
        newPrototipo(new ViolaoJumbo());
        newPrototipo(new Violao7Cordas());
        newPrototipo(new Violao12Cordas());
        newPrototipo(new ViolaoZero());
        newPrototipo(new ViolaoDuploZero());
        newPrototipo(new ViolaoTriploZero());
    }

    public int getContador(){
        return this.contador;
    }

    public void setContador(int valor){
        this.contador = valor;
    }

    public Map<Integer, ViolaoPrototype> getVioloesPrototipos(){
        return this.violoesPrototipos;
    }

    public void newPrototipo(ViolaoPrototype prototipo){
        int contagem = getContador() + 1;
        this.violoesPrototipos.put(contagem, prototipo);
        setContador(contagem);
    }

    public ArrayList<ViolaoPrototype> getVioloesFabricados() {
        return this.violoesFabricados;
    }

    public int getQtdFabricados(){
        return this.violoesFabricados.size();
    }

    public boolean fabricarViolao(int chave){
        ViolaoPrototype escolha = this.violoesPrototipos.get(chave).clonar();
        this.violoesFabricados.add(escolha);
        return true;
    }
}