/**Write a program in java having two different thread classes; 
1) for searching a word in a given text file that prints whether the word is present in the document or not, 
2) will calculate the frequency of each word present in the document. 
Create following threads: 
1. A thread to search a word in Document1.txt
2. A thread to search a word in Document2.txt
3. A thread to print a table of word and corresponding frequency available in Document3.txt Start all three threads in main class and capture the output. 
 
Note: Use File I/O to read the document.**/ 
 
package practice_java;
import java.lang.reflect.Array;
import java.io.File;
import java.util.Scanner;

class searching  extends Thread{
    File  Obj;
    String word;
    Boolean match;
    searching(String word, String fileName){
        this.word = word;
        Obj = new File(fileName);
        match = false;
    }

    

    public void run(){
        try{
        Scanner sc = new Scanner(Obj);
        while (sc.hasNextLine()) {
        String data = sc.nextLine();
        String Split1[] = data.split(" ");
        for(int i=0; i<Split1.length ; i++ ){
            if(Split1[i].contains(word))
                match = true;
               // break;
        }
        if(match)
            break;
        } 
        System.out.println(word+"is found"); 
    }catch(Exception e){
            System.out.println(e.getMessage());
        }

    }
}

class frequency extends Thread{
    File  Obj1;

    int count;
    String data = "";
    frequency( String fileName){
       
        Obj1 = new File(fileName);
        count = 0;
    }


    private String[] getUniqueKeys(String[] keys)
    {
        String[] uniqueKeys = new String[keys.length];
        uniqueKeys[0] = keys[0];
        int uniqueKeyIndex = 1;
        boolean keyAlreadyExists = false;
        for(int i=1; i<keys.length ; i++)
        {
            for(int j=0; j<=uniqueKeyIndex; j++)
            {
                if(keys[i].equals(uniqueKeys[j]))
                {
                    keyAlreadyExists = true;
                }
            }           
            if(!keyAlreadyExists)
            {
                uniqueKeys[uniqueKeyIndex] = keys[i];
                uniqueKeyIndex++;               
            }
            keyAlreadyExists = false;
        }       
        return uniqueKeys;
    }

    public void run(){

        
        try{
     
        Scanner myReader = new Scanner(Obj1);
        while (myReader.hasNextLine()) {
            data = data  + myReader.nextLine() ;

        }
        String[] keys = data.split(" ");
        String[] uniqueKeys;
        
       uniqueKeys = getUniqueKeys(keys);
       
       int i =0;
        for(String key: uniqueKeys)
        {
            
            i++;
            if(key == null)
            {
                break;
            }           
            for(String s : keys)
            {
                if( s != null){
                if(key.equals(s) )
                {
                    count++;
                }
                }               
            }
        

            System.out.println("["+key+"] : "+count);
            count=0; }

    }catch(Exception e){
            System.out.println(e.getMessage());
        }

    }
}

class multithreading {
    public static void main(String args[]){
        
        searching th1 = new searching("java","search.txt");
        searching th2 = new searching("java","frequency.txt");
        frequency th3 = new frequency("search.txt");
        th1.start();
        th2.start();
        th3.start();
     
    }



}
