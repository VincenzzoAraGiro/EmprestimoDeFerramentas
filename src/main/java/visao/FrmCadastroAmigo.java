package visao;

import javax.swing.JOptionPane;
import modelo.Amigo;

public class FrmCadastroAmigo extends javax.swing.JFrame {

    Amigo objeto = new Amigo();
    
    public FrmCadastroAmigo() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JLabelNome = new javax.swing.JLabel();
        JLabelTelefone = new javax.swing.JLabel();
        CadastrarAmigos = new javax.swing.JLabel();
        JTFTelefone = new javax.swing.JTextField();
        JTFNome = new javax.swing.JTextField();
        JBVoltar = new javax.swing.JButton();
        JBCadastrar = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Fast Ferramentas - Cadastro de Amigos");
        setMinimumSize(new java.awt.Dimension(483, 380));
        getContentPane().setLayout(null);

        JLabelNome.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        JLabelNome.setText("Nome:");
        getContentPane().add(JLabelNome);
        JLabelNome.setBounds(40, 59, 50, 20);

        JLabelTelefone.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        JLabelTelefone.setText("Telefone:");
        getContentPane().add(JLabelTelefone);
        JLabelTelefone.setBounds(40, 175, 70, 20);

        CadastrarAmigos.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        CadastrarAmigos.setText("Cadastrar Amigos");
        getContentPane().add(CadastrarAmigos);
        CadastrarAmigos.setBounds(170, 0, 160, 25);

        JTFTelefone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTFTelefoneActionPerformed(evt);
            }
        });
        getContentPane().add(JTFTelefone);
        JTFTelefone.setBounds(40, 209, 255, 22);

        JTFNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTFNomeActionPerformed(evt);
            }
        });
        getContentPane().add(JTFNome);
        JTFNome.setBounds(40, 93, 255, 22);

        JBVoltar.setBackground(new java.awt.Color(255, 102, 102));
        JBVoltar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        JBVoltar.setText("Voltar");
        JBVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBVoltarActionPerformed(evt);
            }
        });
        getContentPane().add(JBVoltar);
        JBVoltar.setBounds(60, 270, 100, 27);

        JBCadastrar.setBackground(new java.awt.Color(139, 253, 139));
        JBCadastrar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        JBCadastrar.setText("Cadastrar");
        JBCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBCadastrarActionPerformed(evt);
            }
        });
        getContentPane().add(JBCadastrar);
        JBCadastrar.setBounds(330, 270, 110, 27);
        getContentPane().add(jSeparator1);
        jSeparator1.setBounds(0, 145, 525, 24);
        getContentPane().add(jSeparator2);
        jSeparator2.setBounds(0, 249, 525, 24);
        getContentPane().add(jSeparator3);
        jSeparator3.setBounds(0, 29, 525, 24);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JTFTelefoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTFTelefoneActionPerformed

    }//GEN-LAST:event_JTFTelefoneActionPerformed

    private void JTFNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTFNomeActionPerformed

    }//GEN-LAST:event_JTFNomeActionPerformed

    private void JBVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBVoltarActionPerformed
        (this).setVisible(false);
    }//GEN-LAST:event_JBVoltarActionPerformed

    private void JBCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBCadastrarActionPerformed
String nome = "";
String telefone = "";

try {
    // Valida o campo de nome
    if (this.JTFNome.getText().length() < 2) {
        JOptionPane.showMessageDialog(null, "Nome deve conter ao menos 2 caracteres");
    } else {
        nome = this.JTFNome.getText();
    }

    // Valida o campo de telefone
    if (this.JTFTelefone.getText().length() < 2) {
        JOptionPane.showMessageDialog(null, "Telefone deve conter ao menos 2 caracteres");
    } else {
        telefone = this.JTFTelefone.getText();
    }

    // Verifica se ambos os campos são válidos
    if (!nome.isEmpty() && !telefone.isEmpty()) {
        if (this.objeto.insertAmigo(nome, telefone)) {
            JOptionPane.showMessageDialog(rootPane, "Amigo Cadastrado com Sucesso!");

            // Limpa os campos da interface
            this.JTFNome.setText("");
            this.JTFTelefone.setText("");
        }
        // Fecha a janela atual
        this.setVisible(false);
    }

} catch (Exception ex) {
    System.out.println("Erro: " + ex.getMessage());
    JOptionPane.showMessageDialog(null, "Ocorreu um erro: " + ex.getMessage());
}
    }//GEN-LAST:event_JBCadastrarActionPerformed

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
            java.util.logging.Logger.getLogger(FrmCadastroAmigo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmCadastroAmigo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmCadastroAmigo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmCadastroAmigo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmCadastroAmigo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel CadastrarAmigos;
    private javax.swing.JButton JBCadastrar;
    private javax.swing.JButton JBVoltar;
    private javax.swing.JLabel JLabelNome;
    private javax.swing.JLabel JLabelTelefone;
    private javax.swing.JTextField JTFNome;
    private javax.swing.JTextField JTFTelefone;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    // End of variables declaration//GEN-END:variables
}
