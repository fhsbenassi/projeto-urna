/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author fhsbenassi
 */
public class votacao {
   
    private String siglaVoto;
    private int numeroVoto;
    private String nomeVoto;
    private String cargoVoto;
    private int nulos;
    private int totalVoto;

    
    public void setNumeroVoto(int numeroVoto) {
        this.numeroVoto = numeroVoto;
    }
    
    public void setNomeVoto(String nomeVoto) {
        this.nomeVoto = nomeVoto;
    }
    
    public void setSiglaVoto(String siglaVoto) {
        this.siglaVoto = siglaVoto;
    }
    
    public void setCargoVoto(String cargoVoto) {
        this.cargoVoto = cargoVoto;
    }
    
    public void setNulo(int nulos) {
        this.nulos = nulos;
    }
    
    public void setTotalVotos(int totalVoto) {
        this.totalVoto = totalVoto;
    }
    
    public int getNumeroVoto() {
        return numeroVoto;
    }
    
    public String getNomeVoto() {
        return nomeVoto;
    }
    
    public String getSiglaVoto() {
        return siglaVoto;
    }
    
    public String getCargoVoto() {
        return cargoVoto;
    }
    
    public int getNulo() {
        return nulos;
    }

    public int getTotalVotos() {
        return totalVoto;
    }
 
    
}
