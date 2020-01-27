//take 3 digits and print all possible combinations
import java.util.Scanner;
class digits{
public static void main(String args[]){
Scanner sc = new Scanner(System.in);
System.out.println("enter 3 digits");
int a=sc.nextInt();
int b=sc.nextInt();
int c=sc.nextInt();
System.out.println("possible combination are");
int d=0,e=0;
 d=a*10+b;
 e=d*10+c;
System.out.println(e);
int f=0,r=0;
 f=b*10+a;
 r=f*10+c;
System.out.println(r);
int w=0,q=0;
 w=c*10+b;
 q=w*10+a;
System.out.println(q);
int k=0,o=0;
 k=b*10+c;
 o=k*10+a;
System.out.println(o);
int j=0,s=0;
 j=c*10+a;
 s=j*10+b;
System.out.println(s);
int g=0,n=0;
 g=a*10+c;
 n=g*10+b;
System.out.println(n);
}}
