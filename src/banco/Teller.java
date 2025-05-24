package banco;

public class Teller {

    public static void main(String[] args) {

        Account account = new Account(200);
        account.depositFunds(100);
        System.out.println("Saldo atual: " + account.getBalance());
        account.withdrawFunds(150);
        System.out.println("Saldo atual: " + account.getBalance());

    }
}
