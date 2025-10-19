import java.util.Scanner;

class BankAccount {
    private double balance=0.0;
    public void showBalance() {
        System.out.printf("Current Balance: $%.2f\n",balance);
    }
    public void deposit(double amount) {
        if (amount<=0)
            System.out.println("Amount must be greater than 0.");
        else {
            balance+=amount;
            System.out.printf("$%.2f deposited successfully.\n", amount);
        }
    }
    public void withdraw(double amount) {
        if (amount<=0)
            System.out.println("Amount must be greater than 0.");
        else if (amount>balance)
            System.out.println("Insufficient balance!");
        else {
            balance-=amount;
            System.out.printf("$%.2f withdrawn successfully.\n", amount);
        }
    }
    // Getter
    public double getBalance() {
        return balance;
    }
}
class User {
    private String name;
    private String pass;
    private BankAccount account;
    public User(String name, String pass) {
        this.name= name;
        this.pass= pass;
        this.account= new BankAccount();
    }
    public String getName() {
        return name;
    }
    public boolean checkPassword(String password) {
        return this.pass.equals(password);
    }
    public BankAccount getAccount() {
        return account;
    }
}
public class BankApp {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        User[] users= new User[100];
        int userCount= 0;
        while (true) {
            System.out.println("\n=== BANK MENU ===");
            System.out.println("1. Register");
            System.out.println("2. Login");
            System.out.println("0. Exit");
            System.out.print("Enter choice: ");
            int ch = sc.nextInt();
            sc.nextLine();
            if (ch==0) {
                System.out.println("Goodbye!");
                break;
            }
            switch (ch) {
                case 1:
                    System.out.print("Enter username: ");
                    String name = sc.nextLine();
                    System.out.print("Enter password: ");
                    String pass = sc.nextLine();
                    users[userCount++] = new User(name, pass);
                    System.out.println("User registered successfully!");
                    break;
                case 2:
                    System.out.print("Enter username: ");
                    String uname = sc.nextLine();
                    System.out.print("Enter password: ");
                    String upass = sc.nextLine();
                    User current=null;
                    for (int i=0; i<userCount; i++) {
                        if (users[i].getName().equals(uname) && users[i].checkPassword(upass)) {
                            current = users[i];
                            break;
                        }
                    }
                    if (current==null) {
                        System.out.println("Invalid username or password!");
                    } else {
                        System.out.println("Login successful! Welcome " + uname);
                        int c;
                        do {
                            System.out.println("\n--- Account Menu ---");
                            System.out.println("1. Show Balance");
                            System.out.println("2. Deposit");
                            System.out.println("3. Withdraw");
                            System.out.println("0. Logout");
                            System.out.print("Enter choice: ");
                            c = sc.nextInt();
                            switch (c) {
                                case 1:
                                    current.getAccount().showBalance();
                                    break;
                                case 2:
                                    System.out.print("Enter deposit amount: ");
                                    double d= sc.nextDouble();
                                    current.getAccount().deposit(d);
                                    break;
                                case 3:
                                    System.out.print("Enter withdraw amount: ");
                                    double w= sc.nextDouble();
                                    current.getAccount().withdraw(w);
                                    break;
                                case 0:
                                    System.out.println("Logged out.\n");
                                    break;
                                default:
                                    System.out.println("Invalid choice!");
                            }
                        } while (c!=0);
                    }
                    break;
                default:
                    System.out.println("Invalid choice!");
            }
        }
        sc.close();
    }
}
