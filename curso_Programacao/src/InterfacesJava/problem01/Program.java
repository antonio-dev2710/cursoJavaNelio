package InterfacesJava.problem01;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        System.out.println("Entre com os dados do alugel");
        System.out.println("Modelo do carro:");
        String carModel = sc.nextLine();

        System.out.println("Retire (dd/MM/yyyy hh:mm): ");
        LocalDateTime start = LocalDateTime.parse(sc.nextLine(),fmt);

        System.out.println("Retorno (dd/MM/yyyy hh:mm): ");
        LocalDateTime finish = LocalDateTime.parse(sc.nextLine(),fmt);

        carRental cr = new carRental(start, finish, new Vehicle(carModel));

        System.out.println("Entre com o preço por hora: ");
        Double pricePerHour = sc.nextDouble();
        System.out.println("Entre com o preço por dia: ");
        Double pricePerDay = sc.nextDouble();

        RentalService rentalService = new RentalService(pricePerHour, pricePerDay, new BrazilTaxService());
                //essa instacia sera injetada na classe RentalService por meio do construtor

        rentalService.processInvoice(cr);

        System.out.println("Fatura: ");

        System.out.println("Pagamento basico: "+ cr.getInvoice().getBasicPayment());

        System.out.println("Imposto: "+String.format("%.2f",cr.getInvoice().getTax())) ;
        System.out.println("Pagamento total: "+ cr.getInvoice().getTotalPayment());



        sc.close();
    }
}
