//java program to write fibonacci series by command line
public class fibonacci{
public static void main(String args[]){
int a=0,b=1,c=1,d;
d=Integer.parseInt(args[0]);//give the number till where you want to find the fibonacci series
for(int i=0;i<d;i++){
	System.out.println(a+" ");
c=a+b;
a=b;
b=c;}
}}
