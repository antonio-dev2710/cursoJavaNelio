package InterfacesJava.excafaxacao.models;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Contract {
    private int number;
    private LocalDate date;
    private double totalValue;
    private List<Installment> installments = new ArrayList<>();

    public List<Installment> getInstallments() {
        return installments;
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
