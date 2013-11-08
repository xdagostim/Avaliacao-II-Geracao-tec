package br.com.view;

import br.com.controller.FuncionarioController;
import br.com.model.Funcionario;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author guest01
 */
public class ProdutoInserirGUI extends javax.swing.JFrame {

    private DefaultTableModel modelo;
    private int linhaSelecionada;

    public ProdutoInserirGUI(DefaultTableModel modelo) {
        initComponents();
        this.modelo = modelo;
    }

    public ProdutoInserirGUI(DefaultTableModel modelo, int linhaSelecionada, int idFuncionario) {

        this.modelo = modelo;
        this.linhaSelecionada = linhaSelecionada;
        initComponents();
        FuncionarioController uc = new FuncionarioController();
        Funcionario f = uc.listById(idFuncionario);
        txCodigoProduto.setText(Integer.toString(f.getId_funcionario()));
        txNomeProduto.setText(f.getNome());
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        String data = sdf.format(f.getDataNascimento());
        txDataNascimento.setText(data);
        txRg.setText(f.getRg());
        txCpf.setText(f.getCpf());
        txTelefone.setText(f.getTelefone());
        txRua.setText(f.getRua());
        txNumero.setText(Integer.toString(f.getNumero()));
        txComplemento.setText(f.getComplemento());
        txBairro.setText(f.getBairro());
        txCidade.setText(f.getCidade());
        txEstado.setText(f.getEstado());
        txCep.setText(f.getCep());
        txCargo.setText(f.getCargo());
        txCargaHoraria.setText(Double.toString(f.getCargaHoraria()));
        txSalario.setText(Double.toString(f.getSalario()));
        txFornecedor.setText(f.getCtps());
        SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy");
        String data2 = sdf2.format(f.getDataAdmissao());
        txDataAdmissao.setText(data2);
        if (f.getSexo().equals("Feminino")) {
            rbFeminino.setSelected(true);
        } else if (f.getSexo().equals("Masculino")) {
            rbMasculino.setSelected(true);
        }
        txQuantidade.setText(f.getLogin());
        txSenha.setText(f.getSenha());
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
        jLabel20 = new javax.swing.JLabel();
        btSalvarProduto = new javax.swing.JButton();
        btLimparProduto = new javax.swing.JButton();
        jLabel23 = new javax.swing.JLabel();
        txQuantidade = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        btSair = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txDescricao = new javax.swing.JTextArea();
        jComboBox1 = new javax.swing.JComboBox();
        jLabel24 = new javax.swing.JLabel();
        txPreco = new javax.swing.JTextField();
        jLabel26 = new javax.swing.JLabel();
        txGenero = new javax.swing.JTextField();
        jLabel27 = new javax.swing.JLabel();
        txMidia = new javax.swing.JTextField();
        jLabel28 = new javax.swing.JLabel();
        txIdade = new javax.swing.JTextField();
        txFornecedor = new javax.swing.JTextField();

        jRadioButton1.setText("jRadioButton1");

        jLabel15.setText("jLabel15");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Cadastro de Produtos", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP));

        jLabel1.setText("Código: ");

        txCodigoProduto.setEditable(false);

        jLabel2.setText("Nome: ");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel7.setText("DADOS PRODUTO: ");

        jLabel17.setText("Categoria:");

        jLabel20.setText("Fornecedor:");

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

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel24.setText("Preço:");

        jLabel26.setText("Gênero do Game:");

        jLabel27.setText("Mídia:");

        jLabel28.setText("Classificação Etária:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
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
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel25)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane1))
                            .addComponent(jLabel7)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txCodigoProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btSair, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txNomeProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 625, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel17)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel28)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txIdade)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel27)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txMidia, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel20)
                        .addGap(18, 18, 18)
                        .addComponent(txFornecedor)
                        .addGap(18, 18, 18)
                        .addComponent(btSalvarProduto)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btLimparProduto)))
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
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel20)
                        .addComponent(txFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btSalvarProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btLimparProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
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
        txDataNascimento.setText("");
        txRg.setText("");
        txCpf.setText("");
        txTelefone.setText("");
        txRua.setText("");
        txNumero.setText("");
        txComplemento.setText("");
        txBairro.setText("");
        txCidade.setText("");
        txEstado.setText("");
        txCep.setText("");
        txCargo.setText("");
        txCargaHoraria.setText("");
        txSalario.setText("");
        txFornecedor.setText("");
        txDataAdmissao.setText("");
        grupoSexo.clearSelection();
        txQuantidade.setText("");
        txSenha.setText("");
    }//GEN-LAST:event_btLimparProdutoActionPerformed

    private void btSalvarProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSalvarProdutoActionPerformed
        Funcionario f = new Funcionario();

        if (!(txCodigoProduto.getText().equals("")) || (txCodigoProduto.getText().equals(null))) {
            f.setId_funcionario(Integer.parseInt(txCodigoProduto.getText()));
        }
        f.setNome(txNomeProduto.getText());
        try {
            String data = txDataNascimento.getText();
            f.setDataNascimento(new SimpleDateFormat("dd/MM/yyyy").parse(data));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro na conversão da data: " + e);
        }
        f.setRg(txRg.getText());
        f.setCpf(txCpf.getText());
        f.setTelefone(txTelefone.getText());
        f.setRua(txRua.getText());
        f.setNumero(Integer.parseInt(txNumero.getText()));
        f.setComplemento(txComplemento.getText());
        f.setBairro(txBairro.getText());
        f.setCidade(txCidade.getText());
        f.setEstado(txEstado.getText());
        f.setCep(txCep.getText());
        f.setCargo(txCargo.getText());
        f.setCargaHoraria(Double.parseDouble(txCargaHoraria.getText()));
        f.setSalario(Double.parseDouble(txSalario.getText()));
        f.setCtps(txFornecedor.getText());
        try {
            String data = txDataAdmissao.getText();
            f.setDataAdmissao(new SimpleDateFormat("dd/MM/yyyy").parse(data));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro na conversão da data: " + e);
        }
        if (rbFeminino.isSelected()) {
            f.setSexo("Feminino");
        } else if (rbMasculino.isSelected()) {
            f.setSexo("Masculino");
        }
        f.setLogin(txQuantidade.getText());
        f.setSenha(txSenha.getText());

        FuncionarioController fc = new FuncionarioController();


        if (f.getId_funcionario() == 0) {
            int id = fc.salvar(f);
            if (id > 0) {
                modelo.addRow(new Object[]{id, f.getNome(), f.getSalario(), f.getLogin()});
                JOptionPane.showMessageDialog(null, "Funcionário cadastrado com sucesso!");
            }
        } else {
            int id = fc.salvar(f);
            if (id > 0) {
                modelo.removeRow(linhaSelecionada);
                modelo.addRow(new Object[]{id, f.getNome(), f.getSalario(), f.getLogin()});
                JOptionPane.showMessageDialog(null, "Usuário atualizado com sucesso!");
            }
        }
        dispose();
    }//GEN-LAST:event_btSalvarProdutoActionPerformed

    private void btSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSairActionPerformed
        dispose();
    }//GEN-LAST:event_btSairActionPerformed
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btLimparProduto;
    private javax.swing.JButton btSair;
    private javax.swing.JButton btSalvarProduto;
    private javax.swing.ButtonGroup grupoSexo;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
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
}