
import java.awt.Dimension;
import java.awt.Image;
import java.awt.Toolkit;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JOptionPane;


public class CadastroEmpresas extends javax.swing.JFrame {

    public static String usuario = "";
    public static String senha = "";
    
    
    
    
    public CadastroEmpresas() {
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
        jLabel6 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jTextField6 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jTextField7 = new javax.swing.JTextField();
        try{   
            javax.swing.text.MaskFormatter 
            MaskEstado= new javax.swing.text.MaskFormatter("**");
            MaskEstado.setValidCharacters("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz");
            jTextField7 = new javax.swing.JFormattedTextField(MaskEstado);
        }  catch (Exception e){   }
        jButton3 = new javax.swing.JButton();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jLabel22 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jTextField8 = new javax.swing.JTextField();
        try{   javax.swing.text.MaskFormatter cep= new javax.swing.text.MaskFormatter("#####-###");   jTextField8 = new javax.swing.JFormattedTextField(cep);   }  catch (Exception e){   }
        jLabel11 = new javax.swing.JLabel();
        jTextField9 = new javax.swing.JTextField();
        try{
            javax.swing.text.MaskFormatter 
            tel= new javax.swing.text.MaskFormatter("(##)####-####");
            jTextField9 = new javax.swing.JFormattedTextField(tel);
        }
        catch (Exception e){   }   
        jLabel12 = new javax.swing.JLabel();
        jTextField10 = new javax.swing.JTextField();
        try{
            javax.swing.text.MaskFormatter 
            cel= new javax.swing.text.MaskFormatter("(##)#####-####");
            jTextField10 = new javax.swing.JFormattedTextField(cel);
        }
        catch (Exception e){   }   

        jLabel13 = new javax.swing.JLabel();
        jTextField11 = new javax.swing.JTextField();
        SAD = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("SISTEMA DE VENDAS");
        setResizable(false);
        getContentPane().setLayout(null);

        jLabel2.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 51));
        jLabel2.setText("CADASTRO DE CLIENTES / EMPRESAS");
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

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cadCli.png"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(10, 10, 50, 50);

        jLabel3.setBackground(new java.awt.Color(204, 204, 204));
        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 51));
        jLabel3.setText("CPF/CNPJ:");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(20, 100, 150, 30);

        jTextField1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        getContentPane().add(jTextField1);
        jTextField1.setBounds(140, 100, 260, 40);

        jButton1.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        jButton1.setText("Pesquisar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(410, 100, 230, 40);

        jLabel4.setBackground(new java.awt.Color(204, 204, 204));
        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 51));
        jLabel4.setText("NOME/RAZÃO:");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(20, 150, 150, 30);

        jTextField2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        getContentPane().add(jTextField2);
        jTextField2.setBounds(140, 150, 260, 40);

        jLabel6.setBackground(new java.awt.Color(204, 204, 204));
        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 51));
        jLabel6.setText("ENDEREÇO:");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(20, 200, 150, 30);

        jTextField4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        getContentPane().add(jTextField4);
        jTextField4.setBounds(140, 200, 260, 40);

        jLabel7.setBackground(new java.awt.Color(204, 204, 204));
        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 51));
        jLabel7.setText("BAIRRO:");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(20, 250, 150, 30);

        jTextField5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        getContentPane().add(jTextField5);
        jTextField5.setBounds(140, 250, 260, 40);

        jLabel8.setBackground(new java.awt.Color(204, 204, 204));
        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 51));
        jLabel8.setText("CIDADE:");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(20, 300, 150, 30);

        jTextField6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        getContentPane().add(jTextField6);
        jTextField6.setBounds(140, 300, 260, 40);

        jLabel9.setBackground(new java.awt.Color(204, 204, 204));
        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 51));
        jLabel9.setText("ESTADO:");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(20, 350, 150, 30);

        jTextField7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        getContentPane().add(jTextField7);
        jTextField7.setBounds(140, 350, 260, 40);

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/salvar.png"))); // NOI18N
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(20, 600, 60, 60);

        jLabel20.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(0, 0, 51));
        jLabel20.setText("GRAVAR");
        getContentPane().add(jLabel20);
        jLabel20.setBounds(90, 612, 110, 40);

        jLabel21.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(0, 0, 51));
        jLabel21.setText("ATUALIZAR");
        getContentPane().add(jLabel21);
        jLabel21.setBounds(350, 612, 180, 40);

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/atualizar.png"))); // NOI18N
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4);
        jButton4.setBounds(280, 600, 60, 60);

        jLabel22.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(0, 0, 51));
        jLabel22.setText("EXCLUIR");
        getContentPane().add(jLabel22);
        jLabel22.setBounds(700, 612, 160, 40);

        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/apagar.png"))); // NOI18N
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5);
        jButton5.setBounds(630, 600, 60, 60);

        jLabel10.setBackground(new java.awt.Color(204, 204, 204));
        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 51));
        jLabel10.setText("CEP:");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(20, 400, 150, 30);

        jTextField8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        getContentPane().add(jTextField8);
        jTextField8.setBounds(140, 400, 260, 40);

        jLabel11.setBackground(new java.awt.Color(204, 204, 204));
        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 0, 51));
        jLabel11.setText("TEL:");
        getContentPane().add(jLabel11);
        jLabel11.setBounds(20, 450, 150, 30);

        jTextField9.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        getContentPane().add(jTextField9);
        jTextField9.setBounds(140, 450, 260, 40);

        jLabel12.setBackground(new java.awt.Color(204, 204, 204));
        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 0, 51));
        jLabel12.setText("CEL:");
        getContentPane().add(jLabel12);
        jLabel12.setBounds(20, 500, 150, 30);

        jTextField10.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        getContentPane().add(jTextField10);
        jTextField10.setBounds(140, 500, 260, 40);

        jLabel13.setBackground(new java.awt.Color(204, 204, 204));
        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 0, 51));
        jLabel13.setText("EMAIL:");
        getContentPane().add(jLabel13);
        jLabel13.setBounds(20, 550, 150, 30);

        jTextField11.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        getContentPane().add(jTextField11);
        jTextField11.setBounds(140, 550, 260, 40);

        SAD.setBackground(new java.awt.Color(204, 204, 204));
        SAD.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        SAD.setForeground(new java.awt.Color(0, 0, 51));
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

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        //PESQUISAR
        
        //Encotnrado = 0
        Variaveis.encontrado = 0;
        
        //Campos em branco
        if(jTextField1.getText().equals("")){
            Mensagens.Preencha();
        } else {
        
        //Limpando variáveis
        Variaveis.LimparVariaveisClientes();
        
        //Conectando ao Banco
        Conexao conecta = new Conexao();
        conecta.conecta();
        
        //Executando Query
        conecta.selectClientes(" select * from sistema.clientes where cpfCnpjCli = '"+jTextField1.getText()+"' ");
        
        //Limpando jTextFields caso nao achar
        if(Variaveis.encontrado <= 0 ){
            jTextField2.setText("");
            jTextField4.setText("");
            jTextField5.setText("");
            jTextField6.setText("");
            jTextField7.setText("");
            jTextField8.setText("");
            jTextField9.setText("");
            jTextField10.setText("");
            jTextField11.setText("");
            
            //Chamando caso nada for encontrado.
            Mensagens.NadaEncontrado();
            
        } else{
        //Preenchendo a jTextFields caso achar
            jTextField2.setText(Variaveis.nomeRazao);
            jTextField4.setText(Variaveis.CliEndereco);
            jTextField5.setText(Variaveis.CliBairro);
            jTextField6.setText(Variaveis.CliCidade);
            jTextField7.setText(Variaveis.CliEstado);
            jTextField8.setText(Variaveis.CliCep);
            jTextField9.setText(Variaveis.CliCtto);
            jTextField10.setText(Variaveis.CliCtto2);
            jTextField11.setText(Variaveis.CliEmail);
            
            Variaveis.jaPesquisado = 1;
        }
        

        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // DELETANDO
        
        if(Variaveis.encontrado > 0){
            int confirmar = JOptionPane.showConfirmDialog(null, "Podemos prosseguir?");
            
            if(confirmar == 0){
            
            Conexao conexao = new Conexao();
            conexao.delete("delete from sistema.clientes where cpfCnpjCli = '"+Variaveis.cpfCnpjCli+"'");
            Variaveis.encontrado = 0;
            
            // Limpando os jTextField
            jTextField1.setText("");
            jTextField2.setText("");
            jTextField4.setText("");
            jTextField5.setText("");
            jTextField6.setText("");
            jTextField7.setText("");
            jTextField8.setText("");
            jTextField9.setText("");
            jTextField10.setText("");
            jTextField11.setText("");
            
            Variaveis.jaPesquisado = 0;
            }
        }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // SALVAR
        
        Variaveis.encontrado = 0; 
         
         if(jTextField1.getText().equals("") || jTextField2.getText().equals("") || 
            jTextField4.getText().equals("") || jTextField5.getText().equals("") || jTextField6.getText().equals("") ||     
            jTextField7.getText().equals("") || jTextField8.getText().equals("") || jTextField9.getText().equals("") ||
            jTextField10.getText().equals("") || jTextField11.getText().equals("")
           ){
            Mensagens.Preencha();
        } else {
             
            //Limpando variáveis
            Variaveis.LimparVariaveisClientes();
            
            //Conectando ao Banco
            Conexao conecta = new Conexao();
            conecta.conecta(); 
            
            //Executando Query para ver se já tem registro.
            conecta.selectClientes(" select * from sistema.clientes where cpfCnpjCli = '"+jTextField1.getText()+"' ");
            if(Variaveis.encontrado > 0 ){
                Mensagens.Padrao("Já existe um cadastro com o ID: " + jTextField1.getText());
            } else{
            // Caso não haja registro nenhum:
                int confirmar = JOptionPane.showConfirmDialog(null, "Podemos prosseguir?");
                
                if(confirmar == 0){
                //Limpando variáveis
                Variaveis.LimparVariaveisClientes();
                conecta.save(" INSERT INTO sistema.clientes VALUES ('"+jTextField1.getText()+"', '"+jTextField2.getText()+"','"+jTextField4.getText()+"','"+jTextField5.getText()+"','"+jTextField6.getText()+"', '"+jTextField7.getText()+"','"+jTextField8.getText()+"','"+jTextField9.getText()+"','"+jTextField10.getText()+"', '"+jTextField11.getText()+"'); ");    
            
                // Limpando os jTextField
                jTextField1.setText("");
                jTextField2.setText("");
                jTextField4.setText("");
                jTextField5.setText("");
                jTextField6.setText("");
                jTextField7.setText("");
                jTextField8.setText("");
                jTextField9.setText("");
                jTextField10.setText("");
                jTextField11.setText("");
                
                Variaveis.jaPesquisado = 0;
                }
            }
             
        }
         
         
        
        
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // ATUALIZAR
        
         if((jTextField1.getText().equals("")) || (jTextField2.getText().equals("")) || 
            (jTextField4.getText().equals("")) || (jTextField5.getText().equals("")) || (jTextField6.getText().equals("")) ||   
            (jTextField7.getText().equals("")) || (jTextField8.getText().equals("")) || (jTextField9.getText().equals("")) ||
            (jTextField10.getText().equals("")) ||(jTextField11.getText().equals("")) || Variaveis.jaPesquisado < 1
           ){
            Mensagens.Padrao("Favor preencher tudo e pesquisar o CPF para verificar se já existe antes atualizar");
        } else {
        
            //Limpando variáveis
            Variaveis.LimparVariaveisClientes();
            
            //Conectando ao Banco
            Conexao conecta = new Conexao();
            conecta.conecta(); 
            
            //Executando Query para ver se já tem registro.
            conecta.selectClientes(" select * from sistema.clientes where cpfCnpjCli = '"+jTextField1.getText()+"' ");
            if(Variaveis.jaPesquisado < 0 ){
                Mensagens.Padrao("Não existe um cadastro com o ID: " + jTextField1.getText() + " para querer alterar.");
            } else{
                int confirmar = JOptionPane.showConfirmDialog(null, "Podemos prosseguir?");
                
                if(confirmar == 0){
                // Executando comando caso já pesquisou...
                Conexao.sql = "UPDATE sistema.clientes SET nomeRazao = '"+jTextField2.getText()+"', endereco = '"+jTextField4.getText()+"', bairro = '"+jTextField5.getText()+"', cidade = '"+jTextField6.getText()+"', estado = '"+jTextField7.getText()+"', cep = '"+jTextField8.getText()+"', ctto = '"+jTextField9.getText()+"', ctto2 = '"+jTextField10.getText()+"', email = '"+jTextField11.getText()+"' where cpfCnpjCli = '"+Variaveis.cpfCnpjCli+"'";
                 conecta.update(Conexao.sql);
                
               
                Variaveis.LimparVariaveisClientes();
                
                // Limpando os jTextField
                jTextField1.setText("");
                jTextField2.setText("");
                jTextField4.setText("");
                jTextField5.setText("");
                jTextField6.setText("");
                jTextField7.setText("");
                jTextField8.setText("");
                jTextField9.setText("");
                jTextField10.setText("");
                jTextField11.setText("");
                
            }
            } 
        }
        
    }//GEN-LAST:event_jButton4ActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Logo;
    private javax.swing.JLabel SAD;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    private javax.swing.ButtonGroup tipo;
    // End of variables declaration//GEN-END:variables
}
