package modelo;

import dao.RelatorioDAO;
import java.util.ArrayList;
import modelo.Amigo;

public class Relatorio {
   

    private RelatorioDAO relatorioDAO;
    private Amigo amigoModel = new Amigo();

    public Relatorio() {
        this.relatorioDAO = new RelatorioDAO();
    }

    public int getLabelTotalFerramentasEmprestadas() {
        return relatorioDAO.getTotalFerramentasEmprestadas();
    }

    public int getLabelTotalEmpréstimosAbertos() {
        return relatorioDAO.getTotalEmprestimosAbertos();
    }

    public int getLabelTotalAmigosAbertos() {
        return relatorioDAO.getTotalAmigosComEmprestimosAbertos();
    }

    public int getLabelTotalEmpréstimosPendentes() {
        return relatorioDAO.getTotalEmprestimosPendentes();
    }
    
    public ArrayList pegarListaAbertos(){
        return relatorioDAO.getEmprestimosAtivos();
    } 
    public ArrayList pegarListaPendentes(){
        return relatorioDAO.getEmprestimosNaoDevolvidos();
    }
    public Amigo pegarListaAmigos(){
        
        return amigoModel.pegaAmigo( relatorioDAO.getAmigoQueFezMaisEmprestimos());
    }
    
}