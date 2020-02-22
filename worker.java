/**	Write a class Worker and derive classes DailyWorker and SalariedWorker from it. Every worker has a name and a salary rate. 
Write method ComPay (int hours) to compute the week pay of every worker.
A Daily Worker is paid on the basis of the number of days he/she works. 
The Salaried Worker gets paid the wage for 40 hours a week no matter what the actual hours are. 
Test this program to calculate the pay of workers. 
You are expected to use the concept of polymorphism to write this program.**/

class Worker{
String name="sumyak";
int salary_rate=82;
public static void main(String args[]){
Daily_worker d=new Daily_worker();
d.ComPay(34);
Salaried_worker s=new Salaried_worker();
s.ComPay(34);
}}
class Daily_worker extends Worker{
void ComPay(int hours){
System.out.println(salary_rate*hours);
}
}
class Salaried_worker extends Worker{
void ComPay(int hours){
System.out.println(salary_rate*40);
}
}
