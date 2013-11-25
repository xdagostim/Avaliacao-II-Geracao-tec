package br.com.view;

import br.com.controller.GameController;
import br.com.controller.ProdutoController;
import br.com.controller.TipoProdutoController;
import br.com.model.Game;
import br.com.model.Produto;
import br.com.model.TipoProduto;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class ProdutoInserirGUI extends javax.swing.JFrame {

    private DefaultTableModel modeloproduto;
    private DefaultTableModel modelogame;
    private int linhaSelecionada;

    public ProdutoInserirGUI(DefaultTableModel modeloproduto, DefaultTableModel modelogames) {
        initComponents();
        this.modeloproduto = modeloproduto;
        this.modelogame = modelogames;
        carregarCombo();
    }

    public ProdutoInserirGUI(DefaultTableModel modeloproduto, DefaultTableModel modelogame, int linhaSelecionada, int id, int tipo) {

        this.modeloproduto = modeloproduto;
        this.modelogame = modelogame;
        this.linhaSelecionada = linhaSelecionada;
        initComponents();

        if (tipo == 1) {
            GameController gc = new GameController();
            Game g = gc.listById(id);
            txCodigoProduto.setText(Integer.toString(g.getId_game()));
            txNomeProduto.setText(g.getNome());
            txDescricao.setText(g.getDescricao());
            txIdade.setText(String.valueOf(g.getClassificacaoEtaria()));
            txMidia.setText(g.getTipoMidia());
            txGenero.setText(g.getTipoGenero());
            txQuantidade.setText(String.valueOf(g.getQuantidade()));
            txPreco.setText(String.valueOf(g.getPreco()));
            cbCategoria.removeAllItems();
            cbCategoria.addItem("Games");
        } else {
            ProdutoController pc = new ProdutoController();
            Produto p = pc.listById(id);
            txCodigoProduto.setText(Integer.toString(p.getId_produto()));
            txNomeProduto.setText(p.getNome());
            txDescricao.setText(p.getDescricao());
            txQuantidade.setText(String.valueOf(p.getQuantidade()));
            txPreco.setText(String.valueOf(p.getPreco()));
            cbCategoria.removeAllItems();
            cbCategoria.addItem("");
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jRadioButton1 = new javax.swing.JRadioButton();
        jLabel15 = new javax.swing.JLabel();
        grupoSexo = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txCodigoProduto = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txNomeProduto = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        btSalvarProduto = new javax.swing.JButton();
        btLimparProduto = new javax.swing.JButton();
        jLabel23 = new javax.swing.JLabel();
        txQuantidade = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        btSair = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txDescricao = new javax.swing.JTextArea();
        cbCategoria = new javax.swing.JComboBox();
        jLabel24 = new javax.swing.JLabel();
        txPreco = new javax.swing.JTextField();
        jLabel26 = new javax.swing.JLabel();
        txGenero = new javax.swing.JTextField();
        jLabel27 = new javax.swing.JLabel();
        txMidia = new javax.swing.JTextField();
        jLabel28 = new javax.swing.JLabel();
        txIdade = new javax.swing.JTextField();
        txFornecedor = new javax.swing.JTextField();
        jLabel29 = new javax.swing.JLabel();

        jRadioButton1.setText("jRadioButton1");

        jLabel15.setText("jLabel15");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Cadastro de Produtos", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP));

        jLabel1.setText("Código: ");

        txCodigoProduto.setEditable(false);

        jLabel2.setText("Nome: ");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel7.setText("DADOS PRODUTO: ");

        jLabel17.setText("Categoria:");

        btSalvarProduto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/imagens/ok-icon2.png"))); // NOI18N
        btSalvarProduto.setToolTipText("Salvar");
        btSalvarProduto.setBorderPainted(false);
        btSalvarProduto.setContentAreaFilled(false);
        btSalvarProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSalvarProdutoActionPerformed(evt);
            }
        });

        btLimparProduto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/imagens/minus-icon2.png"))); // NOI18N
        btLimparProduto.setToolTipText("Limpar");
        btLimparProduto.setBorderPainted(false);
        btLimparProduto.setContentAreaFilled(false);
        btLimparProduto.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btLimparProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btLimparProdutoActionPerformed(evt);
            }
        });

        jLabel23.setText("Quantidade:");

        jLabel25.setText("Descrição:");

        btSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/imagens/arrow-left-icon3.png"))); // NOI18N
        btSair.setToolTipText("Voltar a página anterior");
        btSair.setBorderPainted(false);
        btSair.setContentAreaFilled(false);
        btSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSairActionPerformed(evt);
            }
        });

        txDescricao.setColumns(20);
        txDescricao.setRows(5);
        jScrollPane1.setViewportView(txDescricao);

        cbCategoria.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cbCategoria.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbCategoriaItemStateChanged(evt);
            }
        });
        cbCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbCategoriaActionPerformed(evt);
            }
        });

        jLabel24.setText("Preço:");

        jLabel26.setText("Gênero do Game:");

        jLabel27.setText("Mídia:");

        jLabel28.setText("Classificação Etária:");

        txFornecedor.setEditable(false);

        jLabel29.setText("Fornecedor:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel29)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txFornecedor)
                        .addGap(123, 123, 123)
                        .addComponent(btSalvarProduto)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btLimparProduto))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel26)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txGenero, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel23)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel24)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txPreco, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txNomeProduto))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txCodigoProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btSair, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel25)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel17)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel28)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txIdade)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel27)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txMidia, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(txCodigoProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(btSair, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel7)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txNomeProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel25)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(cbCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel27)
                    .addComponent(txMidia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel28)
                    .addComponent(txIdade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel23)
                    .addComponent(txQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel24)
                    .addComponent(txPreco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel26)
                    .addComponent(txGenero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btSalvarProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btLimparProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel29)
                        .addComponent(txFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btLimparProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLimparProdutoActionPerformed
        txCodigoProduto.setText("");
        txNomeProduto.setText("");
        txDescricao.setText("");
        //categoria.
        txIdade.setText("");
        txMidia.setText("");
        txGenero.setText("");
        txQuantidade.setText("");
        txPreco.setText("");
    }//GEN-LAST:event_btLimparProdutoActionPerformed

    private void btSalvarProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSalvarProdutoActionPerformed
        Game g = new Game();
        Produto p = new Produto();


        TipoProduto tp = new TipoProduto();
        tp = (TipoProduto) cbCategoria.getSelectedItem();
        if (tp.getNome().equalsIgnoreCase("Games")) {
            g.setNome(txNomeProduto.getText());
            g.setDescricao(txDescricao.getText());
            g.setQuantidade(Integer.parseInt(txQuantidade.getText()));
            g.setPreco(Double.parseDouble(txPreco.getText()));
            g.setClassificacaoEtaria(Integer.parseInt(txIdade.getText()));
            g.setTipoMidia(txMidia.getText());
            g.setTipoGenero(txGenero.getText());
            if (!(txCodigoProduto.getText().equals("")) || (txCodigoProduto.getText().equals(null))) {
                g.setId_game(Integer.parseInt(txCodigoProduto.getText()));
            }
            GameController gc = new GameController();

            if (g.getId_game() == 0) {
                int id = gc.salvar(g);
                if (id > 0) {
                    modelogame.addRow(new Object[]{id, g.getNome(), g.getDescricao(), g.getPreco()});
                    JOptionPane.showMessageDialog(null, "Game cadastrado com sucesso!");
                }
            } else {
                int id = gc.salvar(g);
                if (id > 0) {
                    modelogame.removeRow(linhaSelecionada);
                    modelogame.addRow(new Object[]{id, g.getNome(), g.getDescricao(), g.getPreco()});
                    JOptionPane.showMessageDialog(null, "Game atualizado com sucesso!");
                }
            }

        } else {
            if (!(txCodigoProduto.getText().equals("")) || (txCodigoProduto.getText().equals(null))) {
                p.setId_produto(Integer.parseInt(txCodigoProduto.getText()));
            }
            p.setTipoProduto(tp);
            p.setNome(txNomeProduto.getText());
            p.setDescricao(txDescricao.getText());
            p.setQuantidade(Integer.parseInt(txQuantidade.getText()));
            p.setPreco(Double.parseDouble(txPreco.getText()));
            ProdutoController pc = new ProdutoController();

            if (p.getId_produto() == 0) {
                int id = pc.salvar(p);
                if (id > 0) {
                    modeloproduto.addRow(new Object[]{id, p.getNome(), p.getPreco()});
                    JOptionPane.showMessageDialog(null, "Produto cadastrado com sucesso!");
                }
            } else {
                int id = pc.salvar(p);
                if (id > 0) {
                    modeloproduto.removeRow(linhaSelecionada);
                    modeloproduto.addRow(new Object[]{id, p.getNome(), p.getPreco()});
                    JOptionPane.showMessageDialog(null, "Produto atualizado com sucesso!");
                }
            }
        }


        dispose();
    }//GEN-LAST:event_btSalvarProdutoActionPerformed

    private void btSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSairActionPerformed
        dispose();
    }//GEN-LAST:event_btSairActionPerformed

    private void cbCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbCategoriaActionPerformed
