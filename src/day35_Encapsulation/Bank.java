package day35_Encapsulation;

public class Bank {
    public static void main(String[] args) {

        BankAccount bankAccount=new BankAccount("Ahmet",112121,175000);
        bankAccount.setAccountHolder("mehmet");
        System.out.println(bankAccount);
        bankAccount.deposit(120000);

        System.out.println(bankAccount.getBalance());
        bankAccount.withdraw(100000);
        System.out.println(bankAccount.getBalance());
        bankAccount.setBalance(50000);
        System.out.println(bankAccount.getBalance());
    }
}
