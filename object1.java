//java program for classes and object

//making a class student 
class student {
    int id;
    String name;
    
}
  public class object1{
     public static void main(String[] args) {
      
     student s1 = new student();//s1 is the object
     student s2 = new student();
     s1.id=101;
     s1.name="siddhant";
     
     s2.id=106;
     s2.name="sumyak";
     
         System.out.println(s1.id+ "  "+s1.name);
         System.out.println(s2.id+ "  "+s2.name);
     
     } 
}
