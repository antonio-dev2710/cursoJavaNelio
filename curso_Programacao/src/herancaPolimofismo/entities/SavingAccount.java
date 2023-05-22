package entities;

import java.util.PropertyResourceBundle;

public final class SavingAccount extends Account {
    //colocando a palavra final essa classe n pod ser herdada por outra classe e a palavra final no metodo n pode ser sobre posto
  private Double interestRate;

  public SavingAccount() {
    super();
  }

  public Double getInterestRate() {
    return interestRate;
  }

  public SavingAccount(
    Integer number,
    String holder,
    Double balance,
    Double interestRate
  ) {
    super(number, holder, balance);
    this.interestRate = interestRate;
  }

  public void setInterestRate(Double interestRate) {
    this.interestRate = interestRate;
  }

  public void updatebalance() {
    balance += balance * interestRate;
  }

  //sobreposição
  @Override
  public void withdraw(double amount) {
    balance -= amount;
  }
}
