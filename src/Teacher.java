public class Teacher extends Person{
    private String subject;
    private int sectionCount;
    private Section[] sections = new Section[10];

    public Teacher(String subject, String name) {
        super(name);
        this.subject = subject;

    }

    public String getSubject() {
        return subject;
    }

    public Section[] getSections() {
        return sections;
    }

    public int getSectionCount() {
        return sectionCount;
    }

    public void addSection (Section s) {
        sections[sectionCount] = s;
        sectionCount++;
    }

    public String toString() {
        String o = "";
        for(int i = 0; i < sectionCount; i ++) {
            //String x = Integer.toString();
            o += sections[i].getName() + "(" + sections[i].getCurrentSize() + ")";
        }

        return this.getName() + " teaches the following sections: " + o;
    }

}
