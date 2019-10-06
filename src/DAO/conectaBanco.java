/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author fhsbenassi
 */
public class conectaBanco {
    
    //objeto responsável por armazenar a conexão com o DB
    Connection con = null;
    String usuario = "root";
    String senha = "";
    String url = "jdbc:mysql://127.0.0.1:3306/eleicao2018";

    //ao construir a classe será carregado o driver de conexão
    //public conectaBanco() {
        //this.carregarDrive();
    //}

   // public void carregarDrive() {
       // try {
            //carregar o drive
           // Class.forName("com.mysql.jdbc.Driver");
           // System.out.println("\nDriver carregado");
       // } catch (ClassNotFoundException ex) {
            //se nao carregar
         //   System.out.println("O driver MySQL não pode ser carregado. Erro: " + ex);
       // }
    //}

    public Connection obterConexao() {
        try {
            //verifica se conexão fechada ou inexistente
            //abre a conexão
            if ((con == null) || (con.isClosed())) {
                con = DriverManager.getConnection(url, usuario, senha);
                System.out.println("Conexão obtida com sucesso\n");
            }
        } catch (SQLException ex) {
            System.out.println("SQLException: " + ex);
        } catch (Exception ex) {
            System.out.println("Exception: " + ex);
        }
        return con; //retorna uma conexão onde serão feitas as conexões e operações com o DB.
    }

    public void fecharConexao() {
        try {
            if ((con != null) && (!con.isClosed())) {
                con.close();
                System.out.println("Conexão fechada");
            }
        } catch (SQLException ex) {
            System.out.println("SQLException: " + ex);
        } catch (Exception ex) {
            System.out.println("Exception: " + ex);
        }
    }//fim do método fecharConexão.   
}
