public class Banking {
    static String bankName = "Union Bank of India";
    String accountHolder = "Shubham sharma";
    double balance = 70000;

    void accountDetails() {
        System.out.println(bankName);
        System.out.println(accountHolder);
        System.out.println(balance);
    }

    public static void main(String[] args) {
        Banking info = new Banking();
        info.accountDetails();
    }
}
