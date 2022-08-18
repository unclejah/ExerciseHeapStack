public class Chromonetr implements Runnable{
    private int sec =1;

    public synchronized int getSec() {
        return sec;
    }

    @Override
    public void run() {
        while (true) {
            try {
                Thread.sleep(1000);
                System.out.println(sec);
                sec++;
            } catch (InterruptedException e) {
                return;
            }

        }
    }
}
