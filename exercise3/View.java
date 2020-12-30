package by.jonline.grow.basicsofoop.exercise3;

public class View {

    public void Out(Calendar calendar) {
        Calendar.Date[] days = calendar.getDates();

        for (int i = 0; i < days.length; i++) {
            if (i != 0 && days[i - 1].getMonth() != days[i].getMonth()) {
                System.out.println();
                System.out.println(days[i].getMonth());
                System.out.println();
            }

            System.out.print(days[i].getDay() + "(" + days[i].isRestDay() + ") ");

            if (i != 0 && days[i - 1].isRestDay() && days[i].isRestDay()) {
                System.out.println();
            }
        }

    }

}
