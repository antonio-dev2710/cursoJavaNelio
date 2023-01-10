package orientacaoObjeto;

import java.util.Locale;
import java.util.Scanner;

public class ProgramOO {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);
        Triangulo trianguloX = new Triangulo();
        Triangulo trianguloY = new Triangulo();

        System.out.println("Enter the measures of triangle x : ");
        trianguloX.setA(scan.nextDouble());
        trianguloX.setB(scan.nextDouble());
        trianguloX.setC(scan.nextDouble());

        System.out.println("Enter the measures of triangle Y : ");
        trianguloY.setA(scan.nextDouble());
        trianguloY.setB(scan.nextDouble());
        trianguloY.setC(scan.nextDouble());

        double x = trianguloX.calcularArea(trianguloX.getA(), trianguloX.getB(), trianguloX.getC());
        double y=trianguloY.calcularArea(trianguloY.getA(), trianguloY.getB(), trianguloY.getC());
        System.out.printf("Triangle X area: %.4f%n", x);

        System.out.printf("Triangle Y area: %.4f%n", y);

        //verificar quem é maior
        if(x>y){
            System.out.println("Large area: X");
        }
        else{
            System.out.println("Large area: Y");

        }

    

        
    }
}
