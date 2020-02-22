//Java Program to accept 10 numbers in an array and compute the square of each number. 
//Print the sum of these numbers.
import java.util.Scanner;
class numbers{
public static void main(String args[]){
Scanner sc= new Scanner(System.in);
System.out.println("enter 10 numbers");
int arr[]=new int[10];
for(int i=0;i<10;i++){
arr[i]=sc.nextInt();
arr[i]=arr[i]*arr[i];}//square of numbers
System.out.println("squares of numbers are");
for(int i=0;i<10;i++){
System.out.println(arr[i] + " ");
}
int sum=0;
for(int i=0;i<10;i++){
sum=sum+arr[i];}//sum of the squares
System.out.println("sum of the squares of the numbers is:" + sum);	
}}
