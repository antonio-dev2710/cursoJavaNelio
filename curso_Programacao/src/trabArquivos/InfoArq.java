package trabArquivos;

import java.io.File;
import java.util.Scanner;

public class InfoArq {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a folder paath:");
        String strPath = sc.nextLine();

        File path = new File(strPath);
        //suponha que eu quero acessar o nome do arquivo
        System.out.println("getName: "+path.getName());
        System.out.println("getParent: "+path.getParent());
        System.out.println("getPath: "+path.getPath());

    }
}
