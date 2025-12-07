package JavaPogramming.Day13;

public class AccountMain {
    public static void main(String[] args){
        Account account =new Account();
        account.setAccountno(123123);
        account.setNanme("karamjeet");
        account.setAmount(30000);

        System.out.println(account.getAccountno());
        System.out.println(account.getName());
        System.out.println(account.getAmount());
    }
}
