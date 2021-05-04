// Observação: Máxima quntidade de valores no banco: 500 **** Linha 50 e Linha 63

public class Variaveis {
    //Geral -------------------------------------
    public static int telaPrincipal = 0;
    public static int encontrado = 0;
    public static int jaPesquisado = 0;
    public static int permissaoLogado = 0;
    public static int quantidade = 0;
    public static String cpfFuncLogado = "";
    public static String nomeFuncLogado = "";
    
    public static String bancoInstalado = "";
    //-------------------------------------------
    
    //FUNCIONARIOS ------------------------------
    public static String funcCpf = "";
    public static String senha = ""; 
    public static String nome = "";
    public static String cargo = "";
    public static String permissao = "";
    public static String FuncCtto = "";
    public static String FuncCtto2 = "";
    public static String Funcemail = "";
    //-------------------------------------------
    
    //CLIENTES ----------------------------------
    public static String cpfCnpjCli = "";
    public static String nomeRazao = "";
    public static String CliEndereco = "";
    public static String CliBairro = "";
    public static String CliCidade = "";
    public static String CliEstado = "";
    public static String CliCep = "";
    public static String CliCtto = "";
    public static String CliCtto2 = "";
    public static String CliEmail = "";
    //-------------------------------------------
    
    
    
    //PRODUTOS ----------------------------------
    public static String idproduto = "";
    public static String nomeProduto = "";
    public static String modelo = "";
    public static String descricao = "";
    public static String fornecedor = "";
    public static String estoque = "";
    public static String precoUnitario = "";
    //-------------------------------------------
    
    
    //TABELA PRODUTOS----------------------------
    // Máxima quntidade de valores no banco: 500 ****
    public static String[] tabelaIdproduto = new String[500];
    public static String[] tabelaNomeProduto = new String[500];
    public static String[] tabelaModelo = new String[500];
    public static String[] tabelaDescricao = new String[500];
    public static String[] tabelaFornecedor = new String[500];
    public static int []   tabelaEstoque = new int[500];
    public static double[] tabelaprecoUnitario = new double[500];
    //-------------------------------------------
    
    
    //VENDAS ----------------------------------
    public static int quantidadeVendas = 0;
    public static String[] vendasTransacao = new String[500];
    public static String[] vendasData = new String[500];
    public static String[] vendasIdProduto = new String[500];
    public static String[] vendasProdutoNome = new String[500];
    public static String[] vendasPreco = new String[500];
    public static String[] vendasQtd = new String[500];
    public static String[] vendasSubtotal = new String[500];
    public static String[] vendasDesconto = new String[500];
    public static String[] vendasStatus = new String[500];
    public static String[] vendasCpfCnpjCli = new String[500];
    public static String[] vendasNomeRazao = new String[500];
    public static String[] vendasFuncCpf = new String[500];
    public static String[] vendasFuncNome = new String[500];
    //-------------------------------------------
    
    
    //VENDAS GROUP ----------------------------------
    public static int quantidadeVendasGroup = 0;
    public static String[] vendasTransacaoGroup = new String[500];
    public static String[] vendasDataGroup = new String[500];
    public static String[] vendasHorarioVendaGroup = new String[500];
    public static String[] vendasTotalGroup = new String[500];
    public static String[] vendasStatusVendaGroup = new String[500];
    public static String[] vendasCpfCnpjGroup = new String[500];
    public static String[] vendasNomeRazaoGroup = new String[500];
    public static String[] vendasFuncCpfGroup = new String[500];
    public static String[] vendasNomeGroup = new String[500];
    //-------------------------------------------
    
    
    
    
    
    public static void LimparVariaveisClientes(){
        // LIMPAR CLIENTES ----------------------------------
        cpfCnpjCli = "";
        nomeRazao = "";
        CliEndereco = "";
        CliBairro = "";
        CliCidade = "";
        CliEstado = "";
        CliCep = "";
        CliCtto = "";
        CliCtto2 = "";
        CliEmail = "";   
        //-------------------------------------------  
    }
    
    public static void LimparVariaveisFuncionarios(){
        // LIMPAR CLIENTES ----------------------------------
         funcCpf = "";
         senha = ""; 
         nome = "";
         cargo = "";
         permissao = "";
         FuncCtto = "";
         FuncCtto2 = "";
         Funcemail = "";  
        //-------------------------------------------  
    }
    
    
    public static void LimparVariaveisProdutos(){
        // LIMPAR PRODUTOS ----------------------------------
         for(int contador = 0; contador < 500; contador++){
            tabelaIdproduto[contador] = "";
            tabelaNomeProduto[contador] = "";
            tabelaModelo[contador] = "";
            tabelaDescricao[contador] = "";
            tabelaFornecedor[contador] = "";
            tabelaEstoque[contador] = 0;
            tabelaprecoUnitario[contador] = 0;
            
         }
        //-------------------------------------------  
    }
    
    
    public static void LimparVariaveisVendas(){
        // LIMPAR VENDAS ----------------------------
        for(int contador = 0; contador < 500; contador++){
        vendasTransacao[contador] = "";
        vendasData[contador] = "";
        vendasIdProduto[contador] = "";
        vendasProdutoNome[contador] = "";
        vendasPreco[contador] = "";
        vendasQtd[contador] = "";
        vendasSubtotal[contador] = "";
        vendasDesconto[contador] = "";
        vendasStatus[contador] = "";
        vendasCpfCnpjCli[contador] = "";
        vendasNomeRazao[contador] = "";
        vendasFuncCpf[contador] = "";
        vendasFuncNome[contador] = "";
        }
        //-------------------------------------------  
    }
    
    
    public static void LimparVariaveisVendasGroup(){
        // LIMPAR VENDAS ----------------------------
        for(int contador = 0; contador < 500; contador++){
        vendasTransacaoGroup[contador] = "";
        vendasDataGroup[contador] = "";
        vendasHorarioVendaGroup[contador] = "";
        vendasTotalGroup[contador] = "";
        vendasStatusVendaGroup[contador] = "";
        vendasCpfCnpjGroup[contador] = "";
        vendasNomeRazaoGroup[contador] = "";
        vendasFuncCpfGroup[contador] = "";
        vendasNomeGroup[contador] = "";
        }
        //-------------------------------------------  
    }
    

    public static void LimparArrays(){
        for(int i=0; i< 500; i++){
        tabelaIdproduto[i] = "";
        tabelaNomeProduto[i] = "";
        tabelaModelo[i] = "";
        tabelaDescricao[i] = "";
        tabelaFornecedor[i] = "";
        tabelaEstoque[i] = 0;
        tabelaprecoUnitario[i] = 0;

        quantidadeVendas = 0;
        vendasTransacao[i] = "";
        vendasData[i] = "";
        vendasIdProduto[i] = "";
        vendasProdutoNome[i] = "";
        vendasPreco[i] = "";
        vendasQtd[i] = "";
        vendasSubtotal[i] = "";
        vendasDesconto[i] = "";
        vendasStatus[i] = "";
        vendasCpfCnpjCli[i] = "";
        vendasNomeRazao[i] = "";
        vendasFuncCpf[i] = "";
        vendasFuncNome[i] = "";
        }
    }
    
    
}
