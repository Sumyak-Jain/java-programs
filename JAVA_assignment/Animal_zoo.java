
import java.util.ArrayList;
import java.util.Collections;
abstract class Animal
{
    abstract String getName();

    abstract int getAge();

}

    class Tiger extends Animal

    {

        private String name; // To hold name of Tiger.

        private int age;  // To hold age of Tiger.

        

        // Constructor that accept name as parameter.

        public Tiger(String name, int age)

        {

            this.name = name;

            this.age = age;

        }

        

        //method required to extend the animal class.

        

        public String getName()

        {

            return name;

        }

        

        //method required to extend the animal class.

        

        public int getAge()

        {

            return age;

        }

    }

    class Lion extends Animal

    {

        private String name; // To hold name of Lion.

        private int age;  // To hold age of Tiger.

        

        // Constructor that accept name as parameter.

        public Lion(String name, int age)

        {

            this.name = name;

            this.age = age;

        }

        

        //method required to extend the animal class.

        

        public String getName()

        {

            return name;

        }

        

        //method required to extend the animal class.

        

        public int getAge()

        {

            return age;

        }

    }

    class Cheeta extends Animal

    {

        private String name; // To hold name of Cheeta.

        private int age;  // To hold age of Tiger.

        

        // Constructor that accept name as parameter.

        public Cheeta(String name, int age)

        {

            this.name = name;

            this.age = age;

        }

        

        //method required to extend the animal class.

        

        public String getName()

        {

            return name;

        }

        

        //method required to extend the animal class.

        

        public int getAge()

        {

            return age;

        }

    }
public class Animal_zoo

{

    public static void main(String[] args)

    {

        // create an arrayList of animals

        ArrayList<Animal> animals = new ArrayList<Animal>();

        animals.add(new Tiger("Krypto", 10));

        animals.add(new Lion("leo", 15));

        animals.add(new Lion("Asad", 13));

        animals.add(new Tiger("Leonardo", 12));

        animals.add(new Cheeta("Aslanbek", 18));

    

    for(Animal animal : animals)

    {
    System.out.println(animal.getName()+ " : " + animal.getAge());

    }

   
    }
}

