package entities;

public class BusinessAccaount extends Account {

  private Double loanLimit;

  public BusinessAccaount() {
    //caso tenha alguma logica no construtor padrao
    super();
  }

  public BusinessAccaount(
    Integer number,
    String holder,
    Double balance,
    Double loanLimit
  ) {
    super(number, holder, balance);
    this.loanLimit = loanLimit;
  }

  public Double getLoanLimit() {
    return loanLimit;
  }

  public void setLoanLimit(Double loanLimit) {
    this.loanLimit = loanLimit;
  }

  private void loan(double amount) {
    if (amount <= loanLimit) {
      balance += amount - 10.0;
    }
  }

  @Override
  public void withdraw(double amount) {
    //reutiliza o metodo da suber class
    super.withdraw(amount);
        balance-=2;
  }
}
