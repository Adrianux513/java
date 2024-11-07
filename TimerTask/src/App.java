import java.util.Calendar;
import java.util.Timer;
import java.util.TimerTask;

public class App {
    public static void main(String[] args) throws Exception {
        
        Timer timer = new Timer();

        TimerTask task = new TimerTask(){

            int counter = 10;

            @Override
            public void run() {
                if(counter>0){
                    System.out.println(counter + " seconds");
                    counter--;
                }
                else{
                    System.out.println("Happy new Year!!!");
                    timer.cancel();
                }
            }
            
        };

        Calendar date = Calendar.getInstance();
        date.set(Calendar.YEAR,2024);
        date.set(Calendar.MONTH,Calendar.SEPTEMBER);
        date.set(Calendar.DAY_OF_MONTH,16);
        date.set(Calendar.HOUR_OF_DAY,19);
        date.set(Calendar.MINUTE,57);
        date.set(Calendar.SECOND,0);
        date.set(Calendar.MILLISECOND,0);

        //timer.schedule(task, 3000);  //wypisuje to co napiszesz w sysout run()
        //timer.schedule(task, date.getTime());  //wypisuje to co w run() kiedy będzie konkretna data którą ustawimy
        //timer.scheduleAtFixedRate(task, 0, 1000);  //odliczanie
        timer.scheduleAtFixedRate(task, date.getTime(), 1000);  //będzie odliczał 10 sekund po tym jak będzie konkretna data/godzina która ustawimy w date
    }
}
