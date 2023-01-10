package estrturaSequencial;

public class saidaFormt {
    public static void main(String[] args) {
        // %f = ponto flutuante
        // %d = inteiro
        // %s = texto
        // %n = quebra de linha
        String nome="maria";
        int idade=31;
        double renda=4000.0;
        System.out.printf("%s tem %d anos e tem uma renda mensal de %.2f reais %n",nome,idade,renda);
    }
}
