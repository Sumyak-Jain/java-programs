package practice_java;
import java.util.*;
interface sales{//making the interface
    int get_sales(int amount);
    void display_sales();
    
}
class Publication
{
String t;float p;
Publication(String tittle,float price)
{
t=tittle;  
p=price;
}
void display()
{
System.out.println("tittle is "+t);
System.out.println("price is Rs."+p);
}
 
}

abstract class book extends Publication implements sales
{
int c,a;
book(int count)
{   super("c",24.8f);
	c=count;}
void display()
{System.out.println("no of pages added are "+c );
}

   	public int  get_sales(int amount)
	{ a=amount;
        return a;
        }
        
	public void display_sales()
	{
		System.out.println("the sales amount  is Rs."+a);
	}
}
abstract class tape extends Publication implements sales
{
float m;
tape(float min)
{
	super("t",42.8f);
	m=min;}
void display()
{System.out.println("playing time in minutes is "+m+ " min");}

	}

public class Companyprogram {
    public static void main(String args[])
{
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter the tittle");
	String tittle=sc.nextLine();
        System.out.println("enter the price");
	float price=sc.nextFloat();
        System.out.println("enter the page count");
	int count=sc.nextInt();
        System.out.println("enter the minute");
	float min=sc.nextFloat();
	System.out.println("enter the sale amountt");
	int  amount=sc.nextInt();
Publication obj=new Publication(tittle,price);
obj.display();

book ob=new book(count) {};
ob.display();
ob.get_sales(amount);
ob.display_sales();


tape o=new tape(min) {
            @Override
            public int get_sales(int amount) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void display_sales() {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        };
o.display();


}
    
}
