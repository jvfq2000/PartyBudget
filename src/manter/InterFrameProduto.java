/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manter;

import base_dados.BaseDados;
import funcao.ApenasLetrasMaiusculas;
import funcao.Mensagem;
import funcao.Validacoes;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo.Produto;

/**
 *
 * @author ji
 */
public class InterFrameProduto extends javax.swing.JInternalFrame {

    private DefaultTableModel dtm;
    private int[] listaCodCat;

    public InterFrameProduto() {
        initComponents();

        txtDescricaoProduto.setDocument(new ApenasLetrasMaiusculas());
        cbbCategoria.addItem("SELECIONE");

        camposInicio();
        dtm = (DefaultTableModel) tableProduto.getModel();

        if (BaseDados.listaCat.size() > 0) {
            for (int i = 0; i < BaseDados.listaCat.size(); i++) {
                if (BaseDados.listaCat.get(i).getTipoCategoria().equals("PRODUTO")) {
                    cbbCategoria.addItem(BaseDados.listaCat.get(i).getNome());
                }
            }
        }

        if (BaseDados.listaProduto.size() > 0) {
            for (int i = 0; i < BaseDados.listaProduto.size(); i++) {
                int posCat = Validacoes.buscaCategoria(BaseDados.listaProduto.get(i).getCodCategoria());
                dtm.addRow(new Object[]{
                    BaseDados.listaProduto.get(i).getCODIGO(),
                    BaseDados.listaProduto.get(i).getNome(),
                    BaseDados.listaCat.get(posCat).getNome(),
                    BaseDados.listaProduto.get(i).getQuantidade(),
                    BaseDados.listaProduto.get(i).getPrecoUnitario()
                });
            }
        }
    }

    private void camposInicio() {
        txtDescricaoProduto.setText("");
        countQuantidade.setValue(0);
        countPrecoUnitario.setValue(0);
        cbbCategoria.setSelectedIndex(0);
        btnCadastrar.setText("Cadastrar");
        txtDescricaoProduto.setEnabled(false);
        countQuantidade.setEnabled(false);
        countPrecoUnitario.setEnabled(false);
        cbbCategoria.setEnabled(false);
        btnCadastrar.setEnabled(false);
        btnAlterar.setEnabled(false);
        btnExcluir.setEnabled(false);
        btnNovo.setEnabled(true);
        btnVoltar.setEnabled(false);
        btnLimpar.setEnabled(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        btnNovo = new javax.swing.JButton();
        btnCadastrar = new javax.swing.JButton();
        btnAlterar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        btnVoltar = new javax.swing.JButton();
        btnLimpar = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        txtDescricaoProduto = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        cbbCategoria = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        countPrecoUnitario = new javax.swing.JSpinner();
        countQuantidade = new javax.swing.JSpinner();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableProduto = new javax.swing.JTable();

        setClosable(true);
        setIconifiable(true);
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });

        jPanel3.setBackground(new java.awt.Color(0, 51, 102));

