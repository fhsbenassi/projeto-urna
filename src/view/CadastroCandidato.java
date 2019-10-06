/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import DAO.cadastoCandidato;
import DAO.conectaBanco;
import Model.Candidato;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author fhsbenassi
 */
public class CadastroCandidato extends javax.swing.JFrame {
    conectaBanco conec = new conectaBanco();
     cadastoCandidato cadas = new cadastoCandidato();
     //cadastroPartido cadPart = new cadastroPartido();
     
    // BufferedImage imagemBuffer=null;
    // ByteArrayOutputStream bytesImg =  new ByteArrayOutputStream();
    // byte[] byteArray;
     
     
     public void limpaEdit(){
        txtNome.setText(null);
        jcbCargo.setSelectedIndex(0);
        txtNumero.setText(null);
        txtSigla.setText(null);
        
        txtNome.requestFocus();
    }
     

    /**
     * Creates new form Cadastro
     */
    public CadastroCandidato() {
        initComponents();
        
        txtNome.requestFocus();
          
          ResultSet rs = cadas.listaCandidato();
           carregarTabela(rs);
           
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jRadioButton1 = new javax.swing.JRadioButton();
        txtNome = new javax.swing.JTextField();
        txtNumero = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtPesquisa = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        btnSalvar = new javax.swing.JButton();
        btnNovo = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        jscCandidato = new javax.swing.JScrollPane();
        tblCandidatos = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        txtSigla = new javax.swing.JTextField();
        jcbCargo = new javax.swing.JComboBox<>();
        lblFoto = new javax.swing.JLabel();

        jRadioButton1.setText("jRadioButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Nome");

        jLabel2.setText("Cargo");

        txtPesquisa.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtPesquisaKeyPressed(evt);
            }
        });

        jLabel3.setText("Número");

        jLabel4.setText("Pesquisar");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        btnSalvar.setText("Salvar");
        btnSalvar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSalvar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnSalvarMousePressed(evt);
            }
        });

        btnNovo.setText("Novo");
        btnNovo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnNovo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnNovoMousePressed(evt);
            }
        });

        btnEditar.setText("Editar");
        btnEditar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEditar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnEditarMousePressed(evt);
            }
        });

        btnExcluir.setText("Excluir");
        btnExcluir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnExcluir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnExcluirMousePressed(evt);
            }
        });

        btnCancelar.setText("Cancelar");
        btnCancelar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCancelar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnCancelarMousePressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(45, Short.MAX_VALUE)
                .addComponent(btnNovo, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnEditar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnExcluir)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCancelar)
                .addGap(32, 32, 32))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSalvar)
                    .addComponent(btnNovo)
                    .addComponent(btnEditar)
                    .addComponent(btnExcluir)
                    .addComponent(btnCancelar))
                .addGap(35, 35, 35))
        );

        tblCandidatos.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        tblCandidatos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Numero", "Nome", "Cargo", "Sigla"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblCandidatos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tblCandidatosMousePressed(evt);
            }
        });
        jscCandidato.setViewportView(tblCandidatos);

        jLabel5.setText("Partido (Sigla)");

        jcbCargo.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jcbCargo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Deputado Estadual", "Deputado Federal", "Governador", "Presidente", "Senador" }));

        lblFoto.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblFoto.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblFoto.setText("Clique para Inserir Foto");
        lblFoto.setToolTipText("");
        lblFoto.setAlignmentY(0.0F);
        lblFoto.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lblFoto.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        lblFoto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblFotoMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jscCandidato, javax.swing.GroupLayout.PREFERRED_SIZE, 920, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jcbCargo, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(jLabel3)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(txtNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel5)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(txtSigla, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 572, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblFoto, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(10, 10, 10)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel2)
                        .addComponent(jLabel1))
                    .addContainerGap(901, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(46, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtSigla, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5)
                            .addComponent(txtNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jcbCargo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(50, 50, 50)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addGap(43, 43, 43))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(lblFoto, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)))
                .addComponent(jscCandidato, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(53, 53, 53)
                    .addComponent(jLabel1)
                    .addGap(24, 24, 24)
                    .addComponent(jLabel2)
                    .addContainerGap(440, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /*public void insereFotoCandidato() throws IOException{
        
        JFileChooser buscafoto = new JFileChooser();
        buscafoto.setFileFilter(new FileNameExtensionFilter ("Imagem", "bmp", "jpg", "jpeg"));
        buscafoto.setAcceptAllFileFilterUsed(false);
        buscafoto.showOpenDialog(this);
        String caminho =""+buscafoto.getSelectedFile().getAbsolutePath();
        imagemBuffer = ImageIO.read(new File(caminho));
        Image diminuir = imagemBuffer.getScaledInstance(220, 180, 0);
        lblFoto.setText("");
        lblFoto.setIcon(new ImageIcon(diminuir));
    }*/
    
    public void carregarTabela(ResultSet rs){
        
        String[] colunasTabela = new String[]{"Numero","Nome","Cargo","Sigla"};
        DefaultTableModel modeloTabela = 
                new DefaultTableModel(null,colunasTabela){
        
        public boolean isCellEditable(int row,int col){
            return false; }  };
        
        tblCandidatos.setModel(modeloTabela);
        try{
            rs.previous();
            while(rs.next()){
                modeloTabela.addRow(new String[]{
                  rs.getString(1),rs.getString(2),rs.getString(3), rs.getString(4)});
             }//fim do while
            }//fim do try
        catch(Exception e){
            System.out.print(e.getMessage());
        }
   }
       
    private void txtPesquisaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPesquisaKeyPressed
        ResultSet rs = cadas.buscarCandidatoNome(txtPesquisa.getText());
        carregarTabela(rs);

        tblCandidatos.setEnabled(true);
    }//GEN-LAST:event_txtPesquisaKeyPressed

    private void btnSalvarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSalvarMousePressed
        
        
       /* ImageIO.write(imagemBuffer, "jpg", bytesImg);
        bytesImg.flush();
        byteArray = bytesImg.toByteArray();
        bytesImg.close();*/
               
        Candidato can = new Candidato();

        can.setNomeCandidato(txtNome.getText());
        can.setCargoCandidato(jcbCargo.getSelectedItem().toString());
        can.setNumeroCandidato(Integer.parseInt(txtNumero.getText()));
        can.setPartidoCandidato(txtSigla.getText());
      //can.setFotoCandidato(byteArray);

        if (txtNome.getText().isEmpty() || txtNumero.getText().isEmpty() || txtSigla.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Por favor, preencha os campos");
        } else {
            cadas.incluirCandidato(can);
            JOptionPane.showMessageDialog(null, "Cadastrado com sucesso!!");
        }

        limpaEdit();

        ResultSet rs = cadas.listaCandidato();
        carregarTabela(rs);
    }//GEN-LAST:event_btnSalvarMousePressed

    private void btnNovoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnNovoMousePressed
        limpaEdit();
    }//GEN-LAST:event_btnNovoMousePressed

    private void btnEditarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEditarMousePressed
        
        Candidato c = new Candidato();

        c.setNomeCandidato(txtNome.getText());
        c.setCargoCandidato(jcbCargo.getSelectedItem().toString());
        c.setNumeroCandidato(Integer.parseInt(txtNumero.getText()));
        c.setPartidoCandidato(txtSigla.getText());
        int linha = tblCandidatos.getSelectedRow();
        int id = Integer.parseInt(tblCandidatos.getModel().getValueAt(linha, 0).toString());
      //c.setcodigoCandidato(id);

        if (txtNome.getText().isEmpty() || txtNumero.getText().isEmpty() || txtSigla.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Por favor, preencha os campos");
        } else {
            cadas.alterarCandidato(c);
        }

        limpaEdit();

        ResultSet rs = cadas.listaCandidato();
        carregarTabela(rs);
    }//GEN-LAST:event_btnEditarMousePressed

    private void btnExcluirMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnExcluirMousePressed
        Candidato c = new Candidato();

        int linha = tblCandidatos.getSelectedRow();
        int id = Integer.parseInt(tblCandidatos.getModel().getValueAt(linha, 0).toString());
        //c.setcodigoCandidato(id);

        int result = JOptionPane.showConfirmDialog(null, "Deseja realmente apagar este candidato ?");
        if (result == 0) {
            cadas.excluirCandidato(c);
            ResultSet rs = cadas.listaCandidato();
            carregarTabela(rs);
        }
    }//GEN-LAST:event_btnExcluirMousePressed

    private void btnCancelarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCancelarMousePressed
        
        int i = JOptionPane.showConfirmDialog(null,
            "Deseja realmente sair?", "Saída",
            JOptionPane.YES_NO_OPTION);
        if (i == JOptionPane.YES_OPTION) {
            System.exit(0);
        } else {
            repaint();
        }
    }//GEN-LAST:event_btnCancelarMousePressed

    private void tblCandidatosMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblCandidatosMousePressed


    }//GEN-LAST:event_tblCandidatosMousePressed

    private void lblFotoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblFotoMouseClicked
        
       /* try {
            this.getFotoCandidato();
        } catch (IOException ex) {
            Logger.getLogger(CadastroCandidato.class.getName()).log(Level.SEVERE, null, ex);
        }*/
        
    }//GEN-LAST:event_lblFotoMouseClicked

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
            java.util.logging.Logger.getLogger(CadastroCandidato.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastroCandidato.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastroCandidato.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastroCandidato.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastroCandidato().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnNovo;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JComboBox<String> jcbCargo;
    private javax.swing.JScrollPane jscCandidato;
    private javax.swing.JLabel lblFoto;
    private javax.swing.JTable tblCandidatos;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtNumero;
    private javax.swing.JTextField txtPesquisa;
    private javax.swing.JTextField txtSigla;
    // End of variables declaration//GEN-END:variables
}