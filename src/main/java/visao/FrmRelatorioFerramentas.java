package visao;

import modelo.Ferramenta;
import javax.swing.table.DefaultTableModel;
import java.util.ArrayList;
import modelo.Relatorio;
import modelo.Emprestimo;
import javax.swing.JOptionPane;
import modelo.Amigo;

public class FrmRelatorioFerramentas extends javax.swing.JFrame {

     private Relatorio relatorioService;
     Emprestimo objeto;
    
     public FrmRelatorioFerramentas() {
        initComponents();
        objeto = new Emprestimo();
         this.relatorioService = new Relatorio();
         carregaTabelaAbertos();
        carregarDadosRelatorios();
         carregaTabelaAmigos();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TabelaRelatorios = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        FastFerramentasApp = new javax.swing.JLabel();
        DescriçãoTela = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        Voltar = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        Label32 = new javax.swing.JLabel();
        Label34 = new javax.swing.JLabel();
        Label33 = new javax.swing.JLabel();
        Label35 = new javax.swing.JLabel();
        LabelTotalFerramentasEmprestadas = new javax.swing.JLabel();
        LabelTotalEmpréstimosAbertos = new javax.swing.JLabel();
        LabelTotalAmigosAbertos = new javax.swing.JLabel();
        LabelTotalEmpréstimosPendentes = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        TabelaAbertos = new javax.swing.JTable();
        jPanel7 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        TabelaPendentes = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Fast Ferramentas - Relatórios");
        setMinimumSize(new java.awt.Dimension(960, 670));
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(255, 255, 215));
        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
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
                "ID", "Quem Emprestou", "Telefone"
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
        jScrollPane1.setBounds(10, 30, 290, 40);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setText("Maior Número de Empréstimos");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(10, 0, 230, 20);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(600, 90, 310, 80);

        jPanel3.setBackground(new java.awt.Color(255, 255, 215));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel3.setLayout(null);

        FastFerramentasApp.setFont(new java.awt.Font("MV Boli", 1, 28)); // NOI18N
        FastFerramentasApp.setText("Fast Ferramentas");
        jPanel3.add(FastFerramentasApp);
        FastFerramentasApp.setBounds(340, 0, 260, 40);

        DescriçãoTela.setFont(new java.awt.Font("MV Boli", 0, 18)); // NOI18N
        DescriçãoTela.setText("Relatórios");
        jPanel3.add(DescriçãoTela);
        DescriçãoTela.setBounds(410, 30, 90, 25);

        getContentPane().add(jPanel3);
        jPanel3.setBounds(10, 10, 900, 60);

        jPanel4.setBackground(new java.awt.Color(255, 255, 204));
        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel4.setLayout(null);

