public class Student {

    private final String name;
    private final int year;
    private final double average;

    public Student(int year, String name, double average) {
        this.name = name;
        this.year = year;
        this.average = average;
    }

    public String getName() {
        return name;
    }

    public int getYear() {
        return year;
    }

    public double getAverage() {
        return average;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", year=" + year +
                ", average=" + average + "%" +
                '}';
    }
}
