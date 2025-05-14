
public class Main {
	public static void main(String[] args){
        BankAccount newaccount1 = new BankAccount();
        newaccount1.insertData("Loica Ben-Habib", 110156, 500.00);
        newaccount1.displayAccountDetails();
        newaccount1.withdrawCash(150.00);
        newaccount1.depositAmount(1540.98);
        newaccount1.displayAccountDetails();

    }
 }        
