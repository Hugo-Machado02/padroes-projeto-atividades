package DAO;

import models.ProjetoModel;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

public class ProjetoDAO {
    private String arquivoTxt;

    public ProjetoDAO(){
        this.arquivoTxt = "Projeto.txt";
    }

    public int addProjeto(ProjetoModel projeto){
        try(FileWriter arquivo = new FileWriter(this.arquivoTxt, true);
        PrintWriter editaArquivo = new PrintWriter(arquivo)){
            editaArquivo.println(projeto.getTitulo() + "," + projeto.getDataInicio() + "," + projeto.getDataFim());
            return 200;
        }
        catch (IOException e) {
            e.printStackTrace();
            return 502;
        }
    }

    public List<String> listaProjeto(){
        List<String> listaProjetos = new ArrayList<String>();
        try(FileReader arquivo = new FileReader(this.arquivoTxt);
        BufferedReader leituraArquivo = new BufferedReader(arquivo)){
            String elemento;
            while ((elemento = leituraArquivo.readLine()) != null) {
                listaProjetos.add(elemento);
            }
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        return listaProjetos;
    }

    public String getArquivoTxt() {
        return arquivoTxt;
    }

    public void setArquivoTxt(String arquivoTxt) {
        this.arquivoTxt = arquivoTxt;
    }
    
}
