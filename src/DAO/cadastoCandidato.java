/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Model.Candidato;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author fhsbenassi
 */
public class cadastoCandidato {
    
   conectaBanco con;
   
    public cadastoCandidato(){
        con = new conectaBanco();
    }
    
    public void incluirCandidato(Candidato cand) {
        Connection conexao = con.obterConexao();
        PreparedStatement pre = null;
        String cargoCan = buscarSql(cand.getCargoCandidato());
        String sql = "insert " + cargoCan + " (Numero,Nome,Cargo,Sigla) values (?,?,?,?)";
        //JOptionPane.showMessageDialog(null, sql);
               

        try {
                    
            pre = conexao.prepareStatement(sql);
            pre.setInt(1, cand.getNumeroCandidato());
            pre.setString(2, cand.getNomeCandidato());
            pre.setString(3, cand.getCargoCandidato());
            pre.setString(4, cand.getPartidoCandidato());
            

            pre.executeUpdate();
            System.out.println("Inclusão Realizada");
        } catch (SQLException e) {
            System.out.println("Erro ao incluir: " + e.getMessage());
        }
    }
    
    public ResultSet listaCandidato() {
       
        Statement st;
        ResultSet rs = null;
        try {
            Connection conexao = con.obterConexao();
            st = conexao.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
            rs = st.executeQuery("SELECT Numero,Nome,Cargo,Sigla FROM DepEstadual\n" +
                                    " UNION ALL\n" +
                                    " SELECT Numero,Nome,Cargo,Sigla FROM DepFederal\n" +
                                    " UNION ALL\n" +
                                    " SELECT Numero,Nome,Cargo,Sigla FROM Senador\n" +
                                    " UNION ALL\n" +
                                    " SELECT Numero,Nome,Cargo,Sigla FROM Governador\n" +
                                    " UNION ALL\n" +
                                    " SELECT Numero,Nome,Cargo,Sigla FROM Presidente\n" +
                                    " ORDER BY Nome");
            while (rs.next()) {
                System.out.println(rs.getString("Numero") + " " + rs.getString("Nome") + " " + rs.getString("Cargo") + " " + rs.getString("Sigla"));
            }
            rs.first();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return rs;
    }
    
    public void alterarCandidato(Candidato c) {
        Connection conexao = con.obterConexao();
        PreparedStatement pre = null;
        String cargoCan = buscarSql(c.getCargoCandidato());
        String sql = "update " + cargoCan + " set Nome = ?, Cargo = ?, Sigla = ? where Numero = ?";
        
        
        try {

            pre = conexao.prepareStatement(sql);
            
            pre = conexao.prepareStatement(sql);
            pre.setString(1, c.getNomeCandidato());
            pre.setString(2, c.getCargoCandidato());
            pre.setString(3, c.getPartidoCandidato());
            pre.setInt(4, c.getNumeroCandidato());
          //pre.setInt(4, c.getCodigoCandidato());
            pre.executeUpdate();
            JOptionPane.showMessageDialog(null, "Alteração realizada com sucesso!");
        } catch (SQLException a) {
            System.out.println("Erro ao Alterar" + a.getMessage());
        }
    }
    
     public void excluirCandidato(Candidato c) {
        Connection conexao = con.obterConexao();
        PreparedStatement pre = null;
        String cargoCan = buscarSql(c.getCargoCandidato());
        String sql = "delete from " + cargoCan + " where Numero = ?";
        
        try {
            
            pre = conexao.prepareStatement(sql);
            pre.setInt(1, c.getNumeroCandidato());
            pre.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Exclusão realizada com sucesso!");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Não foi possível excluir!");
        }
    }
     
     public ResultSet buscarCandidatoNome(String descricao) {
        PreparedStatement st;
        ResultSet rs = null;
        try {
            Connection conexao =con.obterConexao();
            st = conexao.prepareStatement("SELECT Numero,Nome,Cargo,Sigla FROM DepEstadual\n" +
                                    " UNION ALL\n" +
                                    " SELECT Numero,Nome,Cargo,Sigla FROM DepFederal\n" +
                                    " UNION ALL\n" +
                                    " SELECT Numero,Nome,Cargo,Sigla FROM Senador\n" +
                                    " UNION ALL\n" +
                                    " SELECT Numero,Nome,Cargo,Sigla FROM Governador\n" +
                                    " UNION ALL\n" +
                                    " SELECT Numero,Nome,Cargo,Sigla FROM Presidente\n" +
                                    " where Nome like ?");
            st.setString(1, descricao + '%');
            rs = st.executeQuery();
            System.out.println("\nproduto buscando");
            while (rs.next()) {
                System.out.println(rs.getString("Numero") + " " + rs.getString("Nome") + " " + rs.getString("Sigla"));
            }
            rs.first();
        } catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
        }
        return rs;
    }

    public ResultSet buscarCandidadoNumero(Integer numero) {
        PreparedStatement st;
        ResultSet rs = null;
        try {
            Connection conexao = con.obterConexao();
            st = conexao.prepareStatement("SELECT Numero,Nome,Cargo,Sigla,TotalVotos FROM DepEstadual\n" +
                                    " UNION ALL\n" +
                                    " SELECT Numero,Nome,Cargo,Sigla,TotalVotos FROM DepFederal\n" +
                                    " UNION ALL\n" +
                                    " SELECT Numero,Nome,Cargo,Sigla,TotalVotos FROM Senador\n" +
                                    " UNION ALL\n" +
                                    " SELECT Numero,Nome,Cargo,Sigla,TotalVotos FROM Governador\n" +
                                    " UNION ALL\n" +
                                    " SELECT Numero,Nome,Cargo,Sigla,TotalVotos FROM Presidente\n" +
                                    " where Numero = ?");
            st.setInt(1, numero);
            rs = st.executeQuery();
        } catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
        }
        return rs;
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
