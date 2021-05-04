
import java.awt.Dimension;
import java.awt.Image;
import java.awt.Toolkit;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;


public class Principal extends javax.swing.JFrame {

    /*
    Admnistradores ou Gerentes devem ter PERMISSÃO = 3 - POIS CADASTRAM CLIENTES, FUNCIONARIOS ETC.
    Funcionários devem ter PERMISSÃO = 2 - POIS APENAS CONSULTAM E FAZEM VENDA.
    Clientes e Visitantes ter permissao = 1 - MINIMO ACESSO.
    */
    public Principal() {
        initComponents();
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
        
        
        if(Variaveis.nomeFuncLogado.equals("")){
        jLabel8.setText("Bem-Vindo!");
        } else{
            jLabel8.setText("Bem-Vindo, "+Variaveis.nomeFuncLogado);
        }
        
        // Tamanho da tela -------------------------------
        setSize(1190, 700); 
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
        Conexao conectado = new Conexao();
        conectado.conecta();
        // CONEXÃO COM BANCO --------------------------------
        
        // Instalação do sistema ----------------------------
        Conexao.instalandoBancoSemMsg();
        // Instalação do sistema ----------------------------
        
        //Path das imagens ----------------------------
        conectado.selectPathImagens();
        //Path das imagens ----------------------------
        
        
        // LIMPANDO AS NOTAS --------------------------------
        try{
            File file = new File( "impressao_notaFiscal.txt" ); 
            file.delete();
        } catch(Exception e){}
        // LIMPANDO AS NOTAS --------------------------------
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        Logo = new javax.swing.JLabel();
        jButton8 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        SAD = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("SISTEMA DE VENDAS");
        setResizable(false);
        getContentPane().setLayout(null);

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/vendas.png"))); // NOI18N
        jButton1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton1.setOpaque(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(40, 140, 60, 60);

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/estoque.png"))); // NOI18N
        jButton2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton2.setOpaque(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(40, 210, 60, 60);

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cadProdutos.png"))); // NOI18N
        jButton3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton3.setOpaque(false);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(40, 280, 60, 60);

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cadFunc.png"))); // NOI18N
        jButton4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton4.setOpaque(false);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4);
        jButton4.setBounds(40, 350, 60, 60);

        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cadCli.png"))); // NOI18N
        jButton5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton5.setOpaque(false);
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5);
        jButton5.setBounds(40, 420, 60, 60);

        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/login.png"))); // NOI18N
        jButton6.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton6.setOpaque(false);
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton6);
        jButton6.setBounds(40, 490, 60, 60);

        jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/fechar.png"))); // NOI18N
        jButton7.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton7.setOpaque(false);
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton7);
        jButton7.setBounds(40, 560, 60, 60);

        jLabel11.setFont(new java.awt.Font("Arial Rounded MT Bold", 3, 48)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 0, 51));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("SISTEMA DE VENDAS");
        getContentPane().add(jLabel11);
        jLabel11.setBounds(40, 40, 920, 50);

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 51));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Bem-vindo!");
        jLabel8.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        getContentPane().add(jLabel8);
        jLabel8.setBounds(40, 95, 920, 30);

        jLabel6.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 51));
        jLabel6.setText("LOGIN NO SISTEMA");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(110, 494, 570, 50);

        jLabel1.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 51));
        jLabel1.setText("ESTOQUE");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(110, 214, 570, 50);

        jLabel2.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 51));
        jLabel2.setText("VENDAS");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(110, 144, 570, 50);

        jLabel3.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 51));
        jLabel3.setText("CADASTRO DE PRODUTOS");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(110, 284, 570, 50);

        jLabel4.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 51));
        jLabel4.setText("CADASTRO DE FUNCIONÁRIOS");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(110, 354, 570, 50);

        jLabel5.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 51));
        jLabel5.setText("CADASTRO DE CLIENTES / EMPRESAS");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(110, 424, 570, 50);

        jLabel7.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 51));
        jLabel7.setText("SAIR DO SISTEMA");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(110, 564, 570, 50);

        Logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Atual Design.png"))); // NOI18N
        Logo.setFocusCycleRoot(true);
        Logo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        getContentPane().add(Logo);
        Logo.setBounds(990, 10, 180, 140);

        jButton8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/configuracoes.png"))); // NOI18N
        jButton8.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton8.setOpaque(false);
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton8);
        jButton8.setBounds(1100, 560, 60, 60);

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 51));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel10.setText("hb06ars@hotmail.com");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(40, 640, 170, 13);

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("ver. 1.0.0");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(0, 640, 1180, 13);

        SAD.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/fundo.jpg"))); // NOI18N
        getContentPane().add(SAD);
        SAD.setBounds(0, -100, 1630, 1060);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // Saindo do Sistema
        Conexao conexao = new Conexao();
        try {
            conexao.desconectar();
        } catch (Exception ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.exit(0);
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        //LOGIN
        Login login = new Login();
        login.setVisible(true);
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
     // ACESSANDO VENDAS
     if(Variaveis.permissaoLogado > 0){
     Vendas vendas = new Vendas();
     vendas.setVisible(true);
     this.dispose();
     }else{
            Mensagens.Padrao("Você não se logou para ter acesso as Vendas");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // CADASTRO DE PRODUTOS
        if(Variaveis.permissaoLogado > 1){
        CadastroProdutos cadProdutos = new CadastroProdutos();
        cadProdutos.setVisible(true);
        this.dispose();
        }else{
            Mensagens.Padrao("Você não possui permissão de Gerente / Admnistrador para cadastrar ");
        }
        
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // CADASTRO DE FUNCIONARIOS
        if(Variaveis.permissaoLogado > 1){
        CadastroFuncionarios cadFuncionarios = new CadastroFuncionarios();
        cadFuncionarios.setVisible(true);
        this.dispose();
        } else{
            Mensagens.Padrao("Você não possui permissão de Gerente / Admnistrador para cadastrar Funcionários.");
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // CADASTRO DE FORNECEDORES
        if(Variaveis.permissaoLogado > 1){
        CadastroEmpresas cadEmpresas = new CadastroEmpresas();
        cadEmpresas.setVisible(true);
        this.dispose();
        } else{
            Mensagens.Padrao("Você não possui permissão de Gerente / Admnistrador para cadastrar Fornecedores");
        }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // ESTOQUE
     Estoque estoque = new Estoque();
     estoque.setVisible(true);
     this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        // INSTALAÇÃO
        if(Variaveis.permissaoLogado > 2){
            Instalacao instalacao = new Instalacao();
            instalacao.setVisible(true);
            this.dispose();
        } else{
            Mensagens.Padrao("Você não possui permissão de Gerente / Admnistrador para gerenciar o Sistema.");
        }
        
    }//GEN-LAST:event_jButton8ActionPerformed

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
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    public static javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    // End of variables declaration//GEN-END:variables
}
