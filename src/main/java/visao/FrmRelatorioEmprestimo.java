package visao;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo.Emprestimo;
import modelo.Amigo;
import modelo.Ferramenta;
import dao.RelatorioDAO;

public class FrmRelatorioEmprestimo extends javax.swing.JFrame {

    private Emprestimo objetoEmprestimo;
    private Emprestimo objeto;
    private int idEmprestimo;
    private Amigo objetoAmigo;

    public FrmRelatorioEmprestimo(int id) {
        this.idEmprestimo = id;
        initComponents();
        objetoEmprestimo = new Emprestimo();
        objetoAmigo = new Amigo();
        preencheDados();
         setLocationRelativeTo(null);
    }

    public FrmRelatorioEmprestimo() {
        initComponents();
    }

    public void preencheDados() {
        objetoEmprestimo = objetoEmprestimo.pegaEmprestimo(idEmprestimo);
        System.out.print(objetoEmprestimo.getIdAmigo());
        objetoAmigo = objetoAmigo.pegaAmigo(objetoEmprestimo.getIdAmigo());

        JTFID.setText(String.valueOf(objetoAmigo.getNome()));
        JTFDataEmprestimo.setText(String.valueOf(objetoEmprestimo.getDataInicial()));
        JTFDevolução.setText(String.valueOf(objetoEmprestimo.getDataDevolucao()));

        // Assuming there is a method to get Amigo details
        JTFNome.setText(objetoAmigo.getNome());
        JTFTelefone.setText(objetoAmigo.getTelefone());
        DefaultTableModel model = (DefaultTableModel) FerramentasEmprestadasTable.getModel();
        model.setRowCount(0);
        for (Ferramenta ferramenta : objetoEmprestimo.getFerramentasSelecionadas()) {
            model.addRow(new Object[]{ferramenta.getId(), ferramenta.getNome(), ferramenta.getCusto(), ferramenta.getMarca()});
        }

        // Update the total quantity and price
        JTFIdEmprestimo.setText(String.valueOf(objetoEmprestimo.getIdEmprestimo()));
        JTFQuantidade.setText(String.valueOf(objetoEmprestimo.getFerramentasSelecionadas().size()));
        JTFPreçoTotal.setText(String.valueOf(objetoEmprestimo.calculaTotalEmprestimo()));
        // Assuming there is a method to calculate total price
        System.out.print(objetoEmprestimo.getStatus());
        LabelStatus.setText(String.valueOf(objetoEmprestimo.getStatus()));
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        JTFID = new javax.swing.JTextField();
        JTFNome = new javax.swing.JTextField();
        JTFTelefone = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        Devolver = new javax.swing.JButton();
        Voltar = new javax.swing.JButton();
        Apagar = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        FerramentasEmprestadasTable = new javax.swing.JTable();
        jPanel5 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        JTFIdEmprestimo = new javax.swing.JTextField();
        JTFDataEmprestimo = new javax.swing.JTextField();
        JTFDevolução = new javax.swing.JTextField();
        JTFQuantidade = new javax.swing.JTextField();
        JTFPreçoTotal = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        Status = new javax.swing.JLabel();
        LabelStatus = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Fast Ferramentas - Relatórios de Empréstimos");
        setMinimumSize(new java.awt.Dimension(850, 535));
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(255, 255, 204));
        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("MV Boli", 1, 28)); // NOI18N
        jLabel1.setText("Fast Ferramentas");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(270, 0, 280, 40);

        jLabel2.setFont(new java.awt.Font("MV Boli", 1, 14)); // NOI18N
        jLabel2.setText("Relatórios de Empréstimos");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(300, 30, 210, 16);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(6, 6, 798, 60);

        jPanel2.setBackground(new java.awt.Color(255, 255, 204));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.setLayout(null);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("Amigo");
        jPanel2.add(jLabel3);
        jLabel3.setBounds(10, 0, 50, 20);
        jPanel2.add(JTFID);
        JTFID.setBounds(10, 50, 40, 22);
        jPanel2.add(JTFNome);
        JTFNome.setBounds(80, 50, 150, 22);
        jPanel2.add(JTFTelefone);
        JTFTelefone.setBounds(250, 50, 140, 22);

        jLabel4.setText("Nome");
        jPanel2.add(jLabel4);
        jLabel4.setBounds(80, 30, 36, 16);

        jLabel5.setText("Telefone");
        jPanel2.add(jLabel5);
        jLabel5.setBounds(250, 30, 60, 16);

        jLabel6.setText("ID");
        jPanel2.add(jLabel6);
        jLabel6.setBounds(10, 30, 11, 16);

        getContentPane().add(jPanel2);
        jPanel2.setBounds(6, 75, 400, 80);

        jPanel3.setBackground(new java.awt.Color(255, 255, 204));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel3.setLayout(null);

        Devolver.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Devolver.setForeground(new java.awt.Color(0, 204, 204));
        Devolver.setText("Devolver");
        Devolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DevolverActionPerformed(evt);
            }
        });
        jPanel3.add(Devolver);
        Devolver.setBounds(690, 10, 100, 30);

        Voltar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Voltar.setForeground(new java.awt.Color(0, 0, 255));
        Voltar.setText("Voltar");
        Voltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VoltarActionPerformed(evt);
            }
        });
        jPanel3.add(Voltar);
        Voltar.setBounds(490, 10, 90, 30);

        Apagar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Apagar.setForeground(new java.awt.Color(255, 0, 0));
        Apagar.setText("Apagar");
        Apagar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ApagarActionPerformed(evt);
            }
        });
        jPanel3.add(Apagar);
        Apagar.setBounds(590, 10, 90, 30);

        getContentPane().add(jPanel3);
        jPanel3.setBounds(6, 422, 798, 48);

        jPanel4.setBackground(new java.awt.Color(255, 255, 204));
        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel4.setLayout(null);

        jLabel15.setText("Ferramentas Emprestadas");
        jPanel4.add(jLabel15);
        jLabel15.setBounds(7, 7, 135, 16);

        FerramentasEmprestadasTable.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(FerramentasEmprestadasTable);

        jPanel4.add(jScrollPane1);
        jScrollPane1.setBounds(10, 30, 350, 290);

        getContentPane().add(jPanel4);
        jPanel4.setBounds(435, 80, 0, 330);

        jPanel5.setBackground(new java.awt.Color(255, 255, 204));
        jPanel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel5.setLayout(null);

        jLabel7.setText("Detalhes do Empréstimo");
        jPanel5.add(jLabel7);
        jLabel7.setBounds(7, 7, 129, 16);
        jPanel5.add(JTFIdEmprestimo);
        JTFIdEmprestimo.setBounds(7, 60, 158, 22);
        jPanel5.add(JTFDataEmprestimo);
        JTFDataEmprestimo.setBounds(7, 123, 158, 22);
        jPanel5.add(JTFDevolução);
        JTFDevolução.setBounds(7, 201, 158, 22);
        jPanel5.add(JTFQuantidade);
        JTFQuantidade.setBounds(225, 60, 158, 22);

        JTFPreçoTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTFPreçoTotalActionPerformed(evt);
            }
        });
        jPanel5.add(JTFPreçoTotal);
        JTFPreçoTotal.setBounds(225, 123, 158, 22);

        jLabel8.setText("ID");
        jPanel5.add(jLabel8);
        jLabel8.setBounds(10, 40, 11, 16);

        jLabel9.setText("Quantidade de Ferramentas");
        jPanel5.add(jLabel9);
        jLabel9.setBounds(230, 40, 150, 16);

        jLabel10.setText("Data Empréstimo");
        jPanel5.add(jLabel10);
        jLabel10.setBounds(10, 100, 91, 16);

        jLabel11.setText("Preço Total R$");
        jPanel5.add(jLabel11);
        jLabel11.setBounds(230, 100, 90, 16);

        jLabel12.setText("Data Devolução");
        jPanel5.add(jLabel12);
        jLabel12.setBounds(10, 180, 100, 16);

        Status.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Status.setText("Status:");
        jPanel5.add(Status);
        Status.setBounds(210, 190, 60, 25);

        LabelStatus.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        LabelStatus.setText("Status");
        jPanel5.add(LabelStatus);
        LabelStatus.setBounds(280, 191, 70, 25);

        getContentPane().add(jPanel5);
        jPanel5.setBounds(10, 170, 400, 240);

        jPanel6.setBackground(new java.awt.Color(255, 255, 204));
        jPanel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel6.setLayout(null);

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel13.setText("Ferramentas Emprestadas");
        jPanel6.add(jLabel13);
        jLabel13.setBounds(10, 0, 190, 20);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(jTable1);

        jPanel6.add(jScrollPane2);
        jScrollPane2.setBounds(10, 40, 360, 280);

        getContentPane().add(jPanel6);
        jPanel6.setBounds(420, 80, 380, 330);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void DevolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DevolverActionPerformed
        int confirm = JOptionPane.showConfirmDialog(this, "Tem certeza que deseja devolver o empréstimo?", "Confirmação", JOptionPane.YES_NO_OPTION);

        // Verificar se o usuário confirmou a devolução
        if (confirm == JOptionPane.YES_OPTION) {
            objetoEmprestimo.setStatus(StatusEmprestimo.FECHADO);
            System.out.println("status: "+objetoEmprestimo.getStatus());
            objetoEmprestimo.atualizaEmprestimo(objetoEmprestimo);
            // Definir o status de todas as ferramentas associadas como verdadeiro
            for (Ferramenta ferramenta : objetoEmprestimo.getFerramentasSelecionadas()) {
                ferramenta.setStatus(true);
                ferramenta.devolveFerramenta(ferramenta.getId());
            }

            preencheDados();
        }
    }//GEN-LAST:event_DevolverActionPerformed

    private void JTFPreçoTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTFPreçoTotalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTFPreçoTotalActionPerformed

    private void VoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VoltarActionPerformed
        this.setVisible(false);
        FrmGerenciaFerramenta objeto = new FrmGerenciaFerramenta();
        objeto.setVisible(true);
    }//GEN-LAST:event_VoltarActionPerformed

    private void ApagarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ApagarActionPerformed
       int confirm = JOptionPane.showConfirmDialog(this, "Tem certeza que deseja excluir o empréstimo?", "Confirmação", JOptionPane.YES_NO_OPTION);

    if (confirm == JOptionPane.YES_OPTION) {
       
        
        try {
            // Atualiza o status das ferramentas associadas para true
            for (Ferramenta ferramenta : objetoEmprestimo.getFerramentasSelecionadas()) {
                ferramenta.setStatus(true);
                ferramenta.devolveFerramenta(ferramenta.getId());
            }

            objetoEmprestimo.deletarEmprestimo(objetoEmprestimo.getIdEmprestimo());

            JOptionPane.showMessageDialog(this, "Empréstimo excluído com sucesso!");
            this.setVisible(false);
            FrmGerenciaEmprestimo verEmprestimos = new FrmGerenciaEmprestimo();
            verEmprestimos.setVisible(true);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Erro ao excluir empréstimo: " + e.getMessage());
        }
    }
    }//GEN-LAST:event_ApagarActionPerformed

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
            java.util.logging.Logger.getLogger(FrmRelatorioEmprestimo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmRelatorioEmprestimo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmRelatorioEmprestimo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmRelatorioEmprestimo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmRelatorioEmprestimo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Apagar;
    private javax.swing.JButton Devolver;
    private javax.swing.JTable FerramentasEmprestadasTable;
    private javax.swing.JTextField JTFDataEmprestimo;
    private javax.swing.JTextField JTFDevolução;
    private javax.swing.JTextField JTFID;
    private javax.swing.JTextField JTFIdEmprestimo;
    private javax.swing.JTextField JTFNome;
    private javax.swing.JTextField JTFPreçoTotal;
    private javax.swing.JTextField JTFQuantidade;
    private javax.swing.JTextField JTFTelefone;
    private javax.swing.JLabel LabelStatus;
    private javax.swing.JLabel Status;
    private javax.swing.JButton Voltar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables

    private static class StatusEmprestimo {

        private static modelo.Emprestado.Status FECHADO;

        public StatusEmprestimo() {
        }
    }
}
