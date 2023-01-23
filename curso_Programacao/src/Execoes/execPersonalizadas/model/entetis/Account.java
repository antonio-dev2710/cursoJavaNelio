package Execoes.execPersonalizadas.model.entetis;

import Execoes.execPersonalizadas.model.expet.DomainAcountExeption;

public class Account {
    Integer number;
    String  holder;
    Double balance=0.0;
    Double withdrawLimit;
    

    public Account(Integer number, String holder, Double withdrawLimit)  {
        
        this.number = number;
        this.holder = holder;
        this.withdrawLimit = withdrawLimit;
    }
    public Integer getNumber() {
        return number;
    }
    public void setNumber(Integer number) {
        this.number = number;
    }
    public String getHolder() {
        return holder;
    }
    public void setHolder(String holder) {
        this.holder = holder;
    }
    public Double getBalance() {
        return balance;
    }
   
    public Double getWithdrawLimit() {
        return withdrawLimit;
    }
    public void setWithdrawLimit(Double withdrawLimit) {
        this.withdrawLimit = withdrawLimit;
    }
    public void deposit(Double amount) throws DomainAcountExeption {
        if(amount==0){
            throw new DomainAcountExeption("the amount not be 0");
        }
        this.balance+=amount;
    }

    public void withdraw(Double amount) throws DomainAcountExeption {
        if(amount>this.withdrawLimit){
            throw new DomainAcountExeption("The amount exceeds withdraw limit");
        }
        if(amount>this.balance){
            throw new DomainAcountExeption("Not enough balance");
        }
        this.balance-=amount;
    }
    @Override
    public String toString() {
        return "Account [number=" + number + ", holder=" + holder + ", balance=" + balance + ", withdraw Limit="
                + withdrawLimit + "]";
    }
    

    
}
