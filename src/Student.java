public class Student extends Person{
    private int grade;
    private int sectionCount;
    private  Section[] sections = new Section[10];

    public Student(String name, int grade) {
        super(name);
        this.grade = grade;

    }

    public Section[] getSections() {
        return sections;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public int getGrade() {

        return grade;
    }

    public void addSection (Section s) {
        sections[sectionCount] = s;
        sectionCount++;
    }

    public String toString() {
        String o = "";
        for(int i = 0; i < sectionCount; i ++) {
            o += sections[i].getName() + " (" + sections[i].getTeacher() + "), ";
        }
        return this.getName() + " is in " + this.grade +
                " grade and is enrolled in the following sections: "
                + o;
    }
}
