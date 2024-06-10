package visao;

import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

import javax.swing.JButton;
import javax.swing.JOptionPane;
import modelo.Ferramenta;
 
public class FrmGerenciaFerramenta extends javax.swing.JFrame {
 private Ferramenta objetoFerramenta;
   
    public FrmGerenciaFerramenta() {
        initComponents();
        this.objetoFerramenta = new Ferramenta(); 
        this.carregaTabela();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JBVoltar = new javax.swing.JButton();
        JBApagar = new javax.swing.JButton();
        JBAlterar = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        JTFNome = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        JTFMarca = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        JTFStatus = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        JTFCusto = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        JTableFerramentas = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        JTFID = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Fast Ferramentas - Gerenciamento de Ferramentas");
        setMinimumSize(new java.awt.Dimension(790, 580));
        setPreferredSize(new java.awt.Dimension(483, 380));
        getContentPane().setLayout(null);

        JBVoltar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        JBVoltar.setForeground(new java.awt.Color(0, 0, 255));
        JBVoltar.setText("Voltar");
        JBVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBVoltarActionPerformed(evt);
            }
        });
        getContentPane().add(JBVoltar);
        JBVoltar.setBounds(50, 470, 80, 27);

        JBApagar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        JBApagar.setForeground(new java.awt.Color(255, 0, 0));
        JBApagar.setText("Apagar");
        JBApagar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBApagarActionPerformed(evt);
            }
        });
        getContentPane().add(JBApagar);
        JBApagar.setBounds(320, 470, 90, 27);

        JBAlterar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        JBAlterar.setForeground(new java.awt.Color(0, 153, 51));
        JBAlterar.setText("Alterar");
        JBAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBAlterarActionPerformed(evt);
            }
        });
        getContentPane().add(JBAlterar);
        JBAlterar.setBounds(610, 470, 90, 30);

        jPanel1.setBackground(new java.awt.Color(255, 255, 204));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.setLayout(null);
        jPanel1.add(JTFNome);
        JTFNome.setBounds(10, 40, 240, 22);

        jLabel1.setText("Nome");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(10, 20, 33, 16);

        jLabel2.setText("Marca");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(10, 70, 50, 16);
        jPanel1.add(JTFMarca);
        JTFMarca.setBounds(10, 90, 240, 22);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(10, 320, 350, 130);

        jPanel2.setBackground(new java.awt.Color(255, 255, 204));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.setLayout(null);

        JTFStatus.setText("False");
        jPanel2.add(JTFStatus);
        JTFStatus.setBounds(10, 100, 280, 22);

        jLabel5.setText("Status");
        jPanel2.add(jLabel5);
        jLabel5.setBounds(10, 80, 40, 16);
        jPanel2.add(JTFCusto);
        JTFCusto.setBounds(10, 50, 280, 22);

        jLabel4.setText("Custo");
        jPanel2.add(jLabel4);
        jLabel4.setBounds(10, 30, 40, 16);

        getContentPane().add(jPanel2);
        jPanel2.setBounds(380, 320, 360, 130);

        jPanel4.setBackground(new java.awt.Color(255, 255, 204));
        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(jPanel4);
        jPanel4.setBounds(10, 460, 730, 50);

        jPanel3.setBackground(new java.awt.Color(255, 255, 204));
        jPanel3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        jPanel3.setLayout(null);

        JTableFerramentas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Nome", "Custo", "Marca", "Status", "Data Empréstimo", "Data Devolução"
            }
        ));
        JTableFerramentas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JTableFerramentasMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(JTableFerramentas);

        jPanel3.add(jScrollPane1);
        jScrollPane1.setBounds(10, 10, 710, 190);

        jLabel3.setText("ID");
        jPanel3.add(jLabel3);
        jLabel3.setBounds(20, 200, 31, 16);

        JTFID.setText("1");
        jPanel3.add(JTFID);
        JTFID.setBounds(20, 220, 40, 22);

        getContentPane().add(jPanel3);
        jPanel3.setBounds(10, 60, 730, 250);

        jLabel6.setFont(new java.awt.Font("MV Boli", 1, 28)); // NOI18N
        jLabel6.setText("Fast Ferramentas");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(250, 0, 250, 46);

        jLabel7.setFont(new java.awt.Font("MV Boli", 0, 14)); // NOI18N
        jLabel7.setText("Gerenciamento de Ferramentas");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(260, 30, 220, 23);

        jPanel5.setBackground(new java.awt.Color(255, 255, 204));
        jPanel5.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        getContentPane().add(jPanel5);
        jPanel5.setBounds(10, 10, 730, 40);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JTableFerramentasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JTableFerramentasMouseClicked
        
        if (this.JTableFerramentas.getSelectedRow() != -1) {

                    String id = ""+ this.JTableFerramentas.getValueAt(this.JTableFerramentas.getSelectedRow(), 0).toString();
                    String nome = this.JTableFerramentas.getValueAt(this.JTableFerramentas.getSelectedRow(), 1).toString();
                    String preco = this.JTableFerramentas.getValueAt(this.JTableFerramentas.getSelectedRow(), 2).toString();
                    String marca = this.JTableFerramentas.getValueAt(this.JTableFerramentas.getSelectedRow(), 3).toString();
                    String status = this.JTableFerramentas.getValueAt(this.JTableFerramentas.getSelectedRow(), 4).toString();
                    
                    
                    
                    this.JTFNome.setText(nome);
                    this.JTFMarca.setText(marca);
                    this.JTFCusto.setText(preco);
                    this.JTFStatus.setText(status);
                    this.JTFID.setText(id);
                    
                    this.JTFID.setEnabled(false);
                    this.JTFStatus.setEnabled(false);
                }                                           
    }//GEN-LAST:event_JTableFerramentasMouseClicked

    private void JBAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBAlterarActionPerformed
      try {
            // recebendo e validando dados da interface gráfica.
            int id = 0;
            String nome = "";
            String marca="";
            double preco =0.0;
            boolean status = false;            

            if (this.JTFNome.getText().length() <= 2) {
                throw new Mensagem("Nome deve conter ao menos 2 caracteres.");
            } else {
                nome = this.JTFNome.getText();
            }
            
            if (this.JTFMarca.getText().length() <= 2) {
                throw new Mensagem("Marca deve conter ao menos 2 caracteres.");
            } else {
                marca = this.JTFMarca.getText();
            }

            if (this.JTFCusto.getText().length() <= 2) {
                throw new Mensagem("Preço deve conter ao menos 2 caracteres.");
            } else {
                preco = Double.parseDouble(this.JTFCusto.getText());
            }

            if (this.JTableFerramentas.getSelectedRow() == -1) {
                throw new Mensagem("Primeiro Selecione uma Ferramenta para Alterar");
            } else {
                id = Integer.parseInt(this.JTableFerramentas.getValueAt(this.JTableFerramentas.getSelectedRow(), 0).toString());
            }
            
            if(this.JTFStatus.getText().equals("Disponível")){
                status = false;
            }else{
                status= true;
            }
            // envia os dados para o Aluno processar
            if (this.objetoFerramenta.updateFerramentaBD(nome,id,marca,status,preco  )) {
                // limpa os campos
                this.JTFNome.setText("");
                    this.JTFMarca.setText("");
                    this.JTFCusto.setText("");
                    this.JTFStatus.setText("");
                    this.JTFID.setText("");
                JOptionPane.showMessageDialog(rootPane, "Ferramenta alterada!");

            }
            System.out.println(this.objetoFerramenta.pegarLista().toString());
        } catch (Mensagem erro) {
            JOptionPane.showMessageDialog(null, erro.getMessage());
        } catch (NumberFormatException erro2) {
            JOptionPane.showMessageDialog(null, "Informe um número.");
        } finally {
            carregaTabela(); // atualiza a tabela.
        }
    }//GEN-LAST:event_JBAlterarActionPerformed

    private void JBVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBVoltarActionPerformed
        (this).setVisible(false);
        FrmOpções objeto = new FrmOpções();
        objeto.setVisible(true);
    }//GEN-LAST:event_JBVoltarActionPerformed

    private void JBApagarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBApagarActionPerformed
        try {
            // validando dados da interface gráfica.
            int id = 0;
            if (this.JTableFerramentas.getSelectedRow() == -1) {
                throw new Mensagem("Primeiro Selecione uma Ferramenta para APAGAR");
            } else {
                id = Integer.parseInt(this.JTableFerramentas.getValueAt(this.JTableFerramentas.getSelectedRow(), 0).toString());
            }
            
            // Define os textos dos botões
            Object[] options = {"Sim", "Não"};
            int resposta_usuario = JOptionPane.showOptionDialog(
                    null, 
                "Tem certeza que deseja APAGAR essa ferramenta ?", 
                "Confirmação", 
                JOptionPane.YES_NO_OPTION, 
                JOptionPane.QUESTION_MESSAGE, 
                null, 
                options, 
                options[0] );          
            
            if (resposta_usuario == 0) {// clicou em SIM

                // envia os dados para o Aluno processar
                if (this.objetoFerramenta.deleteFerramentaBD(id)) {

                    // limpa os campos
                    this.JTFNome.setText("");
                    this.JTFMarca.setText("");
                    this.JTFCusto.setText("");
                    this.JTFStatus.setText("");
                    this.JTFID.setText("");
                    JOptionPane.showMessageDialog(rootPane, "Ferramenta apagada!");
                }
            }
            System.out.println(this.objetoFerramenta.pegarLista().toString());

        } catch (Mensagem erro) {
            JOptionPane.showMessageDialog(null, erro.getMessage());
        } finally {
            // atualiza a tabela.
            carregaTabela();
        }
    }//GEN-LAST:event_JBApagarActionPerformed
    public static void main(String args[]) {
    
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ferramenta().setVisible(true);
            }
        });
    }
    @SuppressWarnings("unchecked")
    
    public void carregaTabela() {
    DefaultTableModel modelo = (DefaultTableModel) this.JTableFerramentas.getModel();
    modelo.setNumRows(0);
    ArrayList<Ferramenta> minhalista = objetoFerramenta.pegarLista();
    for (Ferramenta a : minhalista) {
         System.out.println("a: "+a.getId());
        String x="";
        if (a.isStatus() == false) {
            x = "Disponível";
        } else {
            x = "Indisponível";
        }
        modelo.addRow(new Object[]{
            a.getId(),
            a.getNome(),
            a.getCusto(),
            a.getMarca(),
            x
        });
    }    
}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JBAlterar;
    private javax.swing.JButton JBApagar;
    private javax.swing.JButton JBVoltar;
    private javax.swing.JTextField JTFCusto;
    private javax.swing.JTextField JTFID;
    private javax.swing.JTextField JTFMarca;
    private javax.swing.JTextField JTFNome;
    private javax.swing.JTextField JTFStatus;
    private javax.swing.JTable JTableFerramentas;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}