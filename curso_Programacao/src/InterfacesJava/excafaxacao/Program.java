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

        // divisao das parcelas
        double parcela = valorTotal / months;

        ContractService contractService= new ContractService();

       
        

        // lista de parcelas
        List<Installment> listIntallments = new ArrayList<>();
        for (int i = 1; i <= months; i++) {
            
            PaypalService paypalService = new PaypalService();
            // parcelas
            double valorJuros = paypalService.interest(200.0, i);
            parcela=valorJuros;

            double valorTaxaPag = paypalService.paymnetFee(parcela);

            // total por parcela
            parcela = parcela + valorTaxaPag;
            
            
            LocalDate oneMonthLater = start.plusMonths( i );
            
        
            Installment installment = new Installment(oneMonthLater, parcela);

            listIntallments.add(installment);
        }
        contract.setInstallments(listIntallments);

        contractService.processContract(contract, months);
        sc.close();
    }

}
