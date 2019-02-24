       
package br.estacio;
// importano as bibliotecas
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.util.List;
import javax.swing.table.DefaultTableModel;

public class Lista extends javax.swing.JFrame {

  

    public Lista() {
        initComponents();
        // Setando o botão excluir tudo para ficar invísivel
         botaoExcluirTudo.setVisible(false);
         
      
        
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        botaoInserir = new javax.swing.JButton();
        campoTexto = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        novaTabela = new javax.swing.JTable();
        botaoExcluir = new javax.swing.JButton();
        botaoExcluirTudo = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        menuIniciar = new javax.swing.JMenu();
        botaoSair = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        botaoInserir.setText("Inserir");
        botaoInserir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoInserirActionPerformed(evt);
            }
        });

        campoTexto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoTextoActionPerformed(evt);
            }
        });

        novaTabela.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Lista"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(novaTabela);

        botaoExcluir.setText("Excluir Item");
        botaoExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoExcluirActionPerformed(evt);
            }
        });

        botaoExcluirTudo.setText("Excluir Todos os Itens");
        botaoExcluirTudo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoExcluirTudoActionPerformed(evt);
            }
        });

        menuIniciar.setText("Inicio");

        botaoSair.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F4, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        botaoSair.setText("Sair");
        botaoSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoSairActionPerformed(evt);
            }
        });
        menuIniciar.add(botaoSair);

        jMenuBar1.add(menuIniciar);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(campoTexto)
                            .addComponent(jScrollPane1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(botaoExcluir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(botaoInserir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(120, 120, 120)
                        .addComponent(botaoExcluirTudo, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botaoInserir)
                    .addComponent(campoTexto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(131, 131, 131)
                        .addComponent(botaoExcluir)))
                .addGap(18, 18, 18)
                .addComponent(botaoExcluirTudo)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void campoTextoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoTextoActionPerformed
   // Pegando o que foi escrito no campo de texto
        this.campoTexto.getText();
    }//GEN-LAST:event_campoTextoActionPerformed

    private void botaoInserirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoInserirActionPerformed
   
   
    // Verificando se o campo de texto está vazio, e não estando, setando para o botão Ecluir tudo ficar vísivel
        if (campoTexto.getText().trim().isEmpty()){
      
            JOptionPane.showMessageDialog(null, "Insira uma tarefa");
        }
        else{  botaoExcluirTudo.setVisible(true);
            
                
       
        // Criando a tabela no getModel e vinculando a valor, que cria uma nova linha que pega o que foi escrito no campo de texto
       DefaultTableModel valor = (DefaultTableModel) this.novaTabela.getModel();
       
        valor.addRow(new String[] {campoTexto.getText()});
     
        
        campoTexto.setText("");
        }
    }//GEN-LAST:event_botaoInserirActionPerformed

    private void botaoSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoSairActionPerformed
System.exit(0);        // Saindo do programa
    }//GEN-LAST:event_botaoSairActionPerformed

    private void botaoExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoExcluirActionPerformed
       // Vinculando a tabela ao método, logo após verificando se existe aguma linha feita e perguntando se quer excluir a linha ou não
        DefaultTableModel valor = (DefaultTableModel) this.novaTabela.getModel();
        if (valor.getRowCount() > 0){
       int resposta = JOptionPane.showConfirmDialog(null, "Voce deseja realmente excluir este item?" ,"item",  JOptionPane.YES_NO_OPTION);
       
        if (resposta == JOptionPane.YES_OPTION){
       
       int linhas = this.novaTabela.getSelectedRow();
       valor.removeRow(linhas);
    }//GEN-LAST:event_botaoExcluirActionPerformed
      
        else if (resposta == JOptionPane.NO_OPTION);
        
        }
        else {JOptionPane.showMessageDialog(null, "Selecione um item a ser excluido");        }
    }
    private void botaoExcluirTudoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoExcluirTudoActionPerformed
  
       // chamando novamente a tabela, e verificando se a mesma tem linhas, confirmando vai ser pergutando se quer excluir todas as linhas
        DefaultTableModel valor = (DefaultTableModel) this.novaTabela.getModel();
 
 if (valor.getRowCount() > 0){
     
     int resposta = JOptionPane.showConfirmDialog(null, "Voce deseja realmente excluir todos os itens?" ,"itens",  JOptionPane.YES_NO_OPTION);
         if (resposta == JOptionPane.YES_OPTION){
             // Laço "for" que renome todas as linhas
            for (int i=0;i<=valor.getRowCount();i--){
               valor.removeRow(0);            
             }
            
    }//GEN-LAST:event_botaoExcluirTudoActionPerformed
 
         else if (resposta == JOptionPane.NO_OPTION);
 }
 else {
                    JOptionPane.showMessageDialog(null, "Não existe nenhum item na tabela");
                    }
    }
   
    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Lista().setVisible(true);
               
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoExcluir;
    private javax.swing.JButton botaoExcluirTudo;
    private javax.swing.JButton botaoInserir;
    private javax.swing.JMenuItem botaoSair;
    private javax.swing.JTextField campoTexto;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JMenu menuIniciar;
    private javax.swing.JTable novaTabela;
    // End of variables declaration//GEN-END:variables

    private Object botaoExcluir() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
