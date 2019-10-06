/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import com.itextpdf.text.pdf.qrcode.ByteArray;

/**
  * @author fhsbenassi
  */
public class Eleitor {
    
    private String nomeEleitor;
    private long inscricaoEleitor;
    private int zonaEleitor;
    private int secaoEleitor;
    private String municipioEleitor;
    private String maeEleitor;
    private String paiEleitor;
    private String dataInscricaoEleitor;
    private String dataNascimentoEleitor;
    private String estadoEleitor;

    public void setNomeEleitor(String nomeEleitor) {
        this.nomeEleitor = nomeEleitor;
    }
    
    public String getNomeEleitor() {
        return nomeEleitor;
    }

    public void setInscricaoEleitor(long inscricaoEleitor) {
        this.inscricaoEleitor = inscricaoEleitor;
    }
    
    public long getInscricaoEleitor() {
        return inscricaoEleitor;
    }

    public void setZonaEleitor(int zonaEleitor) {
        this.zonaEleitor = zonaEleitor;
    }
    
    public int getZonaEleitor() {
        return zonaEleitor;
    }

    public void setSecaoEleitor(int secaoEleitor) {
        this.secaoEleitor = secaoEleitor;
    }
     
    public int getSecaoEleitor() {
        return secaoEleitor;
    }
   
    public void setMunicipioEleitor(String municipioEleitor) {
        this.municipioEleitor = municipioEleitor;
    }
    
    public String getMunicipioEleitor() {
        return municipioEleitor;
    }

    public void setMaeEleitor(String maeEleitor) {
        this.maeEleitor = maeEleitor;
    }
    
    public String getMaeEleitor() {
        return maeEleitor;
    }

    public void setPaiEleitor(String paiEleitor) {
       this.paiEleitor = paiEleitor;
    }
    
    public String getPaiEleitor() {
        return paiEleitor;
    }

    public void setDataInscricaoEleitor(String dataInscricaoEleitor) {
        this.dataInscricaoEleitor = dataInscricaoEleitor;
    }
    
    public String getDataInscricaoEleitor() {
        return dataInscricaoEleitor;
    }

    public void setDataNascimentoEleitor(String dataNascimentoEleitor) {
        this.dataNascimentoEleitor = dataNascimentoEleitor;
    }
    
    public String getDataNascimentoEleitor() {
        return dataNascimentoEleitor;
    }

    public void setEstadoEleitor(String estadoEleitor) {
        this.estadoEleitor = estadoEleitor;
    }
    
    public String getEstadoEleitor() {
        return estadoEleitor;
    }
    

}//fim da classe
