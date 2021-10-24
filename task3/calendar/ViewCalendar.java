package by.epam.module5.task3.calendar;

public class ViewCalendar {
    private final Calendar calendar;

    public ViewCalendar(Calendar calendar) {
        this.calendar = calendar;
    }

    public void printMonth(int month) {
        System.out.println("Year: " + calendar.getYears() + "\n");
        System.out.println("Month: " + calendar.getMonth().get(month - 1).getNameOfMonth() + "\n");
        for (int i = 0; i < calendar.getMonth().get(month - 1).getWeekdays().size(); i++) {
            System.out.println(calendar.getMonth().get(month - 1).getDates().get(i) +
                    " " + calendar.getMonth().get(month - 1).getWeekdays().get(i));
        }
    }
}
