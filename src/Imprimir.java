
import java.awt.Desktop;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.PrintStream;
import javax.print.DocFlavor;
import javax.print.DocPrintJob;
import javax.print.PrintService;
import javax.print.PrintServiceLookup;
import javax.print.SimpleDoc;

public class Imprimir {
    
    public void imprime(String conteudo){
        String data = conteudo;
        int impresso = 0;
        try {
            //Criando txt ----
            PrintStream output = new PrintStream("impressao_notaFiscal.txt");
            output.print(data);
            output.close();
            Desktop desktop = Desktop.getDesktop();
            //Imprimir ----
            File arquivoAImprimir = new File("impressao_notaFiscal.txt");
            desktop.print(arquivoAImprimir);
            System.err.println("IMPRESSÃO FINALIZADA");
            impresso = 1;
        }
        catch(Exception e) {
            e.getStackTrace();
        }
    }
    
    
    
}