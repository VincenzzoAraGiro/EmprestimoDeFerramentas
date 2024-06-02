/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package visao;

/**
 *
 * @author Meu Computador
 */
public class FrmMenuPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form FrmMenuPrincipal
     */
    public FrmMenuPrincipal() {
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

        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        JMenuOpções = new javax.swing.JMenu();
        JMenuItemCadastoAmigo = new javax.swing.JMenuItem();
        JMenuItemCadastroFerramenta = new javax.swing.JMenuItem();
        JMenuItemGerenciarEmprestimos = new javax.swing.JMenuItem();
        JMenuItemGerenciarAmigos = new javax.swing.JMenuItem();
        JMenuItemGerenciarFerramentas = new javax.swing.JMenuItem();
        JMenuItemSair = new javax.swing.JMenuItem();
        JMenuSobre = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Menu Principal");
        setMinimumSize(new java.awt.Dimension(500, 300));
        getContentPane().setLayout(null);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/fundo2.jpg"))); // NOI18N
        jLabel1.setMaximumSize(new java.awt.Dimension(500, 300));
        jLabel1.setMinimumSize(new java.awt.Dimension(500, 300));
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, -240, 1100, 1200);

        jMenuBar1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        JMenuOpções.setText("Opções");
        JMenuOpções.setToolTipText("");

        JMenuItemCadastoAmigo.setText("Cadastrar Amigo");
        JMenuItemCadastoAmigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JMenuItemCadastoAmigoActionPerformed(evt);
            }
        });
        JMenuOpções.add(JMenuItemCadastoAmigo);

        JMenuItemCadastroFerramenta.setText("Cadastrar Ferramenta");
        JMenuOpções.add(JMenuItemCadastroFerramenta);

        JMenuItemGerenciarEmprestimos.setText("Gerenciar Empréstimos");
        JMenuOpções.add(JMenuItemGerenciarEmprestimos);

        JMenuItemGerenciarAmigos.setText("Gerenciar Amigos");
        JMenuOpções.add(JMenuItemGerenciarAmigos);

        JMenuItemGerenciarFerramentas.setText("Gerenciar Ferramentas");
        JMenuOpções.add(JMenuItemGerenciarFerramentas);

        JMenuItemSair.setText("Sair");
        JMenuOpções.add(JMenuItemSair);

        jMenuBar1.add(JMenuOpções);

        JMenuSobre.setText("Sobre");
        jMenuBar1.add(JMenuSobre);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JMenuItemCadastoAmigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JMenuItemCadastoAmigoActionPerformed
        // Instancia a Tela de Cadastro de Amigos
        FrmCadastroAmigo objeto = new FrmCadastroAmigo();
        objeto.setVisible(true);
    }//GEN-LAST:event_JMenuItemCadastoAmigoActionPerformed

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
            java.util.logging.Logger.getLogger(FrmMenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmMenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmMenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmMenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmMenuPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem JMenuItemCadastoAmigo;
    private javax.swing.JMenuItem JMenuItemCadastroFerramenta;
    private javax.swing.JMenuItem JMenuItemGerenciarAmigos;
    private javax.swing.JMenuItem JMenuItemGerenciarEmprestimos;
    private javax.swing.JMenuItem JMenuItemGerenciarFerramentas;
    private javax.swing.JMenuItem JMenuItemSair;
    private javax.swing.JMenu JMenuOpções;
    private javax.swing.JMenu JMenuSobre;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenuBar jMenuBar1;
    // End of variables declaration//GEN-END:variables
}
