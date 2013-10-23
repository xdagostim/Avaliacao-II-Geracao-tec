package br.com.view;

import br.com.controller.FuncionarioController;
import br.com.model.Funcionario;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author guest01
 */
public class FuncionarioListaGUI extends javax.swing.JFrame {

    private JTable tabela;
    private DefaultTableModel modelo = new DefaultTableModel();

    public FuncionarioListaGUI() {
        initComponents();
        criaJTable();
        tabelaFuncionarios.setViewportView(tabela);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txPesquisar = new javax.swing.JTextField();
        tabelaFuncionarios = new javax.swing.JScrollPane();
        txNovo = new javax.swing.JButton();
        txAlterar = new javax.swing.JButton();
        txRemover = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Funcionários Cadastrados", 2, 2));

        jLabel1.setText("Pesquisar: ");

        txPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txPesquisarActionPerformed(evt);
            }
        });

        tabelaFuncionarios.setBackground(new java.awt.Color(255, 255, 255));

        txNovo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/imagens/plus-icon2.png"))); // NOI18N
        txNovo.setBorderPainted(false);
        txNovo.setContentAreaFilled(false);
        txNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txNovoActionPerformed(evt);
            }
        });

        txAlterar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/imagens/bullet-2-icon2.png"))); // NOI18N
        txAlterar.setBorderPainted(false);
        txAlterar.setContentAreaFilled(false);
        txAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txAlterarActionPerformed(evt);
            }
        });

        txRemover.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/imagens/cross-icon2.png"))); // NOI18N
        txRemover.setBorderPainted(false);
        txRemover.setContentAreaFilled(false);
        txRemover.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txRemoverActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tabelaFuncionarios)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 490, Short.MAX_VALUE)
                        .addComponent(txNovo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txAlterar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txRemover))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txPesquisar)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(tabelaFuncionarios, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txRemover)
                        .addComponent(txAlterar))
                    .addComponent(txNovo))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txAlterarActionPerformed
        int linhaSelecionada = -1;
        linhaSelecionada = tabela.getSelectedRow();
        if (linhaSelecionada >= 0) {
            int idFuncionario = (int) tabela.getValueAt(linhaSelecionada, 0);
            FuncionarioInserirGUI fu = new FuncionarioInserirGUI(modelo, linhaSelecionada, idFuncionario);
            fu.setVisible(true);
        } else {
            JOptionPane.showMessageDialog(null, "Por favor selecione a linha que deseja alterar!");
        }
    }//GEN-LAST:event_txAlterarActionPerformed

    private void txNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txNovoActionPerformed
        FuncionarioInserirGUI fu = new FuncionarioInserirGUI(modelo);
        //Posicionar a janela no meio da tela.
        fu.setLocationRelativeTo(null);

        fu.setVisible(true);
    }//GEN-LAST:event_txNovoActionPerformed

    private void txPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txPesquisarActionPerformed
        String nome = txPesquisar.getText();
        FuncionarioController fc = new FuncionarioController();

        fc.listByNome(nome);

        modelo.setNumRows(0);
        for (Funcionario f : fc.listByNome(nome)) {
            modelo.addRow(new Object[]{f.getId_funcionario(), f.getNome(), f.getSalario(), f.getLogin()});
        }
    }//GEN-LAST:event_txPesquisarActionPerformed

    private void txRemoverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txRemoverActionPerformed
        int linhaSelecionada = -1;
        linhaSelecionada = tabela.getSelectedRow();
        if (linhaSelecionada >= 0) {
            int idFuncionario = (int) tabela.getValueAt(linhaSelecionada, 0);
            FuncionarioController fc = new FuncionarioController();
            if (fc.remove(idFuncionario)) {
                JOptionPane.showMessageDialog(null, "Funcionário removido com sucesso!");
                modelo.removeRow(linhaSelecionada);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Por favor selecione a linha que deseja remover!");
        }
    }//GEN-LAST:event_txRemoverActionPerformed

    private void criaJTable() {
        tabela = new JTable(modelo);
        modelo.addColumn("ID");
        modelo.addColumn("Nome");
        modelo.addColumn("Salário");
        modelo.addColumn("Usuário");
        preencherJTable();
    }

    private void preencherJTable() {
        FuncionarioController fc = new FuncionarioController();
        for (Funcionario f : fc.listarTodos()) {
            modelo.addRow(new Object[]{f.getId_funcionario(), f.getNome(), f.getSalario(), f.getLogin()});
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane tabelaFuncionarios;
    private javax.swing.JButton txAlterar;
    private javax.swing.JButton txNovo;
    private javax.swing.JTextField txPesquisar;
    private javax.swing.JButton txRemover;
    // End of variables declaration//GEN-END:variables
}
