public class Main {
    public static void main(String[] args) {

        Chromonetr chromonetr = new Chromonetr();
        Message5 mes5= new Message5(chromonetr);
        Message7 mes7= new Message7(chromonetr);

        new Thread(chromonetr).start();
        new Thread(mes5).start();
        new Thread(mes7).start();

    }
}
