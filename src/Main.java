public class Main {
    public static void main(String[] args) {
        BankAccount account = new BankAccount(0);
        account.deposit(15000);
        try {
            while (true) {
                account.withDraw(6000);
            }
        } catch (LimitException e) {
            System.out.println("Пытался вывести больше доступного баланса");
            System.out.println("Остаток средств: " + e.getRemainingAmount());
        }

    }
}