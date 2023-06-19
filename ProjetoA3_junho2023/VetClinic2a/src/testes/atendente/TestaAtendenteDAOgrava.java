package testes.atendente;

import modelo.Atendente;
import persistencia.AtendenteDAO;

public class TestaAtendenteDAOgrava {

    /**
     * @param args the command line arguments
     * @throws java.lang.Exception
     */
    public static void main(String[] args) throws Exception {
        Atendente atendente = new Atendente();
        atendente.setIdAtend(3);
        atendente.setNome("João Vitor");
        
        System.out.println(AtendenteDAO.grava(atendente));
    }
}