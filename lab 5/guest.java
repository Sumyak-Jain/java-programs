 /**program to input of the full name from user and print short form of the name including welome message
 use function**/
 import java.util.Scanner;
 class string_convert {
    String funtn(String name){
        String [] st=name.split(" ");
        String str=" ";
        for(int i=0;i<st.length -1;i++){
            str=str+st[i].charAt(0)+".";
        }
        return (str+st[st.length-1]);           
		}		
 
		}
	public class guest extends string_convert {
    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter your full name");
		String name=sc.nextLine();
		 System.out.println("enter m for male and f for female");
		char gender=sc.next().charAt(0);
        string_convert obj=new string_convert();
		if(gender=='m'){
		System.out.println("welcome Mr."+obj.funtn(name));
		}
		else{
		System.out.println("welcome Mrs."+obj.funtn(name));
		}
		}
    
		}
