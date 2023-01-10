package Execoes.stackTraceDemo02;

import java.util.Locale;
import java.util.Scanner;

import javax.tools.DocumentationTool.Location;

public class method02 {
    public static void main(String[] args) {

        method02();
        System.out.println("fim");
        Locale.setDefault(Locale.US);
        
        
    }
    
    public static void method02(){
        Scanner sc = new Scanner(System.in);
        try {
            String [] vect = sc.nextLine().split(" ");
            int pos = sc.nextInt();

            System.out.println(vect[pos]);

        } catch (Exception e) {
            // TODO: handle exception
            //MOSTRA ONDE ESTA ACOTECENDO A EXCESSAO
            e.printStackTrace();
            System.out.println("Invalid position!");
        }
    }
}
