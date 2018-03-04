
package mysleep;

public class MyTest extends Thread{
        
        public static void main(String[] args) {
            System.out.println(Thread.currentThread().getName());
            MyThread t1 = new MyThread();
            t1.start();
            MyThreadThread t2 = new MyThreadThread();
            t2.start();
           
    }

}
