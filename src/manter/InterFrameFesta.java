/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manter;

import base_dados.BaseDados;
import com.toedter.calendar.JTextFieldDateEditor;
import funcao.ApenasLetrasMaiusculas;
import funcao.Mensagem;
import funcao.Validacoes;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo.Festa;

/**
 *
 * @author ji
 */
public class InterFrameFesta extends javax.swing.JInternalFrame {

    private SimpleDateFormat formatoData = new SimpleDateFormat("dd/MM/yyyy");
    private SimpleDateFormat formatoHora = new SimpleDateFormat("HH:mm");
    private DefaultTableModel dtm;
    private int[] listaCodCat;

    public InterFrameFesta() {
        initComponents();

        txtNomeFesta.setDocument(new ApenasLetrasMaiusculas());
        txtLocal.setDocument(new ApenasLetrasMaiusculas());
        txtDescricao.setDocument(new ApenasLetrasMaiusculas());
        ((JTextFieldDateEditor) dcDataInicial.getDateEditor()).setEditable(false);
        ((JTextFieldDateEditor) dcDataFinal.getDateEditor()).setEditable(false);
        cbbCategoria.addItem("SELECIONE");

        camposInicio();
        dtm = (DefaultTableModel) tableFesta.getModel();

        if (BaseDados.listaCat.size() > 0) {
            for (int i = 0; i < BaseDados.listaCat.size(); i++) {
                if (BaseDados.listaCat.get(i).getTipoCategoria().equals("FESTA")) {
                    cbbCategoria.addItem(BaseDados.listaCat.get(i).getNome());
                }
            }
        }

        if (BaseDados.listaFesta.size() > 0) {
            for (int i = 0; i < BaseDados.listaFesta.size(); i++) {
                int posCat = Validacoes.buscaCategoria(BaseDados.listaFesta.get(i).getCodCategoria());
                dtm.addRow(new Object[]{
                    BaseDados.listaFesta.get(i).getCODIGO(),
                    BaseDados.listaFesta.get(i).getNome(),
                    BaseDados.listaCat.get(posCat).getNome(),
                    BaseDados.listaFesta.get(i).getLocal(),
                    BaseDados.listaFesta.get(i).getDataInicial(),
                    BaseDados.listaFesta.get(i).getDataFinal(),
                    BaseDados.listaFesta.get(i).getHoraInicial(),
                    BaseDados.listaFesta.get(i).getHoraFinal(),
                    BaseDados.listaFesta.get(i).getDescricao()
                });
            }
        }
    }

