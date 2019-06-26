package LoginAndFormulario2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Luke Negreiros
 */
public class Formulario extends javax.swing.JFrame {

        Connection connection;
        Statement statement;
    // metodo chamado pela classe LoginLuciano
    // criar o formulario
    public Formulario() {
        initComponents(); // inicia os componentes label, btn, textfield etc...
        abrirConexao(); // se conecta com o banco de dados
        listarTabela();
    }
    
    private void abrirConexao(){
        try{
        Class.forName("org.gjt.mm.mysql.Driver").newInstance();
        connection = DriverManager.getConnection("jdbc:mysql://172.16.6.26:3306/curso","aluno","segredo");
        statement = connection.createStatement();
        } catch(Exception e){
            JOptionPane.showMessageDialog(
                    this,
                    e.getMessage(),
                    "ERRO",
                    JOptionPane.ERROR_MESSAGE);
        }
    }
    
    private void fecharConexao() throws Exception{
        statement.close();
        connection.close();
    }
    
    private void listarTabela(){
        ((DefaultTableModel) jTable1.getModel()).setRowCount(0);
        try{
            // carrega todos os registros da tabela 'produto'
            ResultSet result = statement.executeQuery("SELECT * FROM produto");
            //enquanto tiver registro, .next() sera 'true'
            while(result.next()){
              int id =  result.getInt(1);
              String nome = result.getString(2);
              String preco = result.getString(3);
              int qtde = result.getInt(4);
              String campo2 = result.getString(5);
              String campo3 = result.getString(6);
              String campo4 = result.getString(7);
              String campo5 = result.getString(8);
              String campo6 = result.getString(9);
              String campo7 = result.getString(10);
              // concatena os valores
              // como linha[] aceita String, precisa transformar os valores dos int em strings
              // por isso o String.valuesOf(id)
              String linha[] = {String.valueOf(id),nome,preco,String.valueOf(qtde),campo2,campo3,campo4,campo5,campo6,campo7};
              //e coloca numa linha da jTable
             ((DefaultTableModel) jTable1.getModel()).addRow(linha);
            }
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(this,e.getMessage(),"ERRO",JOptionPane.ERROR_MESSAGE);
        }
    }    
    
    ////////////////////////////////////////////
    
    private void carregarCampos(int linha){
        DefaultTableModel model = ((DefaultTableModel)jTable1.getModel());
        jTextFieldId.setText((String)model.getValueAt(linha, 0));
        jTextFieldNome.setText((String)model.getValueAt(linha, 1));
        jTextFieldPreco.setText((String)model.getValueAt(linha, 2));
        jTextFieldQtd.setText((String)model.getValueAt(linha, 3));
        jTextFieldCampo2.setText((String)model.getValueAt(linha, 4));
        jTextFieldCampo3.setText((String)model.getValueAt(linha, 5));
        jTextFieldCampo4.setText((String)model.getValueAt(linha, 6));
        jTextFieldCampo5.setText((String)model.getValueAt(linha, 7));
        jTextFieldCampo6.setText((String)model.getValueAt(linha, 8));
        jTextFieldCampo7.setText((String)model.getValueAt(linha, 9));

    }
    
    private void limparCampos(){
       jTextFieldId.setText("");
       jTextFieldNome.setText("");
       jTextFieldPreco.setText("");
       jTextFieldQtd.setText("");
       jTextFieldCampo2.setText("");
       jTextFieldCampo3.setText("");
       jTextFieldCampo4.setText("");
       jTextFieldCampo5.setText("");
       jTextFieldCampo6.setText("");
       jTextFieldCampo7.setText("");
    }
    
    private void reiniciaBotoes(){
       jButtonBuscar.setEnabled(true);
       jButtonLimpar.setEnabled(true);
       jButtonInserir.setEnabled(true);
       jButtonAlterar.setEnabled(false);
       jButtonRemover.setEnabled(false);
    }
    
    private void redefinirBotoes(){
       jButtonBuscar.setEnabled(false);
       jButtonLimpar.setEnabled(true);
       jButtonInserir.setEnabled(false);
       jButtonAlterar.setEnabled(true);
       jButtonRemover.setEnabled(true);
    }
    
    ///////////////////////////////////////////////////
    
