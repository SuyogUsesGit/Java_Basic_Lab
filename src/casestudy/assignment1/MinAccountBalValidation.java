package casestudy.assignment1;

public class MinAccountBalValidation {
    public static void main(String[] args) {
        Account account = new Account();
        account.setAccAmount(499);
        int balance = account.getAccAmount();

        if(balance<500)
            System.out.println("The balance is below minimum value");
        else
            System.out.println(balance);

    }

}
