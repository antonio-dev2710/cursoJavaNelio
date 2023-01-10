package estruturaRepet;

import java.util.Scanner;

public class repetWhile {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int num = scan.nextInt();
        int total = 0;
        while (num != 0) {
            System.out.println("digite um nummero");
            total += num;
            num = scan.nextInt();

        }
        System.out.printf("Total = %d%n", total);

    }
}
