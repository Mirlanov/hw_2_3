public class Main {
    public static void main(String[] args) {
        BankAccount account = new BankAccount(15000.0);
        double withdrawalAmount = 6000.0;

        while (true) {
            try {
                account.withDraw(withdrawalAmount);
                System.out.println("Withdrawn: " + withdrawalAmount);
            } catch (LimitException e) {
                double remainingAmount = e.getRemainingAmount();
                System.out.println("Withdrawn: " + remainingAmount);
                System.out.println("Remaining amount: " + remainingAmount);
                break;
            }
        }
    }
}
