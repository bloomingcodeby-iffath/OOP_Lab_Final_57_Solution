# OOP_Lab_Final_57_Solution
## 🛠 Features
1. **Account Class**
   - Private attributes: `accNumber`, `holderName`, `balance`
   - Constructor, Getters, Setters
   - Methods to display account info & current balance
   - Overloaded method to display balance with date

2. **SavingsAccount Subclass**
   - Additional attribute: `interestRate`
   - Constructor, Getters, Setters
   - Overridden `currentBalance()` method

3. **Transaction Interface**
   - `sendMoney(int money)` → Deducts money from balance
   - `receiveMoney(int money)` → Adds money to balance

4. **Custom Exception**
   - `LowBalanceException` prevents setting balance below 500 taka
