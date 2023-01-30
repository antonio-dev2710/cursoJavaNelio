package InterfacesJava.excafaxacao;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import InterfacesJava.excafaxacao.models.Contract;
import InterfacesJava.excafaxacao.models.Installment;
import InterfacesJava.excafaxacao.service.ContractService;
import InterfacesJava.excafaxacao.service.OnlinePaymentService;
import InterfacesJava.excafaxacao.service.PaypalService;

public class Program {
    public static void main(String[] args) throws ParseException {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("Retire (dd/MM/yyyy : ");
        DateTimeFormatter sdf =  DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate start = LocalDate.parse(sc.nextLine(),sdf);
        double valorTotal = 600.0;
        Contract contract = new Contract(8028, start, valorTotal);

        System.out.println(contract);
        System.out.println("how many months ?");
        int months = sc.nextInt();


        ContractService contractService= new ContractService(new PaypalService() );

        contractService.processContract(contract, months);


        sc.close();
    }

}
