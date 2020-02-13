//Write a Java program to show that private member of a super class cannot be accessed from derived classes

class Human 
{
	int age=9;//public
	 private int weight=90;//private member
}

 class Animal extends Human
 {
	  private void eat()//private method
	{
		System.out.println("eating");
	}
}
 class Water extends Animal {
	void Float(){//public method
	System.out.println("floating");
	}
	}

 class test_inheritance{
	public static void main(String args[]){
	Water  obj=new Water();
	obj.Float();
	obj.eat();//cannot access private method
	System.out.println(obj.age);
	System.out.println(obj.weight);//cannot access private member
	}
	}
