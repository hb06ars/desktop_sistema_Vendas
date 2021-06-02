
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.Toolkit;
import java.io.File;
import java.io.IOException;
import java.text.DecimalFormat;
import java.util.Calendar;
import java.util.Random;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;


public class Vendas extends javax.swing.JFrame {
    
    public static int pesquisado = 0;
    public static String usuario = "";
    public static String senha = "";
    
    public static String ano = "";
    public static int mes = 0;
    public static int dia = 1;
    public static String hora = "";
    public static String horario = "";
    public static String bancoData = "";
    public static String pathImagens = "";
    
    public static int ultimaLinhaTabela = 0;
    
    int converterEstoque;
    int converterEstoqueAtual;
        // Valores decimais
        DecimalFormat decimal =  new DecimalFormat();
        // -----------------------------------------------
    
    public Vendas() {
        initComponents();
        Variaveis.LimparArrays();
        ultimaLinhaTabela = 0;
        pesquisado = 0;
        
        
         // Valores decimais
        decimal.setMaximumFractionDigits(2);
        // -----------------------------------------------
        
        // Mostrar barra de rolagem
        jTable1.setAutoResizeMode(jTable1.AUTO_RESIZE_OFF);  
        jTable1.setRowHeight(30); 
        
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

        // Preenchendo o CPF e nome do Vendedor ----------
        System.out.println("cpfFuncLogado: "+Variaveis.cpfFuncLogado);
        jTextField12.setText(Variaveis.cpfFuncLogado);
        jTextField13.setText(Variaveis.nomeFuncLogado);
        // -----------------------------------------------
        
        // Número Random ---------------------------------
        String randomico = "";
        Random gerador = new Random();
        randomico = ""+gerador.nextInt(99);
        // -----------------------------------------------
        
        // Ano Mes Dia Hora Minuto Segundo ---------------
        Calendar c = Calendar.getInstance();
        ano = ""+c.get(Calendar.YEAR);
        mes = c.get(Calendar.MONTH)+1;
        dia = c.get(Calendar.DAY_OF_MONTH);
        String strDia = "";
        String strMes = "";
        if(dia < 10){
            strDia = "0"+dia;
        }
        if(mes < 10){
            strMes = "0"+mes;
        }
        hora = ""+c.get(Calendar.HOUR_OF_DAY)+c.get(Calendar.MINUTE)+c.get(Calendar.SECOND)+c.get(Calendar.MILLISECOND);
        horario = ""+c.get(Calendar.HOUR_OF_DAY)+":"+c.get(Calendar.MINUTE)+":"+c.get(Calendar.SECOND);
        bancoData = ano+"-"+strMes+"-"+strDia;
        // -----------------------------------------------
        
        
        
        // Setando ---------------------------------------
        jTextField2.setText(randomico+ano+mes+dia+hora);
        jTextField3.setText(strDia+"/"+strMes+"/"+ano); // BANCO: 2019-08-17
        // -----------------------------------------------
        
        //Inicio transação
        jTextField1.setText(jTextField2.getText());
        // -----------------------------------------------
        
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tipo = new javax.swing.ButtonGroup();
        jLabel2 = new javax.swing.JLabel();
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
        jLabel10 = new javax.swing.JLabel();
        jTextField8 = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jTextField9 = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jTextField10 = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jTextField11 = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jTextField12 = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jTextField13 = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jTextField14 = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jTextField16 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jLabel22 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        jLabel23 = new javax.swing.JLabel();
        jButton6 = new javax.swing.JButton();
        jLabel24 = new javax.swing.JLabel();
        jTextField17 = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jTextField18 = new javax.swing.JTextField();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel27 = new javax.swing.JLabel();
        jTextField15 = new javax.swing.JTextField();
        Logo = new javax.swing.JLabel();
        Logo1 = new javax.swing.JLabel();
        Logo2 = new javax.swing.JLabel();
        Logo3 = new javax.swing.JLabel();
        SAD = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("SISTEMA DE VENDAS");
        setResizable(false);
        getContentPane().setLayout(null);

        jLabel2.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 51));
        jLabel2.setText("VENDAS");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(70, 10, 470, 50);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/vendas.png"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(10, 10, 50, 50);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 51));
        jLabel3.setText("TRANSAÇÃO:");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(20, 70, 150, 30);

        jTextField1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(204, 0, 0));
        jTextField1.setText("502019820184959897");
        jTextField1.setSelectedTextColor(new java.awt.Color(153, 255, 255));
        getContentPane().add(jTextField1);
        jTextField1.setBounds(180, 70, 190, 30);

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton1.setText("Pesquisar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(380, 70, 120, 30);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 51));
        jLabel4.setText("TRANSAÇÃO:");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(20, 105, 150, 30);

        jTextField2.setEditable(false);
        jTextField2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        getContentPane().add(jTextField2);
        jTextField2.setBounds(180, 105, 190, 30);

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 51));
        jLabel5.setText("DATA:");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(20, 140, 150, 30);

        jTextField3.setEditable(false);
        jTextField3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        getContentPane().add(jTextField3);
        jTextField3.setBounds(180, 140, 190, 30);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 51));
        jLabel6.setText("ID_ITEM:");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(20, 175, 150, 30);

        jTextField4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTextField4.setForeground(new java.awt.Color(204, 0, 0));
        jTextField4.setSelectedTextColor(new java.awt.Color(153, 255, 255));
        jTextField4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField4MouseClicked(evt);
            }
        });
        jTextField4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField4ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField4);
        jTextField4.setBounds(180, 175, 190, 30);

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 51));
        jLabel7.setText("PRODUTO:");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(20, 210, 150, 30);

        jTextField5.setEditable(false);
        jTextField5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        getContentPane().add(jTextField5);
        jTextField5.setBounds(180, 210, 190, 30);

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 51));
        jLabel8.setText("PREÇO UN.:");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(20, 245, 150, 30);

        jTextField6.setEditable(false);
        jTextField6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        getContentPane().add(jTextField6);
        jTextField6.setBounds(180, 245, 190, 30);

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 51));
        jLabel9.setText("QTD:");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(20, 280, 150, 30);

        jTextField7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTextField7.setForeground(new java.awt.Color(204, 0, 0));
        jTextField7.setText("1");
        jTextField7.setSelectedTextColor(new java.awt.Color(153, 255, 255));
        jTextField7.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField7KeyReleased(evt);
            }
        });
        getContentPane().add(jTextField7);
        jTextField7.setBounds(180, 280, 190, 30);

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 51));
        jLabel10.setText("SUBTOTAL:");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(20, 315, 150, 30);

        jTextField8.setEditable(false);
        jTextField8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTextField8.setText("0.00");
        getContentPane().add(jTextField8);
        jTextField8.setBounds(180, 315, 190, 30);

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 0, 51));
        jLabel11.setText("DESCONTO:");
        getContentPane().add(jLabel11);
        jLabel11.setBounds(20, 350, 150, 30);

        jTextField9.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTextField9.setForeground(new java.awt.Color(204, 0, 0));
        jTextField9.setText("0.00");
        jTextField9.setSelectedTextColor(new java.awt.Color(153, 255, 255));
        jTextField9.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField9KeyReleased(evt);
            }
        });
        getContentPane().add(jTextField9);
        jTextField9.setBounds(180, 350, 190, 30);

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 0, 51));
        jLabel12.setText("TOTAL:");
        getContentPane().add(jLabel12);
        jLabel12.setBounds(20, 385, 150, 30);

        jTextField10.setEditable(false);
        jTextField10.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTextField10.setText("0.00");
        getContentPane().add(jTextField10);
        jTextField10.setBounds(180, 385, 190, 30);

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 0, 51));
        jLabel13.setText("ESTOQUE ATUAL:");
        getContentPane().add(jLabel13);
        jLabel13.setBounds(20, 420, 150, 30);

        jTextField11.setEditable(false);
        jTextField11.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        getContentPane().add(jTextField11);
        jTextField11.setBounds(180, 420, 190, 30);

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(0, 0, 51));
        jLabel14.setText("VENDEDOR:");
        getContentPane().add(jLabel14);
        jLabel14.setBounds(20, 525, 150, 30);

        jTextField12.setEditable(false);
        jTextField12.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        getContentPane().add(jTextField12);
        jTextField12.setBounds(180, 525, 190, 30);

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(0, 0, 51));
        jLabel15.setText("NOME:");
        getContentPane().add(jLabel15);
        jLabel15.setBounds(20, 560, 150, 30);

        jTextField13.setEditable(false);
        jTextField13.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        getContentPane().add(jTextField13);
        jTextField13.setBounds(180, 560, 190, 30);

        jLabel16.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(0, 0, 51));
        jLabel16.setText("COMPRADOR:");
        getContentPane().add(jLabel16);
        jLabel16.setBounds(820, 70, 150, 40);

        jTextField14.setEditable(false);
        jTextField14.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        getContentPane().add(jTextField14);
        jTextField14.setBounds(940, 70, 300, 40);

        jLabel18.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(0, 0, 51));
        jLabel18.setText("CNPJ/CPF:");
        getContentPane().add(jLabel18);
        jLabel18.setBounds(820, 120, 150, 40);

        jTextField16.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTextField16.setForeground(new java.awt.Color(204, 0, 0));
        jTextField16.setSelectedTextColor(new java.awt.Color(153, 255, 255));
        getContentPane().add(jTextField16);
        jTextField16.setBounds(940, 120, 300, 40);

        jButton2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton2.setText("Pesquisar Comprador");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(1020, 180, 220, 40);

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/pagar.png"))); // NOI18N
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(20, 610, 60, 60);

        jLabel20.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(0, 102, 51));
        jLabel20.setText("PAGAR");
        getContentPane().add(jLabel20);
        jLabel20.setBounds(90, 620, 110, 40);

        jLabel21.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(51, 51, 255));
        jLabel21.setText("FINALIZAR VENDA");
        getContentPane().add(jLabel21);
        jLabel21.setBounds(360, 620, 180, 40);

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/finalizar.png"))); // NOI18N
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4);
        jButton4.setBounds(290, 610, 60, 60);

        jLabel22.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(0, 0, 51));
        jLabel22.setText("CUPOM NÃO FISCAL");
        getContentPane().add(jLabel22);
        jLabel22.setBounds(720, 620, 190, 40);

        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/imprimir.png"))); // NOI18N
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5);
        jButton5.setBounds(650, 610, 60, 60);

        jLabel23.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(255, 51, 51));
        jLabel23.setText("CANCELAR VENDA");
        getContentPane().add(jLabel23);
        jLabel23.setBounds(1090, 620, 160, 40);

        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/apagar.png"))); // NOI18N
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton6);
        jButton6.setBounds(1020, 610, 60, 60);

        jLabel24.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(0, 0, 51));
        jLabel24.setText("ESTOQUE PÓS VENDA:");
        getContentPane().add(jLabel24);
        jLabel24.setBounds(20, 455, 150, 30);

        jTextField17.setEditable(false);
        jTextField17.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        getContentPane().add(jTextField17);
        jTextField17.setBounds(180, 455, 190, 30);

        jLabel25.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(0, 0, 51));
        jLabel25.setText("ITENS:");
        getContentPane().add(jLabel25);
        jLabel25.setBounds(380, 220, 150, 30);

        jLabel26.setBackground(new java.awt.Color(255, 255, 255));
        jLabel26.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(0, 0, 51));
        jLabel26.setText("STATUS:");
        getContentPane().add(jLabel26);
        jLabel26.setBounds(20, 490, 90, 30);

        jTextField18.setEditable(false);
        jTextField18.setBackground(new java.awt.Color(255, 255, 255));
        jTextField18.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        getContentPane().add(jTextField18);
        jTextField18.setBounds(180, 490, 190, 30);

        jButton8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton8.setText("Adicionar");
        jButton8.setEnabled(false);
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton8);
        jButton8.setBounds(510, 175, 120, 30);

        jButton9.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton9.setText("REMOVER");
        jButton9.setEnabled(false);
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton9);
        jButton9.setBounds(380, 480, 160, 40);

        jButton7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton7.setText("Pesquisar");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton7);
        jButton7.setBounds(380, 175, 120, 30);

        jTable1.setAutoCreateRowSorter(true);
        jTable1.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "ID Produto", "Item", "Preço Unitário", "QTD", "Desconto", "Subtotal"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.setDragEnabled(true);
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jTable1MousePressed(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setMinWidth(100);
            jTable1.getColumnModel().getColumn(0).setPreferredWidth(100);
            jTable1.getColumnModel().getColumn(1).setMinWidth(100);
            jTable1.getColumnModel().getColumn(1).setPreferredWidth(100);
            jTable1.getColumnModel().getColumn(2).setMinWidth(100);
            jTable1.getColumnModel().getColumn(2).setPreferredWidth(130);
            jTable1.getColumnModel().getColumn(3).setMinWidth(100);
            jTable1.getColumnModel().getColumn(3).setPreferredWidth(60);
            jTable1.getColumnModel().getColumn(4).setMinWidth(100);
            jTable1.getColumnModel().getColumn(4).setPreferredWidth(100);
            jTable1.getColumnModel().getColumn(5).setMinWidth(100);
            jTable1.getColumnModel().getColumn(5).setPreferredWidth(100);
        }

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(380, 250, 630, 220);

        jLabel27.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(0, 0, 51));
        jLabel27.setText("TOTAL DA COMPRA:");
        getContentPane().add(jLabel27);
        jLabel27.setBounds(940, 480, 150, 40);

        jTextField15.setEditable(false);
        jTextField15.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jTextField15.setForeground(new java.awt.Color(0, 51, 153));
        jTextField15.setText("0");
        getContentPane().add(jTextField15);
        jTextField15.setBounds(1100, 480, 140, 40);

        Logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/fechar.png"))); // NOI18N
        Logo.setFocusCycleRoot(true);
        Logo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Logo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                LogoMousePressed(evt);
            }
        });
        getContentPane().add(Logo);
        Logo.setBounds(1190, 10, 50, 50);

        Logo1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cadProdutos.png"))); // NOI18N
        Logo1.setFocusCycleRoot(true);
        Logo1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Logo1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Logo1MousePressed(evt);
            }
        });
        getContentPane().add(Logo1);
        Logo1.setBounds(1120, 10, 50, 50);

        Logo2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/pesquisar.png"))); // NOI18N
        Logo2.setFocusCycleRoot(true);
        Logo2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Logo2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Logo2MousePressed(evt);
            }
        });
        getContentPane().add(Logo2);
        Logo2.setBounds(1050, 10, 50, 50);

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
        Logo3.setBounds(1020, 250, 220, 220);

        SAD.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        SAD.setForeground(new java.awt.Color(0, 0, 51));
        SAD.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/fundo.png"))); // NOI18N
        getContentPane().add(SAD);
        SAD.setBounds(-10, -10, 1290, 710);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // Pesquisar CPF ou CNPJ
        
        Variaveis.encontrado = 0;
        
        //Conectando ao Banco
        Conexao conexao = new Conexao();
        conexao.conecta();
        
        //Pesquisa o Cliente no Banco de dados
        conexao.selectClientes("select * from sistema.clientes where cpfCnpjCli = '"+jTextField16.getText()+"'");
        
        //Encontrando ou nao o CPF do Cliente.
        if(Variaveis.encontrado <= 0){
            Mensagens.Padrao("NENHUM CLIENTE ENCONTRADO.");
            jTextField14.setText("");
            jTextField16.setText("");
        } else{
            jTextField14.setText(Variaveis.nomeRazao);
            jButton7.setEnabled(true);
        }
        
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // PESQUISANDO ::::::::
        PreenchendoTabela();
        
        if(jTextField18.getText().equals("PAGO")){
        jLabel26.setForeground(Color.BLUE);
        jTextField18.setBackground(new java.awt.Color(153,255,153));
        jTextField18.setForeground(Color.BLUE);
        jTextField16.setEditable(false);
        jButton7.setEnabled(false);
        jButton8.setEnabled(false);
        jButton9.setEnabled(false);
        jButton2.setEnabled(false);
        }
        
        if(jTextField18.getText().equals("CANCELADO")){
        jLabel26.setForeground(new java.awt.Color(255,153,153));
        jTextField18.setBackground(new java.awt.Color(255,153,153));
        jTextField18.setForeground(new java.awt.Color(204,0,0));
        jTextField16.setEditable(false);
        jButton7.setEnabled(false);
        jButton8.setEnabled(false);
        jButton9.setEnabled(false);
        jButton2.setEnabled(false);
        }
        
        if(jTextField18.getText().equals("FINALIZADO")){
        jLabel26.setForeground(Color.BLUE);
        jTextField18.setBackground(new java.awt.Color(102,255,255));
        jTextField18.setForeground(Color.BLUE);
        jTextField16.setEditable(false);
        jButton7.setEnabled(false);
        jButton8.setEnabled(false);
        jButton9.setEnabled(false);
        jButton2.setEnabled(false);
        }
        
        if(jTextField18.getText().equals("PENDENTE")){
        jLabel26.setForeground(new java.awt.Color(240,240,240));
        jTextField18.setBackground(new java.awt.Color(240,240,240));
        jTextField18.setForeground(new java.awt.Color(0,0,0));
        jButton7.setEnabled(true);
        jButton8.setEnabled(true);
        jButton9.setEnabled(true);
        jButton2.setEnabled(true);
        }
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // PESQUISAR O ITEM :::
        Variaveis.encontrado = 0;
        //Conectando ao Banco
        Conexao conexao = new Conexao();
        conexao.conecta();
        //Pesquisa o Cliente no Banco de dados
        conexao.selectProdutos("select * from sistema.produtos where idproduto = '"+jTextField4.getText()+"'");
        //Encontrando ou nao o CPF do Cliente.
        if(Variaveis.encontrado > 0){
            jTextField4.setText(Variaveis.idproduto);
            jTextField5.setText(Variaveis.nomeProduto);
            jTextField6.setText(Variaveis.precoUnitario);
            jTextField11.setText(Variaveis.estoque);
            converterEstoque = Integer.parseInt(Variaveis.estoque);
            converterEstoqueAtual = Integer.parseInt(jTextField7.getText());
            converterEstoqueAtual = converterEstoque - converterEstoqueAtual;
            jTextField17.setText(""+converterEstoqueAtual);
            if(converterEstoqueAtual < 0){
                Mensagens.Padrao("NÃO HÁ ITENS SUFICIENTES NO ESTOQUE!");
                jTextField7.setText("0");
                jTextField17.setText("" + converterEstoque);
            } else{
                jButton8.setEnabled(true);
                //Multiplicando Unitario * Quantidade
                if(Integer.parseInt(jTextField7.getText()) > 0){
                jTextField8.setText("" + (Double.parseDouble(jTextField6.getText()) * Double.parseDouble(jTextField7.getText())) );
                } else{
                    Mensagens.Padrao("O CAMPO NÃO ACEITA VALOR NEGATIVO OU ZERADO.");
                }
                jTextField10.setText("" + (Double.parseDouble(jTextField8.getText()) - Double.parseDouble(jTextField9.getText())) );
                jTextField8.setText(jTextField8.getText().replace(",", "."));  
                // Convertendo
                double valor = Double.parseDouble(jTextField10.getText());
                jTextField10.setText(decimal.format(valor).replace(",", "."));
                double valorb = Double.parseDouble(jTextField8.getText());
                jTextField8.setText(decimal.format(valorb).replace(",", "."));
            }
            
            //Alterando a imagem do Produto ------------------------------
            try{
                String idProduto = jTextField4.getText()+".png";
                String diretorio = Vendas.pathImagens+"/";
                ImageIcon valid = new ImageIcon(diretorio+idProduto);
                System.err.println("valid: "+valid.getIconHeight());
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
            
        } else{
            // Tentando achar algo similar
            Conexao conecta = new Conexao();
            conecta.conecta();
            String sql = "select * from sistema.produtos where nome like '%"+jTextField4.getText()+"%' or idproduto like '%"+jTextField4.getText()+"%'";
            conecta.selectTabelaProdutos(sql);
            if(Variaveis.encontrado > 0){
            Tab_Produtos tab_prod = new Tab_Produtos(sql);
            tab_prod.setVisible(true);
            } else{
                Mensagens.Padrao("NENHUM REGISTRO ENCONTRADO.");
            }
        }
        conexao.desconectar();
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        // REMOVENDO ÚLTIMO ITEM
        Conexao conexao = new Conexao();
        conexao.conecta();
        if(!jTextField18.getText().equals("PAGO") || !Variaveis.vendasStatus[0].equals("PAGO")){
        int linha = 0;
        String idLinha = "?";
        linha = jTable1.getSelectedRow();
        if(linha >= 0 && linha < Variaveis.quantidadeVendas){
        
        //Descobrindo linha selecionada
        idLinha = ""+jTable1.getValueAt(linha, 0);
        //Excluir
        if(!jTable1.getValueAt(0, 0).equals("")){
        Conexao.deleteSemMsg("delete from sistema.vendas where transacao = '"+Variaveis.vendasTransacao[0]+"' and idproduto = '"+idLinha+"'");
        Conexao.updateEstoque("update sistema.produtos set estoque = estoque + "+jTable1.getValueAt(linha, 3)+" where idproduto = '"+idLinha+"'");
        } else{
        Conexao.deleteSemMsg("update sistema.vendas set idproduto = '' where transacao = '"+Variaveis.vendasTransacao[0]);    
        }
        PreenchendoTabela();
        ImageIcon valid = new ImageIcon(getClass().getResource("/img/semFoto.png"));
        Logo3.setIcon(valid);
        
        }
        }  else{
            Mensagens.Padrao("NÃO É POSSÍVEL ALTERAR, A TRANSAÇÃO JÁ ESTÁ FINALIZADA.");
        }
        conexao.desconectar();
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        // ADICIONANDO
        Conexao conexao = new Conexao();
        conexao.conecta();
        jButton8.setEnabled(false);
        if(1<0 && jTextField14.getText().equals("")){
            Mensagens.Padrao("FAVOR INSERIR O CLIENTE.");
        } else {
            
        if(pesquisado > 0){
        int repetido = 0;
        String query="";
        //Verificando o estoque :::
        if((!jTextField18.getText().equals("PAGO") || !Variaveis.vendasStatus[0].equals("PAGO")) && !jTextField18.getText().equals("CANCELADO") && !jTextField18.getText().equals("FINALIZADO")){
        // ********* FAVOR COLOCAR QUE CASO ELE INSERIR O MESMO ITEM QUE APENAS ADICIONE
        if(Integer.parseInt(jTextField7.getText()) > 0){
        
        if(jTextField4.getText().equals(Variaveis.idproduto)){
        jTable1.setValueAt(jTextField4.getText(), Variaveis.quantidadeVendas, 0);
        jTable1.setValueAt(jTextField5.getText(), Variaveis.quantidadeVendas, 1);
        jTable1.setValueAt(jTextField6.getText(), Variaveis.quantidadeVendas, 2);
        jTable1.setValueAt(jTextField7.getText(), Variaveis.quantidadeVendas, 3);
        jTable1.setValueAt(jTextField9.getText(), Variaveis.quantidadeVendas, 4);
        jTable1.setValueAt(jTextField8.getText().replace(",", "."), Variaveis.quantidadeVendas, 5);
        
        Variaveis.vendasData[0] = Variaveis.vendasData[0].substring(6,10) + "-" + Variaveis.vendasData[0].substring(3,5) + "-" + Variaveis.vendasData[0].substring(0,2);
        
        for(int i=0; i<Variaveis.quantidadeVendas; i++){
            if(jTable1.getValueAt(i,0).equals(Variaveis.idproduto)){
                if(!jTable1.getValueAt(i,0).equals("")){
                    repetido = 1;
                }
            }
        }
        if(repetido == 0){
            //Conectando ao Banco
            if(!jTextField14.getText().equals("")){
                query = "INSERT INTO sistema.vendas VALUES('"+jTextField2.getText()+"', '"+Variaveis.vendasData[0]+"', '"+horario+"', '"+Variaveis.idproduto+"', '"+jTable1.getValueAt(Variaveis.quantidadeVendas, 1)+"', '"+jTable1.getValueAt(Variaveis.quantidadeVendas, 2)+"', '"+jTable1.getValueAt(Variaveis.quantidadeVendas, 3)+"', '"+jTable1.getValueAt(Variaveis.quantidadeVendas, 5)+"','"+jTable1.getValueAt(Variaveis.quantidadeVendas, 4)+"', 'PENDENTE', '"+jTextField16.getText()+"', '"+jTextField14.getText()+"', '"+Variaveis.vendasFuncCpf[0]+"', '"+Variaveis.vendasFuncNome[0]+"');";
            } else{
                query = "INSERT INTO sistema.vendas VALUES('"+jTextField2.getText()+"', '"+Variaveis.vendasData[0]+"', '"+horario+"', '"+Variaveis.idproduto+"', '"+jTable1.getValueAt(Variaveis.quantidadeVendas, 1)+"', '"+jTable1.getValueAt(Variaveis.quantidadeVendas, 2)+"', '"+jTable1.getValueAt(Variaveis.quantidadeVendas, 3)+"', '"+jTable1.getValueAt(Variaveis.quantidadeVendas, 5)+"','"+jTable1.getValueAt(Variaveis.quantidadeVendas, 4)+"', 'PENDENTE', NULL, NULL, '"+Variaveis.vendasFuncCpf[0]+"', '"+Variaveis.vendasFuncNome[0]+"');";
            }
            Conexao.saveSemMsg(query);
            Conexao.updateEstoque("update sistema.produtos set estoque = estoque - "+jTextField7.getText()+" where idproduto = '"+Variaveis.idproduto+"'");
            conexao.desconectar();
        } else{
            Conexao.updateSemMsg("update sistema.vendas set desconto = desconto + "+jTextField9.getText()+", qtd = qtd + "+jTextField7.getText()+" where idproduto = '"+Variaveis.idproduto+"' and transacao = '"+Variaveis.vendasTransacao[0]+"'");    
            Conexao.updateEstoque("update sistema.produtos set estoque = estoque - "+jTextField7.getText()+" where idproduto = '"+Variaveis.idproduto+"'");
            conexao.desconectar();
        }
        
        PreenchendoTabela();
        
        jTextField4.setText("");
        jTextField5.setText("");
        jTextField6.setText("");
        jTextField8.setText("");
        jTextField10.setText("");
        jTextField11.setText("");
        jTextField7.setText("1");
        jTextField9.setText("0");
        
        jButton9.setEnabled(true);
        
        } else{
            Mensagens.Padrao("PESQUISE O ITEM E VERIFIQUE SE HÁ A QUANTIDADE SUFICIENTE NO ESTOQUE.");
        }
        } else{
            Mensagens.Padrao("QUANTIDADE INCORRETA.");
        }
        
        
        }else{
            Mensagens.Padrao("NÃO É POSSÍVEL ALTERAR, A TRANSAÇÃO JÁ ESTÁ FINALIZADA.");
        }
        }
        
        
        
        
        // INSERINDO TRANSAÇÃO PRIMEIRA VEZ NO BANCO ----------------------------------------------
        else{
            String query="";
            Conexao.selectVendas("select * from sistema.vendas where transacao = '"+jTextField1.getText()+"'");
            if(Variaveis.quantidadeVendas <= 0){
            jTextField18.setText("PENDENTE");
            // Transação não existe, INSERT...
            
            if(Integer.parseInt(jTextField7.getText()) > 0){
                
              if(jTextField4.getText().equals(Variaveis.idproduto)){
                jTable1.setValueAt(jTextField4.getText(), 0, 0);
                jTable1.setValueAt(jTextField5.getText(), 0, 1);
                jTable1.setValueAt(jTextField6.getText(), 0, 2);
                jTable1.setValueAt(jTextField7.getText(), 0, 3);
                jTable1.setValueAt(jTextField9.getText(), 0, 4);
                jTable1.setValueAt(jTextField8.getText().replace(",", "."), Variaveis.quantidadeVendas, 5);
            
            if(!jTextField14.getText().equals("")){
                query = "INSERT INTO sistema.vendas VALUES('"+jTextField2.getText()+"', '"+ano+"-"+mes+"-"+dia+"', '"+horario+"', '"+jTable1.getValueAt(0, 0)+"', '"+jTable1.getValueAt(0, 1)+"', '"+jTable1.getValueAt(0, 2)+"', '"+jTable1.getValueAt(0, 3)+"', '"+jTable1.getValueAt(0, 5)+"','"+jTable1.getValueAt(0, 4)+"', 'PENDENTE', '"+jTextField16.getText()+"', '"+jTextField14.getText()+"', '"+jTextField12.getText()+"', '"+jTextField13.getText()+"');";
            } else{
                query = "INSERT INTO sistema.vendas VALUES('"+jTextField2.getText()+"', '"+ano+"-"+mes+"-"+dia+"', '"+horario+"', '"+jTable1.getValueAt(0, 0)+"', '"+jTable1.getValueAt(0, 1)+"', '"+jTable1.getValueAt(0, 2)+"', '"+jTable1.getValueAt(0, 3)+"', '"+jTable1.getValueAt(0, 5)+"','"+jTable1.getValueAt(0, 4)+"', 'PENDENTE', NULL, NULL, '"+jTextField12.getText()+"', '"+jTextField13.getText()+"');";
            }
            Conexao.saveSemMsg(query);
            Conexao.updateEstoque("update sistema.produtos set estoque = estoque - "+jTextField7.getText()+" where idproduto = '"+Variaveis.idproduto+"'");
            
            PreenchendoTabela();
        
            jTextField4.setText("");
            jTextField5.setText("");
            jTextField6.setText("");
            jTextField8.setText("");
            jTextField10.setText("");
            jTextField11.setText("");
            jTextField7.setText("1");
            jTextField9.setText("0");
            pesquisado = 1;
                
            jButton9.setEnabled(true);  
            
            }
              else{
                 Mensagens.Padrao("A QUANTIDADE ESTÁ INCORRETA."); 
              }
                
                
                
            } else{
                Mensagens.Padrao("FAVOR PESQUISAR O ITEM E VALIDAR SE ELE EXISTE.");
            }
            
            
            } else{
                Mensagens.Padrao("A TRANSAÇÃO "+jTextField1.getText()+" JÁ EXISTE!");
            }
     
        }
        
        }
       
        conexao.desconectar();
        
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // PAGO
        if(!jTextField18.getText().equals("PAGO") && !jTextField18.getText().equals("CANCELADO") && !jTextField18.getText().equals("FINALIZADO")){
        int confirmar = JOptionPane.showConfirmDialog(null, "Tem certeza disso?");
        if(confirmar == 0){
        Conexao c = new Conexao();
        c.conecta();
        Conexao.updateEstoque("update sistema.vendas set statusVenda = 'PAGO' , horarioVenda = '"+horario+"' where transacao = '"+Variaveis.vendasTransacao[0]+"'");
        c.desconectar();
        PreenchendoTabela();
        }
        } else{
           Mensagens.Padrao("REQUISIÇÃO NÃO PODE SER EFETUADA.");
        }
        
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // CANCELANDO A VENDA
        Conexao c = new Conexao();
        c.conecta();
        int linhaCancela = 0;
        
        if(!jTextField18.getText().equals("") && !jTextField18.getText().equals("CANCELADO") && !jTextField18.getText().equals("FINALIZADO")){
        int confirmar = JOptionPane.showConfirmDialog(null, "Tem certeza disso?");
        if(confirmar == 0){
        Conexao.updateEstoque("update sistema.vendas set statusVenda = 'CANCELADO' , horarioVenda = '"+horario+"' where transacao = '"+Variaveis.vendasTransacao[0]+"'");
        
        for(linhaCancela=0; linhaCancela <= (Variaveis.quantidadeVendas-1); linhaCancela++){
            Conexao.updateEstoque("update sistema.produtos set estoque = estoque + "+jTable1.getValueAt(linhaCancela, 3)+" where idproduto = '"+jTable1.getValueAt(linhaCancela, 0)+"'");
            System.out.println("update sistema.produtos set estoque = estoque + "+jTable1.getValueAt(linhaCancela, 3)+" where idproduto = '"+jTable1.getValueAt(linhaCancela, 0)+"'");
        }
        
        jTextField18.setText("CANCELADO");
        jLabel26.setForeground(new java.awt.Color(255,153,153));
        jTextField18.setBackground(new java.awt.Color(255,153,153));
        jTextField18.setForeground(new java.awt.Color(204,0,0));
        Mensagens.Padrao("VENDA CANCELADA COM SUCESSO.");
        Vendas v = new Vendas();
        this.dispose();
        v.setVisible(true);
        }
        
        
        
        } else{
            Mensagens.Padrao("A REQUISIÇÃO NÃO PODE SER EFETUADA.");
        }
        
        c.desconectar();
        
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // FINALIZAR A VENDA
        Conexao c = new Conexao();
        c.conecta();
        if(!jTextField18.getText().equals("") && !jTextField18.getText().equals("CANCELADO") && !jTextField18.getText().equals("FINALIZADO") && !jTextField18.getText().equals("PENDENTE")){
        int confirmar = JOptionPane.showConfirmDialog(null, "Tem certeza disso?");
        if(confirmar == 0){
        Conexao.updateEstoque("update sistema.vendas set statusVenda = 'FINALIZADO' , horarioVenda = '"+horario+"' where transacao = '"+Variaveis.vendasTransacao[0]+"'");
        PreenchendoTabela();
        
        jTextField18.setText("FINALIZADO");
        jLabel26.setForeground(Color.BLUE);
        jTextField18.setBackground(new java.awt.Color(102,255,255));
        jTextField18.setForeground(Color.BLUE);
        Mensagens.Padrao("VENDA FINALIZADA COM SUCESSO.");
        }
        } else if(jTextField18.getText().equals("")){
            Mensagens.Padrao("INSIRA UM ITEM NO CARRINHO, EM SEGUIDA PAGUE A CONTA PARA FINALIZAR.");
        } else if(jTextField18.getText().equals("PENDENTE")){
            Mensagens.Padrao("PAGUE A CONTA PARA FINALIZAR.");
        } else{
           Mensagens.Padrao("REQUISIÇÃO NÃO PODE SER EFETUADA.");
        }
        
        
        c.desconectar();
        
    }//GEN-LAST:event_jButton4ActionPerformed

    private void LogoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LogoMousePressed
        // Voltando
        Principal menuPrincipal = new Principal();
        menuPrincipal.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_LogoMousePressed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // NOTA FISCAL - 882019820202536833
        Conexao c = new Conexao();
        c.conecta();
        if(!jTextField18.getText().equals("PAGO") && !jTextField18.getText().equals("CANCELADO") && !jTextField18.getText().equals("PENDENTE")){
        
        String notaFiscal = "";
        String horario = Conexao.selectHorario(jTextField2.getText());
        
        notaFiscal = "### TRANSAÇÃO: "+jTextField2.getText()+" ###################\n";
        notaFiscal = notaFiscal+"---------------------------------------------------\n";
        notaFiscal = notaFiscal+"DATA: "+jTextField3.getText()+"\n";
        notaFiscal = notaFiscal+"HORÁRIO: "+horario+"\n";
        notaFiscal = notaFiscal+"STATUS: "+jTextField18.getText()+"\n";
        notaFiscal = notaFiscal+"OPERADOR: "+jTextField12.getText().toUpperCase()+" - NOME: "+jTextField13.getText().toUpperCase()+"\n";
        notaFiscal = notaFiscal+"CLIENTE: "+jTextField14.getText().toUpperCase()+"\n";
        notaFiscal = notaFiscal+"CNPJ: "+jTextField16.getText()+"\n";
        notaFiscal = notaFiscal+"---------------------------------------------------\n";
        notaFiscal = notaFiscal+"COD - ITEM - PREÇO UNIT - QTD - DESCONTO - SUBTOTAL\n";
        
        for(int i = 0; i < Variaveis.quantidadeVendas ; i++){
            notaFiscal = notaFiscal + jTable1.getValueAt(i, 0) + " - ";
            notaFiscal = notaFiscal + jTable1.getValueAt(i, 1) + " - ";
            notaFiscal = notaFiscal + "R$" + jTable1.getValueAt(i, 2) + " - ";
            notaFiscal = notaFiscal + jTable1.getValueAt(i, 3) + "X - ";
            notaFiscal = notaFiscal + "R$" + jTable1.getValueAt(i, 4) + " - ";
            notaFiscal = notaFiscal + "R$" + jTable1.getValueAt(i, 5) + "\n";
        }
        
        
        notaFiscal = notaFiscal+"---------------------------------------------------\n";
        notaFiscal = notaFiscal+"TOTAL: "+jTextField15.getText()+"\n";
        notaFiscal = notaFiscal+"---------------------------------------------------\n";
        
        notaFiscal = notaFiscal + "\n\n";
        
        
        JTextArea area = new JTextArea(notaFiscal);
        JScrollPane scroll = new JScrollPane(area);
        scroll.setPreferredSize(new Dimension(600, 599));
        //JOptionPane.showMessageDialog(null,scroll,  "Deseja Imprimir", JOptionPane.YES_NO_OPTION);    
        int imprime = JOptionPane.showConfirmDialog(this,
        scroll,
        "DESEJA IMPRIMIR A NOTA?",
        JOptionPane.OK_CANCEL_OPTION);
        if(imprime == JOptionPane.OK_OPTION){
           System.err.println("IMPRIMINDO"); 
           Imprimir i = new Imprimir();
           i.imprime(notaFiscal);
        }
        Vendas v = new Vendas();
        this.dispose();
        v.setVisible(true);
        } else{
            Mensagens.Padrao("A VENDA PRECISA ESTAR FINALIZADA.");
        } 
        
        c.desconectar();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jTextField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField4ActionPerformed
        
    }//GEN-LAST:event_jTextField4ActionPerformed

    private void jTextField4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField4MouseClicked
        
    }//GEN-LAST:event_jTextField4MouseClicked

    private void Logo1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Logo1MousePressed
        // Nova Venda
        if(jTextField18.getText().equals("") || jTextField18.getText().equals("CANCELADO") || jTextField18.getText().equals("FINALIZADO")){
            Vendas v = new Vendas();
            this.dispose();
            v.setVisible(true);
            //Foto do Produto
            ImageIcon valid = new ImageIcon(getClass().getResource("/img/semFoto.png"));
            Logo3.setIcon(valid);
        } else{
            Mensagens.Padrao("PARA INICIAR UMA NOVA VENDA, VOCÊ PRECISA FINALIZAR/CANCELAR ESSA VENDA ATUAL.");
        }
    }//GEN-LAST:event_Logo1MousePressed

    private void jTextField7KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField7KeyReleased
        // ATUALIZA AUTOMATICAMENTE
        jTextField9.setText(jTextField9.getText().replace(",", "."));
        jButton8.setEnabled(true);
                //Multiplicando Unitario * Quantidade
                if(Integer.parseInt(jTextField7.getText()) > 0){
                jTextField8.setText("" + (Double.parseDouble(jTextField6.getText()) * Double.parseDouble(jTextField7.getText())) );
                } else{
                    Mensagens.Padrao("O CAMPO NÃO ACEITA VALOR NEGATIVO OU ZERADO.");
                }
                converterEstoque = Integer.parseInt(Variaveis.estoque);
                converterEstoqueAtual = Integer.parseInt(jTextField7.getText());
                converterEstoqueAtual = converterEstoque - converterEstoqueAtual;
                jTextField17.setText(""+converterEstoqueAtual);

                jTextField10.setText("" + (Double.parseDouble(jTextField8.getText()) - Double.parseDouble(jTextField9.getText())) );
                jTextField8.setText(jTextField8.getText().replace(",", "."));  
                // Convertendo
                double valor = Double.parseDouble(jTextField10.getText());
                jTextField10.setText(decimal.format(valor).replace(",", "."));
                double valorb = Double.parseDouble(jTextField8.getText());
                jTextField8.setText(decimal.format(valorb).replace(",", "."));
    }//GEN-LAST:event_jTextField7KeyReleased

    private void jTextField9KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField9KeyReleased
        // ATUALIZA AUTOMATICAMENTE
        jTextField9.setText(jTextField9.getText().replace(",", "."));
        jButton8.setEnabled(true);
                //Multiplicando Unitario * Quantidade
                if(Integer.parseInt(jTextField7.getText()) > 0){
                jTextField8.setText("" + (Double.parseDouble(jTextField6.getText()) * Double.parseDouble(jTextField7.getText())) );
                } else{
                    Mensagens.Padrao("O CAMPO NÃO ACEITA VALOR NEGATIVO OU ZERADO.");
                }
                jTextField10.setText("" + (Double.parseDouble(jTextField8.getText()) - Double.parseDouble(jTextField9.getText())) );
                jTextField8.setText(jTextField8.getText().replace(",", "."));  
                // Convertendo
                double valor = Double.parseDouble(jTextField10.getText());
                jTextField10.setText(decimal.format(valor).replace(",", "."));
                double valorb = Double.parseDouble(jTextField8.getText());
                jTextField8.setText(decimal.format(valorb).replace(",", "."));
                
    }//GEN-LAST:event_jTextField9KeyReleased

    private void Logo2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Logo2MousePressed
        // PESQUISAR DIVERSAS VENDAS
            Conexao conecta = new Conexao();
            conecta.conecta();
            String sql = "select transacao, max(data) data, max(horarioVenda) horarioVenda, sum(subtotal)-sum(desconto) total, max(statusVenda) statusVenda, max(cpfCnpjCli) cpfCnpjCli, max(nomeRazao) nomeRazao, max(funcCpf) funcCpf, max(nome) nome from sistema.vendas group by transacao order by data desc, horarioVenda desc, transacao desc;";
            conecta.selectVendasGroup(sql);
            if(Variaveis.encontrado > 0){
                Tab_Vendas tab_vendas = new Tab_Vendas(sql);
                tab_vendas.setVisible(true);
            }
            conecta.desconectar();
        
    }//GEN-LAST:event_Logo2MousePressed

    private void Logo3MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Logo3MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_Logo3MousePressed

    private void jTable1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MousePressed
        // ALTERA FOTO DO ITEM
        int linha = jTable1.getSelectedRow();
        String idLinha = ""+jTable1.getValueAt(linha, 0);
        
        //Alterando a imagem do Produto ------------------------------
            try{
                String idProduto = idLinha+".png";
                String diretorio = Vendas.pathImagens+"/";
                ImageIcon valid = new ImageIcon(diretorio+idProduto);
                System.err.println("valid: "+valid.getIconHeight());
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
        
    }//GEN-LAST:event_jTable1MousePressed

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
    private javax.swing.JLabel Logo3;
    private javax.swing.JLabel SAD;
    public static javax.swing.JButton jButton1;
    public static javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    public static javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    public static javax.swing.JTable jTable1;
    public static javax.swing.JTextField jTextField1;
    public static javax.swing.JTextField jTextField10;
    public static javax.swing.JTextField jTextField11;
    public static javax.swing.JTextField jTextField12;
    public static javax.swing.JTextField jTextField13;
    public static javax.swing.JTextField jTextField14;
    public static javax.swing.JTextField jTextField15;
    public static javax.swing.JTextField jTextField16;
    public static javax.swing.JTextField jTextField17;
    public static javax.swing.JTextField jTextField18;
    public static javax.swing.JTextField jTextField2;
    public static javax.swing.JTextField jTextField3;
    public static javax.swing.JTextField jTextField4;
    public static javax.swing.JTextField jTextField5;
    public static javax.swing.JTextField jTextField6;
    public static javax.swing.JTextField jTextField7;
    public static javax.swing.JTextField jTextField8;
    public static javax.swing.JTextField jTextField9;
    private javax.swing.ButtonGroup tipo;
    // End of variables declaration//GEN-END:variables

