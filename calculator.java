//java program for basic command line argument calculator
public class calculator{
public static void main(String args[]){
	int a,b,c;
  a=Integer.parseInt(args[1]);// taking number as command line argument
  b=Integer.parseInt(args[2]);
  if(args[0].equals("add")){
  System.out.println(a+b);
  }
  else if(args[0].equals("sub")){
  System.out.println(a-b);
  }
  else if(args[0].equals("divide")){
  System.out.println(a/b);
  }
  else if(args[0].equals("multiply")){
  System.out.println(a*b);
  }}}
