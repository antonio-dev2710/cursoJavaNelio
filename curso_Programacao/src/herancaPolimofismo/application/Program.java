package application;

import entities.Account;
import entities.BusinessAccaount;
import entities.SavingAccount;

public class Program {

  //sobreposicao é a implementacao de uma superclass na subclass
  public static void main(String[] args) {
    Account account = new Account(1001, "Alex", 0.0);

    BusinessAccaount businessA = new BusinessAccaount(
      1002,
      "Maria",
      0.0,
      500.0
    );

    //UPCASTING
    Account acc1 = businessA;

    Account acc2 = new BusinessAccaount(1002, "Joao", 0.0, 200.0);

    Account acc3 = new SavingAccount(1002, "Joao", 0.0, 2.0);

    //DOWNCASTING
    BusinessAccaount acc4 = (BusinessAccaount) acc2;

    if (acc3 instanceof BusinessAccaount) {
      //erro pois Busi no extend Sanving
      BusinessAccaount acc5 = (BusinessAccaount) acc3;
    }

    if (acc3 instanceof SavingAccount) {
      //erro pois Busi no extend Sanving
      SavingAccount acc5 = (SavingAccount) acc3;
    }

    //polimorfismo
    //varaveis de mesmo tipo apontando para objetos diferetes
    Account x = new Account(1020, "Alex", 1000.0);
    Account y = new SavingAccount(1023, "Maria", 1000.0, 0.01);
    x.withdraw(50.0);
    y.withdraw(50.0);
  }
}
