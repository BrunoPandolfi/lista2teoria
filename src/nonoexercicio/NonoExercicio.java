package nonoexercicio;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author Bruno Pandolfi
 */
public class NonoExercicio 
{

    /**
     * @param args the command line arguments
     */
    
    public static void addNumTabela (int [] tabela)
    {
        String nomearq = "entrada.txt";
        String [] dados;
        String linha;
        FileReader entrada;
        BufferedReader leitor;
        try
        {
            entrada = new FileReader(new File(nomearq));
            leitor = new BufferedReader (entrada);
            dados = new String[9];
            for (int i = 0; i < dados.length; i++)
            {
                linha = leitor.readLine();
                linha = linha.replace(" ", "");
                dados[i] = linha;
            }
            
        }
        catch (IOException e) 
        {

        }
    }
    
    
    public static void main(String[] args) 
    {
        int tabela[][];
        
        tabela = new int[9][9];
        
        
    }
    
}
