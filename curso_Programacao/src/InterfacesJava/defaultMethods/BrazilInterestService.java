package InterfacesJava.defaultMethods;

import java.security.InvalidParameterException;

public class BrazilInterestService implements  InterestService {
    private double intersRate;

    public BrazilInterestService(double intersRate) {
        this.intersRate = intersRate;
    }

    @Override
    public double getIntersRate() {
        return intersRate;
    }

    public void setIntersRate(double intersRate) {
        this.intersRate = intersRate;
    }
    
   
    

}

