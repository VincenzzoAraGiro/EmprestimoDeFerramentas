package visao;

import java.awt.Color;
import java.awt.Component;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import modelo.Emprestimo;

public class FrmGerenciaEmprestimo extends javax.swing.JFrame {

    Emprestimo objeto;
    double totalEmprestimo;

    public FrmGerenciaEmprestimo() {
        initComponents();
        objeto = new Emprestimo();
        carregaTabela();
         setLocationRelativeTo(null);
    }

    public void carregaTabela() {
        DefaultTableModel modelo = (DefaultTableModel) this.JTableEmprestimos.getModel();
        modelo.setNumRows(0);

        ArrayList<Emprestimo> minhalista = new ArrayList<>();
        minhalista = objeto.pegarLista();

        for (Emprestimo a : minhalista) {
            double valorTotal = a.calcularValorTotal();
            String status = "x";
            switch (a.getStatus().getCodigo()) {
                            case 1:
                                status = "Aberto";
                                break;
                            case 2:
                                status ="Finalizado";
                                break;
                            case 3:
                                status ="Pendente";
                                break;
                            default:
                                 JOptionPane.showConfirmDialog(null, "Erro ao informar o status");
                                break;
                        }
            modelo.addRow(new Object[]{
                a.getIdEmprestimo(),
                a.getIdAmigo(),
                a.getDataInicial(),
                a.tempoRestante(a.getDataInicial(), a.getDataDevolucao()),
                a.getDataDevolucao(),
                a.qtdFerramentasEmprestimo(a.getIdEmprestimo()),
                valorTotal,
                status
            });
        }
        configurarRenderizadorTabela();
    }

    private void configurarRenderizadorTabela() {
        JTableEmprestimos.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
            @Override
            public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
                Component c = super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);

                String status = (String) table.getValueAt(row, 7); // Coluna do status
                switch (status) {
                    case "Aberto":
                        c.setBackground(Color.GREEN);
                        break;
                    case "Fechado":
                        c.setBackground(Color.GRAY);
                        break;
                    case "Em Atraso":
                        c.setBackground(Color.RED);
                        break;
                    default:
                        c.setBackground(Color.WHITE);
                        break;
                }
                return c;
            }
        });
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        JTableEmprestimos = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        Registrar = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        Atualizar = new javax.swing.JButton();
        Apagar = new javax.swing.JButton();
        Voltar = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Fast Ferramentas - Gerenciamento de Empréstimos");
        setMinimumSize(new java.awt.Dimension(800, 640));
        getContentPane().setLayout(null);

        JTableEmprestimos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null}
            },
            new String [] {
                "Amigo", "Ferramentas", "Data do Empréstimo", "Data de Devolução"
            }
        ));
        JTableEmprestimos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JTableEmprestimosMouseClicked(evt);
            }
        });
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

        Registrar.setForeground(new java.awt.Color(0, 153, 51));
        Registrar.setText("Registrar");
        Registrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegistrarActionPerformed(evt);
            }
        });
        getContentPane().add(Registrar);
        Registrar.setBounds(10, 110, 80, 23);

        jPanel2.setBackground(new java.awt.Color(255, 255, 204));
        jPanel2.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), null));
        jPanel2.setLayout(null);

        Atualizar.setText("Atualizar");
        Atualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AtualizarActionPerformed(evt);
            }
        });
        jPanel2.add(Atualizar);
        Atualizar.setBounds(10, 190, 80, 23);

        Apagar.setForeground(new java.awt.Color(255, 0, 0));
        Apagar.setText("Apagar");
        Apagar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ApagarActionPerformed(evt);
            }
        });
        jPanel2.add(Apagar);
        Apagar.setBounds(10, 120, 80, 23);

        Voltar.setForeground(new java.awt.Color(0, 0, 255));
        Voltar.setText("Voltar");
        Voltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VoltarActionPerformed(evt);
            }
        });
        jPanel2.add(Voltar);
        Voltar.setBounds(10, 480, 72, 23);

        getContentPane().add(jPanel2);
        jPanel2.setBounds(0, 60, 100, 520);

        jPanel3.setBackground(new java.awt.Color(255, 255, 204));
        jPanel3.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), null));
        getContentPane().add(jPanel3);
        jPanel3.setBounds(110, 60, 670, 520);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void VoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VoltarActionPerformed
        // Volta para a tela de Opções
        FrmOpções objeto = new FrmOpções();
        objeto.setVisible(true);
    }//GEN-LAST:event_VoltarActionPerformed

    private void JTableEmprestimosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JTableEmprestimosMouseClicked
        int selectedRow = JTableEmprestimos.getSelectedRow();
        if (selectedRow != -1) {
            // Captura o ID do empréstimo da linha selecionada
            int idEmprestimo = (int) JTableEmprestimos.getValueAt(selectedRow, 0);
            System.out.print(idEmprestimo);
            // Abre a tela de detalhes do empréstimo passando o ID
            FrmRelatorioEmprestimo detalhes = new FrmRelatorioEmprestimo(idEmprestimo);
            detalhes.setVisible(true);
        }
        this.setVisible(false);
    }//GEN-LAST:event_JTableEmprestimosMouseClicked

    private void RegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegistrarActionPerformed
        FrmCadastroEmprestimo objeto = new FrmCadastroEmprestimo();
        objeto.setVisible(true);
    }//GEN-LAST:event_RegistrarActionPerformed

    private void ApagarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ApagarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ApagarActionPerformed

    private void AtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AtualizarActionPerformed
        carregaTabela();
    }//GEN-LAST:event_AtualizarActionPerformed

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
    private javax.swing.JButton Apagar;
    private javax.swing.JButton Atualizar;
    private javax.swing.JTable JTableEmprestimos;
    private javax.swing.JButton Registrar;
    private javax.swing.JButton Voltar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables

}
