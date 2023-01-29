package InterfacesJava.problem01;

import java.time.Duration;

public class RentalService {
    private Double pricePerHour;

    private Double pricePerDay;
    private TaxService taxService;
                                                        //injeção de dependencia por meio de donstrutor
    public RentalService(Double pricePerHour, Double pricePerDay, TaxService taxService) {
        this.pricePerHour = pricePerHour;
        this.pricePerDay = pricePerDay;
        this.taxService = taxService;
    }

    public void processInvoice(carRental rental){
        double minutes = Duration.between(rental.getStart(), rental.getFinish()).toMinutes();
        double basicPayment;
        double hours = minutes/60;
        if(hours<=12){
            basicPayment = pricePerHour*Math.ceil(hours);
        }else{
            basicPayment = pricePerDay*Math.ceil(hours/24.0);
        }
        double tax = taxService.tax(basicPayment);
        rental.setInvoice(new Invoice(basicPayment, tax));
    }
    


}
