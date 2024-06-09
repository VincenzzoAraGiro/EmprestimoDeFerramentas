package visao;

import java.awt.List;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo.Amigo;
import modelo.Ferramenta;
import com.toedter.calendar.JDateChooser;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import modelo.Emprestimo;
import java.util.Date;

public class FrmCadastroEmprestimo extends javax.swing.JFrame {

    private ArrayList<Ferramenta> ferramentasSelecionadas;
    private Amigo objetoAmigo;
    private Ferramenta objetoFerramenta;
    private double totalEmprestimo = 0.0;
    private int quantidade = 0;
    Emprestimo objetoEmprestimo = new Emprestimo();
    ArrayList<Ferramenta> ferramentas = new ArrayList<>();

    public FrmCadastroEmprestimo() {
        initComponents();
        this.objetoAmigo = new Amigo();
        carregarAmigos();
        this.objetoFerramenta = new Ferramenta();
        carregarFerramentasDisponiveis();
        ferramentasSelecionadas = new ArrayList<>();
        calculaTotalEmprestimo();
    }

    private void carregarAmigos() {
        ArrayList<Amigo> amigos = new ArrayList<>();
        amigos = objetoAmigo.pegarLista(); //metodo retorna um array/*List*/
        DefaultTableModel model = (DefaultTableModel) AmigoTable.getModel();
        model.setRowCount(0);
        for (Amigo amigo : amigos) {
            model.addRow(new Object[]{amigo.getId(), amigo.getNome(), amigo.getTelefone()});
        }
    }

    private void carregarFerramentasDisponiveis() {

        ferramentas = objetoFerramenta.pegarListaDisponiveis(); //metodo retorna um arraylist
        DefaultTableModel model = (DefaultTableModel) TableFerramentas.getModel();
        model.setRowCount(0);
        for (Ferramenta ferramenta : ferramentas) {
            model.addRow(new Object[]{ferramenta.getId(), ferramenta.getNome(), ferramenta.getCusto(), ferramenta.getMarca()});
        }
    }

    private void atualizarTabelaFerramentasSelecionadas() {
        DefaultTableModel model = (DefaultTableModel) TableFerramentas.getModel();
        model.setRowCount(0);
        for (Ferramenta ferramenta : ferramentasSelecionadas) {
            model.addRow(new Object[]{ferramenta.getId(), ferramenta.getNome(), ferramenta.getCusto(), ferramenta.getMarca()});
        }
    }

    private void calculaTotalEmprestimo() {
        totalEmprestimo = 0.0;
        for (Ferramenta ferramenta : ferramentasSelecionadas) {
            totalEmprestimo += ferramenta.getCusto();
        }
        this.labelTotalCusto.setText("" + totalEmprestimo);
    }

    private void quantFerramentas() {
        quantidade = ferramentasSelecionadas.size();
        this.labelQuant.setText("" + quantidade);
    }

