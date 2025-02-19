import java.util.Scanner;

public class BankingApplication {
    public static void main(String args[]){
        BankAccount ba = new BankAccount();
        ba.show();
        ba.showMenu();
    }
}
class BankAccount {
        int balance;
        int previousTransaction;
        String customerName;
        String cid;


        void Deposit(int amount){
            if(amount != 0){
                balance = balance + amount;
                previousTransaction = amount;
            }
        }

        void withdraw(int amount){
            if(amount != 0){
                balance = balance - amount;
                previousTransaction = -amount;
            }
        }

        void getPreviousTransaction(){
            if(previousTransaction > 0){
                System.out.println("Deposited : " + previousTransaction);
            }
            else if(previousTransaction < 0){
                System.out.println("Withdrawn : " + Math.abs(previousTransaction));
            }
            else{
                System.out.println("No transaction occured!");
            }
        }
        public void show() {
            System.out.println("Enter name");
            @SuppressWarnings("resource")
            Scanner sc = new Scanner(System.in);
            customerName = sc.next();
            System.out.println("Welcome" +  " "+ customerName);

        }

        void showMenu(){
            char option = '\0';
            @SuppressWarnings("resource")
            Scanner sc = new Scanner(System.in);
            System.out.println();
            System.out.println("A. Check Balance");
            System.out.println("B. Deposit");
            System.out.println("C. WithDraw");
            System.out.println("D. Previous Transaction");
            System.out.println("E. Exit");

            do{
                System.out.println("----------------------------------------------------------------");
                System.out.println("Enter the Option");
                System.out.println("----------------------------------------------------------------");
                option = sc.next().charAt(0);
                Character.toUpperCase(option);

                switch(option){
                    case 'A': 
                        System.out.println("----------------------------------------------------------------");
                        System.out.println("Balance" + balance);
                        System.out.println("----------------------------------------------------------------");
                        System.out.println();
                        break;
                    
                    case 'B':
                        System.out.println("----------------------------------------------------------------");
                        System.out.println("Enter the amount to deposit" );
                        System.out.println("----------------------------------------------------------------");
                        int amount = sc.nextInt();
                        Deposit(amount);
                        System.out.println();
                        break;

                    case 'C':
                        System.out.println("----------------------------------------------------------------");
                        System.out.println("Enter the amount to withdraw" );
                        System.out.println("----------------------------------------------------------------");
                        int amount2 = sc.nextInt();
                        withdraw(amount2);
                        System.out.println();
                        break;
                    
                    case 'D':
                        System.out.println("----------------------------------------------------------------");
                        getPreviousTransaction();
                        System.out.println("----------------------------------------------------------------");
                        System.out.println();
                        break;

                    case 'E':
                        System.out.println("----------------------------------------------------------------");
                        break;
                    
                    default:
                        System.out.println("Inalid option! Please try again ");
                        break;
                }
            }while (option != 'E');
        }
}