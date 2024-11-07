public class App {
    public static void main(String[] args) throws Exception {
        
            //dwa sposoby na utorzenie thread

        MyThread thread1 = new MyThread();      //utworzenie subklasy extends thread

        MyRunnable runnable1 = new MyRunnable();        //implements runnable i dodajemy thread(runnable)
        Thread thread2 = new Thread(runnable1);

        //thread1.setDaemon(true);  //deamon przestanie działać jeżeli program napotka błąd, jeżeli jest to user thread a w main będzie błąd to będzie działać dalej
        //thread2.setDaemon(true);

        thread1.start();
        //thread1.join(3000);  //po zakończeniu thread1 zacznie się thread2, jeżeli dodamy ilość sekund to po takim czasie zacznie się wykonwywać thread2
        thread2.start();

        //System.out.println(1/0);
    }
}
