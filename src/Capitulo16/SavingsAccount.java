package Capitulo16;

class SavingsAccount {
    String owner;
    int acctNumber;
    int balance; // em dólares americanos
    BalanceChangeHandler[] subscribers;
    int numSubscribers;
    SavingsAccount(String o, int a) {
        owner = o;
        acctNumber = a;
        balance = 0;
        subscribers = new BalanceChangeHandler[20];
// No máximo 20 assinantes são permitidos
        numSubscribers = 0;
    }
    void addHandler(BalanceChangeHandler h) {
        if(numSubscribers < 20) {
            subscribers[numSubscribers] = h;
            numSubscribers++;
        }
    }
// quantia positiva significa depósito
// quantia negativa significa retirada
void changeBalance(int amount) {
    if(amount != 0) {
// Altera o saldo
        balance += amount;
// Notifica todos os assinantes sobre a mudança
        for(int i = 0; i < numSubscribers; i++)
            subscribers[i].balanceChanged(amount, this);
    }
}
    int getBalance() { return balance; }
    int getAcctNumber() { return acctNumber; }
    String getOwner() { return owner; }
}
class FeeHandler implements BalanceChangeHandler {
    public void balanceChanged(int change, SavingsAccount acct) {
        System.out.println("Deducting a fee from account " +
                acct.getAcctNumber());
    }
}
class FraudHandler implements BalanceChangeHandler {
    public void balanceChanged(int change, SavingsAccount acct) {
        System.out.println("Checking for fraudulent withdrawal" +
                " of amount: " + change + " from" +
                " account " + acct.getAcctNumber());
    }
}
interface BalanceChangeHandler {
    void balanceChanged(int change, SavingsAccount acct);
}
class SavingsAccountDemo {
    public static void main(String[] args) {
        SavingsAccount acct = new SavingsAccount("Sam", 1234);
        FeeHandler feeHandler = new FeeHandler();
        FraudHandler fraudHandler = new FraudHandler();
        acct.addHandler(feeHandler);
        acct.addHandler(fraudHandler);
        acct.changeBalance(0); // nada ocorre
        acct.changeBalance(10);
        acct.changeBalance(-10);
    }
}
