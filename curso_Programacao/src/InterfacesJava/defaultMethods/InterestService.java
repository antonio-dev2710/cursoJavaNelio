package InterfacesJava.defaultMethods;

import java.security.InvalidParameterException;

public interface InterestService {
    double getIntersRate();
    //interface n pode armazernar estado
    //as intefarces n possui construtores nem atributos

    default double payment(double amount,int months){
        if(months<1){
            throw new InvalidParameterException("Months must be greater than zero");
        }
        return amount* Math.pow(1.0+getIntersRate()/100, months);
    }
}