    private void camposInicio() {
        txtNomeFesta.setText("");
        txtLocal.setText("");
        txtDescricao.setText("");
        dcDataFinal.setDate(new Date());
        dcDataInicial.setDate(new Date());
        formatHoraFim.setText(null);
        formatHoraInicio.setText(null);
        cbbCategoria.setSelectedIndex(0);
        btnCadastrar.setText("Cadastrar");
        txtNomeFesta.setEnabled(false);
        txtDescricao.setEnabled(false);
        txtLocal.setEnabled(false);
        cbbCategoria.setEnabled(false);
        dcDataFinal.setEnabled(false);
        dcDataInicial.setEnabled(false);
        formatHoraFim.setEnabled(false);
        formatHoraInicio.setEnabled(false);
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
        txtNomeFesta = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        cbbCategoria = new javax.swing.JComboBox<>();
        txtLocal = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        formatHoraFim = new javax.swing.JFormattedTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        formatHoraInicio = new javax.swing.JFormattedTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtDescricao = new javax.swing.JTextArea();
        jLabel3 = new javax.swing.JLabel();
        dcDataInicial = new com.toedter.calendar.JDateChooser();
        dcDataFinal = new com.toedter.calendar.JDateChooser();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableFesta = new javax.swing.JTable();

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
                    .addComponent(btnLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 130, Short.MAX_VALUE))
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
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "[Informações da Festa]", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 12), new java.awt.Color(204, 204, 204))); // NOI18N

        jLabel1.setForeground(new java.awt.Color(204, 204, 204));
        jLabel1.setText("*Nome:");

        jLabel2.setForeground(new java.awt.Color(204, 204, 204));
        jLabel2.setText("*Categoria:");

        jLabel4.setForeground(new java.awt.Color(204, 204, 204));
        jLabel4.setText("*Local / Endereço:");

        jLabel5.setForeground(new java.awt.Color(204, 204, 204));
        jLabel5.setText("*Data Inicial:");

        jLabel6.setForeground(new java.awt.Color(204, 204, 204));
        jLabel6.setText("*Data Final:");

        try {
            formatHoraFim.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##:##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jLabel7.setForeground(new java.awt.Color(204, 204, 204));
        jLabel7.setText("*Horário Inicial:");

        jLabel8.setForeground(new java.awt.Color(204, 204, 204));
        jLabel8.setText("*Horário Final:");

        try {
            formatHoraInicio.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##:##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        txtDescricao.setColumns(20);
        txtDescricao.setRows(5);
        jScrollPane2.setViewportView(txtDescricao);

        jLabel3.setForeground(new java.awt.Color(204, 204, 204));
        jLabel3.setText("Descrição:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(401, 401, 401))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(txtLocal)
                        .addComponent(jScrollPane2)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel6)
                                .addComponent(jLabel5))
                            .addGap(1, 1, 1)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(dcDataInicial, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(dcDataFinal, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 91, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel7)
                                .addComponent(jLabel8))
                            .addGap(1, 1, 1)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(formatHoraInicio)
                                .addComponent(formatHoraFim, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel4)
                            .addGap(0, 0, Short.MAX_VALUE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel1)
                                    .addGap(0, 0, Short.MAX_VALUE))
                                .addComponent(txtNomeFesta))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel2)
                                .addComponent(cbbCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(57, 57, 57))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNomeFesta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbbCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtLocal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(formatHoraInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(formatHoraFim, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel3))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5)
                            .addComponent(dcDataInicial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(dcDataFinal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        tableFesta.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Cód", "Nome", "Categoria", "Local", "Data Inicial", "Data Final", "Hora Ini", "Hora Fin", "Descrição"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tableFesta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                tableFestaMouseReleased(evt);
            }
        });
        jScrollPane1.setViewportView(tableFesta);
        if (tableFesta.getColumnModel().getColumnCount() > 0) {
            tableFesta.getColumnModel().getColumn(0).setMinWidth(35);
            tableFesta.getColumnModel().getColumn(0).setMaxWidth(35);
            tableFesta.getColumnModel().getColumn(1).setMinWidth(100);
            tableFesta.getColumnModel().getColumn(1).setMaxWidth(120);
            tableFesta.getColumnModel().getColumn(2).setMinWidth(100);
            tableFesta.getColumnModel().getColumn(2).setMaxWidth(100);
            tableFesta.getColumnModel().getColumn(3).setMinWidth(100);
            tableFesta.getColumnModel().getColumn(3).setMaxWidth(120);
            tableFesta.getColumnModel().getColumn(4).setMinWidth(85);
            tableFesta.getColumnModel().getColumn(4).setMaxWidth(85);
            tableFesta.getColumnModel().getColumn(5).setMinWidth(90);
            tableFesta.getColumnModel().getColumn(5).setMaxWidth(90);
            tableFesta.getColumnModel().getColumn(6).setMinWidth(60);
            tableFesta.getColumnModel().getColumn(6).setMaxWidth(60);
            tableFesta.getColumnModel().getColumn(7).setMinWidth(62);
            tableFesta.getColumnModel().getColumn(7).setMaxWidth(62);
            tableFesta.getColumnModel().getColumn(8).setMinWidth(100);
            tableFesta.getColumnModel().getColumn(8).setMaxWidth(120);
        }

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(jScrollPane1)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 242, Short.MAX_VALUE))
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
        txtNomeFesta.setEnabled(true);
        txtDescricao.setEnabled(true);
        txtLocal.setEnabled(true);
        cbbCategoria.setEnabled(true);
        dcDataFinal.setEnabled(true);
        dcDataInicial.setEnabled(true);
        formatHoraFim.setEnabled(true);
        formatHoraInicio.setEnabled(true);
        btnCadastrar.setEnabled(true);
        btnAlterar.setEnabled(false);
        btnExcluir.setEnabled(false);
        btnNovo.setEnabled(false);
        btnVoltar.setEnabled(true);
        btnLimpar.setEnabled(true);
    }//GEN-LAST:event_btnNovoActionPerformed

    private void btnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarActionPerformed
        Festa novaFesta = new Festa();

        if (txtNomeFesta.getText().equals("") || cbbCategoria.getSelectedIndex() == 0
                || txtLocal.getText().equals("") || String.valueOf(dcDataFinal.getDate()).equals("")
                || String.valueOf(dcDataInicial.getDate()).equals("")) {

            Mensagem.camposObrigatorios();

        } else {
            Calendar dtIni = new GregorianCalendar();
            Calendar dtFim = new GregorianCalendar();
            dtIni.setTimeInMillis(0);
            dtFim.setTimeInMillis(0);
            dtIni.setTime(dcDataInicial.getDate());
            dtFim.setTime(dcDataFinal.getDate());

            if (dtFim.getTimeInMillis() < dtIni.getTimeInMillis()) {
                Mensagem.personalizada("A 'Data Final' não pode ser menor que a 'Data Inicial'!\n"
                        + "Tesete: " + dtFim.getTimeInMillis() + " < " + dtIni.getTimeInMillis());

            } else if (!Validacoes.validaDataOuHora(formatHoraInicio.getText(), "HH:mm")) {
                Mensagem.personalizada("Horáio inicial inválido!");

            } else if (!Validacoes.validaDataOuHora(formatHoraFim.getText(), "HH:mm")) {
                Mensagem.personalizada("Horáio final inválido!");

            } else {
                Calendar hrIni = new GregorianCalendar();
                Calendar hrFim = new GregorianCalendar();
                try {
                    hrIni.setTimeInMillis(0);
                    hrFim.setTimeInMillis(0);
                    hrIni.setTime(formatoHora.parse(formatHoraInicio.getText()));
                    hrFim.setTime(formatoHora.parse(formatHoraFim.getText()));

                    if (hrFim.getTimeInMillis() < hrIni.getTimeInMillis()) {
                        Mensagem.personalizada("O Horário Final deve ser maior ou igual ao Horário Inicial!"
                                + "Tesete: " + hrFim.getTimeInMillis() + " < " + hrIni.getTimeInMillis());

                    } else if (btnCadastrar.getText().equals("Cadastrar")) {
                        novaFesta.cadastrarOuAlterar(
                                txtNomeFesta.getText(),
                                formatoData.format(dcDataInicial.getDate()),
                                formatoData.format(dcDataFinal.getDate()),
                                formatHoraInicio.getText(),
                                formatHoraFim.getText(),
                                txtLocal.getText(),
                                txtDescricao.getText(),
                                listaCodCat[cbbCategoria.getSelectedIndex() - 1]
                        );

                        BaseDados.listaFesta.add(novaFesta);
                        int ultPos = BaseDados.listaFesta.size() - 1;
                        int posCat = Validacoes.buscaCategoria(BaseDados.listaFesta.get(ultPos).getCodCategoria());

                        dtm.addRow(new Object[]{
                            BaseDados.listaFesta.get(ultPos).getCODIGO(),
                            BaseDados.listaFesta.get(ultPos).getNome(),
                            BaseDados.listaCat.get(posCat).getNome(),
                            BaseDados.listaFesta.get(ultPos).getLocal(),
                            BaseDados.listaFesta.get(ultPos).getDataInicial(),
                            BaseDados.listaFesta.get(ultPos).getDataFinal(),
                            BaseDados.listaFesta.get(ultPos).getHoraInicial(),
                            BaseDados.listaFesta.get(ultPos).getHoraFinal(),
                            BaseDados.listaFesta.get(ultPos).getDescricao()
                        });

                        camposInicio();
                        Mensagem.sucessoCadastro();

                    } else {
                        int posFesta = tableFesta.getSelectedRow();
                        int posCat = Validacoes.buscaCategoria(BaseDados.listaFesta.get(posFesta).getCodCategoria());

                        BaseDados.listaFesta.get(posFesta).cadastrarOuAlterar(
                                txtNomeFesta.getText(),
                                formatoData.format(dcDataInicial.getDate()),
                                formatoData.format(dcDataFinal.getDate()),
                                formatHoraInicio.getText(),
                                formatHoraFim.getText(),
                                txtLocal.getText(),
                                txtDescricao.getText(),
                                listaCodCat[cbbCategoria.getSelectedIndex() - 1]
                        );

                        dtm.setValueAt(BaseDados.listaFesta.get(posFesta).getCODIGO(), posFesta, 0);
                        dtm.setValueAt(BaseDados.listaFesta.get(posFesta).getNome(), posFesta, 1);
                        dtm.setValueAt(BaseDados.listaCat.get(posCat).getNome(), posFesta, 2);
                        dtm.setValueAt(BaseDados.listaFesta.get(posFesta).getLocal(), posFesta, 3);
                        dtm.setValueAt(BaseDados.listaFesta.get(posFesta).getDataInicial(), posFesta, 4);
                        dtm.setValueAt(BaseDados.listaFesta.get(posFesta).getDataFinal(), posFesta, 5);
                        dtm.setValueAt(BaseDados.listaFesta.get(posFesta).getHoraInicial(), posFesta, 6);
                        dtm.setValueAt(BaseDados.listaFesta.get(posFesta).getHoraFinal(), posFesta, 7);
                        dtm.setValueAt(BaseDados.listaFesta.get(posFesta).getDescricao(), posFesta, 8);

                        btnCadastrar.setText("Cadastrar");
                        camposInicio();
                        Mensagem.sucessoAlteracao();
                    }

                } catch (ParseException ex) {
                    Mensagem.personalizada("Horário Inválido!");
                }
            }
        }
    }//GEN-LAST:event_btnCadastrarActionPerformed

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
        camposInicio();
    }//GEN-LAST:event_btnVoltarActionPerformed

    private void tableFestaMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableFestaMouseReleased
        if (tableFesta.getSelectedRow() != -1) {
            txtNomeFesta.setText(tableFesta.getValueAt(tableFesta.getSelectedRow(), 1).toString());
            cbbCategoria.setSelectedItem(tableFesta.getValueAt(tableFesta.getSelectedRow(), 2).toString());
            txtLocal.setText(tableFesta.getValueAt(tableFesta.getSelectedRow(), 3).toString());
            try {
                dcDataInicial.setDate(formatoData.parse(tableFesta.getValueAt(tableFesta.getSelectedRow(), 4).toString()));
                dcDataFinal.setDate(formatoData.parse(tableFesta.getValueAt(tableFesta.getSelectedRow(), 5).toString()));
            } catch (ParseException ex) {
                Mensagem.personalizada("Erro ao trazer a data da tabela para o campo");
            }
            formatHoraInicio.setText(tableFesta.getValueAt(tableFesta.getSelectedRow(), 6).toString());
            formatHoraFim.setText(tableFesta.getValueAt(tableFesta.getSelectedRow(), 7).toString());
            txtDescricao.setText(tableFesta.getValueAt(tableFesta.getSelectedRow(), 8).toString());

            txtNomeFesta.setEnabled(false);
            txtDescricao.setEnabled(false);
            txtLocal.setEnabled(false);
            cbbCategoria.setEnabled(false);
            dcDataFinal.setEnabled(false);
            dcDataInicial.setEnabled(false);
            formatHoraFim.setEnabled(false);
            formatHoraInicio.setEnabled(false);
            btnCadastrar.setEnabled(false);
            btnAlterar.setEnabled(true);
            btnExcluir.setEnabled(true);
            btnNovo.setEnabled(false);
            btnVoltar.setEnabled(true);
            btnLimpar.setEnabled(false);
        }
    }//GEN-LAST:event_tableFestaMouseReleased

    private void btnAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarActionPerformed
        btnNovoActionPerformed(evt);
        btnCadastrar.setText("Salvar");
    }//GEN-LAST:event_btnAlterarActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        if (Mensagem.confirmarExclusao() == JOptionPane.YES_OPTION) {
            int posFesta = tableFesta.getSelectedRow();

            BaseDados.listaFesta.remove(posFesta);
            dtm.removeRow(posFesta);

            camposInicio();
            Mensagem.sucessoExclusao();
        }
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void btnLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparActionPerformed
        txtNomeFesta.setText("");
        txtLocal.setText("");
        txtDescricao.setText("");
        dcDataFinal.setDate(new Date());
        dcDataInicial.setDate(new Date());
        formatHoraFim.setText(null);
        formatHoraInicio.setText(null);
        cbbCategoria.setSelectedIndex(0);
    }//GEN-LAST:event_btnLimparActionPerformed

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        if (cbbCategoria.getItemCount() == 1) {
            Mensagem.personalizada("Para cadastrar uma festa é necessário cadastrar pelo menos uma categoria do tipo festa.\n"
                    + "Vá ao menu de categorias para realizar essa ação!");
            btnNovo.setEnabled(false);
            btnLimpar.setEnabled(false);
        } else {
            int cont = -1;
            listaCodCat = new int[cbbCategoria.getItemCount() - 1];
            for (int i = 0; i < BaseDados.listaCat.size(); i++) {
                if (BaseDados.listaCat.get(i).getTipoCategoria().equals("FESTA")) {
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
    private com.toedter.calendar.JDateChooser dcDataFinal;
    private com.toedter.calendar.JDateChooser dcDataInicial;
    private javax.swing.JFormattedTextField formatHoraFim;
    private javax.swing.JFormattedTextField formatHoraInicio;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tableFesta;
    private javax.swing.JTextArea txtDescricao;
    private javax.swing.JTextField txtLocal;
    private javax.swing.JTextField txtNomeFesta;
    // End of variables declaration//GEN-END:variables
}
