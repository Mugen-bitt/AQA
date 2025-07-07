package Practic3;

public class BankAccount {
    private String owner;
    private double balance;

    //Конструктор
    public BankAccount(String owner, double balance){
        this.owner = owner;
        this.balance = Math.max(balance, 0);
    }
    //Геттер для получения данных владельца
    public String getOwner(){
        return owner;
    }
    //Геттер для получения баланса
    public double getBalance(){
        return balance;
    }
    //Сеттер для изменения владельца
    public void setOwner(String owner){
        this.owner = owner;
    }
    //Метод deposit для увеличения баланса
    public void deposit(double amount){
        balance += Math.max(amount, 0);
        System.out.println("Депозит внесен: " + Math.max(amount, 0));
    }
    //Метод withdraw для уменьшения баланса
    public void withdraw(double amount){
        double actualWithdraw = Math.min(amount, balance);
        balance -= actualWithdraw;
        System.out.println("Снято: " + actualWithdraw);
    }
    //Метод printBalance для вывода текущего баланса
    public void printBalance(){
        System.out.println("Текущий баланс: " + balance);
    }

    //Метод main
    public static void main(String[] args){
        BankAccount bankAccount = new BankAccount("Павел", 5000);
        bankAccount.printBalance();

        //Вносим баланс
        bankAccount.deposit(1500);
        bankAccount.printBalance();

        //Снимаем 300
        bankAccount.withdraw(300);
        bankAccount.printBalance();
    }
}
