/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import DAO.cadVotacao;
import DAO.cadastoCandidato;
import DAO.conectaBanco;
import DAO.cadastroEleitor;
import Model.somUrna;
import Model.votacao;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author fhsbenassi
 */
public class urna extends javax.swing.JFrame {
    
             conectaBanco conec = new conectaBanco();
              cadVotacao cadastroVoto = new cadVotacao();
               cadastoCandidato cadas = new cadastoCandidato();
                votacao voto = new votacao();

               
    /**
     * Creates new form urna
     */
    public urna() {
        initComponents();
         lblFim.setVisible(false);
         imgAvatar.setVisible(false);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnBranco = new javax.swing.JButton();
        btnCorrige = new javax.swing.JButton();
        btnConfirma = new javax.swing.JButton();
        btn1 = new javax.swing.JButton();
        btn2 = new javax.swing.JButton();
        btn3 = new javax.swing.JButton();
        btn4 = new javax.swing.JButton();
        btn5 = new javax.swing.JButton();
        btn6 = new javax.swing.JButton();
        btn7 = new javax.swing.JButton();
        btn8 = new javax.swing.JButton();
        btn9 = new javax.swing.JButton();
        btn0 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        txtNum = new javax.swing.JTextField();
        lblNom = new javax.swing.JLabel();
        lblPar = new javax.swing.JLabel();
        lblNomeCand = new javax.swing.JLabel();
        lblPartido = new javax.swing.JLabel();
        lblNum = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        lblFim = new javax.swing.JLabel();
        imgAvatar = new javax.swing.JLabel();
        lblMeuVoto = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        btnCandidatos = new javax.swing.JButton();
        btnLiberar = new javax.swing.JButton();
        btnApuracao = new javax.swing.JButton();
        btnEleitores = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        btnBranco.setBackground(new java.awt.Color(255, 255, 255));
        btnBranco.setText("BRANCO");
        btnBranco.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnBranco.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnBrancoMousePressed(evt);
            }
        });

        btnCorrige.setBackground(new java.awt.Color(204, 51, 0));
        btnCorrige.setText("CORRIGE");
        btnCorrige.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCorrige.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnCorrigeMousePressed(evt);
            }
        });

        btnConfirma.setBackground(new java.awt.Color(0, 153, 0));
        btnConfirma.setText("CONFIRMAR");
        btnConfirma.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnConfirma.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnConfirmaMousePressed(evt);
            }
        });

        btn1.setText("1");
        btn1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn1MousePressed(evt);
            }
        });

        btn2.setText("2");
        btn2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn2MousePressed(evt);
            }
        });

        btn3.setText("3");
        btn3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn3MousePressed(evt);
            }
        });

        btn4.setText("4");
        btn4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn4MousePressed(evt);
            }
        });

        btn5.setText("5");
        btn5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn5MousePressed(evt);
            }
        });

        btn6.setText("6");
        btn6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn6MousePressed(evt);
            }
        });

        btn7.setText("7");
        btn7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn7MousePressed(evt);
            }
        });

        btn8.setText("8");
        btn8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn8MousePressed(evt);
            }
        });

        btn9.setText("9");
        btn9.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn9MousePressed(evt);
            }
        });

        btn0.setText("0");
        btn0.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn0.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn0MousePressed(evt);
            }
        });
        btn0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn0ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btn4, javax.swing.GroupLayout.DEFAULT_SIZE, 82, Short.MAX_VALUE)
                    .addComponent(btn1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btn0, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
                    .addComponent(btn5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(btn3, javax.swing.GroupLayout.DEFAULT_SIZE, 79, Short.MAX_VALUE)
                        .addComponent(btn6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(btn9, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(32, Short.MAX_VALUE)
                .addComponent(btnBranco, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnCorrige)
                .addGap(18, 18, 18)
                .addComponent(btnConfirma, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btn1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btn3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btn2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btn4, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE)
                    .addComponent(btn5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btn7, javax.swing.GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE)
                    .addComponent(btn8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btn0, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnCorrige, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnBranco, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnConfirma, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(15, 15, 15))
        );

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));
        jPanel2.setLayout(null);

        txtNum.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        txtNum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNumActionPerformed(evt);
            }
        });
        jPanel2.add(txtNum);
        txtNum.setBounds(115, 111, 227, 39);

        lblNom.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblNom.setText("Nome:");
        jPanel2.add(lblNom);
        lblNom.setBounds(42, 184, 52, 22);

        lblPar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblPar.setText("Partido: ");
        jPanel2.add(lblPar);
        lblPar.setBounds(42, 224, 67, 22);

        lblNomeCand.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblNomeCand.setText("...");
        jPanel2.add(lblNomeCand);
        lblNomeCand.setBounds(106, 184, 290, 22);

        lblPartido.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblPartido.setText("...");
        jPanel2.add(lblPartido);
        lblPartido.setBounds(110, 220, 280, 22);

        lblNum.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblNum.setText("Número:");
        jPanel2.add(lblNum);
        lblNum.setBounds(42, 127, 68, 22);

        jLabel8.setText("LARANJA para CORRIGIR o voto");
        jPanel2.add(jLabel8);
        jLabel8.setBounds(398, 360, 190, 14);

        jLabel9.setText("VERDE para CONFIRMAR seu voto");
        jPanel2.add(jLabel9);
        jLabel9.setBounds(396, 340, 190, 14);

        jLabel7.setText("Aperte as teclas: ");
        jPanel2.add(jLabel7);
        jLabel7.setBounds(400, 310, 120, 14);

        lblFim.setFont(new java.awt.Font("Tahoma", 0, 100)); // NOI18N
        lblFim.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblFim.setText("FIM");
        lblFim.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel2.add(lblFim);
        lblFim.setBounds(26, 120, 570, 121);

        imgAvatar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/images.png"))); // NOI18N
        jPanel2.add(imgAvatar);
        imgAvatar.setBounds(410, 10, 204, 204);

        lblMeuVoto.setText("MEU VOTO VAI PARA");
        jPanel2.add(lblMeuVoto);
        lblMeuVoto.setBounds(12, 13, 102, 14);
        jPanel2.add(jSeparator1);
        jSeparator1.setBounds(0, 300, 620, 20);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/justi.png"))); // NOI18N

        btnCandidatos.setText("Candidatos");
        btnCandidatos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCandidatos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnCandidatosMousePressed(evt);
            }
        });

        btnLiberar.setBackground(new java.awt.Color(204, 204, 204));
        btnLiberar.setText("Liberar Para votação");
        btnLiberar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnLiberar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnLiberarMousePressed(evt);
            }
        });

        btnApuracao.setText("Apuração");
        btnApuracao.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnApuracao.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnApuracaoMousePressed(evt);
            }
        });

        btnEleitores.setText("Eleitores");
        btnEleitores.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEleitores.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnEleitoresMousePressed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnLiberar, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 146, Short.MAX_VALUE)
                        .addComponent(btnEleitores)
                        .addGap(18, 18, 18)
                        .addComponent(btnCandidatos)
                        .addGap(18, 18, 18)
                        .addComponent(btnApuracao, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(22, 22, 22))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(114, 114, 114))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnCandidatos)
                            .addComponent(btnLiberar, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnEleitores)
                            .addComponent(btnApuracao))
                        .addGap(18, 18, 18)
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(10, 10, 10))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn0ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn0ActionPerformed

    private void btnCandidatosMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCandidatosMousePressed
        CadastroCandidato cadCan = new CadastroCandidato();
        cadCan.setVisible(true);
    }//GEN-LAST:event_btnCandidatosMousePressed

    private void btnConfirmaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnConfirmaMousePressed
      
        int numero;        
          numero = Integer.parseInt(txtNum.getText());
                   ResultSet rs = cadas.buscarCandidadoNumero(numero);
            

        try {
             if (txtNum.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Não existe candidado com esse número");
  
            }else if (rs.first() == false) {
                
                     lblNom.setVisible(false);
                        lblNomeCand.setVisible(false);
                         lblNum.setVisible(false);
                          lblPar.setVisible(false);
                           lblPartido.setVisible(false);
                            lblFim.setVisible(true);
                           lblMeuVoto.setVisible(false);
        
                          imgAvatar.setVisible(false);
        
                        txtNum.setVisible(false);
                       

              //cadastroVoto.confirmarVoto(voto);
              voto.setNulo(1);
               lblFim.setVisible(true);
                lblFim.setText("NULO");
                 this.tocarSom();

            }else {
                
                imgAvatar.setVisible(true);
                
                      lblNomeCand.setText(rs.getString(2));
                     lblPartido.setText(rs.getString(3));
                   Integer result = JOptionPane.showConfirmDialog(null, "Deseja realmente votar no candidado:\n\n" + 
                           "Número: " + rs.getString(1) + 
                           "\nNome: " + rs.getString(2) +
                           "\nCargo: " + rs.getString(3) +
                           "\nPartido: " + rs.getString(4));
               
                if (result == 0) {
                    String nome = lblNomeCand.getText();
                     
                     // votacao votoo = new votacao();
                       voto.setNumeroVoto(numero);
                      voto.setNomeVoto(nome);
                     voto.setCargoVoto(rs.getString(3));
                    voto.setSiglaVoto(rs.getString(4));
                   voto.setTotalVotos(Integer.parseInt(rs.getString(4)));
                   cadastroVoto.confirmarVoto(voto);

                                               tocarSom();
                       
                       lblNom.setVisible(false);
                        lblNomeCand.setVisible(false);
                         lblNum.setVisible(false);
                          lblPar.setVisible(false);
                           lblPartido.setVisible(false);
                            lblFim.setVisible(true);
                           lblMeuVoto.setVisible(false);
        
                          imgAvatar.setVisible(false);
        
                        txtNum.setVisible(false);
                         lblFim.setVisible(true);
                } 
            }

        } catch (SQLException ex) {
            Logger.getLogger(urna.class.getName()).log(Level.SEVERE, null, ex);
        }                
    }//GEN-LAST:event_btnConfirmaMousePressed

    private void btn1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn1MousePressed
         String valor = txtNum.getText();
          txtNum.setText(valor + "1");
         
    }//GEN-LAST:event_btn1MousePressed

    private void btn2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn2MousePressed
        String valor = txtNum.getText();
        txtNum.setText(valor + "2");
     
    }//GEN-LAST:event_btn2MousePressed

    private void btn3MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn3MousePressed
       String valor = txtNum.getText();
        txtNum.setText(valor + "3");
          
    }//GEN-LAST:event_btn3MousePressed

    private void btn4MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn4MousePressed
        String valor = txtNum.getText();
        txtNum.setText(valor + "4");
    }//GEN-LAST:event_btn4MousePressed

    private void btn5MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn5MousePressed
        String valor = txtNum.getText();
        txtNum.setText(valor + "5");
    }//GEN-LAST:event_btn5MousePressed

    private void btn6MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn6MousePressed
        String valor = txtNum.getText();
        txtNum.setText(valor + "6");
    }//GEN-LAST:event_btn6MousePressed

    private void btn7MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn7MousePressed
        String valor = txtNum.getText();
        txtNum.setText(valor + "7");
    }//GEN-LAST:event_btn7MousePressed

    private void btn8MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn8MousePressed
        String valor = txtNum.getText();
        txtNum.setText(valor + "8");
    }//GEN-LAST:event_btn8MousePressed

    private void btn9MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn9MousePressed
       String valor = txtNum.getText();
        txtNum.setText(valor + "9");
    }//GEN-LAST:event_btn9MousePressed

    private void btn0MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn0MousePressed
        String valor = txtNum.getText();
        txtNum.setText(valor + "0");
    }//GEN-LAST:event_btn0MousePressed

    private void btnCorrigeMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCorrigeMousePressed
        txtNum.setText(null);
         txtNum.requestFocus();
    }//GEN-LAST:event_btnCorrigeMousePressed

    private void txtNumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNumActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNumActionPerformed

    private void btnBrancoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBrancoMousePressed
        
        votacao voto = new votacao();
            voto.setNumeroVoto(0);
             //voto.setCandidatoVoto("BRANCO");            
             // voto.setPartidoVoto(null);
            
                      lblNom.setVisible(false);
                        lblNomeCand.setVisible(false);
                         lblNum.setVisible(false);
                          lblPar.setVisible(false);
                           lblPartido.setVisible(false);
                            lblFim.setVisible(true);
                           lblMeuVoto.setVisible(false);
        
                          imgAvatar.setVisible(false);
        
                        txtNum.setVisible(false);
                       

             //vot.confirmarVoto(voto);
              lblFim.setVisible(true);
               lblFim.setText("BRANCO");
                this.tocarSom();
    }//GEN-LAST:event_btnBrancoMousePressed

    private void btnApuracaoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnApuracaoMousePressed
        contagem apura = new contagem();
        apura.setVisible(true);
        
    }//GEN-LAST:event_btnApuracaoMousePressed

    private void btnLiberarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLiberarMousePressed
                      lblNom.setVisible(true);
                        lblNomeCand.setVisible(true);
                         lblNum.setVisible(true);
                          lblPar.setVisible(true);
                           lblPartido.setVisible(true);
                            lblFim.setVisible(false);
                           lblMeuVoto.setVisible(true);
        
                          imgAvatar.setVisible(false);
        
                        txtNum.setVisible(true);
                        
                         lblNomeCand.setText("...");
                           lblPartido.setText("...");
                        
                   txtNum.setText(null);
                    txtNum.requestFocus();
    }//GEN-LAST:event_btnLiberarMousePressed

    private void btnEleitoresMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEleitoresMousePressed
        CadastroEleitor cadEle = new CadastroEleitor();
        cadEle.setVisible(true);
    }//GEN-LAST:event_btnEleitoresMousePressed

    
    public void tocarSom() {
        somUrna urna = new somUrna();
         urna.playSound("C:\\somurna.wav");
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(urna.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(urna.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(urna.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(urna.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new urna().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn0;
    private javax.swing.JButton btn1;
    private javax.swing.JButton btn2;
    private javax.swing.JButton btn3;
    private javax.swing.JButton btn4;
    private javax.swing.JButton btn5;
    private javax.swing.JButton btn6;
    private javax.swing.JButton btn7;
    private javax.swing.JButton btn8;
    private javax.swing.JButton btn9;
    private javax.swing.JButton btnApuracao;
    private javax.swing.JButton btnBranco;
    private javax.swing.JButton btnCandidatos;
    private javax.swing.JButton btnConfirma;
    private javax.swing.JButton btnCorrige;
    private javax.swing.JButton btnEleitores;
    private javax.swing.JButton btnLiberar;
    private javax.swing.JLabel imgAvatar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblFim;
    private javax.swing.JLabel lblMeuVoto;
    private javax.swing.JLabel lblNom;
    private javax.swing.JLabel lblNomeCand;
    private javax.swing.JLabel lblNum;
    private javax.swing.JLabel lblPar;
    private javax.swing.JLabel lblPartido;
    private javax.swing.JTextField txtNum;
    // End of variables declaration//GEN-END:variables
}
