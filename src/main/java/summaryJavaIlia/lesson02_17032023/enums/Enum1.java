package summaryJavaIlia.lesson02_17032023.enums;

public class Enum1 {
    public static void main(String[] args) {
        Today today = new Today(WeekDays.FRIDAY);
        today.DaysInfo();
        Today today1 = new Today(WeekDays.SUNDAY);
        today1.DaysInfo();
    }
}
enum WeekDays {
    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY;
}
class Today {
    WeekDays weekDays;
    public Today(WeekDays weekDays) {
        this.weekDays = weekDays;
    }
    void DaysInfo(){
        switch (weekDays){
            case MONDAY:
            case TUESDAY:
            case WEDNESDAY:
            case THURSDAY:
            case FRIDAY:
                System.out.println("Go working");
                break;
            case SATURDAY:
            case SUNDAY:
                System.out.println("WeekEnds");
                break;
        }
    }
}
