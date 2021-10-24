package by.epam.module5.task3.calendar;

import java.util.ArrayList;

public class CalendarLogic {
    private Calendar calendar;

    public CalendarLogic(Calendar calendar) {
        this.calendar = calendar;
    }

    public CalendarLogic() {
    }

    public void setHoliday(Calendar.Month month, int dateOfHoliday) {
        month.getDates().get(dateOfHoliday - 1).setHoliday(true);
    }

    public ArrayList<Integer> getHolidays(int month) {
        ArrayList<Integer> holidays = new ArrayList<>();
        for (int i = 0; i < calendar.getMonth().get(month - 1).getWeekdays().size(); i++) {
            if (calendar.getMonth().get(month - 1).getDates().get(i).isHoliday()) {
                holidays.add(i + 1);
            }
        }
        return holidays;
    }

    public static ArrayList<Calendar.Date> createDatesOfMonth(int length) {
        Calendar calendar = new Calendar();
        ArrayList<Calendar.Date> dates = new ArrayList<>();
        for (int i = 1; i <= length; i++) {
            dates.add(calendar.new Date(i));
        }
        return dates;
    }

    public static ArrayList<Calendar.Weekday> createWeek() {
        Calendar calendar = new Calendar();

        Calendar.Weekday weekday = calendar.new Weekday(Day.SUNDAY, true);
        Calendar.Weekday weekday1 = calendar.new Weekday(Day.MONDAY, false);
        Calendar.Weekday weekday2 = calendar.new Weekday(Day.TUESDAY, false);
        Calendar.Weekday weekday3 = calendar.new Weekday(Day.WEDNESDAY, false);
        Calendar.Weekday weekday4 = calendar.new Weekday(Day.THURSDAY, false);
        Calendar.Weekday weekday5 = calendar.new Weekday(Day.FRIDAY, false);
        Calendar.Weekday weekday6 = calendar.new Weekday(Day.SATURDAY, true);

        ArrayList<Calendar.Weekday> week = new ArrayList<>();
        week.add(weekday);
        week.add(weekday1);
        week.add(weekday2);
        week.add(weekday3);
        week.add(weekday4);
        week.add(weekday5);
        week.add(weekday6);

        return week;
    }

    public static Calendar.Month createMonth(NameOfMonth month, int length, int firstWeekday) {
        Calendar calendar = new Calendar();
        ArrayList<Calendar.Date> dates = createDatesOfMonth(length);
        ArrayList<Calendar.Weekday> week = createWeek();
        ArrayList<Calendar.Weekday> weekdaysOfMonth = new ArrayList<>();
        int i = 1;
        int j = firstWeekday;
        while (i <= dates.size()) {
            weekdaysOfMonth.add(week.get(j++));
            if (j == 7) {
                j = 0;
            }
            i++;
        }
        return calendar.new Month(month, weekdaysOfMonth, dates);
    }

}
