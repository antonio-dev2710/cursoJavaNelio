package estruturaRepet;

import java.util.Scanner;

public class exer01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int x =2;
        int y=2;
        //quando n se sabe a quantidade previamente de repetiçoes
        while(x!=0 && y!=0){
            if(x>0 && y>0){
                System.out.println("primeiro");
            }
            else if(x>0 && y<0){
                System.out.println("quarto");
            }
            else if(x<0 && y<0){
                System.out.println("terceiro");
            }
            else if(x<0 && y>0){
                System.out.println("segundo");
            }
            else{
                System.out.println( " ");
            }
            System.out.println("Digite o valor de x e y");
            x=scan.nextInt();
            y=scan.nextInt();
        }
    }
}
