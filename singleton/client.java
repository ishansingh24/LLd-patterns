public class client {
    public static void main(String[] args) {
        singlton s = singlton.getInstance();
        singlton s1 = singlton.getInstance();
        System.out.println(s.hashCode());
        System.out.println(s1.hashCode());

        Runnable r = ()->{System.out.println(singlton.getInstance().hashCode());};
        Runnable r2 = ()->{System.out.println(singlton.getInstance().hashCode());};

        Thread t1 = new Thread(r);
        Thread t2 = new Thread(r2);

        t1.start();
        t2.start();

        Runnable r3 = ()->{System.out.println(syncSinglton.getInstance().hashCode());};
        Runnable r4 = ()->{System.out.println(syncSinglton.getInstance().hashCode());};

        Thread t3 = new Thread(r3);
        Thread t4 = new Thread(r4);

        t3.start();
        t4.start();

        Runnable r5 = ()->{System.out.println(lazySinglton.getInstance().hashCode());};
        Runnable r6 = ()->{System.out.println(lazySinglton.getInstance().hashCode());};

        Thread t5 = new Thread(r5);
        Thread t6 = new Thread(r6);

        t5.start();
        t6.start();
    }
}
