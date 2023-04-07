public class Main {
    public static void main(String[] args) {
    Account account = new Account();
    account.setAccountNumber("12345");
    account.setCustomerName("Kyle Pazdel");
    account.setEmail("kyle@test.com");
    account.setPhoneNumber("(555) 555-5555");
    account.setAccountBalance(1000.50);

    account.accountDetails();

    account.makeWithdrawal(550.25);
    account.makeWithdrawal(1234.50);
    account.makeDeposit(1000000.69);

    account.accountDetails();

    }
}