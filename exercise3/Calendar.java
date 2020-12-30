package by.jonline.grow.basicsofoop.exercise3;

import java.util.Arrays;
import java.util.Objects;

public class Calendar {

    Date[] dates;

    public Calendar() {

    }

    public Calendar(Date[] dates) {
        this.dates = dates;
    }

    public Date[] getDates() {
        return dates;
    }

    public void setDates(Date[] dates) {
        this.dates = dates;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Calendar calendar = (Calendar) o;
        return Arrays.equals(dates, calendar.dates);
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(dates);
    }

    @Override
    public String toString() {
        return "Calendar{" +
                "dates=" + Arrays.toString(dates) +
                '}';
    }

    public static class Date {

        private int day;
        private int month;
        private boolean restDay;

        public Date() {

        }

        public Date(int day, int month, boolean restDay) {
            this.day = day;
            this.month = month;
            this.restDay = restDay;
        }

        public int getDay() {
            return day;
        }

        public void setDay(int day) {
            this.day = day;
        }

        public int getMonth() {
            return month;
        }

        public void setMonth(int month) {
            this.month = month;
        }

        public boolean isRestDay() {
            return restDay;
        }

        public void setRestDay(boolean restDay) {
            this.restDay = restDay;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Date day1 = (Date) o;
            return day == day1.day &&
                    month == day1.month &&
                    restDay == day1.restDay;
        }

        @Override
        public int hashCode() {
            return Objects.hash(day, month, restDay);
        }

        @Override
        public String toString() {
            return getClass().getSimpleName() + "{" +
                    "day=" + day +
                    ", month=" + month +
                    ", restDay=" + restDay +
                    '}';
        }

    }
}