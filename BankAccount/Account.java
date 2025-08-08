package BankAccount;

public class Account implements Transaction{
   private int accNumber;
   private String holderName;
   private double balance;

    public Account(int accNumber, double balance, String holderName) {
        this.accNumber = accNumber;
        this.balance = balance;
        this.holderName = holderName;
    }

    public int getAccNumber() {
        return accNumber;
    }

    public void setAccNumber(int accNumber) {
        this.accNumber = accNumber;
    }

    public String getHolderName(){
        return holderName;
    }

    public void setHolderName(String holderName){
        this.holderName=holderName;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    void accInfo(){
        System.out.println("Holder Name: "+holderName);
    }
    void currentBalance(){
        System.out.println("Balance: "+balance);
    }

    void currentBalance(String date){
        System.out.println("Current Balance :"+balance+" on "+date);
    }


    @Override
    public void sendMoney(int money) {
     this.balance-=money;
        System.out.println("Current balance after send money: "+balance);
    }

    @Override
    public void receiveMoney(int money) {
     this.balance+=money;
        System.out.println("Current balance after receiving money: "+balance);
    }
}
