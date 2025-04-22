package BO;

import java.util.ArrayList;
import java.util.List;

import DAO.ProjetoDAO;

public class ProjetoBO {
    public boolean validaProjeto(String tituloProjeto){
        ProjetoDAO projDao = new ProjetoDAO();
        List<String> elementos = projDao.listaProjeto();
        List<String[]> atributosProjeto = formataDados(elementos);
        for(String[] atributo : atributosProjeto){
            if(atributo[0].equals(tituloProjeto)){
                return true;
            }
        }
        return false;
    }

    public List<String[]> formataDados(List<String> projetos){
        List<String[]> projetoFormatado = new ArrayList<>();
        for(String projeto : projetos){
            String[] atributos = projeto.split(",");
            projetoFormatado.add(atributos);
        }
        return projetoFormatado;
    }
}
