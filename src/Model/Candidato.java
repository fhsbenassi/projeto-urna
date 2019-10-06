/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import com.itextpdf.text.pdf.qrcode.ByteArray;

/**
 *
 * @author fhsbenassi
 */
public class Candidato {
    
    private int numeroCandidato;
    //private int codigoCandidato;
    private String cargoCandidato;
    private String nomeCandidato;
    private String partidoCandidato;
    //private ByteArray fotoCandidato;

   /*
    public int getCodigoCandidato() {
        return codigoCandidato;
    }

    public void setcodigoCandidato(int codigoCandidato) {
        this.codigoCandidato = codigoCandidato;
    }
*/

    //public ByteArray getFotoCandidato() {
       // return fotoCandidato;
   // }

    //public void setFotoCandidato(ByteArray fotoCandidato) {
       // this.fotoCandidato = fotoCandidato;
   // }
    
    public String getNomeCandidato() {
        return nomeCandidato;
    }

    public void setNomeCandidato(String nomeCandidato) {
        this.nomeCandidato = nomeCandidato;
    }
    
    public String getCargoCandidato() {
        return cargoCandidato;
    }

    public void setCargoCandidato(String cargoCandidato) {
        this.cargoCandidato = cargoCandidato;
    }

    public String getPartidoCandidato() {
        return partidoCandidato;
    }

    public void setPartidoCandidato(String partidoCandidato) {
        this.partidoCandidato = partidoCandidato;
    }

    public int getNumeroCandidato() {
        return numeroCandidato;
    }

    public void setNumeroCandidato(int numeroCandidato) {
        this.numeroCandidato = numeroCandidato;
    }
    
 }//fim da classe