public static void PreenchendoTabela(){
        for(int i = 0; i < 6; i++){
            for(int j = 0; j < 100; j++){
                jTable1.setValueAt("", j, i);
            }
        }
                
        // Valores decimais
        DecimalFormat decimal =  new DecimalFormat();
        // -----------------------------------------------
        
        // Contador
        int contadorProdutosVenda = 0;
        
        // Variavel total da Compra
        double totalCompra = 0;
        double subtotal = 0;
        double desconto = 0;
        
        // Pesquisar CPF ou CNPJ
        Variaveis.encontrado = 0;

        //Conectando ao Banco
        Conexao conexao = new Conexao();
        conexao.conecta();

        //Pesquisa o Cliente no Banco de dados
        conexao.selectVendas("select * from sistema.vendas where transacao = '"+jTextField1.getText()+"'");

        //Encontrando ou nao o CPF do Cliente.
        if(Variaveis.encontrado <= 0){
            Mensagens.Padrao("SEM REGISTRO.");
            jTextField14.setText("");
            jTextField16.setText("");
            jTextField15.setText("");
        } else{
            jTextField14.setEditable(false);
            jTextField16.setEditable(false);
            jButton2.setEnabled(false);
            
            pesquisado = 1;
            jTextField2.setText(Variaveis.vendasTransacao[0]);
            Variaveis.vendasData[0] = Variaveis.vendasData[0].substring(8,10) + "/" + Variaveis.vendasData[0].substring(5,7) + "/" + Variaveis.vendasData[0].substring(0,4);
            jTextField3.setText(Variaveis.vendasData[0]);
            jTextField14.setText(Variaveis.vendasNomeRazao[0]);
            jTextField16.setText(Variaveis.vendasCpfCnpjCli[0]);
            jTextField18.setText(Variaveis.vendasStatus[0]);
            
            // Preenchendo a Tabela
            for(contadorProdutosVenda = 0; contadorProdutosVenda < Variaveis.quantidadeVendas; contadorProdutosVenda++){
                 jTable1.setValueAt(Variaveis.vendasIdProduto[contadorProdutosVenda], contadorProdutosVenda, 0);
                 jTable1.setValueAt(Variaveis.vendasProdutoNome[contadorProdutosVenda], contadorProdutosVenda, 1);
                 jTable1.setValueAt(Variaveis.vendasPreco[contadorProdutosVenda], contadorProdutosVenda, 2);
                 jTable1.setValueAt(Variaveis.vendasQtd[contadorProdutosVenda], contadorProdutosVenda, 3);
                 desconto = Double.parseDouble(Variaveis.vendasDesconto[contadorProdutosVenda]);
                 jTable1.setValueAt(desconto, contadorProdutosVenda, 4);
                 subtotal = (Double.parseDouble(Variaveis.vendasPreco[contadorProdutosVenda]) * Double.parseDouble(Variaveis.vendasQtd[contadorProdutosVenda])) - Double.parseDouble(Variaveis.vendasDesconto[contadorProdutosVenda]);
                 
                 jTable1.setValueAt(decimal.format(subtotal).replace(",", "."), contadorProdutosVenda, 5);
                 totalCompra = totalCompra + subtotal;
                 jTextField15.setText("R$ "+decimal.format(totalCompra));
            }
  
        }
    }

    
    public String Converter(String valores){
        String[] stringDividida = valores.split("[.]");
        String valor = ""+stringDividida[1];
        valor = valor.substring(0,1);
        valor = stringDividida[0]+"."+valor;
        return valor;
    }
    
    public String Replace(String valores){
        valores = valores.replace(".", ",");
        return valores;
    }
    
    
    
    
}
