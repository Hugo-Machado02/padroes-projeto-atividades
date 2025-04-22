package controllers;
import java.util.ArrayList;
import java.util.List;

import BO.ProjetoBO;
import models.ProjetoModel;
import DAO.ProjetoDAO;

public class ProjetoController {
    public int validaCadastro(String titulo, String dataInicio, String dataFim){
        ProjetoBO projetoBO = new ProjetoBO();
        if(!titulo.isEmpty() && !dataInicio.isEmpty() && !dataFim.isEmpty()){
            if(!projetoBO.validaProjeto(titulo)){
                ProjetoDAO projetoDao = new ProjetoDAO();
                ProjetoModel novoProjeto = new ProjetoModel(titulo, dataInicio, dataFim);
                return projetoDao.addProjeto(novoProjeto);
            } else{
                return 501;
            }
        }
        return 500;
    }

    public List<ProjetoModel> listaProjetos(){
        ProjetoDAO projDao = new ProjetoDAO();
        List<String> elementos = projDao.listaProjeto();
        List<ProjetoModel> projetos = new ArrayList<>();

        for(String elemento : elementos){
            String[] atributos = elemento.split(",");
            ProjetoModel objProjeto = new ProjetoModel(atributos[0], atributos[1], atributos[2]);
            projetos.add(objProjeto);
        }

        return projetos;
    }
}