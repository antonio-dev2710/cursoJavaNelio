package Execoes.execPersonalizadas.programExcp;

import java.util.Locale;
import java.util.Scanner;

import Execoes.execPersonalizadas.model.entetis.Account;
import Execoes.execPersonalizadas.model.expet.DomainAcountExeption;

public class ProgramAccount {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        try {

            System.out.println(" number account: ");
            Integer number = sc.nextInt();

            System.out.println("Holder: ");
            sc.nextLine();
            String nome = sc.nextLine();

            System.out.println("Withdraw limit: ");
            Double withdrawLimit = sc.nextDouble();

            Account account = new Account(number, nome, withdrawLimit);

            System.out.println("deposit a value: ");
            Double balance = sc.nextDouble();

            account.deposit(balance);
            System.out.println("withdraw a value: ");
            account.withdraw(sc.nextDouble());

            System.out.println(account);

        } catch (DomainAcountExeption e) {
            System.out.println("Withdraw error: " + e.getMessage());

        }

    }
}
