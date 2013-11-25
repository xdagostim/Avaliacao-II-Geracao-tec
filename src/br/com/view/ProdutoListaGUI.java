package br.com.view;

import br.com.controller.GameController;
import br.com.controller.ProdutoController;
import br.com.model.Game;
import br.com.model.Produto;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author guest01
 */
public class ProdutoListaGUI extends javax.swing.JFrame {

    private JTable tabelaproduto;
    private JTable tabelagames;
    private DefaultTableModel modeloproduto = new DefaultTableModel();
    private DefaultTableModel modelogames = new DefaultTableModel();

    public ProdutoListaGUI() {
        initComponents();
        criaJTableProduto();
        painelTabelaProdutos.setViewportView(tabelaproduto);
        criaJTableGames();
        painelTabelaGames.setViewportView(tabelagames);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txPesquisarProduto = new javax.swing.JTextField();
        painelTabelaProdutos = new javax.swing.JScrollPane();
        txNovoProduto = new javax.swing.JButton();
        txAlterarProduto = new javax.swing.JButton();
        txRemoverProduto = new javax.swing.JButton();
        btVoltarProduto = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txPesquisarGame = new javax.swing.JTextField();
        painelTabelaGames = new javax.swing.JScrollPane();
        txNovoGame = new javax.swing.JButton();
        txAlterarGame = new javax.swing.JButton();
        txRemoverGame = new javax.swing.JButton();
        btVoltarGame = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Produtos Cadastrados", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP));

        jLabel1.setText("Pesquisar: ");

        txPesquisarProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txPesquisarProdutoActionPerformed(evt);
            }
        });

        painelTabelaProdutos.setBackground(new java.awt.Color(255, 255, 255));

        txNovoProduto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/imagens/plus-icon2.png"))); // NOI18N
        txNovoProduto.setToolTipText("Adicionar");
        txNovoProduto.setBorderPainted(false);
        txNovoProduto.setContentAreaFilled(false);
        txNovoProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txNovoProdutoActionPerformed(evt);
            }
        });

        txAlterarProduto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/imagens/bullet-2-icon2.png"))); // NOI18N
        txAlterarProduto.setToolTipText("Modificar");
        txAlterarProduto.setBorderPainted(false);
        txAlterarProduto.setContentAreaFilled(false);
        txAlterarProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txAlterarProdutoActionPerformed(evt);
            }
        });

        txRemoverProduto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/imagens/cross-icon2.png"))); // NOI18N
        txRemoverProduto.setToolTipText("Remover");
        txRemoverProduto.setBorderPainted(false);
        txRemoverProduto.setContentAreaFilled(false);
        txRemoverProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txRemoverProdutoActionPerformed(evt);
            }
        });

        btVoltarProduto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/imagens/arrow-left-icon3.png"))); // NOI18N
        btVoltarProduto.setToolTipText("Voltar a página anterior");
        btVoltarProduto.setBorderPainted(false);
        btVoltarProduto.setContentAreaFilled(false);
        btVoltarProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btVoltarProdutoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(painelTabelaProdutos)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txPesquisarProduto))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGap(0, 485, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addComponent(txNovoProduto)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txAlterarProduto)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txRemoverProduto))
                            .addComponent(btVoltarProduto, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(btVoltarProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txPesquisarProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(painelTabelaProdutos, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(txRemoverProduto)
                        .addComponent(txAlterarProduto))
                    .addComponent(txNovoProduto))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Produtos", jPanel1);

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Games Cadastrados", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP));

        jLabel2.setText("Pesquisar: ");

        txPesquisarGame.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txPesquisarGameActionPerformed(evt);
            }
        });

        painelTabelaGames.setBackground(new java.awt.Color(255, 255, 255));

        txNovoGame.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/imagens/plus-icon2.png"))); // NOI18N
        txNovoGame.setToolTipText("Adicionar");
        txNovoGame.setBorderPainted(false);
        txNovoGame.setContentAreaFilled(false);
        txNovoGame.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txNovoGameActionPerformed(evt);
            }
        });

        txAlterarGame.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/imagens/bullet-2-icon2.png"))); // NOI18N
        txAlterarGame.setToolTipText("Modificar");
        txAlterarGame.setBorderPainted(false);
        txAlterarGame.setContentAreaFilled(false);
        txAlterarGame.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txAlterarGameActionPerformed(evt);
            }
        });

        txRemoverGame.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/imagens/cross-icon2.png"))); // NOI18N
        txRemoverGame.setToolTipText("Remover");
        txRemoverGame.setBorderPainted(false);
        txRemoverGame.setContentAreaFilled(false);
        txRemoverGame.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txRemoverGameActionPerformed(evt);
            }
        });

        btVoltarGame.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/imagens/arrow-left-icon3.png"))); // NOI18N
        btVoltarGame.setToolTipText("Voltar a página anterior");
        btVoltarGame.setBorderPainted(false);
        btVoltarGame.setContentAreaFilled(false);
        btVoltarGame.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btVoltarGameActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(painelTabelaGames)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txPesquisarGame))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addGap(0, 485, Short.MAX_VALUE)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                                .addComponent(txNovoGame)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txAlterarGame)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txRemoverGame))
                            .addComponent(btVoltarGame, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(btVoltarGame, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txPesquisarGame, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(painelTabelaGames, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(txRemoverGame)
                        .addComponent(txAlterarGame))
                    .addComponent(txNovoGame))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Games", jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txPesquisarProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txPesquisarProdutoActionPerformed
        String nome = txPesquisarProduto.getText();
        ProdutoController pc = new ProdutoController();

        pc.listByNome(nome);

        modeloproduto.setNumRows(0);
        for (Produto p : pc.listByNome(nome)) {
            modeloproduto.addRow(new Object[]{p.getId_produto(), p.getNome()});
        }
    }//GEN-LAST:event_txPesquisarProdutoActionPerformed

    private void txNovoProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txNovoProdutoActionPerformed
        ProdutoInserirGUI pi = new ProdutoInserirGUI(modeloproduto, modelogames);
        //Posicionar a janela no meio da tela.
        pi.setLocationRelativeTo(null);
        pi.setVisible(true);

    }//GEN-LAST:event_txNovoProdutoActionPerformed

    private void txAlterarProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txAlterarProdutoActionPerformed
        int linhaSelecionada = -1;
        linhaSelecionada = tabelaproduto.getSelectedRow();
        if (linhaSelecionada >= 0) {
            int idProduto = (int) tabelaproduto.getValueAt(linhaSelecionada, 0);
            ProdutoInserirGUI tpu = new ProdutoInserirGUI(modeloproduto, modelogames, linhaSelecionada, idProduto, 2);
            tpu.setLocationRelativeTo(null);
            tpu.setVisible(true);
        } else {
            JOptionPane.showMessageDialog(null, "Por favor selecione a linha que deseja alterar!");
        }
    }//GEN-LAST:event_txAlterarProdutoActionPerformed

    private void txRemoverProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txRemoverProdutoActionPerformed
        int linhaSelecionada = -1;
        linhaSelecionada = tabelaproduto.getSelectedRow();
        if (linhaSelecionada >= 0) {
            int idProduto = (int) tabelaproduto.getValueAt(linhaSelecionada, 0);
            ProdutoController pc = new ProdutoController();
            if (pc.remove(idProduto)) {
                JOptionPane.showMessageDialog(null, "Produto removido com sucesso!");
                modeloproduto.removeRow(linhaSelecionada);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Por favor selecione a linha que deseja remover!");
        }
    }//GEN-LAST:event_txRemoverProdutoActionPerformed

    private void btVoltarProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btVoltarProdutoActionPerformed
        dispose();
    }//GEN-LAST:event_btVoltarProdutoActionPerformed

    private void txPesquisarGameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txPesquisarGameActionPerformed
        String nome = txPesquisarGame.getText();
        GameController gc = new GameController();

        gc.listByNome(nome);

        modeloproduto.setNumRows(0);
        for (Game g : gc.listByNome(nome)) {
            modeloproduto.addRow(new Object[]{g.getId_game(), g.getNome()});
        }
    }//GEN-LAST:event_txPesquisarGameActionPerformed

    private void txNovoGameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txNovoGameActionPerformed
        ProdutoInserirGUI pi = new ProdutoInserirGUI(modeloproduto, modelogames);
        //Posicionar a janela no meio da tela.
        pi.setLocationRelativeTo(null);
        pi.setVisible(true);
    }//GEN-LAST:event_txNovoGameActionPerformed

    private void txAlterarGameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txAlterarGameActionPerformed
        int linhaSelecionada = -1;
        linhaSelecionada = tabelagames.getSelectedRow();
        if (linhaSelecionada >= 0) {
            int idGame = (int) tabelagames.getValueAt(linhaSelecionada, 0);
            ProdutoInserirGUI pu = new ProdutoInserirGUI(modeloproduto, modelogames, linhaSelecionada, idGame, 1);
            pu.setLocationRelativeTo(null);
            pu.setVisible(true);
        } else {
            JOptionPane.showMessageDialog(null, "Por favor selecione a linha que deseja alterar!");
        }
    }//GEN-LAST:event_txAlterarGameActionPerformed

    private void txRemoverGameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txRemoverGameActionPerformed
        int linhaSelecionada = -1;
        linhaSelecionada = tabelagames.getSelectedRow();
        if (linhaSelecionada >= 0) {
            int idGame = (int) tabelagames.getValueAt(linhaSelecionada, 0);
            GameController gc = new GameController();
            if (gc.remove(idGame)) {
                JOptionPane.showMessageDialog(null, "Game removido com sucesso!");
                modelogames.removeRow(linhaSelecionada);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Por favor selecione a linha que deseja remover!");
        }
    }//GEN-LAST:event_txRemoverGameActionPerformed

    private void btVoltarGameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btVoltarGameActionPerformed
        dispose();
    }//GEN-LAST:event_btVoltarGameActionPerformed

    private void criaJTableProduto() {
        tabelaproduto = new JTable(modeloproduto);
        modeloproduto.addColumn("Código");
        modeloproduto.addColumn("Nome");
        modeloproduto.addColumn("Preço");
        preencherJTableProduto();
    }

    private void criaJTableGames() {
        tabelagames = new JTable(modelogames);
        modelogames.addColumn("Código");
        modelogames.addColumn("Nome");
        modelogames.addColumn("Gênero");
        modelogames.addColumn("Preço");
        preencherJTableGames();
    }

    private void preencherJTableProduto() {
        ProdutoController pc = new ProdutoController();
        for (Produto p : pc.listarTodos()) {
            modeloproduto.addRow(new Object[]{p.getId_produto(), p.getNome(), p.getPreco()});
        }
    }

    private void preencherJTableGames() {
        GameController gc = new GameController();
        for (Game g : gc.listarTodos()) {
            modelogames.addRow(new Object[]{g.getId_game(), g.getNome(), g.getTipoGenero(), g.getPreco()});
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btVoltarGame;
    private javax.swing.JButton btVoltarProduto;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JScrollPane painelTabelaGames;
    private javax.swing.JScrollPane painelTabelaProdutos;
    private javax.swing.JButton txAlterarGame;
    private javax.swing.JButton txAlterarProduto;
    private javax.swing.JButton txNovoGame;
    private javax.swing.JButton txNovoProduto;
    private javax.swing.JTextField txPesquisarGame;
    private javax.swing.JTextField txPesquisarProduto;
    private javax.swing.JButton txRemoverGame;
    private javax.swing.JButton txRemoverProduto;
    // End of variables declaration//GEN-END:variables
}
