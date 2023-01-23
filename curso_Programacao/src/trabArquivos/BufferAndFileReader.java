package trabArquivos;

import java.io.BufferedReader;
import java.io.FileReader;

public class BufferAndFileReader {
    public static void main(String[] args) {
        //FileReader(stream(squencia) de leitura de caracteres a partir de um arquivo)
        //BufferedReader(mais rápido) instanciado a partir do filereader e complementa algumas otmizações utilizando o buffer de memória

        String path ="c:\\temp\\in.txt";

        

        try(BufferedReader br = new BufferedReader(new FileReader(path))) {
            
            //leitura de uma linha do arq
            String line = br.readLine();

            while(line!=null){
                System.out.println(line);
                line = br.readLine();
            }
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println("Error:"+e.getMessage());
        }
        
    }
}
