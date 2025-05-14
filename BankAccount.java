public class BankAccount{
    private String accountName;
    private int accountNumber;
    private double accountBalance;
    private double deposit;


    public void insertData(String name, int number,double deposit){
        this.accountName = name;
        this.accountNumber = number;
        this.accountBalance = deposit;
    }

    public void displayAccountDetails(){
        System.out.println(accountName);
        System.out.println(accountNumber);
        System.out.println(accountBalance);
    }

    public void depositAmount(double amount){
        accountBalance = accountBalance + amount;
    }

    public void withdrawCash(double amount){
        if(amount > accountBalance){
            System.out.println("Insufficient funds!\n");
        }else{
            accountBalance -= amount;
            System.out.println("Successful! Your new account balance is: " + accountBalance);
        }
    }

}