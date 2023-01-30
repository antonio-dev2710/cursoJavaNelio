package InterfacesJava.excafaxacao.service;

import java.time.LocalDate;

import InterfacesJava.excafaxacao.models.Contract;
import InterfacesJava.excafaxacao.models.Installment;

public class ContractService {
     private OnlinePaymentService onlinePaymentService;

     public ContractService() {

     }

     public ContractService(OnlinePaymentService onlinePaymentService) {
          this.onlinePaymentService = onlinePaymentService;
     }

     public void processContract(Contract contract, int month) {
          
          double value = contract.getTotalValue()/3;
          for (int i = 1; i <= month; i++) {

               LocalDate oneMonthLater = contract.getDate().plusMonths(i);

               // parcelas
               double valorJuros = onlinePaymentService.interest(value, i);
               double parcela = valorJuros;

               double valorTaxaPag = onlinePaymentService.paymnetFee(parcela);

               // total por parcela
               parcela = parcela + valorTaxaPag;

               Installment installment = new Installment(oneMonthLater, parcela);

               contract.getInstallments().add(installment);

          }
          System.out.println("Parcelas: ");
          for (Installment installments : contract.getInstallments()) {

               System.out.println(installments);
          }

     }
}
