package visao;

public class FrmRelatorio extends javax.swing.JFrame {

    public FrmRelatorio() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TabelaRelatorios = new javax.swing.JTable();
        Voltar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        labelPago = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        FastFerramentasApp = new javax.swing.JLabel();
        DescriçãoTela = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Fast Ferramentas - Relatórios");
        setMinimumSize(new java.awt.Dimension(483, 380));
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(255, 255, 215));
        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        jPanel1.setLayout(null);

        TabelaRelatorios.setBackground(new java.awt.Color(248, 242, 242));
        TabelaRelatorios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "ID do Empréstimo", "Quem Emprestou", "Ferramenta Emprestada"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(TabelaRelatorios);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(10, 10, 440, 120);

        Voltar.setBackground(new java.awt.Color(255, 102, 102));
        Voltar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Voltar.setText("Voltar");
        Voltar.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        Voltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VoltarActionPerformed(evt);
            }
        });
        jPanel1.add(Voltar);
        Voltar.setBounds(150, 190, 170, 30);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setText("Total Pago R$:");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(30, 140, 100, 20);

        labelPago.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        labelPago.setText("00,00");
        jPanel1.add(labelPago);
        labelPago.setBounds(130, 140, 90, 20);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(10, 100, 460, 240);

        jPanel3.setBackground(new java.awt.Color(255, 255, 215));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel3.setLayout(null);

        FastFerramentasApp.setFont(new java.awt.Font("MV Boli", 1, 28)); // NOI18N
        FastFerramentasApp.setText("Fast Ferramentas");
        jPanel3.add(FastFerramentasApp);
        FastFerramentasApp.setBounds(120, 0, 260, 40);

        DescriçãoTela.setFont(new java.awt.Font("MV Boli", 0, 18)); // NOI18N
        DescriçãoTela.setText("Relatórios");
        jPanel3.add(DescriçãoTela);
        DescriçãoTela.setBounds(190, 30, 90, 25);

        getContentPane().add(jPanel3);
        jPanel3.setBounds(10, 10, 460, 60);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void VoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VoltarActionPerformed
        // Volta para a tela de Opções
        FrmOpções objeto = new FrmOpções();
        objeto.setVisible(true);
    }//GEN-LAST:event_VoltarActionPerformed

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
            java.util.logging.Logger.getLogger(FrmRelatorio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmRelatorio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmRelatorio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmRelatorio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmRelatorio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel DescriçãoTela;
    private javax.swing.JLabel FastFerramentasApp;
    private javax.swing.JTable TabelaRelatorios;
    private javax.swing.JButton Voltar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelPago;
    // End of variables declaration//GEN-END:variables
}
