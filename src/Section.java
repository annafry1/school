import java.lang.reflect.Array;

public class Section {
    private String name;
    private Teacher teacher;
    private Student[] students = new Student[50];
    private int currentSize;

    public Section(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public String getName() {
        return this.name;
    }

    public String getTeacher() {
        return teacher.getName();
    }

    public int getCurrentSize() {
        return this.currentSize;
    }

    public String getStudents() {
        String o = "";
        for (int i = 0; i < currentSize; i++){
            o += students[i].getName() + " ";
        }
        return o;
    }

    public void addStudent (Student s) {
        students[currentSize] = s;
        currentSize++;
    }

    public String toString() {
        return this.name + " is taught by " + this.getTeacher() +
                " and has " + this.currentSize + " students: "
                + this.getStudents();
    }
}
