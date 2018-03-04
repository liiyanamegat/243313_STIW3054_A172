
package mysleep;

import static java.lang.Thread.sleep;

public class MyThread extends Thread{
    
    public void run() {
        System.out.println(Thread.currentThread().getName());
        try {
            for (int x = 0; x <= 10; x++) {
                System.out.println(x);
                sleep(500);
                
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
