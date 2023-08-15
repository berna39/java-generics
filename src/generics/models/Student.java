package generics.models;

public class Student extends Person {
    
    private String section;

    public Student(String name, int age, String section) {
        super(name, age);
        this.section = section;
    }

    public String getSection() {
        return section;
    }

    public void setSection(String section) {
        this.section = section;
    }

    @Override
    public String toString() {
        String ts = "section = " + section;
       return String.format("%s=[%s %s]", this.getClass().getName(), super.toString(), ts);
    }
}
