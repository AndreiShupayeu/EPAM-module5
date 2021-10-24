package by.epam.module5.task3.calendar;

import java.util.ArrayList;
import java.util.Objects;

public class Calendar {
    private int years;
    private ArrayList<Month> month;

    public Calendar(int years) {
        this.years = years;
    }

    public Calendar() {
    }

    public int getYears() {
        return years;
    }

    public void setYears(int years) {
        this.years = years;
    }

    public ArrayList<Month> getMonth() {
        return month;
    }

    public void setMonth(ArrayList<Month> month) {
        this.month = month;
    }

    @Override
    public String toString() {
        return "Calendar{" +
                "years=" + years +
                ", month=" + month +
                '}';
    }

    public class Month {
        private NameOfMonth nameOfMonth;
        private ArrayList<Weekday> weekdays;
        private ArrayList<Date> dates;

        public Month(NameOfMonth nameOfMonth, ArrayList<Weekday> weekdays, ArrayList<Date> dates) {
            this.nameOfMonth = nameOfMonth;
            this.weekdays = weekdays;
            this.dates = dates;
        }

        public Month(NameOfMonth nameOfMonth) {
            this.nameOfMonth = nameOfMonth;
        }

        public Month() {
        }

        public void setWeekdays(ArrayList<Weekday> weekdays) {
            this.weekdays = weekdays;
        }

        public void setDates(ArrayList<Date> dates) {
            this.dates = dates;
        }

        public ArrayList<Weekday> getWeekdays() {
            return weekdays;
        }

        public void setNameOfMonth(NameOfMonth nameOfMonth) {
            this.nameOfMonth = nameOfMonth;
        }

        public NameOfMonth getNameOfMonth() {
            return nameOfMonth;
        }

        public ArrayList<Date> getDates() {
            return dates;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Month month = (Month) o;
            return nameOfMonth == month.nameOfMonth && Objects.equals(weekdays, month.weekdays) && Objects.equals(dates, month.dates);
        }

        @Override
        public int hashCode() {
            return Objects.hash(nameOfMonth, weekdays, dates);
        }

        @Override
        public String toString() {
            return "Month{" +
                    "nameOfMonth=" + nameOfMonth +
                    ", weekdays=" + weekdays + "\n" +
                    ", dates=" + dates +
                    '}';
        }
    }


    public class Weekday {
        private Day day;
        private boolean weekends;


        public Weekday(Day day, boolean weekends) {
            this.day = day;
            this.weekends = weekends;
        }

        public Day getDay() {
            return day;
        }

        public void setDay(Day day) {
            this.day = day;
        }

        public boolean isWeekends() {
            return weekends;
        }

        public void setWeekends(boolean weekends) {
            this.weekends = weekends;
        }


        @Override
        public String toString() {
            if (weekends)
                return "day = " + day + " weekends ";
            else return "day = " + day;
        }
    }

    public class Date {
        private int date;
        private boolean holiday;

        public Date(int date) {
            this.date = date;
        }

        public int getDate() {
            return date;
        }

        public void setDate(int date) {
            this.date = date;
        }

        public boolean isHoliday() {
            return holiday;
        }

        public void setHoliday(boolean holiday) {
            this.holiday = holiday;
        }

        @Override
        public String toString() {
            if (holiday)
                return "date=" + date + " holiday";
            else return "date=" + date;
        }
    }
}

