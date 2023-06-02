class MinhaRunnable implements Runnable {

    public void run() {

        Thread minhaThread1 = new Thread(new MinhaThread("Primeira Thread"));

        Thread minhaThread2 = new Thread(new MinhaThread("Segunda Thread"));

        minhaThread1.start();
        minhaThread2.start();

        try {
            minhaThread1.join();
            minhaThread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Threads executada.");

    }
}