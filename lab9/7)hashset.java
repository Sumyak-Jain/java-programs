import java.util.*;  
public class hashset {
    public static void main(String args[]){  
          ArrayList<String> list=new ArrayList<String>();  
           list.add("gaurav0");  
           list.add("gaurav1");  
           list.add("gaurrav2");
            HashSet<String> set=new HashSet(list);  
           System.out.println("An initial list of elements: "+set); 
           if(set.contains("gaurav0"))
		{
			System.out.println("Yes Set contains the 'gaurav0' String");
		}
		
		if(set.contains("table") == false)
		{
			System.out.println("No Set do not contains the 'table' String");
		}
           set.clear();  
           System.out.println("After invoking clear() method: "+set); 
}
}
