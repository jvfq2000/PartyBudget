/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gerenciar;

import base_dados.BaseDados;
import funcao.Mensagem;
import funcao.Validacoes;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ji
 */
public class InterFrameGerenciarFesta extends javax.swing.JInternalFrame {

    private DefaultTableModel dtmCategoria;
    private DefaultTableModel dtmProduto;
    private int posFesta;

    public InterFrameGerenciarFesta() {
        initComponents();

        dtmCategoria = (DefaultTableModel) tableCategoria.getModel();
        dtmProduto = (DefaultTableModel) tableProduto.getModel();

        for (int i = 0; i < BaseDados.listaFesta.size(); i++) {
            cbbFesta.addItem(BaseDados.listaFesta.get(i).getNome());
        }

        tableCategoria.setEnabled(false);
        btnSalvarAlterCat.setEnabled(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        painelDeAbas = new javax.swing.JTabbedPane();
        jPanel4 = new javax.swing.JPanel();
        btnSalvarAlterCat = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableCategoria = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        labelNomeFesta = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        labelNomeFesta2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btnSalvarAlterProd = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tableProduto = new javax.swing.JTable();
        cbbFesta = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);

        jPanel1.setBackground(new java.awt.Color(0, 51, 102));

        painelDeAbas.setBackground(new java.awt.Color(0, 51, 102));
        painelDeAbas.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                painelDeAbasComponentShown(evt);
            }
        });

        jPanel4.setBackground(new java.awt.Color(0, 51, 102));

        btnSalvarAlterCat.setText("Salvar Alterações");
        btnSalvarAlterCat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarAlterCatActionPerformed(evt);
            }
        });

        tableCategoria.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Nome", "Adicionar"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.Boolean.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tableCategoria);
        if (tableCategoria.getColumnModel().getColumnCount() > 0) {
            tableCategoria.getColumnModel().getColumn(0).setMaxWidth(60);
            tableCategoria.getColumnModel().getColumn(1).setMinWidth(120);
            tableCategoria.getColumnModel().getColumn(2).setMinWidth(80);
        }

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Adicione as categorias de produto mais convenientes");

        labelNomeFesta.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        labelNomeFesta.setForeground(new java.awt.Color(204, 204, 204));
        labelNomeFesta.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelNomeFesta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnSalvarAlterCat)))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelNomeFesta, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSalvarAlterCat)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(100, 100, 100))
        );

        painelDeAbas.addTab("Categorias", jPanel4);

        jPanel5.setBackground(new java.awt.Color(0, 51, 102));

        labelNomeFesta2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        labelNomeFesta2.setForeground(new java.awt.Color(204, 204, 204));
        labelNomeFesta2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Atualizar produtos de acordo com as categorias selecionadas:");

        btnSalvarAlterProd.setText("Salvar Alterações");
        btnSalvarAlterProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarAlterProdActionPerformed(evt);
            }
        });

        tableProduto.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Descrição", "Categoria", "Quantidade", "Valor Unitário", "Valor Total", "Remover"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Integer.class, java.lang.Object.class, java.lang.Object.class, java.lang.Boolean.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, true, true, true, false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tableProduto);
        if (tableProduto.getColumnModel().getColumnCount() > 0) {
            tableProduto.getColumnModel().getColumn(0).setMaxWidth(60);
            tableProduto.getColumnModel().getColumn(1).setMinWidth(120);
            tableProduto.getColumnModel().getColumn(2).setMinWidth(70);
            tableProduto.getColumnModel().getColumn(3).setMinWidth(80);
        }

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelNomeFesta2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane2)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                        .addComponent(btnSalvarAlterProd)))
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelNomeFesta2, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSalvarAlterProd))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(100, 100, 100))
        );

        painelDeAbas.addTab("Produtos", jPanel5);

        cbbFesta.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione" }));
        cbbFesta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbbFestaActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Escolha a Fresta:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cbbFesta, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(painelDeAbas)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbbFesta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addComponent(painelDeAbas, javax.swing.GroupLayout.DEFAULT_SIZE, 423, Short.MAX_VALUE))
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

    private void cbbFestaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbbFestaActionPerformed
        dtmCategoria.setNumRows(0);
        dtmProduto.setNumRows(0);

        if (cbbFesta.getSelectedIndex() == 0) {
            btnSalvarAlterCat.setEnabled(false);
            tableCategoria.setEnabled(false);
            labelNomeFesta.setText("");

            btnSalvarAlterProd.setEnabled(false);
            tableProduto.setEnabled(false);
            labelNomeFesta2.setText("");
        } else {
            btnSalvarAlterCat.setEnabled(true);
            tableCategoria.setEnabled(true);
            boolean catAdicionada;

            posFesta = cbbFesta.getSelectedIndex() - 1;
            labelNomeFesta.setText(BaseDados.listaFesta.get(posFesta).getNome());

            for (int i = 0; i < BaseDados.listaCat.size(); i++) {
                if (BaseDados.listaCat.get(i).getTipoCategoria().equals("PRODUTO")) {
                    catAdicionada = false;

                    for (int j = 0; j < BaseDados.listaFesta.get(posFesta).listaCatProduto.size(); j++) {
                        if (BaseDados.listaFesta.get(posFesta).listaCatProduto.get(j).getCODIGO()
                                == BaseDados.listaCat.get(i).getCODIGO()) {

                            catAdicionada = true;
                        }
                    }
                    dtmCategoria.addRow(new Object[]{
                        BaseDados.listaCat.get(i).getCODIGO(),
                        BaseDados.listaCat.get(i).getNome(),
                        catAdicionada
                    });
                }
            }

            for (int i = 0; i < BaseDados.listaFesta.get(posFesta).listaCatProduto.size(); i++) {
                for (int j = 0; j < BaseDados.listaFesta.get(posFesta).listaProduto.size(); j++) {
                    if (BaseDados.listaFesta.get(posFesta).listaCatProduto.get(i).getCODIGO()
                            == BaseDados.listaFesta.get(posFesta).listaProduto.get(j).getCodCategoria()) {

                        dtmCategoria.addRow(new Object[]{
                            BaseDados.listaFesta.get(posFesta).listaProduto.get(j).getCODIGO(),
                            BaseDados.listaFesta.get(posFesta).listaProduto.get(j).getNome(),
                            BaseDados.listaFesta.get(posFesta).listaCatProduto.get(i).getNome(),
                            BaseDados.listaFesta.get(posFesta).listaProduto.get(j).getQuantidade(),
                            BaseDados.listaFesta.get(posFesta).listaProduto.get(j).getPrecoUnitario(),
                            BaseDados.listaFesta.get(posFesta).listaProduto.get(j).getQuantidade()
                            * BaseDados.listaFesta.get(posFesta).listaProduto.get(j).getPrecoUnitario(),
                            false
                        });
                    }
                }
            }
        }
    }//GEN-LAST:event_cbbFestaActionPerformed

    private void btnSalvarAlterCatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarAlterCatActionPerformed
        if (Mensagem.confirmarSalvarAlter() == JOptionPane.YES_OPTION) {
            int posFesta = cbbFesta.getSelectedIndex() - 1;
            int posCatProd;
            boolean achei;

            for (int i = 0; i < dtmCategoria.getRowCount(); i++) {
                achei = false;
                posCatProd = -1;
                int codCat = Integer.parseInt(dtmCategoria.getValueAt(i, 0).toString());

                if (BaseDados.listaFesta.get(posFesta).listaCatProduto.size() > 0) {
                    for (int j = 0; j < BaseDados.listaFesta.get(posFesta).listaCatProduto.size(); j++) {
                        if (BaseDados.listaFesta.get(posFesta).listaCatProduto.get(j).getCODIGO() == codCat) {
                            achei = true;
                            posCatProd = j;
                        }
                    }
                }

                if (achei && dtmCategoria.getValueAt(i, 2).equals(false)) {
                    for (int j = 0; j < BaseDados.listaFesta.get(posFesta).listaProduto.size(); j++) {
                        if (BaseDados.listaFesta.get(posFesta).listaCatProduto.get(posCatProd).getCODIGO()
                                == BaseDados.listaFesta.get(posFesta).listaProduto.get(j).getCodCategoria()) {

                            BaseDados.listaFesta.get(posFesta).listaProduto.remove(j);
                        }
                    }
                    BaseDados.listaFesta.get(posFesta).listaCatProduto.remove(posCatProd);
                    
                } else if (!achei && dtmCategoria.getValueAt(i, 2).equals(true)) {
                    int posCatBusca = Validacoes.buscaCategoria(codCat);
                    BaseDados.listaFesta.get(posFesta).listaCatProduto.add(BaseDados.listaCat.get(posCatBusca));
                    
                    for (int j = 0; j < BaseDados.listaFesta.get(posFesta).listaProduto.size(); j++) {
                        if (BaseDados.listaFesta.get(posFesta).listaCatProduto.get(posCatBusca).getCODIGO()
                                == BaseDados.listaProduto.get(j).getCodCategoria()) {

                            BaseDados.listaFesta.get(posFesta).listaProduto.add(BaseDados.listaProduto.get(j));
                        }
                    }
                }
            }
            cbbFestaActionPerformed(evt);
            Mensagem.sucessoSalvarAlter();
        }
    }//GEN-LAST:event_btnSalvarAlterCatActionPerformed

    private void painelDeAbasComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_painelDeAbasComponentShown

    }//GEN-LAST:event_painelDeAbasComponentShown

    private void btnSalvarAlterProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarAlterProdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSalvarAlterProdActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSalvarAlterCat;
    private javax.swing.JButton btnSalvarAlterProd;
    private javax.swing.JComboBox<String> cbbFesta;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel labelNomeFesta;
    private javax.swing.JLabel labelNomeFesta2;
    private javax.swing.JTabbedPane painelDeAbas;
    private javax.swing.JTable tableCategoria;
    private javax.swing.JTable tableProduto;
    // End of variables declaration//GEN-END:variables
}
