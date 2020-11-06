package collections;

public class SampleDemo implements Runnable{
    private String threadName;
    private Thread t;

    SampleDemo(String threadName){
        this.threadName = threadName;
    }

    public void run() {
        while (true){
            System.out.println(threadName);
        }
    }

    public void start(){
        if (t == null){
            t = new Thread(this, threadName);
            t.start();
        }
    }

    public static void main(String[] args) {
        SampleDemo A = new SampleDemo("A");
        SampleDemo B = new SampleDemo("B");
        B.start();
        A.start();
    }
}
