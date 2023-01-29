package InterfacesJava.excafaxacao.service;

import InterfacesJava.excafaxacao.models.Contract;
import InterfacesJava.excafaxacao.models.Installment;

public class ContractService {
    
   public  void processContract(Contract contract, int month){
        System.out.println("Parcela: ");
       for (int i = 0; i < month; i++) {
            System.out.println(contract.getInstallments().get(i));
       }
    }
}
