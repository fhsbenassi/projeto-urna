/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Model.votacao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;


/**
 *
 * @author fhsbenassi
 */
public class cadVotacao {
    
    conectaBanco con;
    public cadVotacao(){
        con = new conectaBanco();
    }
    
        
    public void confirmarVoto(votacao c) {
        
        Connection conexao = con.obterConexao();
        PreparedStatement pre = null;
        
        String cargoCan = buscarSql(c.getCargoVoto());
        int numero = (c.getNumeroVoto());
        int total = ((c.getTotalVotos()) + 1);
        
        String sql = "update " + cargoCan + " set TotalVotos = ? where Numero = ?";
        try {
            
            pre = conexao.prepareStatement(sql);
            pre.setInt(1, total);
            pre.setInt(2, numero);
            
            pre.executeUpdate();
        } catch (SQLException a) {
            System.out.println("Erro ao incluir: " + a.getMessage());
        }
    }

    
    public String buscarSql(String cargoCan){
        
        String tabCargo;
        
        switch( cargoCan )
        {
            case "Deputado Estadual":
                        tabCargo = "DepEstadual";
                        break;
            case "Deputado Federal":
                        tabCargo = "DepFederal";
                        break;
            case "Governador":
                        tabCargo = "Governador";
                        break;
            case "Presidente":
                        tabCargo = "Presidente";
                        break;
            default:
                        tabCargo = "Senador";
          }
        
        return tabCargo;
        
    }
}
