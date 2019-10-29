import java.util.Arrays;

public class DayOfTheWeek {

    private static String[] weekDays = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};

    private static void dayAfterNumberDays(String startWeekday, int daysForward ) {
        int startWeekdayIndex = Arrays.asList(weekDays).indexOf(startWeekday);

        int newWeekdayIndex = positiveModulo(startWeekdayIndex + daysForward, weekDays.length);
        System.out.println("Your day is: " + startWeekday + " after " + daysForward + " days is: " + weekDays[newWeekdayIndex]);

        /*int newWeekdayIndex = (startWeekdayIndex + daysForward) % 7;
        if (newWeekdayIndex<0){
            newWeekdayIndex +=7;
        }
            System.out.println("Your day is: " + startWeekday + " after " + daysForward + " days is: " + weekDays[newWeekdayIndex]);*/
    }


        // a % b  -----> positive
    private static int positiveModulo(int a, int b){
        int modulo = a%b;
        //a % b <0 ? (a % b)+b : a % b;
        return modulo <0 ? (modulo)+b : modulo;
    }

    public static void main(String[] args) {
        dayAfterNumberDays("Sunday", -8);
    }
}
