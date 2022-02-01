package Multithreading;

public class My implements Runnable{
    @Override
    public void run() {
        int i=1;
        while(i<5){
            System.out.println(i + " thread 1");
            i++;
        }

    }

    public static void main(String[] args) {
        My m = new My();
        Thread t = new Thread(m);
        t.start();
        int i=1;
        while(i<5){
            System.out.println(i + " thread 2");
            i++;
        }
    }
}
