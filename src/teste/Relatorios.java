package teste;

import BancoDeDados.ConexaoBD;
import BancoDeDados.ControleDeNotas;
import com.itextpdf.text.BadElementException;
import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.Font;
import com.itextpdf.text.Image;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import java.awt.Desktop;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.SQLException;
import java.text.DecimalFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

/**
 *
 * @author Danilo
 */
public class Relatorios extends javax.swing.JDialog {

    BancoDeDados.ConexaoBD conex = new ConexaoBD();
    ControleDeNotas notas = new ControleDeNotas();

    public Relatorios() throws SQLException {
        setModal(true);
        setResizable(false);
        initComponents();
        
        try {
            if (!conex.pesquisarComRetornoBoolean("select * from nota")) {
                jBMostrarMensagem.setVisible(true);
            }else{
                jBMostrarMensagem.setVisible(false);
            }
        } catch (SQLException ex) {
        
        }
        
        jComboBoxPercent.setVisible(false);
        jLPercent.setVisible(false);
        jCBSelecionar.setVisible(false);
        jLSelecionar.setVisible(false);
    }

    public void preencherSelecaoDoFiltro() {
        conex.conectar();
        conex.executarSql("SELECT DISTINCT turma FROM nota order by turma");
        try {
            conex.rs.first();
            do {
                jCBSelecionar.addItem(conex.rs.getString("turma"));
            } while (conex.rs.next());

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(rootPane, "Erro ao preencher com turma, jCBSelecionar! \nErro: " + ex);
        }
        conex.desconectar();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        txtCaminho = new javax.swing.JTextField();
        jBProcurar = new javax.swing.JButton();
        jBgerar = new javax.swing.JButton();
        jComboBoxFiltro = new javax.swing.JComboBox<>();
        jCBSelecionar = new javax.swing.JComboBox<>();
        txtNomeArquivo = new javax.swing.JTextField();
        jComboBoxModo = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLSelecionar = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jComboBoxPercent = new javax.swing.JComboBox<>();
        jLPercent = new javax.swing.JLabel();
        jBMostrarMensagem = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 102, 102));

        jBProcurar.setFont(new java.awt.Font("Lucida Fax", 1, 14)); // NOI18N
        jBProcurar.setText("Procurar");
        jBProcurar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBProcurarActionPerformed(evt);
            }
        });

        jBgerar.setFont(new java.awt.Font("Lucida Fax", 1, 14)); // NOI18N
        jBgerar.setText("Gerar Relatório");
        jBgerar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBgerarActionPerformed(evt);
            }
        });

        jComboBoxFiltro.setFont(new java.awt.Font("Lucida Fax", 0, 14)); // NOI18N
        jComboBoxFiltro.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECIONE", "POR CURSO", "POR SÉRIE", "POR TURMA", "DE TODOS OS ALUNOS" }));
        jComboBoxFiltro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxFiltroActionPerformed(evt);
            }
        });

        jCBSelecionar.setFont(new java.awt.Font("Lucida Fax", 0, 14)); // NOI18N
        jCBSelecionar.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECIONE" }));

        jComboBoxModo.setFont(new java.awt.Font("Lucida Fax", 0, 14)); // NOI18N
        jComboBoxModo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECIONE", "TOTAL APENAS", "TOTAL E PARCIAL" }));
        jComboBoxModo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxModoActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Algerian", 1, 48)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 0));
        jLabel6.setText("RELATÓRIOS");

        jLabel7.setFont(new java.awt.Font("Lucida Fax", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Mostrar Nota");

        jLSelecionar.setFont(new java.awt.Font("Lucida Fax", 1, 18)); // NOI18N
        jLSelecionar.setForeground(new java.awt.Color(255, 255, 255));
        jLSelecionar.setText("Selecione:");

        jLabel9.setFont(new java.awt.Font("Lucida Fax", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Gerar relátorio");

        jLabel10.setFont(new java.awt.Font("Lucida Fax", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Nome do Relatório:");

        jLabel11.setFont(new java.awt.Font("Lucida Fax", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Onde Deseja Salvar?");

        jComboBoxPercent.setFont(new java.awt.Font("Lucida Fax", 0, 14)); // NOI18N
        jComboBoxPercent.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECIONE", "SIM", "NÃO" }));

        jLPercent.setFont(new java.awt.Font("Lucida Fax", 1, 18)); // NOI18N
        jLPercent.setForeground(new java.awt.Color(255, 255, 255));
        jLPercent.setText("Verificar percentual de cada eixo?");

        jBMostrarMensagem.setFont(new java.awt.Font("Lucida Fax", 1, 14)); // NOI18N
        jBMostrarMensagem.setForeground(new java.awt.Color(204, 0, 0));
        jBMostrarMensagem.setText("MENSAGEM!");
        jBMostrarMensagem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBMostrarMensagemActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(206, 206, 206)
                .addComponent(jLabel6)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLPercent)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jComboBoxPercent, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel7)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jComboBoxModo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jBMostrarMensagem))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(jLabel10)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(txtNomeArquivo, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(jLabel11)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(txtCaminho, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(jLabel9)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(jComboBoxFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jBProcurar)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(jLSelecionar)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(jCBSelecionar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                        .addContainerGap(36, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jBgerar)
                        .addGap(295, 295, 295))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jComboBoxModo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBMostrarMensagem))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLPercent)
                    .addComponent(jComboBoxPercent, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jComboBoxFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLSelecionar)
                    .addComponent(jCBSelecionar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNomeArquivo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(txtCaminho, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBProcurar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 86, Short.MAX_VALUE)
                .addComponent(jBgerar, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jBProcurarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBProcurarActionPerformed
        JFileChooser local = new JFileChooser();
        local.setDialogTitle("Selecione a pasta");
        local.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);

        int opcao = local.showOpenDialog(this);
        if (opcao == JFileChooser.APPROVE_OPTION) {
            File file = new File("caminho");
            file = local.getSelectedFile();
            String caminho = file.getAbsolutePath();
            txtCaminho.setText(caminho);
        }
    }//GEN-LAST:event_jBProcurarActionPerformed

    private void jBgerarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBgerarActionPerformed
        double somaCN = 0, somaCH = 0, somaLI = 0, somaMA = 0, somaTot = 0;
        int nomeValido = 0;

        if (txtCaminho.getText().equals("") || txtNomeArquivo.getText().equals("")
                || jCBSelecionar.getSelectedItem().equals("SELECIONE") || jComboBoxFiltro.getSelectedItem().equals("SELECIONE")
                || jComboBoxModo.getSelectedItem().equals("SELECIONE")) {

            JOptionPane.showMessageDialog(rootPane, "Todos os campos são obrigatórios!");

        } else {
            File salvarEscolhido = new File(txtCaminho.getText() + "\\" + txtNomeArquivo.getText() + ".pdf");
            if (salvarEscolhido.exists() == true) {
                nomeValido = JOptionPane.showConfirmDialog(rootPane, "Arquivo já existente, deseja substituir?", "Substituir", JOptionPane.YES_NO_OPTION);
            }
            if (nomeValido == JOptionPane.YES_OPTION) {
                Document doc = new Document(PageSize.A4);

                String modo;
                if (jComboBoxModo.getSelectedItem().equals("TOTAL E PARCIAL")) {
                    modo = "COM NOTA PARCIAL E TOTAL";
                } else {
                    modo = "COM NOTA TOTAL";
                }

                try {
                    conex.conectar();

                    PdfWriter pdf = PdfWriter.getInstance(doc, new FileOutputStream(txtCaminho.getText() + "\\" + txtNomeArquivo.getText() + ".pdf"));
                    doc.open();

                    //Cabeçalho
                    //Font fci = new Font(Font.FontFamily.TIMES_ROMAN, 10, Font.BOLD, BaseColor.GREEN);
                    Font fonte = new Font(Font.FontFamily.TIMES_ROMAN, 12, Font.BOLD);
                    //Paragraph cabI = new Paragraph("\n INSTITUTO FEDERAL DO NORTE DE MINAS " , fc);

                    String filtro = "";
                    if (jComboBoxFiltro.getSelectedItem().toString().equals("DE TODOS OS ALUNOS")) {
                        filtro = "DE TODOS OS ALUNOS";
                    } else {
                        filtro = jComboBoxFiltro.getSelectedItem().toString() + ": " + jCBSelecionar.getSelectedItem().toString();
                    }
                    Paragraph cab = new Paragraph("\n RELATÓRIO " + modo + "\n " + filtro + "\n ", fonte);
                    cab.setAlignment(Element.ALIGN_CENTER);

                    //Imagem
                    Image imagem = null;
                    try {
                        imagem = Image.getInstance("images.jpg");
                    } catch (BadElementException | IOException ex) {
                        JOptionPane.showMessageDialog(rootPane, "erro: " + ex.getMessage());
                    }
                    imagem.scaleAbsolute(40, 55);

                    //Tabela do cabeçalho
                    PdfPTable tableCab = new PdfPTable(2);

                    tableCab.setWidths(new float[]{0.30f, 0.80f});
                    tableCab.setTotalWidth(550);
                    tableCab.setLockedWidth(true);
                    tableCab.getDefaultCell().setFixedHeight(70);
                    tableCab.getDefaultCell().setBorder(0);
                    tableCab.getDefaultCell().setPaddingRight(130);

                    tableCab.getDefaultCell().setHorizontalAlignment(Element.ALIGN_CENTER);
                    PdfPCell cellImagem = new PdfPCell(imagem);
                    cellImagem.setBorder(0);
                    tableCab.addCell(cellImagem);
                    tableCab.addCell(cab);
                    doc.add(tableCab);
                    //Fim do cabeçaclho
                    //------------------------------

                    //espaçamento
                    //------------------------------
                    PdfPTable table = null;
                    if (jComboBoxModo.getSelectedItem().equals("TOTAL E PARCIAL")) {
                        table = new PdfPTable(8);
                        table.setWidths(new int[]{60, 65, 45, 70, 70, 70, 70, 35});
                    } else {
                        table = new PdfPTable(4);
                        //tablesetWidths(new int[]{60, 45, 45, 40});
                    }

                    Font f = new Font(Font.FontFamily.TIMES_ROMAN, 7, Font.BOLD, BaseColor.WHITE);
                    Font f1 = new Font(Font.FontFamily.TIMES_ROMAN, 7);

                    PdfPCell nome = new PdfPCell(new Paragraph("NOME", f));
                    nome.setBackgroundColor(BaseColor.DARK_GRAY);
                    PdfPCell matricula = new PdfPCell(new Paragraph("MATRICULA", f));
                    matricula.setBackgroundColor(BaseColor.DARK_GRAY);
                    PdfPCell turma = new PdfPCell(new Paragraph("TURMA", f));
                    turma.setBackgroundColor(BaseColor.DARK_GRAY);
                    PdfPCell cienciasHumanas = new PdfPCell(new Paragraph("CIÊNCIAS HUMANAS E SUAS TECNOLOGIAS", f));
                    cienciasHumanas.setBackgroundColor(BaseColor.DARK_GRAY);
                    PdfPCell cienciasNatureza = new PdfPCell(new Paragraph("CIÊNCIAS DA NATUREZA E SUAS TECNOLOGIAS", f));
                    cienciasNatureza.setBackgroundColor(BaseColor.DARK_GRAY);
                    PdfPCell linguagens = new PdfPCell(new Paragraph("LINGUAGENS, CÓDIGOS E SUAS TECNOLOGIAS", f));
                    linguagens.setBackgroundColor(BaseColor.DARK_GRAY);
                    PdfPCell matematica = new PdfPCell(new Paragraph("MATEMÁTICA E SUAS TECNOLOGIAS", f));
                    matematica.setBackgroundColor(BaseColor.DARK_GRAY);
                    PdfPCell total = new PdfPCell(new Paragraph("TOTAL", f));
                    total.setBackgroundColor(BaseColor.DARK_GRAY);

                    table.addCell(matricula);
                    table.addCell(nome);
                    table.addCell(turma);
                    if (jComboBoxModo.getSelectedItem().equals("TOTAL E PARCIAL")) {
                        table.addCell(cienciasHumanas);
                        table.addCell(cienciasNatureza);
                        table.addCell(linguagens);
                        table.addCell(matematica);
                    }
                    table.addCell(total);

                    Font p = new Font(Font.FontFamily.TIMES_ROMAN, 12);
                    Font p2 = new Font(Font.FontFamily.TIMES_ROMAN, 9);

                    if (jComboBoxFiltro.getSelectedItem().equals("POR CURSO")) {
                        String pesquisa = "";

                        if (jCBSelecionar.getSelectedItem().equals("INFORMÁTICA")) {
                            pesquisa = "INFO";

                        } else if (jCBSelecionar.getSelectedItem().equals("AGROPECUÁRIA")) {
                            pesquisa = "AGRO";

                        } else if (jCBSelecionar.getSelectedItem().equals("MEIO AMBIENTE")) {
                            pesquisa = "MA";
                        }
                        conex.executarSql("SELECT * FROM nota WHERE turma LIKE '%" + pesquisa + "%' order by nome");

                    } else if (jComboBoxFiltro.getSelectedItem().equals("POR SÉRIE")) {
                        String pesquisa = "";

                        if (jCBSelecionar.getSelectedItem().equals("1° ANO")) {
                            pesquisa = "1°";

                        } else if (jCBSelecionar.getSelectedItem().equals("2° ANO")) {
                            pesquisa = "2°";

                        } else if (jCBSelecionar.getSelectedItem().equals("3° ANO")) {
                            pesquisa = "3°";
                        }
                        conex.executarSql("SELECT * FROM nota WHERE turma LIKE '" + pesquisa + "%' order by turma, nome");

                    } else if (jComboBoxFiltro.getSelectedItem().equals("POR TURMA")) {
                        conex.executarSql("SELECT * FROM nota WHERE turma = '" + jCBSelecionar.getSelectedItem() + "' order by nome");

                    } else if (jComboBoxFiltro.getSelectedItem().equals("DE TODOS OS ALUNOS")) {
                        conex.executarSql("SELECT * FROM nota order by turma, nome");
                    }
                    try {
                        while (conex.rs.next()) {
                            //\\
                            String n = conex.rs.getString("nome");
                            String m = String.valueOf(conex.rs.getInt("matricula"));
                            String c = conex.rs.getString("turma");

                            Paragraph matriculaP = new Paragraph(m, f1);
                            Paragraph nomeP = new Paragraph(n, f1);
                            Paragraph turmaP = new Paragraph(c, f1);

                            table.addCell(matriculaP);
                            table.addCell(nomeP);
                            table.addCell(turmaP);
                            //\\

                            //\\
                            if (jComboBoxModo.getSelectedItem().equals("TOTAL E PARCIAL")) {
                                String ch = String.valueOf(conex.rs.getDouble("humanas"));
                                String cn = String.valueOf(conex.rs.getDouble("naturais"));
                                String li = String.valueOf(conex.rs.getDouble("linguagens"));
                                String ma = String.valueOf(conex.rs.getDouble("matematica"));

                                Paragraph chP = new Paragraph(ch, f1);
                                Paragraph cnP = new Paragraph(cn, f1);
                                Paragraph liP = new Paragraph(li, f1);
                                Paragraph maP = new Paragraph(ma, f1);

                                table.addCell(chP);
                                table.addCell(cnP);
                                table.addCell(liP);
                                table.addCell(maP);

                                somaCH = somaCH + Double.parseDouble(ch);
                                somaCN = somaCN + Double.parseDouble(cn);
                                somaLI = somaLI + Double.parseDouble(li);
                                somaMA = somaMA + Double.parseDouble(ma);
                            }
                            //\\

                            String tot = String.valueOf(conex.rs.getDouble("total"));
                            Paragraph totP = new Paragraph(tot, f1);
                            somaTot = somaTot + Double.parseDouble(tot);

                            table.addCell(totP);
                        }
                        doc.add(table);

                        
                        if (jComboBoxPercent.getSelectedItem().equals("SIM")) {
                            double percentCH = somaCH * 100 / somaTot;
                            double percentCN = somaCN * 100 / somaTot;
                            double percentLI = somaLI * 100 / somaTot;
                            double percentMA = somaMA * 100 / somaTot;
                            
                            DecimalFormat formatador = new DecimalFormat("00");
                            
                            Paragraph subTituloPercents = new Paragraph("\n\n\nOBS: Os percentuais abaixo são exibidos somente de acordo com os dados da tabela acima, "
                                    + "sendo assim para cada tabela(ou relatório) poderão ser gerados percentuais diferentes",p2);
                            subTituloPercents.setAlignment(Element.ALIGN_LEFT);
                            
                            Paragraph tituloPercents = new Paragraph("\n\n\nPercentuais correspondentes ao valor de cada eixo em relação ao valor total",p);
                            tituloPercents.setAlignment(Element.ALIGN_CENTER);

                            Paragraph percentuais = new Paragraph("\n\nCIÊNCIAS HUMANAS E SUAS TECNOLOGIAS: "+formatador.format(percentCH)
                                    + "%\nCIÊNCIAS DA NATUREZA E SUAS TECNOLOGIAS: "+formatador.format(percentCN)
                                    + "%\nLINGUAGENS CÓDIGOS E SUAS TECNOLOGIAS: "+formatador.format(percentLI)
                                    + "%\nMATEMÁTUCA E SUAS TECNOLOGIAS: "+formatador.format(percentMA)+"%",f1);
                            percentuais.setAlignment(Element.ALIGN_CENTER);
                            
                            
                        //CRIAÇÃO DE TABELA DE PERCENTUAIS
                        //------------------------------------------------------------------------------------
//                            PdfPTable table2 = new PdfPTable(2);
//                            
//                            PdfPCell eixo = new PdfPCell(new Paragraph("EIXO", f));
//                            eixo.setBackgroundColor(BaseColor.DARK_GRAY);
//                            PdfPCell percent = new PdfPCell(new Paragraph("PERCENTUAL", f));
//                            percent.setBackgroundColor(BaseColor.DARK_GRAY);
//                            
//                            table2.addCell(eixo);
//                            table2.addCell(percent);
//                            doc.add(table2);
                        //------------------------------------------------------------------------------------
                            
                            
                            doc.add(subTituloPercents);
                            doc.add(tituloPercents);
                            doc.add(percentuais);
                        }
                        doc.close();

                        JOptionPane.showMessageDialog(rootPane, "Gerado com sucesso");
                        Desktop.getDesktop().open(new File(txtCaminho.getText() + "\\" + txtNomeArquivo.getText() + ".pdf"));

                    } catch (SQLException ex) {
                        JOptionPane.showMessageDialog(null, "Erro ao selecionar os dados! \nErro" + ex);
                    }
                    conex.desconectar();
                } catch (FileNotFoundException | DocumentException ex) {
                    JOptionPane.showMessageDialog(null, "Erro\n>" + ex.getMessage());
                } catch (IOException ex) {
                    JOptionPane.showMessageDialog(null, "O erro depois do erro\n>" + ex);
                    Logger.getLogger(Relatorios.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }//GEN-LAST:event_jBgerarActionPerformed

    private void jComboBoxFiltroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxFiltroActionPerformed
        if (jComboBoxFiltro.getSelectedItem().equals("SELECIONE")) {
            jCBSelecionar.removeAllItems();
            jCBSelecionar.addItem("SELECIONE");
            jCBSelecionar.setVisible(false);
            jLSelecionar.setVisible(false);

        } else if (jComboBoxFiltro.getSelectedItem().equals("POR TURMA")) {
            jCBSelecionar.removeAllItems();
            jCBSelecionar.addItem("SELECIONE");
            preencherSelecaoDoFiltro();
            jLSelecionar.setText("Turma:");
            jCBSelecionar.setVisible(true);
            jLSelecionar.setVisible(true);

        } else if (jComboBoxFiltro.getSelectedItem().equals("POR SÉRIE")) {
            jCBSelecionar.removeAllItems();
            jCBSelecionar.addItem("SELECIONE");
            jCBSelecionar.addItem("1° ANO");
            jCBSelecionar.addItem("2° ANO");
            jCBSelecionar.addItem("3° ANO");
            jLSelecionar.setText("Série:");
            jCBSelecionar.setVisible(true);
            jLSelecionar.setVisible(true);

        } else if (jComboBoxFiltro.getSelectedItem().equals("POR CURSO")) {
            jCBSelecionar.removeAllItems();
            jCBSelecionar.addItem("SELECIONE");
            jCBSelecionar.addItem("AGROPECUÁRIA");
            jCBSelecionar.addItem("INFORMÁTICA");
            jCBSelecionar.addItem("MEIO AMBIENTE");
            jLSelecionar.setText("Curso:");
            jCBSelecionar.setVisible(true);
            jLSelecionar.setVisible(true);

        } else {
            jCBSelecionar.removeAllItems();
            jCBSelecionar.addItem("DE TODOS OS ALUNOS");
            jCBSelecionar.setVisible(false);
            jLSelecionar.setVisible(false);
        }
    }//GEN-LAST:event_jComboBoxFiltroActionPerformed

    private void jComboBoxModoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxModoActionPerformed
        if (jComboBoxModo.getSelectedItem().equals("SELECIONE") || jComboBoxModo.getSelectedItem().equals("TOTAL APENAS")) {
            jComboBoxPercent.setVisible(false);
            jLPercent.setVisible(false);
        } else {
            jComboBoxPercent.setVisible(true);
            jLPercent.setVisible(true);
        }
    }//GEN-LAST:event_jComboBoxModoActionPerformed

    private void jBMostrarMensagemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBMostrarMensagemActionPerformed
        try {
            if (!conex.pesquisarComRetornoBoolean("select * from nota")) {
                JOptionPane.showMessageDialog(null, "Atenção! Nenhuma correção de gabarito foi feita, caso gere algum relatório ele estará vazio!\n"
                        + "Para que isso não aconteça é necessário ir ao menu 'Corrigir Gabarito' localizado na tela inicial!");
            }
        } catch (SQLException ex) {
            
        }
    }//GEN-LAST:event_jBMostrarMensagemActionPerformed

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
            java.util.logging.Logger.getLogger(Relatorios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Relatorios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Relatorios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Relatorios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new Relatorios().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(Relatorios.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBMostrarMensagem;
    private javax.swing.JButton jBProcurar;
    private javax.swing.JButton jBgerar;
    private javax.swing.JComboBox<String> jCBSelecionar;
    private javax.swing.JComboBox<String> jComboBoxFiltro;
    private javax.swing.JComboBox<String> jComboBoxModo;
    private javax.swing.JComboBox<String> jComboBoxPercent;
    private javax.swing.JLabel jLPercent;
    private javax.swing.JLabel jLSelecionar;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtCaminho;
    private javax.swing.JTextField txtNomeArquivo;
    // End of variables declaration//GEN-END:variables
}
