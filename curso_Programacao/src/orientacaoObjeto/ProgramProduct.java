package orientacaoObjeto;

import java.util.Locale;
import java.util.Scanner;

public class ProgramProduct {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        Produto produto = new Produto();

        System.out.println("Digite o nome do produto");
        produto.setName(scan.nextLine());

        System.out.println("Digite o preço dos produtos");
        double preco = scan.nextDouble();
        produto.setPrice(preco);

        System.out.println("Digite a quantiade de produtos");
        produto.setquantity(scan.nextInt());

        System.out.println("Resultado");
        System.out.println(produto);

        System.out.println("add a quantidade de produtos");
        produto.addProducts(scan.nextInt());

        System.out.println("Produto add");
        System.out.println(produto);

        System.out.println("remove a quantidade de produtos");
        produto.removeProducts(scan.nextInt());

        System.out.println("Produto removido");
        System.out.println(produto);

    }

}
