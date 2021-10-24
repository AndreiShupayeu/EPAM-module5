package by.epam.module5.task3;

import by.epam.module5.task3.calendar.Calendar;
import by.epam.module5.task3.calendar.CalendarLogic;
import by.epam.module5.task3.calendar.NameOfMonth;
import by.epam.module5.task3.calendar.ViewCalendar;


import java.util.ArrayList;

//Создать класс Календарь с внутренним классом, с помощью объектов которого можно хранить информацию о
//выходных и праздничных днях.


public class Main {
    public static void main(String[] args) {
        Calendar calendar2021 = new Calendar(2021);
        CalendarLogic calendarLogic = new CalendarLogic(calendar2021);
        ViewCalendar viewCalendar = new ViewCalendar(calendar2021);

        Calendar.Month january = CalendarLogic.createMonth(NameOfMonth.JANUARY,31,5);
        Calendar.Month february = CalendarLogic.createMonth(NameOfMonth.FEBRUARY, 28,1);
        Calendar.Month march = CalendarLogic.createMonth(NameOfMonth.MARCH, 31, 1);

        ArrayList<Calendar.Month> months = new ArrayList<>();

        months.add(january);
        months.add(february);
        months.add(march);

        calendar2021.setMonth(months);

        calendarLogic.setHoliday(january, 1);
        calendarLogic.setHoliday(january, 7);
        calendarLogic.setHoliday(january, 8);
        calendarLogic.setHoliday(march, 8);

        viewCalendar.printMonth(3);
    }
}
