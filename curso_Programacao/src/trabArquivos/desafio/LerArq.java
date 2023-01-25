package trabArquivos.desafio;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.xml.sax.SAXException;

public class LerArq {
    public static void main(String[] args) {
        Produto p1 = new Produto("TV lED", 1290.99, 1);
        Produto p2 = new Produto("Video Game", 350.50, 3);
        Produto p3 = new Produto("Iphone X", 900.00, 2);
        Produto p4 = new Produto("Samsung Galaxy", 850.00, 2);

        List<Produto> listaProduto = new ArrayList<>();
        listaProduto.add(p1);
        listaProduto.add(p2);
        listaProduto.add(p3);
        listaProduto.add(p4);

        // criar um arquivo .csv
        String path = "c:\\temp\\sources.csv";

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            String str = br.readLine();
            while (str != null) {

                System.out.println(str);
                str = br.readLine();

            }
            // criar uma sub pasta

        } catch (IOException e) {
            System.out.println("Error:" + e.getMessage());
        }

        // saida
        // criar um arquivo .csv
        String strPath = "c:\\temp";

        boolean sucess = new File(strPath + "\\out").mkdir();
        if(sucess){
            System.out.println("Directory created succesfully:" + sucess);
        }
       
        path = "c:\\temp\\out\\summary.csv";

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(path))) {

            for (Produto p : listaProduto) {
                String str = String.valueOf(p.outFiles());

                bw.write(str);
                // quebra de linha
                bw.newLine();
            }

        } catch (IOException e) {
            System.out.println("Error:" + e.getMessage());
        }

    }
}
