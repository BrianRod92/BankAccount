public class TestBankAccount {
    public static void main(String[] args){
        BankAccount checkingsAccount1 = new BankAccount();

        BankAccount savingsAccount1 = new BankAccount();

    checkingsAccount1.depositCheckings(200);
    System.out.println("Your Checkings Balance is: $" + checkingsAccount1.getCheckingBalance());

    savingsAccount1.depositSavingss(100);
    System.out.println("Your Savings Balance is: $" + savingsAccount1.getSavingsBalance());

    checkingsAccount1.withdrawMoney(10);
    System.out.println("Your Checkings Balance Now is: $" + checkingsAccount1.getCheckingBalance());

    checkingsAccount1.withdrawMoney(1000);
    System.out.println("Your Checkings Balance Now is: $" + checkingsAccount1.getCheckingBalance());


    System.out.println("Your accounts Total Balance is: $" + BankAccount.getAccountsTotal());

    System.out.println("There are " + BankAccount.getNumberOfBankAccounts() + " Bank Accounts");
    }
}