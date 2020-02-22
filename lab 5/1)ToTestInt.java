/**1)	Write a program to create interface named test. In this interface the member function is square.
Implement this interface in arithmetic class. 
Create one new class called ToTestInt.
In this class use the object of arithmetic class.**/


import java.util.Scanner;
interface test{//declare interface 
int square(int n);
}
class arithmetic implements test{
public  int square(int n){//implement interface
return n*n;
}}
class ToTestInt {
public static void main(String args[]){
	System.out.print("enter a number");
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
arithmetic obj=new arithmetic();//call method 
System.out.println(obj.square(n));
}}