    @Override
    protected void finalize() throws Throwable {
        fecharConexao();
    }
    


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jTextFieldPreco = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextFieldQtd = new javax.swing.JTextField();
        jTextFieldNome = new javax.swing.JTextField();
        jTextFieldId = new javax.swing.JTextField();
        jButtonBuscar = new javax.swing.JButton();
        jButtonLimpar = new javax.swing.JButton();
        jButtonInserir = new javax.swing.JButton();
        jButtonAlterar = new javax.swing.JButton();
        jButtonRemover = new javax.swing.JButton();
        jTextFieldCampo2 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTextFieldCampo3 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jTextFieldCampo5 = new javax.swing.JTextField();
        jTextFieldCampo4 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jTextFieldCampo6 = new javax.swing.JTextField();
        jTextFieldCampo7 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cadastro de Produtos");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nome", "Preço", "Quantidade", "Campo2", "Campo3", "Campo4", "Campo5", "Campo6", "Campo7"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jTable1.getTableHeader().setReorderingAllowed(false);
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jLabel1.setText("ID:");

        jLabel2.setText("Nome:");

        jLabel3.setText("Preço:");

        jLabel4.setText("Quantidade:");

        jTextFieldId.setEditable(false);
        jTextFieldId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldIdActionPerformed(evt);
            }
        });

        jButtonBuscar.setText("Buscar");
        jButtonBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBuscarActionPerformed(evt);
            }
        });

        jButtonLimpar.setText("Limpar");
        jButtonLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLimparActionPerformed(evt);
            }
        });

        jButtonInserir.setText("Inserir");
        jButtonInserir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonInserirActionPerformed(evt);
            }
        });

        jButtonAlterar.setText("Alterar");
        jButtonAlterar.setEnabled(false);
        jButtonAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAlterarActionPerformed(evt);
            }
        });

        jButtonRemover.setText("Remover");
        jButtonRemover.setEnabled(false);
        jButtonRemover.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRemoverActionPerformed(evt);
            }
        });

        jLabel5.setText("Campo_02:");

        jLabel6.setText("Campo_03:");

        jLabel7.setText("Campo_04:");

        jLabel8.setText("Campo_05:");

        jLabel9.setText("Campo_07:");

        jLabel10.setText("Campo_06:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 681, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jButtonBuscar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButtonInserir)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButtonLimpar))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(jTextFieldCampo5, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jTextFieldCampo4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jTextFieldPreco, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextFieldNome, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextFieldId, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(jTextFieldCampo3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 210, Short.MAX_VALUE)
                                        .addComponent(jTextFieldCampo2, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jTextFieldQtd, javax.swing.GroupLayout.Alignment.LEADING))))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel10)
                                    .addComponent(jLabel9))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jTextFieldCampo7, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextFieldCampo6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(62, 62, 62)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonAlterar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButtonRemover)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldPreco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldQtd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldCampo2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldCampo3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldCampo4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldCampo5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldCampo6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldCampo7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonRemover)
                    .addComponent(jButtonAlterar)
                    .addComponent(jButtonLimpar)
                    .addComponent(jButtonInserir)
                    .addComponent(jButtonBuscar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    ///////////////////// COMPONENTES  ////////////////////
    
    private void jButtonInserirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonInserirActionPerformed
          try{
              String nome = jTextFieldNome.getText();
              String preco = jTextFieldPreco.getText();
              String qtde = jTextFieldQtd.getText();
              String campo2 = jTextFieldCampo2.getText();
              String campo3 = jTextFieldCampo3.getText();
              String campo4 = jTextFieldCampo4.getText();
              String campo5 = jTextFieldCampo5.getText();
              String campo6 = jTextFieldCampo6.getText();
              String campo7 = jTextFieldCampo7.getText();
              if(nome.equals("") || preco.equals("") || qtde.equals("") || campo2.equals("") || campo3.equals("") || campo4.equals("") || campo5.equals("") || campo6.equals("") || campo7.equals("")){
                  throw new Exception ("Todos os campos sao obrigatorios");
              }
              int qtd = Integer.parseInt(qtde);
              //INSERT INTO produto VALUES(null, 'string', 'string', 9999)
              statement.executeUpdate("INSERT INTO produto VALUES(null, '"+nome+"', '"+preco+"', "+qtd+", '"+campo2+"', '"+campo3+"', '"+campo4+"', '"+campo5+"', '"+campo6+"', '"+campo7+"'    )");
              limparCampos();
          }
          catch(Exception e){
            JOptionPane.showMessageDialog(this,e.getMessage(),"ERRO",JOptionPane.ERROR_MESSAGE);
        }
          
    }//GEN-LAST:event_jButtonInserirActionPerformed

    private void jButtonLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLimparActionPerformed
       limparCampos();
       reiniciaBotoes();
       jTable1.clearSelection();
    }//GEN-LAST:event_jButtonLimparActionPerformed

    private void jButtonBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBuscarActionPerformed
       // pesquisa plo campo 'nome'
        String nome = jTextFieldNome.getText();
       
       DefaultTableModel model = ((DefaultTableModel)jTable1.getModel());
       for(int i=0; i< model.getRowCount(); i++){
       String n = (String)model.getValueAt(i, 1);
       if(n.indexOf(nome)>-1){
           jTable1.setRowSelectionInterval(i, i);
           carregarCampos(i);
           redefinirBotoes();
           break;
       }
       }
       
       
    }//GEN-LAST:event_jButtonBuscarActionPerformed

    private void jTextFieldIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldIdActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
     //evento duplo clique
     if(evt.getClickCount() == 2) {
        DefaultTableModel model = ((DefaultTableModel)jTable1.getModel());
        int linha = jTable1.getSelectedRow();
        carregarCampos(linha);
        redefinirBotoes();
        listarTabela();
     }
     
     
    }//GEN-LAST:event_jTable1MouseClicked

    private void jButtonAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAlterarActionPerformed
                try{
              String nome = jTextFieldNome.getText();
              String preco = jTextFieldPreco.getText();
              String qtde = jTextFieldQtd.getText();
              String c2 = jTextFieldCampo2.getText();
              String c3 = jTextFieldCampo3.getText();
              String c4 = jTextFieldCampo4.getText();
              String c5 = jTextFieldCampo5.getText();
              String c6 = jTextFieldCampo6.getText();
              String c7 = jTextFieldCampo7.getText();
              if(nome.equals("") || preco.equals("") || qtde.equals("") || c2.equals("") || c3.equals("") || c4.equals("") || c5.equals("") || c6.equals("") || c7.equals("") ){
                  throw new Exception ("Preencha todos os campos");
              }
              int qtd = Integer.parseInt(qtde);
              //INSERT INTO produto VALUES(null, 'asdas', 'asdasd', 9999)
              statement.executeUpdate("UPDATE produto SET nome_produto='"+nome+"',preco_produto= '"+preco+"',quantidade_produto="+qtd+", <nome>='"+c2+"', <nome>='"+c3+"', <nome>='"+c4+"', <nome>='"+c5+"', <nome>='"+c6+"', <nome>='"+c7+"'   WHERE id_produto=" + jTextFieldId.getText());
              limparCampos();
              listarTabela();
              reiniciaBotoes();
          }
          catch(Exception e){
            JOptionPane.showMessageDialog(this,e.getMessage(),"ERRO",JOptionPane.ERROR_MESSAGE);
        }
          
    }//GEN-LAST:event_jButtonAlterarActionPerformed

    private void jButtonRemoverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRemoverActionPerformed
        try{
          int ret =  JOptionPane.showConfirmDialog(this,"Tem certeza? Essa acao nao pode ser desfeita","Confirmacao de remocao",JOptionPane.WARNING_MESSAGE);
          if (ret != JOptionPane.OK_OPTION){
              throw new Exception("Operacao cancelada pelo usuário");
          }
          statement.executeUpdate("DELETE FROM produto WHERE id_produto=" + jTextFieldId.getText());
            JOptionPane.showMessageDialog(this,"Produto removido","Confirmado",JOptionPane.INFORMATION_MESSAGE);
            listarTabela();
            limparCampos();
            reiniciaBotoes();
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(this,e.getMessage(),"ERRO",JOptionPane.ERROR_MESSAGE);
        }
            listarTabela();
            limparCampos();
            reiniciaBotoes();
        
        
    }//GEN-LAST:event_jButtonRemoverActionPerformed

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
            java.util.logging.Logger.getLogger(Formulario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Formulario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Formulario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Formulario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Formulario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAlterar;
    private javax.swing.JButton jButtonBuscar;
    private javax.swing.JButton jButtonInserir;
    private javax.swing.JButton jButtonLimpar;
    private javax.swing.JButton jButtonRemover;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextFieldCampo2;
    private javax.swing.JTextField jTextFieldCampo3;
    private javax.swing.JTextField jTextFieldCampo4;
    private javax.swing.JTextField jTextFieldCampo5;
    private javax.swing.JTextField jTextFieldCampo6;
    private javax.swing.JTextField jTextFieldCampo7;
    private javax.swing.JTextField jTextFieldId;
    private javax.swing.JTextField jTextFieldNome;
    private javax.swing.JTextField jTextFieldPreco;
    private javax.swing.JTextField jTextFieldQtd;
    // End of variables declaration//GEN-END:variables
}
