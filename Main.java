public class Main {

    public static void main(String[] args) {

        Account account = new Account();

        // set account details
        account.setAccountNumber("ACC1001");
        account.setCustomerName("Alice Johnson");
        account.setEmail("alice@example.com");
        account.setPhoneNumber("123-456-7890");

        // initial balance
        account.setAccountBalance(200.0);

        System.out.println("Initial balance: " + account.getAccountBalance());

        // deposit money
        account.deposit(100.0);
        System.out.println("After deposit: " + account.getAccountBalance());

        // withdraw money
        account.withdraw(50.0);
        System.out.println("After withdrawal: " + account.getAccountBalance());

        // invalid withdrawal (too much)
        account.withdraw(500.0);
        System.out.println("Final balance: " + account.getAccountBalance());
    }
}
