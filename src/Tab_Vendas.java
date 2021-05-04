
import java.awt.Color;
import java.awt.Component;
import java.awt.Image;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;



public class Tab_Vendas extends javax.swing.JFrame {

    public Tab_Vendas(String sql) {
        initComponents();
        
        this.getContentPane().setBackground(Color.getColor("#DEE6EB"));
        //Ícone ----------------------------------------------
        setSize(1000, 420); 
        jTable1.setRowHeight(30);
        
        try {
              Image iconeTitulo = ImageIO.read(getClass().getResource("/img/logotipo.png"));
              setIconImage(iconeTitulo);
          } catch(IOException e) {
            System.out.println("Erro");
          } 
        // -----------------------------------------------
        
        // Tela no Centro --------------------------------
        this.setLocationRelativeTo(null);
        // -----------------------------------------------
        for(int i=0; (i < 100) && (i < Variaveis.quantidadeVendasGroup) ; i++){
            jTable1.setValueAt(Variaveis.vendasTransacaoGroup[i], i, 0);
            jTable1.setValueAt(Variaveis.vendasDataGroup[i], i, 1);
            jTable1.setValueAt(Variaveis.vendasHorarioVendaGroup[i], i, 2);
            jTable1.setValueAt(Variaveis.vendasTotalGroup[i], i, 3);
            if(Variaveis.vendasStatusVendaGroup[i].equals("PENDENTE")){
                CorNaLinha();
                jTable1.setValueAt(Variaveis.vendasStatusVendaGroup[i], i, 4);
            } else if (Variaveis.vendasStatusVendaGroup[i].equals("FINALIZADO")){
                CorNaLinha();
                jTable1.setValueAt(Variaveis.vendasStatusVendaGroup[i], i, 4);
            } else if (Variaveis.vendasStatusVendaGroup[i].equals("CANCELADO")){
                CorNaLinha();
                jTable1.setValueAt(Variaveis.vendasStatusVendaGroup[i], i, 4);
            } else{
                CorNaLinha();
                jTable1.setValueAt(Variaveis.vendasStatusVendaGroup[i], i, 4);
            }
            
            jTable1.setValueAt(Variaveis.vendasCpfCnpjGroup[i], i, 5);
            jTable1.setValueAt(Variaveis.vendasNomeRazaoGroup[i], i, 6);
            jTable1.setValueAt(Variaveis.vendasFuncCpfGroup[i], i, 7);
            jTable1.setValueAt(Variaveis.vendasNomeGroup[i], i, 8);
        }
        
        
        
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        Logo = new javax.swing.JLabel();
        SAD = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("SISTEMA DE VENDAS");
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("ÚLTIMAS VENDAS");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(10, 15, 314, 45);

        jTable1.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Transação", "Data", "Hora", "Total", "Status", "CNPJ", "Razão Social", "Cód. Func", "Nome Func"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setMinWidth(100);
        }

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(10, 71, 970, 280);

        Logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/fechar.png"))); // NOI18N
        Logo.setFocusCycleRoot(true);
        Logo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Logo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                LogoMousePressed(evt);
            }
        });
        getContentPane().add(Logo);
        Logo.setBounds(930, 10, 50, 50);

        SAD.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        SAD.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/fundo.png"))); // NOI18N
        getContentPane().add(SAD);
        SAD.setBounds(-10, -10, 1290, 710);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void LogoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LogoMousePressed
        // Voltando
        this.dispose();
    }//GEN-LAST:event_LogoMousePressed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // SELECIONAR CAMPO
        String valor = "";
        int linha = 0;
        linha = jTable1.getSelectedRow();
        valor = jTable1.getValueAt(linha, 0).toString();
        Vendas.jTextField1.setText(valor);
        Vendas.jButton1.doClick();
        this.dispose();
    }//GEN-LAST:event_jTable1MouseClicked

    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                String sql="";
                new Tab_Produtos(sql).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Logo;
    private javax.swing.JLabel SAD;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables


//***********************************************************************************************************
    //COR NA LINHA *****************************************************************
    public void CorNaLinha(){
        
        jTable1.setDefaultRenderer(Object.class, new DefaultTableCellRenderer(){
            @Override
            public Component getTableCellRendererComponent(JTable table, Object value,
            boolean  isSelected, boolean hasFocus, int row, int column){
                JLabel label = (JLabel) super.getTableCellRendererComponent(table, value, hasFocus, hasFocus, row, column);
                Color c = Color.WHITE;
                Object texto = jTable1.getValueAt(row, 4);
                //*****************************************
                if(texto != null && jTable1.getValueAt(row, 4).toString().equals("FINALIZADO"))
                    c = Color.decode("#B6DAFB");
                    label.setBackground(c);
                //*****************************************
                if(texto != null && jTable1.getValueAt(row, 4).toString().equals("CANCELADO"))
                    c = Color.decode("#F9B2B3");
                    label.setBackground(c);
                //*****************************************
                if(texto != null && jTable1.getValueAt(row, 4).toString().equals("PENDENTE"))
                    c = Color.decode("#FBF5C6");
                    label.setBackground(c);
                //*****************************************
                return label;                            
            }
            });
        }
    //***********************************************************************************************************
    
}
