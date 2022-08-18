public class Message7 implements Runnable {
    Chromonetr chromonetr;
    Message7(Chromonetr chromonetr){
        this.chromonetr = chromonetr;
    }
    public synchronized void run(){
        while(true) {
            if(chromonetr.getSec() % 7 !=0){
                try {
                    Thread.sleep(1000L);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }else{
                try {
                    System.out.println("Message 7");
                    Thread.sleep(1100L);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }

        }
    }
}