        jPanel2.setBackground(new java.awt.Color(0, 51, 102));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "[Menu]", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 12), new java.awt.Color(204, 204, 204))); // NOI18N

        btnNovo.setText("Novo");
        btnNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovoActionPerformed(evt);
            }
        });

        btnCadastrar.setText("Cadastrar");
        btnCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarActionPerformed(evt);
            }
        });

        btnAlterar.setText("Alterar");
        btnAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarActionPerformed(evt);
            }
        });

        btnExcluir.setText("Excluir");
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });

        btnVoltar.setText("Voltar");
        btnVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarActionPerformed(evt);
            }
        });

        btnLimpar.setText("Limpar Campos");
        btnLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnNovo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnCadastrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnAlterar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnExcluir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnVoltar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnLimpar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(btnNovo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCadastrar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnAlterar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnExcluir)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnVoltar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnLimpar)
                .addContainerGap())
        );

        jPanel1.setBackground(new java.awt.Color(0, 51, 102));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "[Informações da Produto]", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 12), new java.awt.Color(204, 204, 204))); // NOI18N

        jLabel1.setForeground(new java.awt.Color(204, 204, 204));
        jLabel1.setText("*Descrição:");

        jLabel2.setForeground(new java.awt.Color(204, 204, 204));
        jLabel2.setText("*Categoria:");

        jLabel5.setForeground(new java.awt.Color(204, 204, 204));
        jLabel5.setText("*Quantidade:");

        jLabel6.setForeground(new java.awt.Color(204, 204, 204));
        jLabel6.setText("*Preço Unitário:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(txtDescricaoProduto, javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel2)
                                    .addGap(90, 90, 90)
                                    .addComponent(jLabel5))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(cbbCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(countQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(countPrecoUnitario, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(6, 6, 6)
                .addComponent(txtDescricaoProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbbCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(countPrecoUnitario, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(countQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(109, 109, 109))
        );

        tableProduto.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Descrição", "Categoria", "Quantidade", "Preço Unitário"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tableProduto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                tableProdutoMouseReleased(evt);
            }
        });
        jScrollPane1.setViewportView(tableProduto);
        if (tableProduto.getColumnModel().getColumnCount() > 0) {
            tableProduto.getColumnModel().getColumn(0).setMinWidth(50);
            tableProduto.getColumnModel().getColumn(0).setMaxWidth(50);
            tableProduto.getColumnModel().getColumn(1).setMinWidth(210);
            tableProduto.getColumnModel().getColumn(1).setMaxWidth(210);
            tableProduto.getColumnModel().getColumn(2).setMinWidth(180);
            tableProduto.getColumnModel().getColumn(2).setMaxWidth(180);
            tableProduto.getColumnModel().getColumn(3).setMinWidth(80);
            tableProduto.getColumnModel().getColumn(3).setMaxWidth(80);
            tableProduto.getColumnModel().getColumn(4).setMinWidth(100);
            tableProduto.getColumnModel().getColumn(4).setMaxWidth(100);
        }

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 622, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 226, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoActionPerformed
        txtDescricaoProduto.setEnabled(true);
        countQuantidade.setEnabled(true);
        countPrecoUnitario.setEnabled(true);
        cbbCategoria.setEnabled(true);
        btnCadastrar.setEnabled(true);
        btnAlterar.setEnabled(false);
        btnExcluir.setEnabled(false);
        btnNovo.setEnabled(false);
        btnVoltar.setEnabled(true);
        btnLimpar.setEnabled(true);
    }//GEN-LAST:event_btnNovoActionPerformed

    private void btnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarActionPerformed
        Produto novoProduto = new Produto();
        int qtd = 0;
        double preco = 0;

        try {
            qtd = Integer.parseInt(countQuantidade.getValue().toString());
            preco = Double.parseDouble(countPrecoUnitario.getValue().toString());
        } catch (Exception e) {
            qtd = -1;
            preco = -1;
        }

        if (txtDescricaoProduto.getText().equals("") || cbbCategoria.getSelectedIndex() == 0
                || countQuantidade.getValue().equals("") || countPrecoUnitario.getValue().equals("")) {

            Mensagem.camposObrigatorios();

        } else if (qtd == -1) {
            Mensagem.personalizada("Valor inválido para campo 'Quantidade'!");

        } else if (qtd == -1) {
            Mensagem.personalizada("Valor inválido para campo 'Preço Unitário!");

        } else if (btnCadastrar.getText().equals("Cadastrar")) {
            novoProduto.cadastrarOuAlterar(
                    txtDescricaoProduto.getText(),
                    qtd,
                    preco,
                    listaCodCat[cbbCategoria.getSelectedIndex() - 1]
            );

            BaseDados.listaProduto.add(novoProduto);
            int ultPos = BaseDados.listaProduto.size() - 1;
            int posCat = Validacoes.buscaCategoria(BaseDados.listaProduto.get(ultPos).getCodCategoria());

            dtm.addRow(new Object[]{
                BaseDados.listaProduto.get(ultPos).getCODIGO(),
                BaseDados.listaProduto.get(ultPos).getNome(),
                BaseDados.listaCat.get(posCat).getNome(),
                BaseDados.listaProduto.get(ultPos).getQuantidade(),
                BaseDados.listaProduto.get(ultPos).getPrecoUnitario()
            });

            camposInicio();
            Mensagem.sucessoCadastro();
        } else {
            int posProduto = tableProduto.getSelectedRow();
            int posCat = Validacoes.buscaCategoria(BaseDados.listaProduto.get(posProduto).getCodCategoria());

            BaseDados.listaProduto.get(posProduto).cadastrarOuAlterar(
                    txtDescricaoProduto.getText(),
                    qtd,
                    preco,
                    listaCodCat[cbbCategoria.getSelectedIndex() - 1]
            );
            dtm.setValueAt(BaseDados.listaProduto.get(posProduto).getCODIGO(), posProduto, 0);
            dtm.setValueAt(BaseDados.listaProduto.get(posProduto).getNome(), posProduto, 1);
            dtm.setValueAt(BaseDados.listaCat.get(posCat).getNome(), posProduto, 2);
            dtm.setValueAt(BaseDados.listaProduto.get(posProduto).getQuantidade(), posProduto, 3);
            dtm.setValueAt(BaseDados.listaProduto.get(posProduto).getPrecoUnitario(), posProduto, 4);

            btnCadastrar.setText("Cadastrar");
            camposInicio();
            Mensagem.sucessoAlteracao();
        }
    }//GEN-LAST:event_btnCadastrarActionPerformed

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
        camposInicio();
    }//GEN-LAST:event_btnVoltarActionPerformed

    private void tableProdutoMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableProdutoMouseReleased
        if (tableProduto.getSelectedRow() != -1) {
            txtDescricaoProduto.setText(tableProduto.getValueAt(tableProduto.getSelectedRow(), 1).toString());
            cbbCategoria.setSelectedItem(tableProduto.getValueAt(tableProduto.getSelectedRow(), 2).toString());
            countQuantidade.setValue(tableProduto.getValueAt(tableProduto.getSelectedRow(), 3));
            countPrecoUnitario.setValue(tableProduto.getValueAt(tableProduto.getSelectedRow(), 4));
            
            txtDescricaoProduto.setEnabled(false);
            countPrecoUnitario.setEnabled(false);
            countQuantidade.setEnabled(false);
            cbbCategoria.setEnabled(false);
            btnCadastrar.setEnabled(false);
            btnAlterar.setEnabled(true);
            btnExcluir.setEnabled(true);
            btnNovo.setEnabled(false);
            btnVoltar.setEnabled(true);
            btnLimpar.setEnabled(false);
        }
    }//GEN-LAST:event_tableProdutoMouseReleased

    private void btnAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarActionPerformed
        btnNovoActionPerformed(evt);
        btnCadastrar.setText("Salvar");
    }//GEN-LAST:event_btnAlterarActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        if (Mensagem.confirmarExclusao() == JOptionPane.YES_OPTION) {
            int posProduto = tableProduto.getSelectedRow();

            BaseDados.listaProduto.remove(posProduto);
            dtm.removeRow(posProduto);

            camposInicio();
            Mensagem.sucessoExclusao();
        }
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void btnLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparActionPerformed
        txtDescricaoProduto.setText("");
        countQuantidade.setValue(0);
        countPrecoUnitario.setValue(0);
        cbbCategoria.setSelectedIndex(0);
    }//GEN-LAST:event_btnLimparActionPerformed

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        if (cbbCategoria.getItemCount() == 1) {
            Mensagem.personalizada("Para cadastrar um produto é necessário cadastrar pelo monos uma categoria do tipo poduto.\n"
                    + "Vá ao menu de categorias para realizar essa ação!");
            btnNovo.setEnabled(false);
            btnLimpar.setEnabled(false);
        } else {
            int cont = -1;
            listaCodCat = new int[cbbCategoria.getItemCount() - 1];
            for (int i = 0; i < BaseDados.listaCat.size(); i++) {
                if (BaseDados.listaCat.get(i).getTipoCategoria().equals("PRODUTO")) {
                    cont++;
                    listaCodCat[cont] = BaseDados.listaCat.get(i).getCODIGO();
                }
            }
        }
    }//GEN-LAST:event_formComponentShown


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlterar;
    private javax.swing.JButton btnCadastrar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnLimpar;
    private javax.swing.JButton btnNovo;
    private javax.swing.JButton btnVoltar;
    private javax.swing.JComboBox<String> cbbCategoria;
    private javax.swing.JSpinner countPrecoUnitario;
    private javax.swing.JSpinner countQuantidade;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tableProduto;
    private javax.swing.JTextField txtDescricaoProduto;
    // End of variables declaration//GEN-END:variables
}
