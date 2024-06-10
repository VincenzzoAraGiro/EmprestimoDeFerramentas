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
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Fast Ferramentas - Cadastro de Amigos");
        setMinimumSize(new java.awt.Dimension(645, 510));
        getContentPane().setLayout(null);

        JLabelNome.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        JLabelNome.setText("Nome:");
        getContentPane().add(JLabelNome);
        JLabelNome.setBounds(180, 150, 50, 20);

        JLabelTelefone.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        JLabelTelefone.setText("Telefone:");
        getContentPane().add(JLabelTelefone);
        JLabelTelefone.setBounds(180, 260, 70, 20);

        CadastrarAmigos.setFont(new java.awt.Font("MV Boli", 1, 14)); // NOI18N
        CadastrarAmigos.setText("Cadastrar Amigos");
        getContentPane().add(CadastrarAmigos);
        CadastrarAmigos.setBounds(240, 40, 160, 20);

        JTFTelefone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTFTelefoneActionPerformed(evt);
            }
        });
        getContentPane().add(JTFTelefone);
        JTFTelefone.setBounds(180, 300, 255, 22);

        JTFNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTFNomeActionPerformed(evt);
            }
        });
        getContentPane().add(JTFNome);
        JTFNome.setBounds(180, 180, 255, 22);

        JBVoltar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        JBVoltar.setForeground(new java.awt.Color(0, 0, 255));
        JBVoltar.setText("Voltar");
        JBVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBVoltarActionPerformed(evt);
            }
        });
        getContentPane().add(JBVoltar);
        JBVoltar.setBounds(90, 380, 100, 27);

        JBCadastrar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        JBCadastrar.setForeground(new java.awt.Color(0, 153, 0));
        JBCadastrar.setText("Cadastrar");
        JBCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBCadastrarActionPerformed(evt);
            }
        });
        getContentPane().add(JBCadastrar);
        JBCadastrar.setBounds(440, 380, 110, 27);

        jLabel1.setFont(new java.awt.Font("MV Boli", 1, 28)); // NOI18N
        jLabel1.setText("Fast Ferramentas");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(180, 10, 270, 46);

        jPanel1.setBackground(new java.awt.Color(255, 255, 204));
        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        getContentPane().add(jPanel1);
        jPanel1.setBounds(10, 10, 600, 60);

        jPanel2.setBackground(new java.awt.Color(255, 255, 204));
        jPanel2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 4, true));
        getContentPane().add(jPanel2);
        jPanel2.setBounds(10, 100, 600, 360);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JTFTelefoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTFTelefoneActionPerformed

    }//GEN-LAST:event_JTFTelefoneActionPerformed

    private void JTFNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTFNomeActionPerformed

    }//GEN-LAST:event_JTFNomeActionPerformed

    private void JBVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBVoltarActionPerformed
        (this).setVisible(false);
        FrmOpções objeto = new FrmOpções();
        objeto.setVisible(true);
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
        FrmOpções objeto = new FrmOpções();
        objeto.setVisible(true);
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
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
