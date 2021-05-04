// SENHA DO SISTEMA: sistemapr19rem
// BANCO: sistema
// SENHA DO BANCO: root
// USER E SENHA ADMIN: 0

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Image;
import java.io.IOException;
import java.text.DecimalFormat;
import java.util.Calendar;
import java.util.Random;
import javax.imageio.ImageIO;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;


public class Instalacao extends javax.swing.JFrame {
    
    public Instalacao() {
        initComponents();
        
        // Tamanho da tela -------------------------------
        setSize(890, 580); 
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

        
       
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tipo = new javax.swing.ButtonGroup();
        jLabel24 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jLabel20 = new javax.swing.JLabel();
        Logo = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jLabel21 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jLabel25 = new javax.swing.JLabel();
        SAD = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("SISTEMA DE VENDAS");
        setResizable(false);
        getContentPane().setLayout(null);

        jLabel24.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(255, 153, 153));
        getContentPane().add(jLabel24);
        jLabel24.setBounds(360, 15, 300, 40);

        jLabel2.setBackground(new java.awt.Color(0, 0, 102));
        jLabel2.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 51));
        jLabel2.setText("INSTALAÇÃO");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(80, 10, 470, 50);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/setaDireita.png"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(20, 10, 50, 50);

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/finalizar.png"))); // NOI18N
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(20, 90, 60, 60);

        jLabel20.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(0, 102, 153));
        jLabel20.setText("PASSO A PASSO DA INSTALAÇÃO.");
        getContentPane().add(jLabel20);
        jLabel20.setBounds(90, 100, 570, 40);

        Logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/fechar.png"))); // NOI18N
        Logo.setFocusCycleRoot(true);
        Logo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Logo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                LogoMousePressed(evt);
            }
        });
        getContentPane().add(Logo);
        Logo.setBounds(820, 10, 50, 50);

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/instalacao.png"))); // NOI18N
        jButton4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButton4MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jButton4MouseReleased(evt);
            }
        });
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4);
        jButton4.setBounds(20, 180, 60, 60);

        jLabel21.setBackground(new java.awt.Color(0, 0, 102));
        jLabel21.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(0, 0, 51));
        jLabel21.setText("PRIMEIRA INSTALAÇÃO (primeira vez)");
        getContentPane().add(jLabel21);
        jLabel21.setBounds(90, 190, 510, 40);

        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/apagar.png"))); // NOI18N
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5);
        jButton5.setBounds(20, 270, 60, 60);

        jLabel22.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(153, 0, 0));
        jLabel22.setText("DELETAR TODAS AS VENDAS (necessário a senha)");
        getContentPane().add(jLabel22);
        jLabel22.setBounds(90, 280, 500, 40);

        jLabel23.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(153, 0, 0));
        jLabel23.setText("DELETAR TODOS OS REGISTROS DO BANDO DE DADOS  (necessário a senha)");
        getContentPane().add(jLabel23);
        jLabel23.setBounds(90, 370, 660, 40);

        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/limpeza.png"))); // NOI18N
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton6);
        jButton6.setBounds(20, 360, 60, 60);

        jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/pesquisar.png"))); // NOI18N
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton7);
        jButton7.setBounds(20, 450, 60, 60);

        jLabel25.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(153, 0, 0));
        jLabel25.setText("PATH DAS IMAGENS");
        getContentPane().add(jLabel25);
        jLabel25.setBounds(90, 460, 660, 40);

        SAD.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        SAD.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/fundo.png"))); // NOI18N
        getContentPane().add(SAD);
        SAD.setBounds(-10, -10, 1290, 710);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // PAGO
        
        String msg = "";
        
        msg = msg+"01 - Instalar o JAVA JDK:";
        msg = msg+"\n";
        msg = msg+"Pasta: SISTEMA ATUAL PROJETOS\\jdk-8u221-windows-x64";
        msg = msg+"\n";
        msg = msg+"Link: https://www.oracle.com/technetwork/pt/java/javase/downloads/jdk8-downloads-2133151.html";
        msg = msg+"\n\n";
        msg = msg+"02 - Instalar o MySQL:";
        msg = msg+"\n";     
        msg = msg+"Pasta: SISTEMA ATUAL PROJETOS\\mysql-installer-web-community-5.7.27.0";
        msg = msg+"\n";
        msg = msg+"Link: https://dev.mysql.com/downloads/windows/installer/5.7.html";
        msg = msg+"\n\n";
        msg = msg+"03 - Abra o MySQL Workbench e clique no + ao lado de MySQL Connections\n";
        msg = msg+"04 - Em Connection Name digite sistema\n";
        msg = msg+"05 - Em Hostname digite localhost\n";
        msg = msg+"06 - Em Port digite 3306\n";
        msg = msg+"07 - Em Username digite root\n";
        msg = msg+"08 - Após clicar em OK, irá pedir a senha, digite root\n";
        msg = msg+"\n\n";
        msg = msg+"09 - Clique em sistema, o Banco que foi criado.\n";
        msg = msg+"10 - Com o botão direito clique em Create Schema...\n";
        msg = msg+"11 - Em Name digite sistema e depois clique em Apply\n";
        msg = msg+"12 - Depois clique em Apply\n";
        msg = msg+"13 - Depois clique em Finish\n\n\n";
        
        msg = msg+"14 - Após criar o DATABASE sistema, clique em:";
        msg = msg+"\n";
        msg = msg+" º PRIMEIRA INSTALAÇÃO";
        msg = msg+"\n\n";
        
        msg = msg+"Pronto! Se houver dificuldades, abra as imagens no qual foram enviadas.\n";
        
        
        
        
        
        
        JTextArea area = new JTextArea(msg);
        JScrollPane scroll = new JScrollPane(area);
        scroll.setPreferredSize(new Dimension(600, 500));
        JOptionPane.showMessageDialog(null,scroll);   
        
        
    }//GEN-LAST:event_jButton3ActionPerformed

    private void LogoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LogoMousePressed
        // Voltando
        Principal menuPrincipal = new Principal();
        menuPrincipal.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_LogoMousePressed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // Instalação
        Conexao c = new Conexao();
        c.conecta();
        Conexao.instalandoBanco();
        c.desconectar();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // REMOVER TODAS AS VENDAS - sistemapr19rem
        
        int confirmar = JOptionPane.showConfirmDialog(null, "Podemos realmente prosseguir?");
        if(confirmar == 0){
            
        JTextField password = new JPasswordField();
        Object[] message = {"Senha: ", password };
        JOptionPane.showMessageDialog(null, message);
        password.grabFocus();
        String senha = ""+password.getText();
        if(senha.equals("sistemapr19rem")){
                Conexao c = new Conexao();
                c.conecta();
                Conexao.delete("delete from sistema.vendas");
                c.desconectar();
        } else{
            Mensagens.Padrao("Senha incorreta.");
        }
        }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // REMOVER TODO O BANCO
        // sistemapr19rem
        
        int confirmar = JOptionPane.showConfirmDialog(null, "Podemos realmente prosseguir?");
        if(confirmar == 0){
            
        JTextField password = new JPasswordField();
        Object[] message = {"Senha: ", password };
        JOptionPane.showMessageDialog(null, message);
        password.grabFocus();
        String senha = ""+password.getText();
        if(senha.equals("sistemapr19rem")){
            Conexao c = new Conexao();
            c.conecta();
            Conexao.deleteSemMsg("delete from sistema.vendas");
            Conexao.deleteSemMsg("delete from sistema.produtos");
            Conexao.deleteSemMsg("delete from sistema.funcionarios");
            Conexao.deleteSemMsg("delete from sistema.clientes");
            Conexao.insereAdmin();
            c.desconectar();
            Mensagens.Padrao("Limpeza efetuada com sucesso.\n\nCrie um usuário Admnistrador com PERMISSÃO = 3\n\nEm seguida remova o usuário ADMIN:\n\nCPF: 0\nSenha: 0\n\n");
        } else{
            Mensagens.Padrao("Senha incorreta.");
        }
        }
        
        
        
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton4MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton4MousePressed
        // Instalando
        jLabel24.setText("Instalando...");
    }//GEN-LAST:event_jButton4MousePressed

    private void jButton4MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton4MouseReleased
        // Instalado
        jLabel24.setText("");
    }//GEN-LAST:event_jButton4MouseReleased

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // PATH DAS IMAGENS
        JTextField diretorio = new JTextField();
        Object[] message = {"Diretório: ", diretorio };
        JOptionPane.showMessageDialog(null, message);
        diretorio.grabFocus();
        String local = ""+diretorio.getText();
        local = local.replaceAll("\\\\", "/");
        if(!local.equals("")){
            Conexao c = new Conexao();
            c.conecta();
            Conexao.updateSemMsg("delete from sistema.configuracao where 1=1");
            Conexao.update("insert into sistema.configuracao values ('"+local+"')");
            Vendas.pathImagens = local;
            c.desconectar();
        } else{
            Mensagens.Padrao("Diretório vazio.\n\n");
        }
        
    }//GEN-LAST:event_jButton7ActionPerformed

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
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    public static javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.ButtonGroup tipo;
    // End of variables declaration//GEN-END:variables

    
    
    
}
