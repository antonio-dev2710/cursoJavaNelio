package InterfacesJava.excafaxacao.service;

public class PaypalService  implements OnlinePaymentService{


    @Override
    public double paymnetFee(double amount) {
        
        return (amount*2/100);
    }
//juros
    @Override
    public double interest(double amount, int months) {
        
        return ((amount*1/100)*months)+amount;
    }


    
}
