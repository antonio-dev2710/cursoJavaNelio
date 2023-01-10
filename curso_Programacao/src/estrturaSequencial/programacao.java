package estrturaSequencial;
import java.util.Locale;

public class programacao {
    public static void main(String[] args) {
        // int y = 32;
        // System.out.println("ola mundo!! "+ y);
        // -------------------------------------------------
        // controlar o número de casas decimais
        // limitar duas casas decimais
        double n = 10.345;
        System.out.printf("%.2f%n", n);

        // configurar o formato de saída do número
        // de "," para "."

        Locale.setDefault(Locale.US);
        System.out.printf("%.2f%n", n);
        System.out.println("------------------");

        System.out.printf("Resultado = %.2f metros%n", n);

    }
}