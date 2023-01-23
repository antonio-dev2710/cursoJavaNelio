package trabArquivos;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferWriterAndFileWriter {
    public static void main(String[] args) {
        
        String[] lines = new String[]{"Good morning","Good afternoon", "Good night"};

        //criar um arquivo e gravar os dados no arquivo
        String path ="c:\\temp\\out.txt";

        //bloco try-with-resouces
        //para indicar q vc n quer recriar o arquivo so utilizar o parametro true acresenta oq ja tinha no arquivo
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(path,true))){
            for(String line: lines){
                bw.write(line);
                //quebra de linha
                bw.newLine();
            }
        }
        catch(IOException e){
            System.out.println("Error:"+e.getMessage());
        }
    }
}