//        TipoProduto tpProdutoSelecionado = (TipoProduto)cbCategoria.getSelectedItem();
//        if (!(tpProdutoSelecionado.getNome()).equalsIgnoreCase("Games")){
//           txMidia.setEditable(false);
//        }
    }//GEN-LAST:event_cbCategoriaActionPerformed

    private void cbCategoriaItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbCategoriaItemStateChanged
        if (this.isVisible()) {
            TipoProduto tpProdutoSelecionado = (TipoProduto) cbCategoria.getSelectedItem();
            if (!(tpProdutoSelecionado.getNome()).equalsIgnoreCase("Games")) {
                txMidia.setEditable(false);
                txGenero.setEditable(false);
                txIdade.setEditable(false);
            } else if ((tpProdutoSelecionado.getNome()).equalsIgnoreCase("Games")) {
                txMidia.setEditable(true);
                txGenero.setEditable(true);
                txIdade.setEditable(true);
            }
        }
    }//GEN-LAST:event_cbCategoriaItemStateChanged
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btLimparProduto;
    private javax.swing.JButton btSair;
    private javax.swing.JButton btSalvarProduto;
    private javax.swing.JComboBox cbCategoria;
    private javax.swing.ButtonGroup grupoSexo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txCodigoProduto;
    private javax.swing.JTextArea txDescricao;
    private javax.swing.JTextField txFornecedor;
    private javax.swing.JTextField txGenero;
    private javax.swing.JTextField txIdade;
    private javax.swing.JTextField txMidia;
    private javax.swing.JTextField txNomeProduto;
    private javax.swing.JTextField txPreco;
    private javax.swing.JTextField txQuantidade;
    // End of variables declaration//GEN-END:variables

    private void carregarCombo() {
        //Declarar uma variável do tipo comboDefault para poder alterar os dados
        DefaultComboBoxModel comboModel = (DefaultComboBoxModel) cbCategoria.getModel();
        //remover todos os itens do combo
        comboModel.removeAllElements();
        //Buscar na base de dados os cursos cadastrados
        List<TipoProduto> tipoprodutos = new ArrayList<>();
        TipoProdutoController pc = new TipoProdutoController();
        tipoprodutos = pc.listarTodos();
        //Preencher o combo com os cursos que estão na lista
        for (int linha = 0; linha < tipoprodutos.size(); linha++) {
            TipoProduto tp = tipoprodutos.get(linha);
            comboModel.addElement(tp);
        }
    }
}