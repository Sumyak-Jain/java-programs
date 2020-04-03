public class thread1 extends Thread {
     public void run(){
        System.out.println("thread is running");//creating thread by extending thread class
    }
     public static void main(String[] args) {
        thread1 t = new thread1();
        t.start();
    }
}
