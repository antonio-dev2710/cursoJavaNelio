package InterfacesJava.excafaxacao.service;

public interface OnlinePaymentService {
    //taxa de pagamento
    public double paymnetFee(double amunt);

    //juros
    public double interest(double amunt, int months);
}
