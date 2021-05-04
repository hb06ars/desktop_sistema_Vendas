import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Conexao {
    
    public static String urlConexao = "jdbc:mysql://localhost:3306/sistema?useTimezone=true&serverTimezone=UTC";;
    public static String userConexao = "root";
    public static String senhaConexao = "root";

    public static Connection connection = null;
    public static Statement stm = null;
    public static String sql="";
        
    public void conecta(){
          
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch(ClassNotFoundException e) {
            System.out.println("Erro no Driver.");
        }

        try {
            connection = DriverManager.getConnection(urlConexao, userConexao,senhaConexao);
        }
        catch(SQLException e) {
          System.out.println("Erro no caminho do Banco de dados."); 
          e.printStackTrace();
        }  

        if(connection != null) {
                  try {
                      stm = (Statement) connection.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
                  } catch (SQLException ex) {
                      Logger.getLogger(Conexao.class.getName()).log(Level.SEVERE, null, ex);
                  }
                System.out.println("Conexão sucedida."); 
            } else {
                System.out.println("Erro na conexão."); 
        }
    }   
    
    
    
    public void desconectar(){
        try{
        stm.close();
        connection.close();
        } catch(Exception e){}
        System.out.println("Desconectado."); 
    }
    
    
    public static void save(String sql) {
        try {
        stm.executeUpdate(sql);
        Mensagens.Sucesso();
        Variaveis.encontrado = 1;
        }
        catch(SQLException sqlex) {
           System.out.println("Erro acesso no SAVE: "+ sqlex);
        }
    }
    
    public static void saveSemMsg(String sql) {
        System.out.println("SQL: "+sql);
        try {
        stm.executeUpdate(sql);
        Variaveis.encontrado = 1;
        }
        catch(SQLException sqlex) {
           System.out.println("Erro acesso no SAVE: "+ sqlex);
        }
    }
    
    
    public static void update(String sql) {
        try {
        stm.executeUpdate(sql);
        Mensagens.Sucesso();
        }
        catch(SQLException sqlex) {
           System.out.println("Erro acesso no UPDATE: "+ sqlex);
        }
    }
    
    public static void updateSemMsg(String sql) {
        try {
        stm.executeUpdate(sql);
        }
        catch(SQLException sqlex) {
           System.out.println("Erro acesso no UPDATE: "+ sqlex);
        }
    }
    
    public static void updateEstoque(String sql) {
        System.out.println("SQL: "+sql);
        try {
        stm.executeUpdate(sql);
        }
        catch(SQLException sqlex) {
           System.out.println("Erro acesso no UPDATE: "+ sqlex);
        }
    }
    
    
    public static void delete(String sql) {
        try {
        stm.executeUpdate(sql);
        Mensagens.Sucesso();
        }
        catch(SQLException sqlex) {
           System.out.println("Erro acesso no DELETE: "+ sqlex);
        }
    }
    
    public static void deleteSemMsg(String sql) {
        System.out.println("SQL: "+sql);
        try {
        stm.executeUpdate(sql);
        }
        catch(SQLException sqlex) {
           System.out.println("Erro acesso no DELETE: "+ sqlex);
        }
    }
    
    
    public void selectPathImagens() {
        try {
        ResultSet dados = stm.executeQuery("select pathProduto from configuracao limit 1;");
        while (dados.next()){
          Vendas.pathImagens = dados.getString("pathProduto");
        }
        }catch(SQLException sqlex) {
           System.out.println("Erro acesso no SELECT: "+ sqlex);
        }
    }
    
    
    public void selectClientes(String sql) {
        try {
        ResultSet dados = stm.executeQuery(sql);
        while (dados.next()){
          Variaveis.encontrado = 1;
          Variaveis.cpfCnpjCli = dados.getString("cpfCnpjCli");
          Variaveis.nomeRazao = dados.getString("nomeRazao");
          Variaveis.CliEndereco = dados.getString("endereco");
          Variaveis.CliBairro = dados.getString("bairro");
          Variaveis.CliCidade = dados.getString("cidade");
          Variaveis.CliEstado = dados.getString("estado");
          Variaveis.CliCep = dados.getString("cep");
          Variaveis.CliCtto = dados.getString("ctto");
          Variaveis.CliCtto2 = dados.getString("ctto2");
          Variaveis.CliEmail = dados.getString("email");

          
        }
        }catch(SQLException sqlex) {
           System.out.println("Erro acesso no SELECT: "+ sqlex);
        }
    }
    
    
    
    public static void selectFuncionarios(String sql) {
        try {
        ResultSet dados = stm.executeQuery(sql);
        while (dados.next()){
          Variaveis.encontrado = 1;
          Variaveis.funcCpf = dados.getString("funcCpf");
          Variaveis.senha = dados.getString("senha");
          Variaveis.nome = dados.getString("nome");
          Variaveis.cargo = dados.getString("cargo");
          Variaveis.permissao = dados.getString("permissao");
          Variaveis.FuncCtto = dados.getString("ctto");
          Variaveis.FuncCtto2 = dados.getString("ctto2");
          Variaveis.Funcemail = dados.getString("email");
          
        }
        }catch(SQLException sqlex) {
           System.out.println("Erro acesso no SELECT: "+ sqlex);
        }
    }
    
    
    
    
    public void selectProdutos(String sql) {
        try {
        ResultSet dados = stm.executeQuery(sql);
        Variaveis.quantidade=0;
        while (dados.next()){
          Variaveis.encontrado = 1;
          Variaveis.idproduto = dados.getString("idproduto");
          Variaveis.nomeProduto = dados.getString("nome");
          Variaveis.modelo = dados.getString("modelo");
          Variaveis.descricao = dados.getString("descricao");
          Variaveis.fornecedor = dados.getString("fornecedor");
          Variaveis.estoque = dados.getString("estoque");
          Variaveis.precoUnitario = dados.getString("precoUnitario");
          Variaveis.quantidade++;
        }
        }catch(SQLException sqlex) {
           System.out.println("Erro acesso no SELECT: "+ sqlex);
        }
    }
    
    
    
    
    public void selectTabelaProdutos(String sql) {
        try {
            int i = 0;
            ResultSet dados = stm.executeQuery(sql);
            Variaveis.quantidade=0;
            
        while (dados.next()){
          Variaveis.encontrado = 1;
          
          Variaveis.tabelaIdproduto[i] = dados.getString("idproduto");
          Variaveis.tabelaNomeProduto[i] = dados.getString("nome");
          Variaveis.tabelaModelo[i] = dados.getString("modelo");
          Variaveis.tabelaDescricao[i] = dados.getString("descricao");
          Variaveis.tabelaFornecedor[i] = dados.getString("fornecedor");
          Variaveis.tabelaEstoque[i] = dados.getInt("estoque");
          Variaveis.tabelaprecoUnitario[i] = dados.getDouble("precoUnitario");
          Variaveis.quantidade++;
          i++;
          
          
        }
        }catch(SQLException sqlex) {
           System.out.println("Erro acesso no SELECT: "+ sqlex);
        }
    }
    
    
    public static void selectVendas(String sql) {
        try {
        Variaveis.quantidadeVendas = 0;
        ResultSet dados = stm.executeQuery(sql);
        
        while (dados.next()){
            Variaveis.encontrado = 1;
            Variaveis.vendasTransacao[Variaveis.quantidadeVendas] = dados.getString("transacao");
            Variaveis.vendasData[Variaveis.quantidadeVendas] = dados.getString("data");
            Variaveis.vendasIdProduto[Variaveis.quantidadeVendas] = dados.getString("idproduto");
            Variaveis.vendasProdutoNome[Variaveis.quantidadeVendas] = dados.getString("nomeProduto");
            Variaveis.vendasPreco[Variaveis.quantidadeVendas] = dados.getString("precoUnitario");
            Variaveis.vendasQtd[Variaveis.quantidadeVendas] = dados.getString("qtd");
            Variaveis.vendasSubtotal[Variaveis.quantidadeVendas] = dados.getString("subtotal");
            Variaveis.vendasDesconto[Variaveis.quantidadeVendas] = dados.getString("desconto");
            Variaveis.vendasStatus[Variaveis.quantidadeVendas] = dados.getString("statusVenda");
            Variaveis.vendasCpfCnpjCli[Variaveis.quantidadeVendas] = dados.getString("cpfCnpjCli");
            Variaveis.vendasNomeRazao[Variaveis.quantidadeVendas] = dados.getString("nomeRazao");
            Variaveis.vendasFuncCpf[Variaveis.quantidadeVendas] = dados.getString("funcCpf");
            Variaveis.vendasFuncNome[Variaveis.quantidadeVendas] = dados.getString("nome");
            Variaveis.quantidadeVendas++;
          
        }
        }catch(SQLException sqlex) {
           System.out.println("Erro acesso no SELECT: "+ sqlex);
        }
    }
    
    
    
    public static void selectVendasGroup(String sql) {
        try {
        Variaveis.quantidadeVendasGroup = 0;
        ResultSet dados = stm.executeQuery(sql);
        
        while (dados.next()){
            Variaveis.encontrado = 1;
            Variaveis.vendasTransacaoGroup[Variaveis.quantidadeVendasGroup] = dados.getString("transacao");
            Variaveis.vendasDataGroup[Variaveis.quantidadeVendasGroup] = dados.getString("data");
            Variaveis.vendasHorarioVendaGroup[Variaveis.quantidadeVendasGroup] = dados.getString("horarioVenda");
            Variaveis.vendasTotalGroup[Variaveis.quantidadeVendasGroup] = dados.getString("total");
            Variaveis.vendasStatusVendaGroup[Variaveis.quantidadeVendasGroup] = dados.getString("statusVenda");
            Variaveis.vendasCpfCnpjGroup[Variaveis.quantidadeVendasGroup] = dados.getString("cpfCnpjCli");
            Variaveis.vendasNomeRazaoGroup[Variaveis.quantidadeVendasGroup] = dados.getString("nomeRazao");
            Variaveis.vendasFuncCpfGroup[Variaveis.quantidadeVendasGroup] = dados.getString("funcCpf");
            Variaveis.vendasNomeGroup[Variaveis.quantidadeVendasGroup] = dados.getString("nome");
            Variaveis.quantidadeVendasGroup++;
        }
        }catch(SQLException sqlex) {
           System.out.println("Erro acesso no SELECT: "+ sqlex);
        }
    }
    
    
    public static String selectHorario(String sql) {
        String horaVenda = "";
        sql = "select distinct(horarioVenda) from sistema.vendas where transacao = '"+sql+"'";
        try {
        ResultSet dados = stm.executeQuery(sql);
        while (dados.next()){
            horaVenda = dados.getString("horarioVenda");
        }
        }catch(SQLException sqlex) {
           System.out.println("Erro acesso no SELECT: "+ sqlex);
        }
        return horaVenda;
    }
    
    
    public static void instalandoBanco() {
        String instalando = "";
        try {
        instalando = "CREATE TABLE IF NOT EXISTS `sistema`.`produtos` ( `idproduto` VARCHAR(25) NOT NULL, `nome` VARCHAR(25) NOT NULL, `modelo` VARCHAR(30) NULL, `descricao` VARCHAR(50) NULL, `fornecedor` VARCHAR(25) NULL, `estoque` int NOT NULL, `precoUnitario` decimal(6,2) NOT NULL, PRIMARY KEY (`idproduto`)) ENGINE = InnoDB;";    
        stm.executeUpdate(instalando);
        
        instalando = "CREATE TABLE IF NOT EXISTS `sistema`.`funcionarios` ( `funcCpf` VARCHAR(40) NOT NULL, `senha` VARCHAR(15) NULL, `nome` VARCHAR(25) NOT NULL, `cargo` VARCHAR(25) NULL, `permissao` int NOT NULL, `ctto` VARCHAR(15) NULL, `ctto2` VARCHAR(15) NULL, `email` VARCHAR(40) NULL, PRIMARY KEY (`funcCpf`)) ENGINE = InnoDB;";    
        stm.executeUpdate(instalando);
        
        instalando = "CREATE TABLE IF NOT EXISTS `sistema`.`clientes` ( `cpfCnpjCli` VARCHAR(40) NOT NULL, `nomeRazao` VARCHAR(25) NOT NULL, `endereco` VARCHAR(25) NULL, `bairro` VARCHAR(25) NULL, `cidade` VARCHAR(25) NULL, `estado` VARCHAR(2) NULL, `cep` VARCHAR(9) NULL, `ctto` VARCHAR(15) NULL, `ctto2` VARCHAR(15) NULL, `email` VARCHAR(40) NULL, PRIMARY KEY (`cpfCnpjCli`)) ENGINE = InnoDB;";    
        stm.executeUpdate(instalando);
        
        instalando = "CREATE TABLE IF NOT EXISTS `sistema`.`vendas` ( transacao VARCHAR(65) NOT NULL, `data` date NOT NULL, `horarioVenda` VARCHAR(25) NOT NULL , `idproduto` VARCHAR(25) NOT NULL, `nomeProduto` VARCHAR(25) NULL, `precoUnitario` decimal(6,2) NOT NULL, `qtd` int NOT NULL, `subtotal` decimal(6,2) NOT NULL, `desconto` decimal(6,2) NOT NULL, `statusVenda` VARCHAR(25) NOT NULL, `cpfCnpjCli` VARCHAR(40) NULL, `nomeRazao` VARCHAR(255) NULL, `funcCpf` VARCHAR(40) NOT NULL, `nome` VARCHAR(25) NOT NULL, CONSTRAINT fk_IdProdutoVendas FOREIGN KEY (idproduto) REFERENCES produtos (idproduto), CONSTRAINT fk_CpfCnpjClienteVendas FOREIGN KEY (cpfCnpjCli) REFERENCES clientes (cpfCnpjCli), CONSTRAINT fk_CpfFuncionarioVendas FOREIGN KEY (funcCpf) REFERENCES funcionarios(funcCpf) ) ENGINE = InnoDB;";    
        stm.executeUpdate(instalando);
        
        instalando = "CREATE TABLE IF NOT EXISTS `sistema`.`configuracao` ( pathProduto VARCHAR(100) NULL ) ENGINE = InnoDB;";    
        stm.executeUpdate(instalando);
        
        selectFuncionarios("select * from sistema.funcionarios");
        if(Variaveis.encontrado <= 0){
        instalando = "INSERT INTO sistema.funcionarios VALUES ('0', '0','Admnistrador','Admnistrador','3', '(00)0000-0000','(00)0000-00000','admni@admin');";    
        stm.executeUpdate(instalando);
        }
        
        Mensagens.Padrao("Banco de dados instalado com sucesso!");
        Variaveis.bancoInstalado = "OK";
        try{
            Instalacao.jLabel24.setText("Banco de dados instalado com sucesso.");
        } catch(Exception e){}
        
        }
        catch(SQLException sqlex) {
           System.out.println("Erro acesso no Instalação: "+ sqlex);
           Variaveis.bancoInstalado = "";
           Instalacao.jLabel24.setText("");
        }
    }
    
    
    public static void instalandoBancoSemMsg() {
        String instalando = "";
        try {
        instalando = "CREATE TABLE IF NOT EXISTS `sistema`.`produtos` ( `idproduto` VARCHAR(25) NOT NULL, `nome` VARCHAR(25) NOT NULL, `modelo` VARCHAR(30) NULL, `descricao` VARCHAR(50) NULL, `fornecedor` VARCHAR(25) NULL, `estoque` int NOT NULL, `precoUnitario` decimal(6,2) NOT NULL, PRIMARY KEY (`idproduto`)) ENGINE = InnoDB;";    
        stm.executeUpdate(instalando);
        
        instalando = "CREATE TABLE IF NOT EXISTS `sistema`.`funcionarios` ( `funcCpf` VARCHAR(40) NOT NULL, `senha` VARCHAR(15) NULL, `nome` VARCHAR(25) NOT NULL, `cargo` VARCHAR(25) NULL, `permissao` int NOT NULL, `ctto` VARCHAR(15) NULL, `ctto2` VARCHAR(15) NULL, `email` VARCHAR(40) NULL, PRIMARY KEY (`funcCpf`)) ENGINE = InnoDB;";    
        stm.executeUpdate(instalando);
        
        instalando = "CREATE TABLE IF NOT EXISTS `sistema`.`clientes` ( `cpfCnpjCli` VARCHAR(40) NOT NULL, `nomeRazao` VARCHAR(25) NOT NULL, `endereco` VARCHAR(25) NULL, `bairro` VARCHAR(25) NULL, `cidade` VARCHAR(25) NULL, `estado` VARCHAR(2) NULL, `cep` VARCHAR(9) NULL, `ctto` VARCHAR(15) NULL, `ctto2` VARCHAR(15) NULL, `email` VARCHAR(40) NULL, PRIMARY KEY (`cpfCnpjCli`)) ENGINE = InnoDB;";    
        stm.executeUpdate(instalando);
        
        instalando = "CREATE TABLE IF NOT EXISTS `sistema`.`vendas` ( transacao VARCHAR(65) NOT NULL, `data` date NOT NULL, `horarioVenda` VARCHAR(25) NOT NULL , `idproduto` VARCHAR(25) NOT NULL, `nomeProduto` VARCHAR(25) NULL, `precoUnitario` decimal(6,2) NOT NULL, `qtd` int NOT NULL, `subtotal` decimal(6,2) NOT NULL, `desconto` decimal(6,2) NOT NULL, `statusVenda` VARCHAR(25) NOT NULL, `cpfCnpjCli` VARCHAR(40) NULL, `nomeRazao` VARCHAR(255) NULL, `funcCpf` VARCHAR(40) NOT NULL, `nome` VARCHAR(25) NOT NULL, CONSTRAINT fk_IdProdutoVendas FOREIGN KEY (idproduto) REFERENCES produtos (idproduto), CONSTRAINT fk_CpfCnpjClienteVendas FOREIGN KEY (cpfCnpjCli) REFERENCES clientes (cpfCnpjCli), CONSTRAINT fk_CpfFuncionarioVendas FOREIGN KEY (funcCpf) REFERENCES funcionarios(funcCpf) ) ENGINE = InnoDB;";    
        stm.executeUpdate(instalando);
        
        instalando = "CREATE TABLE IF NOT EXISTS `sistema`.`configuracao` ( pathProduto VARCHAR(100) NULL ) ENGINE = InnoDB;";    
        stm.executeUpdate(instalando);
        
        selectFuncionarios("select * from sistema.funcionarios");
        if(Variaveis.encontrado <= 0){
        instalando = "INSERT INTO sistema.funcionarios VALUES ('0', '0','Admnistrador','Admnistrador','3', '(00)0000-0000','(00)0000-00000','admni@admin');";    
        stm.executeUpdate(instalando);
        }
        Variaveis.bancoInstalado = "OK";
        }
        catch(SQLException sqlex) {
           System.out.println("Erro acesso no Instalação: "+ sqlex);
           Variaveis.bancoInstalado = "";
           Instalacao.jLabel24.setText("");
        }
    }
    
    
    public static void insereAdmin() {
        String sql="";
        try {
            selectFuncionarios("select * from sistema.funcionarios");
            if(Variaveis.encontrado <= 0){
            sql = "INSERT INTO sistema.funcionarios VALUES ('0', '0','Admnistrador','Admnistrador','3', '(00)0000-0000','(00)0000-00000','admni@admin');";    
            stm.executeUpdate(sql);
            }
        }
        catch(SQLException sqlex) {
           System.out.println("Erro acesso no DELETE: "+ sqlex);
        }
    }
    
    
    
    
} 
