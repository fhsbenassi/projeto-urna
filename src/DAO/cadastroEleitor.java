/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package DAO;

import Model.Eleitor;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import javax.swing.JOptionPane;
import java.util.Date;


/**
 * @author fhsbenassi
 */
public class cadastroEleitor {
    
     conectaBanco con;
   
    public cadastroEleitor(){   
        con = new conectaBanco();
        
    }

    
    public void incluirEleitor(Eleitor ele) throws ParseException {
        Connection conexao = con.obterConexao();
        PreparedStatement pre = null;
        
        String sql = "insert eleitor (NumInscricao,Nome,DtNasc,Zona,Secao,DtEmissao,Municipio,UF,NomePai,NomeMae) values (?,?,?,?,?,?,?,?,?,?)";
        //JOptionPane.showMessageDialog(null, sql);
        
        try {
            
            //Date dataNacs = formatarData(ele.getDataNascimentoEleitor());
            //Date dataInsc = formatarData(ele.getDataInscricaoEleitor());
                    
            pre = conexao.prepareStatement(sql);
            
            pre.setLong(1, ele.getInscricaoEleitor());
            pre.setString(2, ele.getNomeEleitor());
            pre.setString(3, ele.getDataNascimentoEleitor());
            pre.setInt(4, ele.getZonaEleitor());
            pre.setInt(5, ele.getSecaoEleitor());
            pre.setString(6, ele.getDataInscricaoEleitor());
            pre.setString(7, ele.getMunicipioEleitor());
            pre.setString(8, ele.getEstadoEleitor());
            pre.setString(9, ele.getPaiEleitor());
            pre.setString(10, ele.getMaeEleitor());
            

            pre.executeUpdate();
            System.out.println("Inclusão Realizada");
        } catch (SQLException e) {
            System.out.println("Erro ao incluir: " + e.getMessage());
        }
    }
    
    public ResultSet listaEleitor() {
       
        Statement st;
        ResultSet rs = null;
        try {
            Connection conexao = con.obterConexao();
            st = conexao.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
            rs = st.executeQuery("SELECT NumInscricao,Nome,Zona,Secao,Municipio FROM Eleitor ORDER BY Nome");
            while (rs.next()) {
                System.out.println(rs.getString("Numero") + " " + rs.getString("Nome") + " " + rs.getString("Zona") + " " + rs.getString("Secao") + " " + rs.getString("Municipio"));
            }
            rs.first();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return rs;
    }
    
    public void alterarEleitor(Eleitor e) {
        Connection conexao = con.obterConexao();
        PreparedStatement pre = null;
        
        String sql = "update Eleitor set Nome = ?, DtNasc = ?, Zona = ?, Secao = ?, DtEmissao = ?, Municipio = ?, UF = ?, NomePai = ?, NomeMae = ? where NumInscricao = ?";
     
        try {

            pre = conexao.prepareStatement(sql);
            
            pre = conexao.prepareStatement(sql);
            
            pre.setString(1, e.getNomeEleitor());
            pre.setString(2, e.getDataNascimentoEleitor());
            pre.setInt(3, e.getZonaEleitor());
            pre.setInt(4, e.getSecaoEleitor());
            pre.setString(5, e.getDataInscricaoEleitor());
            pre.setString(6, e.getMunicipioEleitor());
            pre.setString(7, e.getEstadoEleitor());
            pre.setString(8, e.getPaiEleitor());
            pre.setString(9, e.getMaeEleitor());
            pre.setLong(10, e.getInscricaoEleitor());
          
            pre.executeUpdate();
            JOptionPane.showMessageDialog(null, "Alteração realizada com sucesso!");
        } catch (SQLException a) {
            System.out.println("Erro ao Alterar" + a.getMessage());
        }
    }
     
    public void excluirEleitor(Eleitor e) {
        Connection conexao = con.obterConexao();
        PreparedStatement pre = null;
        
        String sql = "delete from Eleitor where NumInscricao = ?";
        
        try {
            
            pre = conexao.prepareStatement(sql);
            pre.setLong(1, e.getInscricaoEleitor());
            pre.executeUpdate();
            JOptionPane.showMessageDialog(null, "Exclusão realizada com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Não foi possível excluir!");
        }
    }
   
    public ResultSet buscarEleitorNome(String descricao) {
        PreparedStatement st;
        ResultSet rs = null;
        try {
            Connection conexao =con.obterConexao();
            st = conexao.prepareStatement("SELECT NumInscricao,Nome,Zona,Secao,Municipio FROM Eleitor where Nome like ?");
            st.setString(1, descricao + '%');
            rs = st.executeQuery();
            System.out.println("\nproduto buscando");
            while (rs.next()) {
                System.out.println(rs.getString("Numero") + " " + rs.getString("Nome") + " " + rs.getString("Zona") + " " + rs.getString("Secao") + " " + rs.getString("Municipio"));
            }
            rs.first();
        } catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
        }
        return rs;
    }

    public ResultSet buscarEleitorNumero(Integer numero) {
        PreparedStatement st;
        ResultSet rs = null;
        try {
            Connection conexao = con.obterConexao();
            st = conexao.prepareStatement("SELECT NumInscricao,Nome,Zona,Secao,Municipio FROM Eleitor where NumInscricao = ?");
            st.setInt(1, numero);
            rs = st.executeQuery();
        } catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
        }
        return rs;
    }
    
    
    public Date formatarData(String dataNasc) throws ParseException{
        
        SimpleDateFormat parser = new SimpleDateFormat("dd.MM.yyyy");
        
        Date dataNascimento = parser.parse(dataNasc);
        java.sql.Date dataNascimentoSql = new java.sql.Date(dataNascimento.getTime());
        System.out.println(dataNascimentoSql);
        
        return dataNascimentoSql;
    }

}//fim da classe
