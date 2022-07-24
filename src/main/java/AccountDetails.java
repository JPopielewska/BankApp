import java.util.Scanner;

public class AccountDetails {
    private String name;
    private String accountNumber;
    private String login;
    private long balance;

    Scanner scanner = new Scanner(System.in);
    public void createAccount(){
        System.out.println("Provide account name");
        name = scanner.next();
        System.out.println("Provide account number");
        accountNumber = scanner.next();
        System.out.println("Provide login");
        login = scanner.next();
        System.out.println("Provide account balance");
        balance = scanner.nextLong();
    }

    public void showAccount(){
        System.out.println("Your account name is " + name);
        System.out.println("Your account number is " + accountNumber);
        System.out.println("Your login is " + login);
        System.out.println("Your account balance is " + balance);
    }
    public void deposit(){
        System.out.println("Ile chcesz wpłacić?");
        long money;
        money = scanner.nextLong();
        balance = money + balance;

    }

    public void withdrawal(){
        System.out.println("Podaj kwotę wypłaty");
        long kwotaWyplaty;
        kwotaWyplaty = scanner.nextLong();
        if (balance<kwotaWyplaty) {
            System.out.println("Brak wystarczających środków");
        } else {
            balance = balance - kwotaWyplaty;
        }

    }

    public long getBalance() {
        return balance;
    }

    public void setBalance(long balance) {
        this.balance = balance;
    }
}
