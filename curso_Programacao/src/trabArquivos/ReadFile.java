package trabArquivos;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;


public class ReadFile {
    public static void main(String[] args) {
        File file = new File("c:\\temp\\in.txt");

        Scanner sc = null;

        try {
            //leitura de arquivo através do scanner
            sc= new Scanner(file);
            //testar pra ver se tem uma nova linha no arquivo
            while(sc.hasNextLine()){
                System.out.println(sc.nextLine());
            }
            
        } catch (IOException e) {
            System.out.println("Error: "+e.getMessage());
            // TODO: handle exception
        }
        finally{
            if(sc!=null){
                sc.close();
            }
            
        }
    }
}
