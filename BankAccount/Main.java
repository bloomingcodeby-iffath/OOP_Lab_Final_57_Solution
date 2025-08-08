package BankAccount;

public class Main {
    public static void main(String[] args) throws LowBalanceException {
        Account a=new Account(222222,150,"Iffath");
        
        LocalDateTime date = LocalDateTime.now();
        String dateString = date.format(DateTimeFormatter.ofPattern("dd-MM-yyyy"));
        
        double x=600;
        if(x<500)  throw new LowBalanceException("Can't srt below 500 Taka");
        else  a.setBalance(x);

        a.sendMoney(10);
        a.receiveMoney(100);
        a.currentBalance();
        a.accInfo();
        a.currentBalance();
        a.currentBalance(dateString);

    }
}

