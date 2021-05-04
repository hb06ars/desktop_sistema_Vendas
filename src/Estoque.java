
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.Toolkit;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JOptionPane;


public class Estoque extends javax.swing.JFrame {

    public static String usuario = "";
    public static String senha = "";
    public static Boolean voltarEstoque = false;
    int pagina=0;
    
    
    
    public Estoque() {
        initComponents();
        /*TELA*/
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        String width = ""+(screenSize.getWidth()-0);
        String height = ""+(screenSize.getHeight()-0);
        width = width.replace(".0", "");
        height = height.replace(".0", "");
        this.setMinimumSize(new Dimension(Integer.parseInt(""+width), Integer.parseInt(""+height)));
        this.setExtendedState(JFrame.MAXIMIZED_BOTH); 
        this.setSize(new Dimension(Integer.parseInt(width), Integer.parseInt(height)));
        this.setBounds(0, 0, Integer.parseInt(""+width), Integer.parseInt(""+height));
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        SAD.setSize(Integer.parseInt(""+2060), Integer.parseInt(""+908));
        /*TELA*/
        
        
        // Mostrar barra de rolagem
        jTable1.setAutoResizeMode(jTable1.AUTO_RESIZE_OFF); 
        jTable1.setSize(Integer.parseInt(""+width), Integer.parseInt(""+height));
        jTable1.setRowHeight(30); 
       
        // Tamanho da tela -------------------------------
        setSize(Integer.parseInt(""+width), Integer.parseInt(""+height)); 
        Conexao.sql = "select * from sistema.produtos order by estoque";
        inicioAutomatico();
        // -----------------------------------------------
        
        //Ícone ----------------------------------------------
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

        
        // CONEXÃO COM BANCO --------------------------------
        //Conexao conectado = new Conexao();
        //conectado.conecta();
        // CONEXÃO COM BANCO --------------------------------
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tipo = new javax.swing.ButtonGroup();
        Logo1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        Logo = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jTextField1 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        Logo2 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        SAD = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("SISTEMA DE VENDAS");
        setResizable(false);
        getContentPane().setLayout(null);

        Logo1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/atualizar.png"))); // NOI18N
        Logo1.setFocusCycleRoot(true);
        Logo1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Logo1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Logo1MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                Logo1MouseReleased(evt);
            }
        });
        getContentPane().add(Logo1);
        Logo1.setBounds(300, 10, 50, 50);

        jLabel2.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 51));
        jLabel2.setText("ESTOQUE");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(70, 10, 470, 50);

        Logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/fechar.png"))); // NOI18N
        Logo.setFocusCycleRoot(true);
        Logo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Logo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                LogoMousePressed(evt);
            }
        });
        getContentPane().add(Logo);
        Logo.setBounds(1120, 10, 50, 50);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/estoque.png"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(10, 10, 50, 50);

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/SetaPrimeira.png"))); // NOI18N
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(900, 588, 60, 60);

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/setaEsquerda.png"))); // NOI18N
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4);
        jButton4.setBounds(970, 588, 60, 60);

        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/setaDireita.png"))); // NOI18N
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5);
        jButton5.setBounds(1040, 588, 60, 60);

        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/setaUltima.png"))); // NOI18N
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton6);
        jButton6.setBounds(1110, 588, 60, 60);

        jTable1.setAutoCreateRowSorter(true);
        jTable1.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
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
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "CÓDIGO ITEM", "ITEM", "MODELO", "DESCRIÇÃO", "FORNECEDOR", "ESTOQUE", "VALOR UNITÁRIO"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setMinWidth(160);
            jTable1.getColumnModel().getColumn(0).setPreferredWidth(160);
            jTable1.getColumnModel().getColumn(1).setMinWidth(150);
            jTable1.getColumnModel().getColumn(1).setPreferredWidth(160);
            jTable1.getColumnModel().getColumn(2).setMinWidth(160);
            jTable1.getColumnModel().getColumn(2).setPreferredWidth(160);
            jTable1.getColumnModel().getColumn(3).setMinWidth(160);
            jTable1.getColumnModel().getColumn(3).setPreferredWidth(160);
            jTable1.getColumnModel().getColumn(4).setMinWidth(193);
            jTable1.getColumnModel().getColumn(4).setPreferredWidth(193);
            jTable1.getColumnModel().getColumn(5).setMinWidth(150);
            jTable1.getColumnModel().getColumn(5).setPreferredWidth(150);
            jTable1.getColumnModel().getColumn(6).setMinWidth(150);
            jTable1.getColumnModel().getColumn(6).setPreferredWidth(150);
        }

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(20, 82, 1150, 500);

        jTextField1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        getContentPane().add(jTextField1);
        jTextField1.setBounds(75, 605, 130, 30);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/pesquisar.png"))); // NOI18N
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel3);
        jLabel3.setBounds(720, 595, 50, 50);

        jLabel20.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(0, 0, 51));
        jLabel20.setText("Item:");
        getContentPane().add(jLabel20);
        jLabel20.setBounds(20, 602, 140, 40);

        jLabel21.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(0, 0, 51));
        jLabel21.setText("Modelo:");
        getContentPane().add(jLabel21);
        jLabel21.setBounds(225, 602, 140, 40);

        jTextField2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        getContentPane().add(jTextField2);
        jTextField2.setBounds(300, 605, 130, 30);

        jLabel22.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(0, 0, 51));
        jLabel22.setText("Fornecedor:");
        getContentPane().add(jLabel22);
        jLabel22.setBounds(455, 602, 140, 40);

        jTextField3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        getContentPane().add(jTextField3);
        jTextField3.setBounds(560, 605, 130, 30);

        Logo2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/mesa.png"))); // NOI18N
        Logo2.setFocusCycleRoot(true);
        Logo2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Logo2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Logo2MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                Logo2MouseReleased(evt);
            }
        });
        getContentPane().add(Logo2);
        Logo2.setBounds(840, 10, 50, 50);

        jLabel23.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(0, 0, 51));
        jLabel23.setText("Item:");
        getContentPane().add(jLabel23);
        jLabel23.setBounds(640, 15, 110, 40);

        jTextField4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        getContentPane().add(jTextField4);
        jTextField4.setBounds(690, 20, 130, 30);

        SAD.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        SAD.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/fundo.png"))); // NOI18N
        getContentPane().add(SAD);
        SAD.setBounds(-10, -10, 1290, 710);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void LogoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LogoMousePressed
        // Voltando
        Principal menuPrincipal = new Principal();
        menuPrincipal.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_LogoMousePressed

    private void Logo1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Logo1MousePressed
        // CLICANDO EM ATUALIZAR ESTOQUE
        this.setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR));
        pagina = 0;
        int i=0;
        Conexao.sql = "select * from sistema.produtos order by estoque";
        
        
        //Limpando variáveis
        Variaveis.LimparVariaveisProdutos();
        
        //Conectando ao Banco
        Conexao conecta = new Conexao();
        conecta.conecta();
        
        //Executando Query
        conecta.selectTabelaProdutos(Conexao.sql);
        
        if(Variaveis.encontrado <= 0 ){            
            //Chamando caso nada for encontrado.
            this.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
            Mensagens.Padrao("Não tem nada no estoque!");
            
        } else{
        //Preenchendo a tabela de estoque
            for(i=0; (i < 100) && (i < Variaveis.quantidade) ; i++){
                jTable1.setValueAt(Variaveis.tabelaIdproduto[i], i, 0);
                jTable1.setValueAt(Variaveis.tabelaNomeProduto[i], i, 1);
                jTable1.setValueAt(Variaveis.tabelaModelo[i], i, 2);
                jTable1.setValueAt(Variaveis.tabelaDescricao[i], i, 3);
                jTable1.setValueAt(Variaveis.tabelaFornecedor[i], i, 4);
                jTable1.setValueAt(Variaveis.tabelaEstoque[i], i, 5);
                jTable1.setValueAt(Variaveis.tabelaprecoUnitario[i], i, 6);
                
            }
        }
            
            Variaveis.jaPesquisado = 1;
        
        this.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));

        
        
    }//GEN-LAST:event_Logo1MousePressed

    private void Logo1MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Logo1MouseReleased
        
    }//GEN-LAST:event_Logo1MouseReleased

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        // FILTRANDO
        this.setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR));
        if(jTextField1.getText().equals("") && jTextField2.getText().equals("") && jTextField3.getText().equals("")){
            this.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
            Mensagens.Padrao("Os campos não estão preenchidos!");
            
        }else{
            pagina = 0;
            String primeiro = "";
            String segundo = "";
            String terceiro = "";
            if(!jTextField1.getText().equals("")){
                primeiro = " and nome like '%"+jTextField1.getText()+"%' ";
            }
            if(!jTextField2.getText().equals("")){
                segundo = " and modelo like '%"+jTextField2.getText()+"%' ";
            }
            if(!jTextField3.getText().equals("")){
                terceiro = " and fornecedor like '%"+jTextField3.getText()+"%' ";
            }
            Conexao.sql = "select * from sistema.produtos where 1 = 1 "+primeiro+segundo+terceiro+" order by estoque;";
            inicioAutomatico();
        }
        this.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
    }//GEN-LAST:event_jLabel3MouseClicked

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // Avançando uma pagina
        if(pagina%Variaveis.quantidade == 0){
            if(pagina < (Variaveis.quantidade/100)){
                pagina++;
                inicioAutomatico();
            } 
        } else{
            if(pagina < ((Variaveis.quantidade/100))){
                pagina++;
                inicioAutomatico();
        }
        }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // Retrocedendo uma pagina
        // Avançando uma pagina
        if(pagina>0){
            pagina--;
            inicioAutomatico();
        } 
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // Primeira página
        pagina = 0;
        inicioAutomatico();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // Última página
        if(pagina%Variaveis.quantidade == 0){
            pagina = Variaveis.quantidade/100;
            inicioAutomatico();
        } else{
            pagina = (Variaveis.quantidade/100);
            inicioAutomatico();
        }
    }//GEN-LAST:event_jButton6ActionPerformed

    private void Logo2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Logo2MousePressed
        // FILTRANDO
        this.setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR));
        if(!jTextField4.getText().equals("")){
            pagina = 0;
            Conexao.sql = "select * from sistema.produtos where idproduto = '"+jTextField4.getText()+"';";
            inicioAutomatico();
        } else{
            this.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
            Mensagens.Padrao("Preencha o campo com o ID do Produto.");
        }
        this.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
    }//GEN-LAST:event_Logo2MousePressed

    private void Logo2MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Logo2MouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_Logo2MouseReleased

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // ABRINDO O PRODUTO
        if(Variaveis.permissaoLogado > 0){
            voltarEstoque = true;    
            String valor = "";
            int linha = 0;
            linha = jTable1.getSelectedRow();
            valor = jTable1.getValueAt(linha, 0).toString();
            CadastroProdutos cad = new CadastroProdutos();
            cad.setVisible(true);
            CadastroProdutos.jTextField1.setText(valor);
            CadastroProdutos.jButton1.doClick();
        }
        else{
            Mensagens.Padrao("Sem permissão para acessar.");
        }
        
    }//GEN-LAST:event_jTable1MouseClicked

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Logo;
    private javax.swing.JLabel Logo1;
    private javax.swing.JLabel Logo2;
    private javax.swing.JLabel SAD;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    public static javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.ButtonGroup tipo;
    // End of variables declaration//GEN-END:variables


