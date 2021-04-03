public class Main {

    public static void main(String[] args) {
        int hour = java.time.LocalTime.now().getHour();
        int min = java.time.LocalTime.now().getMinute();
        int sec = java.time.LocalTime.now().getSecond();
        ClockDisplay clock = new ClockDisplay();
        clock.setTime(hour,min,sec);
        System.out.println("clock1");
        clock.print();
        for(int i=0;i<3;i++)
        {
            clock.timeTick();
            clock.print();
        }

        System.out.println();
        System.out.println("clock2");
        ClockDisplay clock2 = new ClockDisplay();
        clock2.setTime(23,59,59);
        clock2.print();
        for(int i=0;i<3;i++)
        {
            clock2.timeTick();
            clock2.print();
        }




    }
}