    private void atualizaInfos() {
        calculaTotalEmprestimo();
        atualizarTabelaFerramentasSelecionadas();
        quantFerramentas();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        TítuloPanel = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        FerramentaPanel = new javax.swing.JPanel();
        Ferramenta = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TableFerramentas = new javax.swing.JTable();
        AmigoPanel = new javax.swing.JPanel();
        Amigo = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        AmigoTable = new javax.swing.JTable();
        EmpréstimoPanel = new javax.swing.JPanel();
        ItensEmpréstimoPanel = new javax.swing.JPanel();
        FerramentasSelecionada = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        FerramentasSelecionadasTable = new javax.swing.JTable();
        DadosEmpréstimo = new javax.swing.JLabel();
        OutrosDados = new javax.swing.JPanel();
        AmigoSelecionado = new javax.swing.JLabel();
        Id = new javax.swing.JLabel();
        Nome = new javax.swing.JLabel();
        Telefone = new javax.swing.JLabel();
        JTFId = new javax.swing.JTextField();
        JTFNome = new javax.swing.JTextField();
        JTFTelefone = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        DataEmpréstimo = new com.toedter.calendar.JDateChooser();
        DataDevolução = new com.toedter.calendar.JDateChooser();
        Aplicar = new javax.swing.JButton();
        Voltar = new javax.swing.JButton();
        QuantidadeDeItensLabel = new javax.swing.JLabel();
        labelQuant = new javax.swing.JLabel();
        PreçoTotalLabel = new javax.swing.JLabel();
        labelTotalCusto = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Fast Ferramentas - Cadastro de Empréstimos");
        setBackground(new java.awt.Color(51, 51, 150));
        setMinimumSize(new java.awt.Dimension(850, 680));
        getContentPane().setLayout(null);

        TítuloPanel.setBackground(new java.awt.Color(255, 255, 204));
        TítuloPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        TítuloPanel.setLayout(null);

        jLabel5.setBackground(new java.awt.Color(0, 0, 0));
        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 28)); // NOI18N
        jLabel5.setText("Fast Ferramentas");
        TítuloPanel.add(jLabel5);
        jLabel5.setBounds(280, 0, 230, 38);

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setText("Cadastro de Empréstimos");
        TítuloPanel.add(jLabel6);
        jLabel6.setBounds(300, 30, 180, 20);

        getContentPane().add(TítuloPanel);
        TítuloPanel.setBounds(10, 10, 800, 60);

        FerramentaPanel.setBackground(new java.awt.Color(255, 255, 204));
        FerramentaPanel.setLayout(null);

        Ferramenta.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Ferramenta.setText("Ferramenta");
        FerramentaPanel.add(Ferramenta);
        Ferramenta.setBounds(10, 10, 90, 20);

        TableFerramentas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID", "Nome", "Marca", "Custo"
            }
        ));
        TableFerramentas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TableFerramentasMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(TableFerramentas);

        FerramentaPanel.add(jScrollPane1);
        jScrollPane1.setBounds(10, 40, 390, 170);

        getContentPane().add(FerramentaPanel);
        FerramentaPanel.setBounds(10, 90, 410, 220);

        AmigoPanel.setBackground(new java.awt.Color(255, 255, 204));
        AmigoPanel.setLayout(null);

        Amigo.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Amigo.setText("Amigo");
        AmigoPanel.add(Amigo);
        Amigo.setBounds(10, 10, 50, 20);

        AmigoTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "ID", "Nome", "Telefone"
            }
        ));
        AmigoTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AmigoTableMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(AmigoTable);

        AmigoPanel.add(jScrollPane2);
        jScrollPane2.setBounds(10, 30, 390, 180);

        getContentPane().add(AmigoPanel);
        AmigoPanel.setBounds(10, 320, 410, 220);

        EmpréstimoPanel.setBackground(new java.awt.Color(255, 255, 204));
        EmpréstimoPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        EmpréstimoPanel.setLayout(null);

        ItensEmpréstimoPanel.setBackground(new java.awt.Color(255, 255, 232));
        ItensEmpréstimoPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 4));
        ItensEmpréstimoPanel.setLayout(null);

        FerramentasSelecionada.setText("Ferramentas Selecionadas");
        ItensEmpréstimoPanel.add(FerramentasSelecionada);
        FerramentasSelecionada.setBounds(10, 10, 150, 16);

        FerramentasSelecionadasTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID", "Nome", "Marca", "Custo"
            }
        ));
        FerramentasSelecionadasTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                FerramentasSelecionadasTableMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(FerramentasSelecionadasTable);

        ItensEmpréstimoPanel.add(jScrollPane3);
        jScrollPane3.setBounds(10, 30, 330, 120);

        EmpréstimoPanel.add(ItensEmpréstimoPanel);
        ItensEmpréstimoPanel.setBounds(10, 40, 350, 160);

        DadosEmpréstimo.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        DadosEmpréstimo.setText("Dados Empréstimo");
        EmpréstimoPanel.add(DadosEmpréstimo);
        DadosEmpréstimo.setBounds(10, 10, 130, 20);

        OutrosDados.setBackground(new java.awt.Color(255, 255, 232));
        OutrosDados.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 4));
        OutrosDados.setLayout(null);

        AmigoSelecionado.setText("Amigo Selecionado");
        OutrosDados.add(AmigoSelecionado);
        AmigoSelecionado.setBounds(10, 10, 110, 16);

        Id.setText("ID");
        OutrosDados.add(Id);
        Id.setBounds(20, 40, 11, 16);

        Nome.setText("Nome");
        OutrosDados.add(Nome);
        Nome.setBounds(140, 40, 33, 16);

        Telefone.setText("Telefone");
        OutrosDados.add(Telefone);
        Telefone.setBounds(250, 40, 50, 16);
        OutrosDados.add(JTFId);
        JTFId.setBounds(10, 60, 90, 22);
        OutrosDados.add(JTFNome);
        JTFNome.setBounds(120, 60, 100, 22);
        OutrosDados.add(JTFTelefone);
        JTFTelefone.setBounds(240, 60, 100, 22);

        EmpréstimoPanel.add(OutrosDados);
        OutrosDados.setBounds(10, 230, 350, 110);

        getContentPane().add(EmpréstimoPanel);
        EmpréstimoPanel.setBounds(440, 60, 370, 360);

        jPanel1.setBackground(new java.awt.Color(255, 255, 232));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 4));
        jPanel1.setLayout(null);

        jLabel1.setText("Datas");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(10, 10, 50, 16);

        jLabel2.setText("Data Empréstimo");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(70, 30, 100, 16);

        jLabel3.setText("Data Devolução");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(227, 30, 90, 16);
        jPanel1.add(DataEmpréstimo);
        DataEmpréstimo.setBounds(50, 50, 129, 22);
        jPanel1.add(DataDevolução);
        DataDevolução.setBounds(210, 50, 129, 22);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(440, 430, 370, 90);

        Aplicar.setBackground(new java.awt.Color(139, 253, 139));
        Aplicar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Aplicar.setText("Aplicar");
        Aplicar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AplicarActionPerformed(evt);
            }
        });
        getContentPane().add(Aplicar);
        Aplicar.setBounds(480, 540, 120, 23);

        Voltar.setBackground(new java.awt.Color(255, 91, 91));
        Voltar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Voltar.setText("Voltar");
        Voltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VoltarActionPerformed(evt);
            }
        });
        getContentPane().add(Voltar);
        Voltar.setBounds(680, 540, 110, 27);

        QuantidadeDeItensLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        QuantidadeDeItensLabel.setText("Quantidade de Itens:");
        getContentPane().add(QuantidadeDeItensLabel);
        QuantidadeDeItensLabel.setBounds(10, 550, 150, 20);

        labelQuant.setText("0");
        getContentPane().add(labelQuant);
        labelQuant.setBounds(160, 550, 40, 20);

        PreçoTotalLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        PreçoTotalLabel.setText("Preço Total R$:");
        getContentPane().add(PreçoTotalLabel);
        PreçoTotalLabel.setBounds(200, 550, 110, 20);

        labelTotalCusto.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        labelTotalCusto.setText("00,00");
        getContentPane().add(labelTotalCusto);
        labelTotalCusto.setBounds(310, 550, 110, 20);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void VoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VoltarActionPerformed
        (this).setVisible(false);
    }//GEN-LAST:event_VoltarActionPerformed

    private void TableFerramentasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TableFerramentasMouseClicked
        int selectedRow = TableFerramentas.getSelectedRow();
        if (selectedRow != -1) {
            DefaultTableModel model = (DefaultTableModel) TableFerramentas.getModel();
            int id = (int) model.getValueAt(selectedRow, 0);

            boolean ferramentaJaSelecionada = false;
            for (Ferramenta ferramenta : ferramentasSelecionadas) {
                if (ferramenta.getId() == id) {
                    ferramentaJaSelecionada = true;
                    break;
                }
            }

            if (ferramentaJaSelecionada) {
                JOptionPane.showMessageDialog(this, "Ferramenta já selecionada", "Erro", JOptionPane.ERROR_MESSAGE);
            } else {
                int option = JOptionPane.showConfirmDialog(this, "Adicionar ferramenta ao empréstimo?", "Confirmação", JOptionPane.YES_NO_OPTION);
                if (option == JOptionPane.YES_OPTION) {
                    Ferramenta ferramenta = new Ferramenta();
                    ferramenta.setId((int) model.getValueAt(selectedRow, 0));
                    ferramenta.setNome((String) model.getValueAt(selectedRow, 1));
                    ferramenta.setCusto((double) model.getValueAt(selectedRow, 2));
                    ferramenta.setMarca((String) model.getValueAt(selectedRow, 3));
                    ferramentasSelecionadas.add(ferramenta);
                    atualizarTabelaFerramentasSelecionadas();
                }
            }
        }
        atualizaInfos();
    }//GEN-LAST:event_TableFerramentasMouseClicked

    private void AmigoTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AmigoTableMouseClicked
        if (this.AmigoTable.getSelectedRow() != -1) {

            String id = "" + this.AmigoTable.getValueAt(this.AmigoTable.getSelectedRow(), 0).toString();
            String nome = this.AmigoTable.getValueAt(this.AmigoTable.getSelectedRow(), 1).toString();
            String telefone = this.AmigoTable.getValueAt(this.AmigoTable.getSelectedRow(), 2).toString();

            this.JTFId.setText(id);
            this.JTFNome.setText(nome);
            this.JTFTelefone.setText(telefone);

            this.JTFId.setEnabled(false);
            this.JTFNome.setEnabled(false);
            this.JTFTelefone.setEnabled(false);
        }
    }//GEN-LAST:event_AmigoTableMouseClicked

    private void FerramentasSelecionadasTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FerramentasSelecionadasTableMouseClicked
        int selectedRow = FerramentasSelecionadasTable.getSelectedRow();
        if (selectedRow != -1) {
            int option = JOptionPane.showConfirmDialog(this, "Tirar ferramenta da lista de selecionadas?", "Confirmação", JOptionPane.YES_NO_OPTION);
            if (option == JOptionPane.YES_OPTION) {
                DefaultTableModel model = (DefaultTableModel) FerramentasSelecionadasTable.getModel();
                int id = (int) model.getValueAt(selectedRow, 0);

                ferramentasSelecionadas.removeIf(ferramenta -> ferramenta.getId() == id);

                model.removeRow(selectedRow);
            }
        }
        atualizaInfos();
    }//GEN-LAST:event_FerramentasSelecionadasTableMouseClicked

    private void AplicarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AplicarActionPerformed
        Date dataInicial = DataEmpréstimo.getDate();
        Date dataDevolucao = DataDevolução.getDate();

        if (dataInicial == null || dataDevolucao == null) {
            JOptionPane.showMessageDialog(this, "Por favor, selecione as datas.", "Erro", JOptionPane.ERROR_MESSAGE);
            return;
        }

        Calendar cal = Calendar.getInstance();
        cal.set(Calendar.HOUR_OF_DAY, 0);
        cal.set(Calendar.MINUTE, 0);
        cal.set(Calendar.SECOND, 0);
        cal.set(Calendar.MILLISECOND, 0);
        Date hoje = cal.getTime();

        Date dataInicialSemHora = resetTime(dataInicial);
        Date dataFinalSemHora = resetTime(dataDevolucao);

        if (dataInicialSemHora.before(hoje)) {
            JOptionPane.showMessageDialog(this, "A data inicial não pode ser inferior à data de hoje.","Erro", JOptionPane.ERROR_MESSAGE);
            return;
        }else if(dataFinalSemHora.before(dataInicialSemHora)){
            JOptionPane.showMessageDialog(this, "A data de devolução não pode ser inferior à data inicial.","Erro", JOptionPane.ERROR_MESSAGE);
            return;
            
        }
        
        java.sql.Date sqlDataInicial = new java.sql.Date(dataInicial.getTime());
        java.sql.Date sqlDataDevolucao = new java.sql.Date(dataDevolucao.getTime());

        /*Sala ai meu fi*/
        if (this.JTFId.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Selecione um amigo!", "Erro", JOptionPane.ERROR_MESSAGE);
            return;
        }

        int idAmigo;
        try {
            idAmigo = Integer.parseInt(this.JTFId.getText());
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "ID do amigo inválido!", "Erro", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // Verificar se a lista de ferramentas selecionadas está vazia
        if (ferramentasSelecionadas.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Selecione ao menos uma ferramenta!", "Erro", JOptionPane.ERROR_MESSAGE);
            return;
        }

        objetoEmprestimo.setIdAmigo(idAmigo);
        objetoEmprestimo.setDataInicial(sqlDataInicial);
        objetoEmprestimo.setDataDevolucao(sqlDataDevolucao);
        objetoEmprestimo.setFerramentasSelecionadas(ferramentasSelecionadas);

        if (this.objetoEmprestimo.inserirEmprestimo(idAmigo, ferramentasSelecionadas, sqlDataInicial, sqlDataDevolucao)) {
            JOptionPane.showMessageDialog(this, "Empréstimo registrado com sucesso!");
            RecarregaTela();
        } else {
            JOptionPane.showMessageDialog(this, "Erro ao registrar o empréstimo!", "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_AplicarActionPerformed

        public void RecarregaTela() {
        ferramentas.clear();
        ferramentasSelecionadas.clear();
        carregarFerramentasDisponiveis();
        atualizarTabelaFerramentasSelecionadas();
        quantFerramentas();
        this.JTFId.setText("");
        this.JTFNome.setText("");
        this.JTFTelefone.setText("");
        this.setVisible(false);
        FrmGerenciaEmprestimo objeto = new FrmGerenciaEmprestimo();
        objeto.carregaTabela();
    }
    
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
            java.util.logging.Logger.getLogger(FrmCadastroEmprestimo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmCadastroEmprestimo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmCadastroEmprestimo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmCadastroEmprestimo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmCadastroEmprestimo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Amigo;
    private javax.swing.JPanel AmigoPanel;
    private javax.swing.JLabel AmigoSelecionado;
    private javax.swing.JTable AmigoTable;
    private javax.swing.JButton Aplicar;
    private javax.swing.JLabel DadosEmpréstimo;
    private com.toedter.calendar.JDateChooser DataDevolução;
    private com.toedter.calendar.JDateChooser DataEmpréstimo;
    private javax.swing.JPanel EmpréstimoPanel;
    private javax.swing.JLabel Ferramenta;
    private javax.swing.JPanel FerramentaPanel;
    private javax.swing.JLabel FerramentasSelecionada;
    private javax.swing.JTable FerramentasSelecionadasTable;
    private javax.swing.JLabel Id;
    private javax.swing.JPanel ItensEmpréstimoPanel;
    private javax.swing.JTextField JTFId;
    private javax.swing.JTextField JTFNome;
    private javax.swing.JTextField JTFTelefone;
    private javax.swing.JLabel Nome;
    private javax.swing.JPanel OutrosDados;
    private javax.swing.JLabel PreçoTotalLabel;
    private javax.swing.JLabel QuantidadeDeItensLabel;
    private javax.swing.JTable TableFerramentas;
    private javax.swing.JLabel Telefone;
    private javax.swing.JPanel TítuloPanel;
    private javax.swing.JButton Voltar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel labelQuant;
    private javax.swing.JLabel labelTotalCusto;
    // End of variables declaration//GEN-END:variables

        private Date resetTime(Date date) {
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        cal.set(Calendar.HOUR_OF_DAY, 0);
        cal.set(Calendar.MINUTE, 0);
        cal.set(Calendar.SECOND, 0);
        cal.set(Calendar.MILLISECOND, 0);
        return cal.getTime();
    }

}
