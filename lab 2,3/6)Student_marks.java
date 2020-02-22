/**program to accept 10 student’s marks in an array, arrange it into ascending order, 
convert into the following grades and print marks and grades.
using class and object**/

import java.util.Scanner;
class marks{
int grades;
void calculate(int g){
grades=g;
if(grades>=40 && grades<=50){//checking of grades
System.out.println("PASS");}
else if(grades>=51 && grades<=75){
System.out.println("MERIT");}
else if(grades>75){
System.out.println("DISTINCTION");}
else if(grades<40){
System.out.println("FAIL");
}
}}
class Student_marks{
public static void main(String args[])
{
marks m=new marks();
Scanner sc = new Scanner(System.in);
System.out.println("enter marks for 10 students");
int a[]=new int[10];
for(int i=0;i<10;i++)
{a[i]=sc.nextInt();
m.calculate(a[i]);
}
for(int i=0;i<10;i++){//sorting in ascending order
	for(int j=i+1;j<10;j++){
	if(a[i]>a[j]){
	int temp=a[j];
	a[j]=a[i];
a[i]=temp;}}}
System.out.println("sorted array of marks is:");
for(int i=0;i<10;i++){
System.out.print(a[i]+" ");}
}}
