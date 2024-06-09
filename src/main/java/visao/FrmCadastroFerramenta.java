package visao;
import javax.swing.JOptionPane;
import modelo.Ferramenta;

public class FrmCadastroFerramenta extends javax.swing.JFrame {
    
    Ferramenta objeto = new Ferramenta();
    
    public FrmCadastroFerramenta() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        JTFMarca = new javax.swing.JTextField();
        JTFCusto = new javax.swing.JTextField();
        JTFNome = new javax.swing.JTextField();
        Título = new javax.swing.JLabel();
        SubTítulo = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        JBCadastrar = new javax.swing.JButton();
        JBVoltar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Fast Ferramentas - Cadastro de Ferramentas");
        setMaximumSize(new java.awt.Dimension(2552525, 25525252));
        setMinimumSize(new java.awt.Dimension(483, 380));
        setPreferredSize(new java.awt.Dimension(483, 350));
        getContentPane().setLayout(null);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("Ferramenta");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(200, 80, 90, 20);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("Marca");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(70, 180, 42, 20);

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setText("Custo");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(350, 180, 37, 20);

        JTFMarca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTFMarcaActionPerformed(evt);
            }
        });
        getContentPane().add(JTFMarca);
        JTFMarca.setBounds(10, 210, 179, 22);

        JTFCusto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTFCustoActionPerformed(evt);
            }
        });
        getContentPane().add(JTFCusto);
        JTFCusto.setBounds(280, 210, 174, 22);

        JTFNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTFNomeActionPerformed(evt);
            }
        });
        getContentPane().add(JTFNome);
        JTFNome.setBounds(60, 110, 372, 22);

        Título.setFont(new java.awt.Font("Segoe UI", 1, 28)); // NOI18N
        Título.setText("Fast Ferramentas");
        getContentPane().add(Título);
        Título.setBounds(0, -10, 350, 38);

        SubTítulo.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        SubTítulo.setText("Cadastro Ferramentas");
        getContentPane().add(SubTítulo);
        SubTítulo.setBounds(0, 20, 160, 20);
        getContentPane().add(jSeparator1);
        jSeparator1.setBounds(0, 50, 480, 10);

        JBCadastrar.setBackground(new java.awt.Color(139, 253, 139));
        JBCadastrar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        JBCadastrar.setText("Cadastrar");
        JBCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBCadastrarActionPerformed(evt);
            }
        });
        getContentPane().add(JBCadastrar);
        JBCadastrar.setBounds(310, 290, 110, 27);

        JBVoltar.setBackground(new java.awt.Color(255, 91, 91));
        JBVoltar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        JBVoltar.setText("Voltar");
        JBVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBVoltarActionPerformed(evt);
            }
        });
        getContentPane().add(JBVoltar);
        JBVoltar.setBounds(40, 290, 100, 27);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JTFMarcaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTFMarcaActionPerformed

    }//GEN-LAST:event_JTFMarcaActionPerformed

    private void JTFCustoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTFCustoActionPerformed

    }//GEN-LAST:event_JTFCustoActionPerformed

    private void JBVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBVoltarActionPerformed
        (this).setVisible(false);
    }//GEN-LAST:event_JBVoltarActionPerformed

    private void JBCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBCadastrarActionPerformed
        String nome = "";
        String marca = "";
        double custoAquisicao = 0.0;

        try {
            // Valida o campo de nome
            if (this.JTFNome.getText().length() < 3) {
                JOptionPane.showMessageDialog(null, "Nome deve conter ao menos 3 caracteres.");
            } else {
                nome = this.JTFNome.getText();
            }

            // Valida o campo de marca
            if (this.JTFMarca.getText().length() < 2) {
                JOptionPane.showMessageDialog(null, "Marca deve conter ao menos 2 caracteres.");
            } else {
                marca = this.JTFMarca.getText();
            }

            // Valida o campo de custo de aquisição
            String textoPreco = this.JTFCusto.getText().replaceAll("[^\\d.,]", "").replace(",", ".");
            if (!textoPreco.isEmpty()) {
                custoAquisicao = Double.parseDouble(textoPreco);
            } else {
                JOptionPane.showMessageDialog(null, "Custo de aquisição inválido.");
                throw new IllegalArgumentException("Custo de aquisição inválido.");
            }

            // Verifica se nome e marca são válidos
            if (!nome.isEmpty() && !marca.isEmpty()) {
                // Envia os dados para o controlador cadastrar
                if (this.objeto.insertFerramenta(nome, marca, custoAquisicao)) {
                    JOptionPane.showMessageDialog(rootPane, "Ferramenta cadastrada com sucesso!");

                    // Limpa campos da interface
                    this.JTFNome.setText("");
                    this.JTFMarca.setText("");
                    this.JTFCusto.setText("");
                }
                this.setVisible(false);
            }
        } catch (NumberFormatException ex) {
            System.out.println("Erro de formato de número: " + ex.getMessage());
            JOptionPane.showMessageDialog(null, "Erro de formato de número: " + ex.getMessage());
        } catch (Exception ex) {
            System.out.println("Erro: " + ex.getMessage());
            JOptionPane.showMessageDialog(null, "Ocorreu um erro: " + ex.getMessage());
        }
    }//GEN-LAST:event_JBCadastrarActionPerformed

    private void JTFNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTFNomeActionPerformed

    }//GEN-LAST:event_JTFNomeActionPerformed

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
            java.util.logging.Logger.getLogger(FrmCadastroFerramenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmCadastroFerramenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmCadastroFerramenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmCadastroFerramenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmCadastroFerramenta().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JBCadastrar;
    private javax.swing.JButton JBVoltar;
    private javax.swing.JTextField JTFCusto;
    private javax.swing.JTextField JTFMarca;
    private javax.swing.JTextField JTFNome;
    private javax.swing.JLabel SubTítulo;
    private javax.swing.JLabel Título;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables
}
