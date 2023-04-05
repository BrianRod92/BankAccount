public class BankAccount {
    private double checkingBalance;
    private double savingsBalance;
    private static int numberOfBankAccounts = 0;
    private static double accountsTotalMoney = 0.0;


    public BankAccount(){
        numberOfBankAccounts++;
    }

    public static int getNumberOfBankAccounts(){
        return numberOfBankAccounts;
    }

    public double getCheckingBalance(){
        return this.checkingBalance;

    }

    public double getSavingsBalance(){
        return this.savingsBalance;

    }

    public void depositCheckings(double deposit){

        this.checkingBalance += deposit;

        accountsTotalMoney += deposit;

    }

    public void depositSavingss(double deposit){

        this.savingsBalance += deposit;

        accountsTotalMoney += deposit;

    }




    public void withdrawMoney(double withdraw){
        if (checkingBalance < withdraw){
            System.out.println("Insufficent funds. Cannot Withdraw.");
        } else {

        this.checkingBalance -= withdraw;
        this.savingsBalance -= withdraw;

        accountsTotalMoney -= withdraw;
        }
        

        

    }



    public static double getAccountsTotal(){
        

        return accountsTotalMoney;
    }

    
}