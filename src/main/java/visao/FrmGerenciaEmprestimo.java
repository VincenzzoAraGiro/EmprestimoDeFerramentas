/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package visao;

/**
 *
 * @author Usuario
 */
public class FrmGerenciaEmprestimo extends javax.swing.JFrame {

    /**
     * Creates new form FrmGerenciaEmprestimo
     */
    public FrmGerenciaEmprestimo() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        JTableEmprestimos = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        JTFFerramentas = new javax.swing.JTextField();
        JTFNome = new javax.swing.JTextField();
        JBCancelar = new javax.swing.JButton();
        JBAtualizar = new javax.swing.JButton();

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
        jScrollPane1.setBounds(6, 6, 509, 98);

        jLabel1.setText("Ferramentas");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(28, 140, 65, 16);

        jLabel2.setText("Nome");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(28, 215, 33, 16);

        jLabel3.setText("Data de Devolução");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(337, 140, 99, 16);

        jLabel4.setText("Data do Empréstimo");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(337, 215, 108, 16);
        getContentPane().add(JTFFerramentas);
        JTFFerramentas.setBounds(28, 162, 258, 22);

        JTFNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTFNomeActionPerformed(evt);
            }
        });
        getContentPane().add(JTFNome);
        JTFNome.setBounds(28, 237, 260, 22);

        JBCancelar.setText("Cancelar");
        JBCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBCancelarActionPerformed(evt);
            }
        });
        getContentPane().add(JBCancelar);
        JBCancelar.setBounds(139, 304, 76, 23);

        JBAtualizar.setText("Atualizar");
        getContentPane().add(JBAtualizar);
        JBAtualizar.setBounds(308, 304, 76, 23);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JTFNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTFNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTFNomeActionPerformed

    private void JBCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBCancelarActionPerformed
        (this).setVisible(false);
    }//GEN-LAST:event_JBCancelarActionPerformed

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
    private javax.swing.JButton JBAtualizar;
    private javax.swing.JButton JBCancelar;
    private javax.swing.JTextField JTFFerramentas;
    private javax.swing.JTextField JTFNome;
    private javax.swing.JTable JTableEmprestimos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
