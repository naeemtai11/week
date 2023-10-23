package days;

public class Weekdays {

    // Enum declaration inside the Weekdays class
    public enum Day {
        MONDAY("Monday"),
        TUESDAY("Tuesday"),
        WEDNESDAY("Wednesday"),
        THURSDAY("Thursday"),
        FRIDAY("Friday"),
        SATURDAY("Saturday"),
        SUNDAY("Sunday");

        private final String name;

        Day(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }
    }

    // Method to print all days
    public void printAllDays() {
        for (Day day : Day.values()) {
            System.out.println(day.getName());
        }
    }
}
