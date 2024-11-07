public class BankAccount {
    private double amount;

    public double getAmount() {
        return amount;
    }
    public void deposit(double sum) {
        if (sum > 0) {
            amount += sum;
            System.out.println("Deposited: " + sum + ". Current balance: " + amount);
        }
    }
    public void withDraw(int sum) throws LimitException {
        if (sum > amount) {
            throw new LimitException("Insufficient balance for withdrawal!", amount);
        }
        amount -= sum;
        System.out.println("Withdrew: " + sum + ". Remaining balance: " + amount);
    }
}