        Voltar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Voltar.setForeground(new java.awt.Color(0, 0, 255));
        Voltar.setText("Voltar");
        Voltar.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        Voltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VoltarActionPerformed(evt);
            }
        });
        jPanel4.add(Voltar);
        Voltar.setBounds(70, 10, 180, 30);

        getContentPane().add(jPanel4);
        jPanel4.setBounds(600, 570, 310, 50);

        jPanel5.setBackground(new java.awt.Color(255, 255, 204));
        jPanel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel5.setLayout(null);

        Label32.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Label32.setText("Total Ferramentas Emprestadas:");
        jPanel5.add(Label32);
        Label32.setBounds(20, 20, 180, 16);

        Label34.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Label34.setText("Empréstimos em Aberto:");
        jPanel5.add(Label34);
        Label34.setBounds(20, 100, 140, 16);

        Label33.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Label33.setText("Total amigos com empréstimos em aberto:");
        jPanel5.add(Label33);
        Label33.setBounds(20, 190, 240, 16);

        Label35.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Label35.setText("Total empréstimos pendentes:");
        jPanel5.add(Label35);
        Label35.setBounds(20, 270, 170, 16);

        LabelTotalFerramentasEmprestadas.setText("0");
        jPanel5.add(LabelTotalFerramentasEmprestadas);
        LabelTotalFerramentasEmprestadas.setBounds(210, 20, 40, 16);

        LabelTotalEmpréstimosAbertos.setText("0");
        jPanel5.add(LabelTotalEmpréstimosAbertos);
        LabelTotalEmpréstimosAbertos.setBounds(170, 100, 37, 16);

        LabelTotalAmigosAbertos.setText("0");
        jPanel5.add(LabelTotalAmigosAbertos);
        LabelTotalAmigosAbertos.setBounds(270, 190, 30, 16);

        LabelTotalEmpréstimosPendentes.setText("0");
        jPanel5.add(LabelTotalEmpréstimosPendentes);
        LabelTotalEmpréstimosPendentes.setBounds(200, 270, 40, 16);

        getContentPane().add(jPanel5);
        jPanel5.setBounds(600, 180, 310, 370);

        jPanel6.setBackground(new java.awt.Color(255, 255, 204));
        jPanel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel6.setLayout(null);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("Empréstimos em Aberto");
        jPanel6.add(jLabel3);
        jLabel3.setBounds(10, 10, 170, 20);

        TabelaAbertos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Amigo", "Dia do Empréstimo", "Restantes", "Devolução", "Quantidade Ferramentas", "Valor", "Status"
            }
        ));
        jScrollPane3.setViewportView(TabelaAbertos);

        jPanel6.add(jScrollPane3);
        jScrollPane3.setBounds(12, 30, 560, 190);

        getContentPane().add(jPanel6);
        jPanel6.setBounds(10, 340, 580, 240);

        jPanel7.setBackground(new java.awt.Color(255, 255, 204));
        jPanel7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel7.setLayout(null);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("Empréstimos Pendentes");
        jPanel7.add(jLabel2);
        jLabel2.setBounds(10, 10, 170, 20);

        TabelaPendentes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Amigo", "Dia do Empréstimo", "Restantes", "Devolução", "Quantidade Ferramentas", "Valor", "Status"
            }
        ));
        jScrollPane2.setViewportView(TabelaPendentes);

        jPanel7.add(jScrollPane2);
        jScrollPane2.setBounds(12, 30, 560, 190);

        getContentPane().add(jPanel7);
        jPanel7.setBounds(10, 90, 580, 230);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void VoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VoltarActionPerformed
        // Volta para a tela de Opções
        (this).setVisible(false);
        FrmOpções objeto = new FrmOpções();
        objeto.setVisible(true);
    }//GEN-LAST:event_VoltarActionPerformed
  private void carregarDadosRelatorios() {
        LabelTotalFerramentasEmprestadas.setText(String.valueOf(relatorioService.getLabelTotalFerramentasEmprestadas()));
        LabelTotalEmpréstimosAbertos.setText(String.valueOf(relatorioService.getLabelTotalEmpréstimosAbertos()));
        LabelTotalAmigosAbertos.setText(String.valueOf(relatorioService.getLabelTotalAmigosAbertos()));
        LabelTotalEmpréstimosPendentes.setText(String.valueOf(relatorioService.getLabelTotalEmpréstimosPendentes()));
    }   
    
 public void carregaTabelaAbertos() {
        DefaultTableModel modelo = (DefaultTableModel) this.TabelaAbertos.getModel();
        modelo.setNumRows(0);

        ArrayList<Emprestimo> minhalista = new ArrayList<>();
        minhalista = relatorioService.pegarListaAbertos();

        for (Emprestimo a : minhalista) {
            double valorTotal = a.calcularValorTotal();
            String status = "x";
            switch (a.getStatus().getCodigo()) {
                            case 1:
                                status = "Aberto";
                                break;
                            case 2:
                                status ="Fechado";
                                break;
                            case 3:
                                status ="Em Atraso";
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
    } 
  
 public void carregaTabelaPendentes() {
        DefaultTableModel modelo = (DefaultTableModel) this.TabelaPendentes.getModel();
        modelo.setNumRows(0);

        ArrayList<Emprestimo> minhalista = new ArrayList<>();
        minhalista = relatorioService.pegarListaPendentes();

        for (Emprestimo a : minhalista) {
            double valorTotal = a.calcularValorTotal();
            String status = "x";
            switch (a.getStatus().getCodigo()) {
                            case 1:
                                status = "Aberto";
                                break;
                            case 2:
                                status ="Fechado";
                                break;
                            case 3:
                                status ="Em Atraso";
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
    } 
   public void carregaTabelaAmigos() {

        DefaultTableModel modelo = (DefaultTableModel) this.TabelaRelatorios.getModel();
        modelo.setNumRows(0);

        Amigo colega = new Amigo();
        colega = relatorioService.pegarListaAmigos();

       
            System.out.print("id "+  colega.getId() +" nome: "+   colega.getNome()+ " telefone "+   colega.getTelefone());
            modelo.addRow(new Object[]{
                colega.getId(),
                colega.getNome(),
                colega.getTelefone()
            });
        
    }

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FrmRelatorioFerramentas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmRelatorioFerramentas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmRelatorioFerramentas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmRelatorioFerramentas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmRelatorioFerramentas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel DescriçãoTela;
    private javax.swing.JLabel FastFerramentasApp;
    private javax.swing.JLabel Label32;
    private javax.swing.JLabel Label33;
    private javax.swing.JLabel Label34;
    private javax.swing.JLabel Label35;
    private javax.swing.JLabel LabelTotalAmigosAbertos;
    private javax.swing.JLabel LabelTotalEmpréstimosAbertos;
    private javax.swing.JLabel LabelTotalEmpréstimosPendentes;
    private javax.swing.JLabel LabelTotalFerramentasEmprestadas;
    private javax.swing.JTable TabelaAbertos;
    private javax.swing.JTable TabelaPendentes;
    private javax.swing.JTable TabelaRelatorios;
    private javax.swing.JButton Voltar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    // End of variables declaration//GEN-END:variables

}
