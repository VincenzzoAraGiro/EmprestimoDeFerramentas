package visao;
import javax.swing.JOptionPane;
import modelo.Ferramenta;

public class FrmCadastroFerramenta extends javax.swing.JFrame {
     // Cria um objeto do tipo Ferramenta
    Ferramenta objeto = new Ferramenta();
    // Construtor da classe FrmCadastroFerramenta
    public FrmCadastroFerramenta() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        JTFCusto = new javax.swing.JTextField();
        JBCadastrar = new javax.swing.JButton();
        JBVoltar = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        Título = new javax.swing.JLabel();
        SubTítulo = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        JTFNome = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        JTFMarca = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Fast Ferramentas - Cadastro de Ferramentas");
        setMaximumSize(new java.awt.Dimension(2552525, 25525252));
        setMinimumSize(new java.awt.Dimension(550, 300));
        setPreferredSize(new java.awt.Dimension(483, 350));
        getContentPane().setLayout(null);

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setText("Custo");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(400, 130, 37, 20);

        JTFCusto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTFCustoActionPerformed(evt);
            }
        });
        getContentPane().add(JTFCusto);
        JTFCusto.setBounds(400, 160, 100, 22);

        JBCadastrar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        JBCadastrar.setForeground(new java.awt.Color(0, 153, 51));
        JBCadastrar.setText("Cadastrar");
        JBCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBCadastrarActionPerformed(evt);
            }
        });
        getContentPane().add(JBCadastrar);
        JBCadastrar.setBounds(320, 210, 110, 27);

        JBVoltar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        JBVoltar.setForeground(new java.awt.Color(0, 0, 255));
        JBVoltar.setText("Voltar");
        JBVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBVoltarActionPerformed(evt);
            }
        });
        getContentPane().add(JBVoltar);
        JBVoltar.setBounds(80, 210, 100, 27);

        jPanel1.setBackground(new java.awt.Color(255, 255, 204));
        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jPanel1.setLayout(null);

        Título.setFont(new java.awt.Font("MV Boli", 1, 28)); // NOI18N
        Título.setText("Fast Ferramentas");
        jPanel1.add(Título);
        Título.setBounds(120, 0, 260, 38);

        SubTítulo.setFont(new java.awt.Font("MV Boli", 1, 14)); // NOI18N
        SubTítulo.setText("Cadastro de Ferramentas");
        jPanel1.add(SubTítulo);
        SubTítulo.setBounds(150, 30, 190, 23);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(10, 10, 490, 50);

        jPanel2.setBackground(new java.awt.Color(255, 255, 204));
        jPanel2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        jPanel2.setLayout(null);

        JTFNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTFNomeActionPerformed(evt);
            }
        });
        jPanel2.add(JTFNome);
        JTFNome.setBounds(10, 60, 180, 22);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("Ferramenta");
        jPanel2.add(jLabel2);
        jLabel2.setBounds(10, 30, 90, 20);

        JTFMarca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTFMarcaActionPerformed(evt);
            }
        });
        jPanel2.add(JTFMarca);
        JTFMarca.setBounds(200, 60, 179, 22);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("Marca");
        jPanel2.add(jLabel3);
        jLabel3.setBounds(200, 30, 42, 20);

        getContentPane().add(jPanel2);
        jPanel2.setBounds(10, 100, 500, 160);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JTFMarcaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTFMarcaActionPerformed

    }//GEN-LAST:event_JTFMarcaActionPerformed

    private void JTFCustoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTFCustoActionPerformed

    }//GEN-LAST:event_JTFCustoActionPerformed

    private void JBVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBVoltarActionPerformed
        // Configuração do botão "Voltar"        
        (this).setVisible(false);
        FrmOpções objeto = new FrmOpções();
        objeto.setVisible(true);
    }//GEN-LAST:event_JBVoltarActionPerformed

    private void JBCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBCadastrarActionPerformed
        // Configuração do botão "Cadastrar"
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
                FrmOpções objeto = new FrmOpções();
                objeto.setVisible(true);
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
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
