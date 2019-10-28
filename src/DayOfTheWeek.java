import java.util.Arrays;

public class DayOfTheWeek {

    private static String[] weekDays = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};

    private static void dayAfterNumberDays(int number, String day) {
        int weekdayNumberFromUser = Arrays.asList(weekDays).indexOf(day);
        //        int weekdayAfterNumberDays = (number + weekdayNumberFromUser)% 7;
        int weekdayAfterNumberDays = number + weekdayNumberFromUser;

        //        System.out.println("Your day is: "+day + " after "+number+" days is: " +weekDays[weekdayAfterNumberDays]);

        if(weekdayAfterNumberDays>=7){
                int newWeekdayNumber = weekdayAfterNumberDays % 7;
                String newDayName = weekDays[newWeekdayNumber];
                System.out.println("Your day is: "+day + " after "+number+" days is: " +newDayName);
            }else{
                System.out.println("Your day is: "+day + " after "+number+" days is: " +weekDays[number+weekdayNumberFromUser]);
            }
    }

    public static void main(String[] args) {
        dayAfterNumberDays(2,"Wednesday");
    }
}
