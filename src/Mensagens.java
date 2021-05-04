
import javax.swing.JOptionPane;


public class Mensagens {
    
    public static void Padrao(String msg){
        JOptionPane.showOptionDialog(null, msg, "ATENÇÃO", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, null, null);
    }
    
    public static void NadaEncontrado(){
        JOptionPane.showOptionDialog(null, "Nenhum valor encontrado.", "ATENÇÃO", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, null, null);
    }
    
    public static void Preencha(){
        JOptionPane.showOptionDialog(null, "Preencha todos os campos, por favor", "ATENÇÃO", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, null, null);
    }
    
    public static void Sucesso(){
        JOptionPane.showMessageDialog(null, "Requisição efetuada com sucesso!");
    }
    
    public static void Erro(){
        JOptionPane.showOptionDialog(null, "Erro na requisição", "ERRO", JOptionPane.DEFAULT_OPTION, JOptionPane.WARNING_MESSAGE, null, null, null);
    }
    
    
    
    
    
    
    }
    

