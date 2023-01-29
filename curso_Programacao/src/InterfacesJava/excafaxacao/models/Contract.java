package InterfacesJava.excafaxacao.models;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;

public class Contract {
    int number;
    LocalDate date;
    double totalValue;
    List<Installment> installments;

    public List<Installment> getInstallments() {
        return installments;
    }

    public void setInstallments(List<Installment> installments) {
        this.installments = installments;
    }
    
    
    
    
    public Contract(int number, LocalDate start, double totalValue) {
        this.number = number;
        this.date = start;
        this.totalValue = totalValue;
    }
    public int getNumber() {
        return number;
    }
    public void setNumber(int number) {
        this.number = number;
    }
    public LocalDate getDate() {
        return date;
    }
    public void setDate(LocalDate date) {
        this.date = date;
    }
    public double getTotalValue() {
        return totalValue;
    }
    public void setTotalValue(double totalValue) {
        this.totalValue = totalValue;
    }

    
    
}
