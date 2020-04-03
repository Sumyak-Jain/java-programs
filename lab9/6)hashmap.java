import java.util.*;
public class hashmap {
     public static void main(String[] args) 
    { 
  
        // Creating an empty HashMap 
        HashMap<Integer, String> hash_map = new HashMap<Integer, String>(); 
  
        // Mapping string values to int keys 
        hash_map.put(10, "hello"); 
        hash_map.put(15, "gaurav"); 
        hash_map.put(20, "jain"); 
        hash_map.put(25, "Welcomes"); 
        hash_map.put(30, "You"); 
  
        // Displaying the HashMap 
        System.out.println("Initial Mappings are: " + hash_map); 
  
        // Checking for the key_element '20' 
        System.out.println("Is the key '20' present? " +   hash_map.containsKey(20)); 
         System.out.println("Is the value 'Welcomes' present? " +  hash_map.containsValue("welcoming"));
           Set<Integer> keys = hash_map.keySet();
           System.out.println("keys are:");
        for(Integer key: keys){
            System.out.println(key);
        }
    } 
    
}
