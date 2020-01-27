//program to input a number of a month (1 - 12) and print its equivalent name of 
the month.( e.g 1 to Jan, 2 to Feb. 12 to Dec.)

import java.util.Scanner;
class month{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
System.out.println("enter a number between 1-12");
int a=sc.nextInt();
if(a==1)
System.out.println("JAN");
else if(a==2)
System.out.println("MAR");
else if(a==3)
System.out.println("MAR");
else if(a==4)
System.out.println("APR");
else if(a==5)
System.out.println("MAY");
else if(a==6)
System.out.println("JUN");
else if(a==7)
System.out.println("JULY");
else if(a==8)
System.out.println("AUG");
else if(a==9)
System.out.println("SEP");
else if(a==10)
System.out.println("OCT");
else if(a==11)
System.out.println("NOV");
else if(a==12)
System.out.println("DEC");}}


