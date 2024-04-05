public class  MyThread implements Runnable {

    @Override
    public  void run() {
        print();
    }

    public synchronized void print(){
        for (int i = 1; i <= 10; i++) {
            try {
                System.out.println(i);
                Thread.sleep(1000);
            }catch (Exception e ){
                e.printStackTrace();
            }
        }
    }
}
