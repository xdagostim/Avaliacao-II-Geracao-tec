package br.com.view;

import br.com.controller.TipoProdutoController;
import br.com.model.TipoProduto;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author guest01
 */
public class TipoProdutoListaGUI extends javax.swing.JFrame {

    private JTable tabela;
    private DefaultTableModel modelo = new DefaultTableModel();

    public TipoProdutoListaGUI() {
        initComponents();
        criaJTable();
        tabelaCategorias.setViewportView(tabela);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txPesquisar = new javax.swing.JTextField();
        tabelaCategorias = new javax.swing.JScrollPane();
        txNovoTipo = new javax.swing.JButton();
        txAlterarTipo = new javax.swing.JButton();
        txRemoverTipo = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Categorias Cadastradas", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP));

        jLabel1.setText("Pesquisar: ");

        txPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txPesquisarActionPerformed(evt);
            }
        });

        tabelaCategorias.setBackground(new java.awt.Color(255, 255, 255));

        txNovoTipo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/imagens/plus-icon2.png"))); // NOI18N
        txNovoTipo.setToolTipText("Adicionar");
        txNovoTipo.setBorderPainted(false);
        txNovoTipo.setContentAreaFilled(false);
        txNovoTipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txNovoTipoActionPerformed(evt);
            }
        });

        txAlterarTipo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/imagens/bullet-2-icon2.png"))); // NOI18N
        txAlterarTipo.setToolTipText("Modificar");
        txAlterarTipo.setBorderPainted(false);
        txAlterarTipo.setContentAreaFilled(false);
        txAlterarTipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txAlterarTipoActionPerformed(evt);
            }
        });

        txRemoverTipo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/imagens/cross-icon2.png"))); // NOI18N
        txRemoverTipo.setToolTipText("Remover");
        txRemoverTipo.setBorderPainted(false);
        txRemoverTipo.setContentAreaFilled(false);
        txRemoverTipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txRemoverTipoActionPerformed(evt);
            }
        });

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/imagens/arrow-left-icon3.png"))); // NOI18N
        jButton1.setToolTipText("Voltar a página anterior");
        jButton1.setBorderPainted(false);
        jButton1.setContentAreaFilled(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tabelaCategorias)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txPesquisar))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 490, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(txNovoTipo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txAlterarTipo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txRemoverTipo))
                            .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(tabelaCategorias, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(txRemoverTipo)
                        .addComponent(txAlterarTipo))
                    .addComponent(txNovoTipo))
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

        jPanel1.getAccessibleContext().setAccessibleName("Categorias Cadastrados");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txAlterarTipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txAlterarTipoActionPerformed
        int linhaSelecionada = -1;
        linhaSelecionada = tabela.getSelectedRow();
        if (linhaSelecionada >= 0) {
            int idCategoria = (int) tabela.getValueAt(linhaSelecionada, 0);
            TipoProdutoInserirGUI tpu = new TipoProdutoInserirGUI(modelo, linhaSelecionada, idCategoria);
            tpu.setLocationRelativeTo(null);
            tpu.setVisible(true);
        } else {
            JOptionPane.showMessageDialog(null, "Por favor selecione a linha que deseja alterar!");
        }
    }//GEN-LAST:event_txAlterarTipoActionPerformed

    private void txNovoTipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txNovoTipoActionPerformed
        TipoProdutoInserirGUI fu = new TipoProdutoInserirGUI(modelo);
        //Posicionar a janela no meio da tela.
        fu.setLocationRelativeTo(null);
        fu.setVisible(true);
    }//GEN-LAST:event_txNovoTipoActionPerformed

    private void txPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txPesquisarActionPerformed
        String nome = txPesquisar.getText();
        TipoProdutoController tpc = new TipoProdutoController();

        tpc.listByNome(nome);

        modelo.setNumRows(0);
        for (TipoProduto f : tpc.listByNome(nome)) {
            modelo.addRow(new Object[]{f.getId_categoria(), f.getNome()});
        }
    }//GEN-LAST:event_txPesquisarActionPerformed

    private void txRemoverTipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txRemoverTipoActionPerformed
        int linhaSelecionada = -1;
        linhaSelecionada = tabela.getSelectedRow();
        if (linhaSelecionada >= 0) {
            int idCategoria = (int) tabela.getValueAt(linhaSelecionada, 0);
            TipoProdutoController fc = new TipoProdutoController();
            if (fc.remove(idCategoria)) {
                JOptionPane.showMessageDialog(null, "Categoria removida com sucesso!");
                modelo.removeRow(linhaSelecionada);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Por favor selecione a linha que deseja remover!");
        }
    }//GEN-LAST:event_txRemoverTipoActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void criaJTable() {
        tabela = new JTable(modelo);
        modelo.addColumn("Código");
        modelo.addColumn("Nome");
        preencherJTable();
    }

    private void preencherJTable() {
        TipoProdutoController tpc = new TipoProdutoController();
        for (TipoProduto tp : tpc.listarTodos()) {
            modelo.addRow(new Object[]{tp.getId_categoria(), tp.getNome()});
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane tabelaCategorias;
    private javax.swing.JButton txAlterarTipo;
    private javax.swing.JButton txNovoTipo;
    private javax.swing.JTextField txPesquisar;
    private javax.swing.JButton txRemoverTipo;
    // End of variables declaration//GEN-END:variables
}
