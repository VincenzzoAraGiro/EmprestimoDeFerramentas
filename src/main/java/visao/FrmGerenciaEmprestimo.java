package visao;

public class FrmGerenciaEmprestimo extends javax.swing.JFrame {

    public FrmGerenciaEmprestimo() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        JTableEmprestimos = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jButton3 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Gerenciamento de Empréstimos");
        setMinimumSize(new java.awt.Dimension(522, 380));
        getContentPane().setLayout(null);

        JTableEmprestimos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null}
            },
            new String [] {
                "Amigo", "Ferramentas", "Data do Empréstimo", "Data de Devolução"
            }
        ));
        jScrollPane1.setViewportView(JTableEmprestimos);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(119, 70, 650, 500);

        jPanel1.setBackground(new java.awt.Color(255, 255, 204));
        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("MV Boli", 1, 28)); // NOI18N
        jLabel1.setText("Fast Ferramentas");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(300, 0, 290, 30);

        jLabel2.setFont(new java.awt.Font("MV Boli", 1, 14)); // NOI18N
        jLabel2.setText("Gerenciamento de Empréstimos");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(310, 20, 240, 30);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(-10, 0, 800, 50);

        jButton1.setForeground(new java.awt.Color(0, 153, 51));
        jButton1.setText("Alterar");
        getContentPane().add(jButton1);
        jButton1.setBounds(10, 110, 80, 23);

        jPanel2.setBackground(new java.awt.Color(255, 255, 204));
        jPanel2.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), null));
        jPanel2.setLayout(null);

        jButton3.setText("Atualizar");
        jPanel2.add(jButton3);
        jButton3.setBounds(10, 190, 80, 23);

        jButton2.setForeground(new java.awt.Color(255, 0, 0));
        jButton2.setText("Apagar");
        jPanel2.add(jButton2);
        jButton2.setBounds(10, 120, 80, 23);

        jButton4.setForeground(new java.awt.Color(0, 0, 255));
        jButton4.setText("Voltar");
        jPanel2.add(jButton4);
        jButton4.setBounds(10, 480, 72, 23);

        getContentPane().add(jPanel2);
        jPanel2.setBounds(0, 60, 100, 520);

        jPanel3.setBackground(new java.awt.Color(255, 255, 204));
        jPanel3.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), null));
        getContentPane().add(jPanel3);
        jPanel3.setBounds(110, 60, 670, 520);

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(FrmGerenciaEmprestimo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmGerenciaEmprestimo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmGerenciaEmprestimo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmGerenciaEmprestimo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmGerenciaEmprestimo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable JTableEmprestimos;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables

    void carregaTabela() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
