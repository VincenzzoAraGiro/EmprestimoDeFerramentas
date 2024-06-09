package visao;

import dao.AmigoDAO;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo.Amigo;

public class FrmGerenciaAmigo extends javax.swing.JFrame {
    private Amigo objetoAmigo;
    
    public FrmGerenciaAmigo() {
        initComponents();
        this.objetoAmigo = new Amigo();
        this.carregaTabela();       
    }
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        JTableAmigos = new javax.swing.JTable();
        JBCancelar = new javax.swing.JButton();
        JBApagar = new javax.swing.JButton();
        JBAlterar = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        JTFTelefone = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        JTFNome = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        JTFID = new javax.swing.JTextField();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Gerenciamento de Amigos");
        setMinimumSize(new java.awt.Dimension(483, 380));
        getContentPane().setLayout(null);

        JTableAmigos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "ID", "Nome", "Telefone"
            }
        ));
        JTableAmigos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JTableAmigosMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(JTableAmigos);

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(27, 80, 430, 117);

        JBCancelar.setBackground(new java.awt.Color(255, 102, 102));
        JBCancelar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        JBCancelar.setText("Cancelar");
        JBCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBCancelarActionPerformed(evt);
            }
        });
        getContentPane().add(JBCancelar);
        JBCancelar.setBounds(26, 303, 90, 30);

        JBApagar.setBackground(new java.awt.Color(153, 255, 255));
        JBApagar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        JBApagar.setText("Apagar");
        JBApagar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBApagarActionPerformed(evt);
            }
        });
        getContentPane().add(JBApagar);
        JBApagar.setBounds(190, 300, 90, 30);

        JBAlterar.setBackground(new java.awt.Color(139, 253, 139));
        JBAlterar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        JBAlterar.setText("Alterar");
        JBAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBAlterarActionPerformed(evt);
            }
        });
        getContentPane().add(JBAlterar);
        JBAlterar.setBounds(354, 302, 90, 30);

        jPanel1.setBackground(new java.awt.Color(255, 255, 204));
        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jPanel1.setLayout(null);

        jLabel3.setFont(new java.awt.Font("MV Boli", 1, 28)); // NOI18N
        jLabel3.setText("Fast Ferramentas");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(110, 10, 260, 20);

        jLabel4.setFont(new java.awt.Font("MV Boli", 1, 14)); // NOI18N
        jLabel4.setText("Gerenciamento de Amigos");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(140, 30, 190, 23);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(10, 10, 460, 50);

        jPanel2.setBackground(new java.awt.Color(255, 255, 204));
        jPanel2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        jPanel2.setLayout(null);

        JTFTelefone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTFTelefoneActionPerformed(evt);
            }
        });
        jPanel2.add(JTFTelefone);
        JTFTelefone.setBounds(240, 190, 170, 22);

        jLabel2.setText("Telefone");
        jPanel2.add(jLabel2);
        jLabel2.setBounds(240, 170, 45, 16);
        jPanel2.add(JTFNome);
        JTFNome.setBounds(40, 190, 170, 22);

        jLabel1.setText("Nome");
        jPanel2.add(jLabel1);
        jLabel1.setBounds(40, 170, 33, 16);

        jLabel5.setText("ID");
        jPanel2.add(jLabel5);
        jLabel5.setBounds(40, 130, 11, 16);
        jPanel2.add(JTFID);
        JTFID.setBounds(40, 150, 40, 22);

        getContentPane().add(jPanel2);
        jPanel2.setBounds(10, 70, 460, 270);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JTFTelefoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTFTelefoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTFTelefoneActionPerformed

    private void JBCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBCancelarActionPerformed
        (this).setVisible(false);
    }//GEN-LAST:event_JBCancelarActionPerformed

    private void JBApagarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBApagarActionPerformed
        try {
        // validando dados da interface gráfica.
        int id = 0;
        if (this.JTableAmigos.getSelectedRow() == -1) {
            throw new Exception("Primeiro Selecione um amigo para APAGAR");
        } else {
            id = Integer.parseInt(this.JTableAmigos.getValueAt(this.JTableAmigos.getSelectedRow(), 0).toString());
        }
        Object[] options = {"Sim", "Não"};
        int resposta_usuario = JOptionPane.showOptionDialog(
                null, 
                "Tem certeza que deseja APAGAR esse amigo ?", 
                "Confirmação", 
                JOptionPane.YES_NO_OPTION, 
                JOptionPane.QUESTION_MESSAGE, 
                null, 
                options, 
                options[0] );  
        if (resposta_usuario == 0) {// clicou em SIM
            // envia os dados para o Amigo processar
            if (this.objetoAmigo.deleteAmigoBD(id)) {
                // limpa os campos
                this.JTFNome.setText("");
                this.JTFTelefone.setText("");
                this.JTFID.setText("");
                JOptionPane.showMessageDialog(rootPane, "Amigo Deletado!");
            }
        }
        System.out.println(this.objetoAmigo.pegarLista().toString());
    } catch (Exception erro) {
        JOptionPane.showMessageDialog(null, erro.getMessage());
    } finally {
        // atualiza a tabela.
        carregaTabela();
    }
    }//GEN-LAST:event_JBApagarActionPerformed

    private void JBAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBAlterarActionPerformed

        try {
            // recebendo e validando dados da interface gráfica.
            int id = 0;
            String nome = "";
            String telefone="";           
            
             if (this.JTableAmigos.getSelectedRow() == -1) {
                throw new Mensagem("Primeiro Selecione um amigo para Alterar");
            } else {
                id = Integer.parseInt(this.JTableAmigos.getValueAt(this.JTableAmigos.getSelectedRow(), 0).toString());
            }
            
            if (this.JTFNome.getText().length() <= 2) {
                throw new Mensagem("Nome deve conter ao menos 2 caracteres.");
            } else {
                nome = this.JTFNome.getText();
            }
            
            if (this.JTFTelefone.getText().length() <= 2) {
                throw new Mensagem("Telefone deve ao menos conter ao menos 2 digitos.");
            } else {
                telefone = this.JTFTelefone.getText();
            }


           
            
            // envia os dados para o Aluno processar
            if (this.objetoAmigo.updateAmigoBD(nome,id,telefone)) {
                // limpa os campos
                this.JTFNome.setText("");
                this.JTFTelefone.setText("");
                this.JTFID.setText("");
                JOptionPane.showMessageDialog(rootPane, "Amigo alterado!");
            }
            System.out.println(this.objetoAmigo.pegarLista().toString());
        } catch (Mensagem erro) {
            JOptionPane.showMessageDialog(null, erro.getMessage());
        } catch (NumberFormatException erro2) {
            JOptionPane.showMessageDialog(null, "Selecione um amigo para atualizar");
        } finally {
            carregaTabela(); // atualiza a tabela.
        }
    }//GEN-LAST:event_JBAlterarActionPerformed

    private void JTableAmigosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JTableAmigosMouseClicked
        
                    if (this.JTableAmigos.getSelectedRow() != -1) {

                    String id = ""+ this.JTableAmigos.getValueAt(this.JTableAmigos.getSelectedRow(), 0).toString();
                    String nome = this.JTableAmigos.getValueAt(this.JTableAmigos.getSelectedRow(), 1).toString();
                    String telefone = this.JTableAmigos.getValueAt(this.JTableAmigos.getSelectedRow(), 2).toString();

                    
                    
                    
                    this.JTFID.setText(id);
                    this.JTFNome.setText(nome);
                    this.JTFTelefone.setText(telefone);
                    
                    this.JTFID.setEnabled(false);
                }
    }//GEN-LAST:event_JTableAmigosMouseClicked

    public static void main(String args[]) {


        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmGerenciaAmigo().setVisible(true);
            }
        });
    }

    
   @SuppressWarnings("unchecked")
    public void carregaTabela() {

        DefaultTableModel modelo = (DefaultTableModel) this.JTableAmigos.getModel();
        modelo.setNumRows(0);

        ArrayList<Amigo> minhalista = new ArrayList<>();
        minhalista = objetoAmigo.pegarLista();

        for (Amigo a : minhalista) {
            modelo.addRow(new Object[]{
                a.getId(),
                a.getNome(),
               a.getTelefone()
            });
        }
    } 
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JBAlterar;
    private javax.swing.JButton JBApagar;
    private javax.swing.JButton JBCancelar;
    private javax.swing.JTextField JTFID;
    private javax.swing.JTextField JTFNome;
    private javax.swing.JTextField JTFTelefone;
    private javax.swing.JTable JTableAmigos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
