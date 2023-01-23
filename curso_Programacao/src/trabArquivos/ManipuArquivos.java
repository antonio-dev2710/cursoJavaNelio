package trabArquivos;

import java.io.File;
import java.util.Scanner;

public class ManipuArquivos {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a folder paath:");
        String strPath = sc.nextLine();

        File path = new File(strPath);
        //pegar todos as pastas que estão a partir desse caminho
        //refence a methods
        //File [] folders = path.listFiles(File::isDirectory);:ler aquivos
        File [] folders = path.listFiles(File::isDirectory);
        System.out.println("FOLDERS: ");
        for(File f: folders){
            System.out.println(f);
        }

        File [] files = path.listFiles(File::isDirectory);
        System.out.println("FILES: ");
        for(File f: files){
            System.out.println(f);
        }
        //criar uma sub pasta a partir da pasta temp
        boolean sucess = new File(strPath+"\\subdir").mkdir();
        System.out.println("Directory created succesfully: "+sucess);
        sc.close();
    }
}
