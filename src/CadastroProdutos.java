
import java.awt.Dimension;
import java.awt.Image;
import java.awt.Toolkit;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;


public class CadastroProdutos extends javax.swing.JFrame {

    public static String usuario = "";
    public static String senha = "";
    
    
    
    
    public CadastroProdutos() {
        initComponents();
        // Tamanho da tela -------------------------------
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
        jLabel2 = new javax.swing.JLabel();
        Logo = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jTextField6 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jTextField7 = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jLabel22 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        Logo3 = new javax.swing.JLabel();
        SAD = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("SISTEMA DE VENDAS");
        setResizable(false);
        getContentPane().setLayout(null);

        jLabel2.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 51));
        jLabel2.setText("CADASTRO DE PRODUTOS");
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

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cadProdutos.png"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(10, 10, 50, 50);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 51));
        jLabel3.setText("CÓD ITEM:");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(20, 80, 150, 40);

        jTextField1.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        getContentPane().add(jTextField1);
        jTextField1.setBounds(150, 80, 260, 40);

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton1.setText("Pesquisar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(420, 80, 150, 40);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 51));
        jLabel4.setText("NOME:");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(20, 130, 150, 40);

        jTextField2.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        getContentPane().add(jTextField2);
        jTextField2.setBounds(150, 130, 260, 40);

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 51));
        jLabel5.setText("MODELO:");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(20, 180, 150, 40);

        jTextField3.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        getContentPane().add(jTextField3);
        jTextField3.setBounds(150, 180, 260, 40);

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 51));
        jLabel6.setText("DESCRIÇÃO:");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(20, 230, 150, 40);

        jTextField4.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        getContentPane().add(jTextField4);
        jTextField4.setBounds(150, 230, 260, 40);

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 51));
        jLabel7.setText("FORNECEDOR:");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(20, 280, 150, 40);

        jTextField5.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        getContentPane().add(jTextField5);
        jTextField5.setBounds(150, 280, 260, 40);

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 51));
        jLabel8.setText("ESTOQUE:");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(20, 330, 150, 40);

        jTextField6.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        getContentPane().add(jTextField6);
        jTextField6.setBounds(150, 330, 260, 40);

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 51));
        jLabel9.setText("PREÇO UNIT.");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(20, 380, 150, 40);

        jTextField7.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        getContentPane().add(jTextField7);
        jTextField7.setBounds(150, 380, 260, 40);

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/salvar.png"))); // NOI18N
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(20, 560, 60, 60);

        jLabel20.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(0, 0, 51));
        jLabel20.setText("GRAVAR");
        getContentPane().add(jLabel20);
        jLabel20.setBounds(90, 572, 110, 40);

        jLabel21.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(0, 0, 51));
        jLabel21.setText("ATUALIZAR");
        getContentPane().add(jLabel21);
        jLabel21.setBounds(350, 572, 180, 40);

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/atualizar.png"))); // NOI18N
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4);
        jButton4.setBounds(280, 560, 60, 60);

        jLabel22.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(0, 0, 51));
        jLabel22.setText("EXCLUIR");
        getContentPane().add(jLabel22);
        jLabel22.setBounds(700, 572, 160, 40);

        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/apagar.png"))); // NOI18N
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5);
        jButton5.setBounds(630, 560, 60, 60);

        Logo3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Logo3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/semFoto.png"))); // NOI18N
        Logo3.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        Logo3.setFocusCycleRoot(true);
        Logo3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Logo3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Logo3MousePressed(evt);
            }
        });
        getContentPane().add(Logo3);
        Logo3.setBounds(600, 80, 220, 220);

        SAD.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        SAD.setForeground(new java.awt.Color(0, 0, 51));
        SAD.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/fundo.png"))); // NOI18N
        getContentPane().add(SAD);
        SAD.setBounds(-10, -10, 1290, 710);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void LogoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LogoMousePressed
        // Voltando
        if(!Estoque.voltarEstoque){
            Principal menuPrincipal = new Principal();
            menuPrincipal.setVisible(true);
            this.dispose();
        } else{
            Estoque.voltarEstoque = false;
            this.dispose();
        }
        
    }//GEN-LAST:event_LogoMousePressed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
                // DELETANDO
        
        if(Variaveis.encontrado > 0){
            int confirmar = JOptionPane.showConfirmDialog(null, "Podemos prosseguir?");
            if(confirmar == 0){
            Conexao conexao = new Conexao();
            conexao.delete("delete from sistema.produtos where idproduto = '"+Variaveis.idproduto+"'");
            Variaveis.encontrado = 0;
            
            // Limpando os jTextField
            jTextField1.setText("");
            jTextField2.setText("");
            jTextField3.setText("");
            jTextField4.setText("");
            jTextField5.setText("");
            jTextField6.setText("");
            jTextField7.setText("");
            
            Variaveis.jaPesquisado = 0;
            }
        }
        
        
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // ATUALIZAR
        
         if((jTextField1.getText().equals("")) || (jTextField2.getText().equals("")) || (jTextField3.getText().equals("")) || 
            (jTextField4.getText().equals("")) || (jTextField5.getText().equals("")) || (jTextField6.getText().equals("")) ||   
            (jTextField7.getText().equals("")) || Variaveis.jaPesquisado < 1
           ){
            Mensagens.Padrao("Favor preencher tudo e pesquisar o item para verificar se já existe antes atualizar");
        } else {
        
            //Limpando variáveis
            Variaveis.LimparVariaveisProdutos();
            
            //Conectando ao Banco
            Conexao conecta = new Conexao();
            conecta.conecta(); 
            
            //Executando Query para ver se já tem registro.
            conecta.selectProdutos(" select * from sistema.produtos where idproduto = '"+jTextField1.getText()+"' ");
            if(Variaveis.jaPesquisado < 0 ){
                Mensagens.Padrao("Não existe um cadastro com o ID: " + jTextField1.getText() + " para querer alterar.");
            } else{

                // Executando comando caso já pesquisou...
                int confirmar = JOptionPane.showConfirmDialog(null, "Podemos prosseguir?");
                if(confirmar == 0){
                Conexao.sql = "UPDATE sistema.produtos SET idproduto = '"+jTextField1.getText()+"', nome = '"+jTextField2.getText()+"', modelo = '"+jTextField3.getText()+"', descricao = '"+jTextField4.getText()+"', fornecedor = '"+jTextField5.getText()+"', estoque = '"+jTextField6.getText()+"', precoUnitario = '"+jTextField7.getText().replace(",", ".")+"' where idproduto = '"+Variaveis.idproduto+"'";
                conecta.update(Conexao.sql);
                
               
                Variaveis.LimparVariaveisFuncionarios();
                
                // Limpando os jTextField
                jTextField1.setText("");
                jTextField2.setText("");
                jTextField3.setText("");
                jTextField4.setText("");
                jTextField5.setText("");
                jTextField6.setText("");
                jTextField7.setText("");
                
                }
            }
             
        };
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // SALVAR
        Variaveis.encontrado = 0;
         
         if(jTextField1.getText().equals("") || jTextField2.getText().equals("") || jTextField3.getText().equals("") ||
            jTextField4.getText().equals("") || jTextField5.getText().equals("") || jTextField6.getText().equals("") ||     
            jTextField7.getText().equals("") 
           ){
            Mensagens.Preencha();
        } else {
            
            //Limpando variáveis
            Variaveis.LimparVariaveisProdutos();
            
            //Conectando ao Banco
            Conexao conecta = new Conexao();
            conecta.conecta(); 
            
            //Executando Query para ver se já tem registro.
            conecta.selectProdutos(" select * from sistema.produtos where idproduto = '"+jTextField1.getText()+"' ");
            
            if(Variaveis.encontrado > 0 ){
                Mensagens.Padrao("Já existe um cadastro com o ID: " + jTextField1.getText());
            } else{
                
                int confirmar = JOptionPane.showConfirmDialog(null, "Podemos prosseguir?");
                if(confirmar == 0){
                // Caso não haja registro nenhum:
            
                //Limpando variáveis
                Variaveis.LimparVariaveisFuncionarios();
                conecta.save("INSERT INTO sistema.produtos VALUES ('"+jTextField1.getText()+"', '"+jTextField2.getText()+"', '"+jTextField3.getText()+"', '"+jTextField4.getText()+"','"+jTextField5.getText()+"','"+jTextField6.getText()+"', '"+jTextField7.getText().replace(",", ".")+"');");    
                
                // Limpando os jTextField
                jTextField1.setText("");
                jTextField2.setText("");
                jTextField3.setText("");
                jTextField4.setText("");
                jTextField5.setText("");
                jTextField6.setText("");
                jTextField7.setText("");
                
                Variaveis.jaPesquisado = 0;
                
                }
            }
             
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        //PESQUISAR

        //Encotnrado = 0
        Variaveis.encontrado = 0;
        
        //Campos em branco
        if(jTextField1.getText().equals("")){
            Mensagens.Preencha();
        } else {
        
        //Limpando variáveis
        Variaveis.LimparVariaveisProdutos();
        
        //Conectando ao Banco
        Conexao conecta = new Conexao();
        conecta.conecta();
        
        //Executando Query
        conecta.selectProdutos("select * from sistema.produtos where idproduto = '"+jTextField1.getText()+"'");
        
        //Limpando jTextFields caso nao achar
        if(Variaveis.encontrado <= 0 ){
            jTextField1.setText("");
            jTextField2.setText("");
            jTextField3.setText("");
            jTextField4.setText("");
            jTextField5.setText("");
            jTextField6.setText("");
            jTextField7.setText("");
            
            //Chamando caso nada for encontrado.
            Mensagens.NadaEncontrado();
            
        } else{
        //Preenchendo a jTextFields caso achar
            jTextField1.setText(Variaveis.idproduto);
            jTextField2.setText(Variaveis.nomeProduto);
            jTextField3.setText(Variaveis.modelo);
            jTextField4.setText(Variaveis.descricao);
            jTextField5.setText(Variaveis.fornecedor);
            jTextField6.setText(Variaveis.estoque);
            jTextField7.setText(Variaveis.precoUnitario);
            
            //Alterando a imagem do Produto ------------------------------
            try{
                String idProduto = jTextField1.getText()+".png";
                String diretorio = Vendas.pathImagens+"/";
                ImageIcon valid = new ImageIcon(diretorio+idProduto);
                if(valid.getIconHeight() > 0){
                    Logo3.setIcon(valid);
                } else{
                    valid = new ImageIcon(getClass().getResource("/img/semFoto.png"));
                    Logo3.setIcon(valid);
                } 
            }catch(Exception e){
                ImageIcon valid = new ImageIcon(getClass().getResource("/img/semFoto.png"));
                Logo3.setIcon(valid);
            }
            //Alterando a imagem do Produto ------------------------------
            
            Variaveis.jaPesquisado = 1;
        }
        

        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void Logo3MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Logo3MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_Logo3MousePressed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Logo;
    private javax.swing.JLabel Logo3;
    private javax.swing.JLabel SAD;
    public static javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    public static javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.ButtonGroup tipo;
    // End of variables declaration//GEN-END:variables
}
