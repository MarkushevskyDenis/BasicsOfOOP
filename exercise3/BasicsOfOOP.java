package by.jonline.grow.basicsofoop.exercise3;

/**
 * Создать класс Календарь с внутренним классом, с помощью объектов которого можно хранить информацию о
 * выходных и праздничных днях.
 */

public class BasicsOfOOP {
    public static void main(String[] args) {

        Logic logic = new Logic();
        View view = new View();

        Calendar.Date[] dates = logic.generateDays(true,6);
        Calendar calendar = new Calendar();
        calendar.setDates(dates);
        view.Out(calendar);

    }
}
