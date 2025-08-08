package BankAccount;

public class SavingAccount extends Account{
  private double intersetRate;
  SavingAccount(double intersetRate,int accNumber, double balance, String holderName){
      super(accNumber,balance,holderName);
      this.intersetRate=intersetRate;
  }

    public double getIntersetRate() {
        return intersetRate;
    }

    public void setIntersetRate(double intersetRate) {
        this.intersetRate = intersetRate;
    }

    void currentBalance(){
        System.out.println("Current balance in the Savings account is: "+getBalance());
    }


}
