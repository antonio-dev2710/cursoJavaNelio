package InterfacesJava.excafaxacao.models;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;
//parcelas
public class Installment {
    //data de vencimento
    LocalDate dueDate;
    //quantia
    double amount;

    DateTimeFormatter sdf =  DateTimeFormatter.ofPattern("dd/MM/yyyy");
   
    @Override
    public String toString() {
        
        return dueDate.format(sdf) + " - " + amount + "]";
    }
    public Installment(LocalDate start, double amount) {
        this.dueDate = start;
        this.amount = amount;
    }
    public LocalDate getDueDate() {
        return dueDate;
    }
   
    public double getAmount() {
        return amount;
    }
    

    
}
