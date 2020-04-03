import java.util.*;
public class arraylist {
    public static void main(String args[]){  
  ArrayList<String> list=new ArrayList<String>();//Creating arraylist  
  list.add("gaurav");//Adding object in arraylist  
  list.add("sumyak");  
  list.add("jaingaurav");  
  list.add("jain");  
  //Traversing list through Iterator  
  Iterator itr=list.iterator();  
  while(itr.hasNext()){  
   System.out.println(itr.next());  
  }
 Collections.reverse(list); 
        System.out.print("\nElements after reversing:\n "); 
        Iterator itr1=list.iterator();
       while(itr1.hasNext()){  
   System.out.println(itr1.next()); 
    
  }
       ArrayList<String> arrayListClone =  (ArrayList<String>) list.clone();
         
        System.out.println(arrayListClone);   
 }  
}
