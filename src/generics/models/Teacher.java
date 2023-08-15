package generics.models;

public class Teacher extends Person {

    private String course;

    public Teacher(String name, int age, String course) {
        super(name, age);
        this.course = course;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    @Override
    public String toString() {
        String ts = "course = " + course;
        return String.format("%s=[%s %s]", this.getClass().getName(), super.toString(), ts);
    }
}
