//Write a program in Java to create a Player class. Inherit the classes  Cricket _Player, Football _Player
and Hockey_ Player from Player class. 


public class Player
{
String name="Sumyak jain";
int player_no=05;

public static void main(String args[]){
Cricket_Player obj1=new Cricket_Player();
obj1.cricket();
Hockey_Player obj3=new Hockey_Player();
obj3.hockey();
}
}
class Cricket_Player extends Player{
public void cricket(){
System.out.println("name is: "+name+"and player no. is: "+player_no);

System.out.println("cricket field diameter 137-150m");
}}
class Football_Player extends Player{
public void football(){
System.out.println("name is: "+name+"and player no. is: "+player_no);

System.out.println(" football field is about 1.32 acres ");
}}
class Hockey_Player extends Player{
public void hockey(){
System.out.println("name is: "+name+"and player no. is: "+player_no);

System.out.println("hockey field is of 5027 sq.m area");
}}
