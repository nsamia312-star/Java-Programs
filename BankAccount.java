
class BankAccount {
    static int accNumber = 1000;
    int accountNo;
    String name, address, type;
    double balance;

    BankAccount(String n, String a, String t, double b) {
        accountNo = accNumber++;
        name = n;
        address = a;
        type = t;
        balance = b;
    }

    void display() {
        System.out.println("Account No: " + accountNo);
        System.out.println("Name: " + name);
        System.out.println("Address: " + address);
        System.out.println("Balance: " + balance);
    }

    void deposit(double amt) {
        balance += amt;
    }

    void withdraw(double amt) {
        balance -= amt;
    }

    void changeAddress(String newAddress) {
        address = newAddress;
    }

    public static void main(String[] args) {
        BankAccount b = new BankAccount("Ali", "Abbottabad", "PLS", 5000);
        b.display();
        b.deposit(2000);
        b.withdraw(1000);
        b.changeAddress("Islamabad");
        b.display();
    }
}