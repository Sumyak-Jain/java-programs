/**2)	Write a program to create interface A, in this interface we have two method meth1 and meth2. 
Implements this interface in another class named MyClass.**/

import java.util.Scanner;
interface A{//declaring methods
int add(int n, int p);
int sub(int n,int p);
}
class MyClass implements A{//defing methods
public int add(int n, int p){
return n+p;
}
public int sub(int n,int p){
return n-p;
}
public static void main(String args[]){
Scanner sc=new  Scanner();
int n=sc.nextInt();
int p=sc.nextInt();
MyClass obj =new MyClass();
System.out.println(obj.add(n,p));
System.out.println(obj.sub(n,p));
}}
