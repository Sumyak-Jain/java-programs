import java.util.Scanner;
interface test{//declare interface 
int division(int a,int b);
int modules(int a,int b);
}
class A implements test{
public  int division(int a,int b){//implement interface
return a/b;}
public int modules(int a,int b){
return a%b;
}}
class B {//class which do not implement 
public  int division(int a,int b){
return a%b;}
public int modules(int a,int b){
return a/b;
}}
class override {
public static void main(String args[]){
	System.out.print("enter two number");
	Scanner sc=new Scanner(System.in);
	int a=sc.nextInt();
	int b=sc.nextInt();
A obj=new A();//call method 
B obj1=new B();
System.out.println(obj.division(a,b));
System.out.println(obj1.division(a,b));//overriding method
System.out.println(obj.modules(a,b));
System.out.println(obj1.modules(a,b));
}}
