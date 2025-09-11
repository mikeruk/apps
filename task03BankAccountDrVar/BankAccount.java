package tema13DefiningClasses.task03BankAccountDrVar;

public class BankAccount {


    private static int idCounter = 1;
    private int id;
    private double balance;
    private static double interestRate = 0.02;

    public BankAccount() {
        this.id = BankAccount.idCounter;
        BankAccount.idCounter++;
        System.out.println("Account ID" + this.id + " created");
    }

    public static void setInterestRate(double interest) {
        interestRate = interest;
    }

    public double getInterest(int years) {
        return (this.balance * this.interestRate) * years;
    }

    public void deposit(double amount) {
        this.balance += amount;
        //System.out.println("Deposited " + amount + " to ID" + this.id);
       System.out.printf("Deposited %.0f to ID%d%n", amount, this.id);
    }

    public int getId() {
        return this.id;
    }
}
