//implementing runnable interface
public class thread6  implements Runnable{
    public void run(){
        System.out.println("runnable");
    }
    public static void main(String[] args) {
        
        thread6 t=new thread6();
        Thread t1=new Thread(t);
        Thread t2=new Thread(t);
        t1.start();
        t2.start();
    }
}
