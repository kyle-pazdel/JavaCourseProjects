public class Account {

    private String accountNumber = "";
    private double accountBalance = 0.0;
    private String customerName = "";
    private String email = "";
    private String phoneNumber = "";

    public String getAccountNumber(){
        return accountNumber;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void makeDeposit(double amount) {
        this.accountBalance += amount;
        System.out.println("Your new account balance is: $" + this.accountBalance);
    }

    public void makeWithdrawal(double amount) {
        double difference = this.accountBalance - amount;
        if (difference >= 0.0) {
            this.accountBalance -= amount;
            System.out.println("Your remaining account balance is: $" + this.accountBalance);
        } else {
            System.out.println("Insufficient Funds");
        }
    }

    public void accountDetails() {
        System.out.println("Account Number:" + this.accountNumber);
        System.out.println("Account Holder:" + this.customerName);
        System.out.println("Account Email Address:" + this.email);
        System.out.println("Account Phone Number:" + this.phoneNumber);
        System.out.println("Account Balance:" + this.accountBalance);
    }

}
