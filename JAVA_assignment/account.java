//question 1

import java.util.Scanner;
 public class account { //make a super class account
   int balance =500;//declare min balance
   int rate=4;//declare intrest rate for compound intrest
   
    public static void main(String[] args) {
        sav_acct obj=new sav_acct();// make object of saving account
        cur_acct obj1=new cur_acct();//make object of current account
        
     Scanner sc=new Scanner(System.in);
        System.out.println("enter your name");
      String customer_name =sc.nextLine();
        System.out.println("enter your account number");
      int account_number =sc.nextInt();
        System.out.println("enter type of account");
        System.out.println("types S for saving account and C for current account");
        char type=sc.next().charAt(0);
        boolean q=true;//condition to return back to the menu
        while(q){
        if(type=='S'){
            
            System.out.println("1.deposit");
            System.out.println("2.withdraw");
            System.out.println("3.compound intrest");
            System.out.println("4.EXIT");
            System.out.println("enter any no. to perform the task");
            int n=sc.nextInt();
            switch(n){
                case 1:
                    obj.deposit();
                    break ;
                case 2:
                    obj.withdraw();
                    break;
                case 3:
                    obj.compound();
                case 4:
                    System.exit(0);
                default:
                    System.out.println("invalid");
                
            }
        }
        else{
            System.out.println("1.display balance");
             System.out.println("2.EXIT");
             System.out.println("enter number to perform the following task");
            int c=sc.nextInt();
            if(c==1)
             obj1.display();
            else{
                System.exit(0);
            }
          } } } }
   
    class cur_acct extends account{ //current account class
        public void  display(){
            if(balance<500){
                System.out.println("not enough money deposit the minimum balance");
            }
            else{
                System.out.println("your balance is Rs."+ balance);
            }
            
        }
    }
    class sav_acct extends account{// saving acount class 
         Scanner sc1=new Scanner(System.in);
        public void deposit(){
            
            System.out.println("enter the amount you want to deposit");
            int amt=sc1.nextInt();
            balance=balance+amt;
            System.out.println("Rs."+ amt +" have been deposited to your account");
            System.out.println("updated balance is Rs." +balance);
            
            
       }
         public void withdraw(){
            System.out.println("enter the amount you want to withdraw");
            int amt1=sc1.nextInt();
            if(balance<500){
                System.out.println("not sufficient balance deposit the min balance");
            }
            else{
            balance=balance-amt1;
            System.out.println( "Rs."+ amt1 +" have been withdrawn from your account ");
             System.out.println("updated balance is Rs."+balance);
        }}
        public void  compound(){
            int r=1;
            System.out.println("enter the no. of years for intrest applied");
            int t=sc1.nextInt();
            for(int i=1;i<=t;i++){
                r=r*(1+rate);
                 
            }
            int compound_intrest=(balance*r)-balance;
            System.out.println("your balance after the intrest is Rs."+ compound_intrest);
            
        }
        
    }
   
