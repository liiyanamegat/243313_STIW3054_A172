package mysleep;

public class MySleep extends Thread {

    public static void main(String[] args) {
        new Thread(new MySleep()).start();
    }

    @Override
    public void run() {
        try {
            for (int x = 5; x < 101; x = x+5) {
                System.out.print(x);
                sleep(500);
                if (x%2==0)
                    System.out.print(" A ");
                    System.out.println();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}