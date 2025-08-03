import java.util.Scanner;

class Atm {
    private double balance;
    public Atm(double balance){
        this.balance = balance;
    }
    public void withdraw(double amount){
    if(amount <= balance){
        balance = balance-amount;
        System.out.println("withdraw sucessful new balance" + balance);
    }
    else{
        System.out.println("insufficent balance");
    }
    }
    public void deposit(double amount){
        balance = balance + amount;
        System.out.println("deposite sucessful new balance " + balance);

    }
    public void checkBalance(){
        System.out.println("current balace" + balance);

    }
    public static void main(String args[]){
        Atm atm = new Atm(10000);
        Scanner sc = new Scanner(System.in );
        while (true){

            System.out.println("1. withdraw");
            System.out.println("2 . deposite");
            System.out.println("3. checkbalance");
            System.out.println("4. exit");
            System.out.println("enter your option");
            int option = sc.nextInt();
            switch(option){
                case 1:
                System.out.println("enter amount withdraw");
                double withdrawAmount  = sc. nextDouble();
                atm.withdraw(withdrawAmount);
                break;
                case 2:
                System.out.println("enter amount deposite");
                double depositeAmount = sc. nextDouble();
                atm.deposit(depositeAmount);
                break;
                case 3:
                atm.checkBalance();
                break;
                case 4:
                System.out.println("exiting");
                return;
                default:
                System.out.println("invalid please try again");
            }
                
            }
        }

}



