public class Message5 implements Runnable{

    Chromonetr chromonetr;
    Message5(Chromonetr chromonetr){
        this.chromonetr = chromonetr;
    }
    public synchronized void run(){
        while(true) {
            if(chromonetr.getSec() % 5 !=0){
                try {
                    Thread.sleep(1000L);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }else{
                try {
                    System.out.println("Message 5");
                    Thread.sleep(1100L);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }

        }
    }
}