public void inicioAutomatico(){
    // CLICANDO EM ATUALIZAR ESTOQUE   
        int i=0;
        
        //Limpando a tabela
        for(i=0;i<100;i++){
           jTable1.setValueAt("", i, 0); 
           jTable1.setValueAt("", i, 1); 
           jTable1.setValueAt("", i, 2); 
           jTable1.setValueAt("", i, 3); 
           jTable1.setValueAt("", i, 4); 
           jTable1.setValueAt("", i, 5); 
           jTable1.setValueAt("", i, 6); 
        }
        
        //Limpando variáveis
        Variaveis.LimparVariaveisProdutos();
        
        //Conectando ao Banco
        Conexao conecta = new Conexao();
        conecta.conecta();
        
        //Executando Query
        conecta.selectTabelaProdutos(Conexao.sql);
        
        if(Variaveis.encontrado <= 0 ){            
            //Chamando caso nada for encontrado.
            this.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
            Mensagens.Padrao("Não tem nada no estoque!");
            
        } else{
        //Preenchendo a tabela de estoque
            for(i=0; (i < 100) && (i < Variaveis.quantidade) ; i++){
                jTable1.setValueAt(Variaveis.tabelaIdproduto[i+(pagina*100)], i, 0);
                jTable1.setValueAt(Variaveis.tabelaNomeProduto[i+(pagina*100)], i, 1);
                jTable1.setValueAt(Variaveis.tabelaModelo[i+(pagina*100)], i, 2);
                jTable1.setValueAt(Variaveis.tabelaDescricao[i+(pagina*100)], i, 3);
                jTable1.setValueAt(Variaveis.tabelaFornecedor[i+(pagina*100)], i, 4);
                if(!Variaveis.tabelaIdproduto[i+(pagina*100)].equals("")){
                    jTable1.setValueAt(Variaveis.tabelaEstoque[i+(pagina*100)], i, 5);
                    jTable1.setValueAt(Variaveis.tabelaprecoUnitario[i+(pagina*100)], i, 6);
                }
                
            }
            
        }
            
            Variaveis.jaPesquisado = 1;
        
        
    
    
    
}




}
