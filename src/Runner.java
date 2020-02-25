public class Runner {
    public static void main(String[] args){
        School berkeley = new School("Berkeley High");

        Section math = new Section("Math");
        Section bio = new Section("Biology");
        Section compSci = new Section("Computer Science");

        Teacher henri = new Teacher("math", "Henri");
        Teacher alby = new Teacher("Computer Science", "Albinson");
        Teacher mueller = new Teacher("Biology", "Mueller");

        Student eva = new Student("Eva", 12);
        Student anna = new Student("Anna", 12);
        Student ben = new Student("Ben",12);
        Student mia = new Student("Mia", 12);
        Student john = new Student("John", 10);
        Student marc = new Student("Marc-Anthony", 9);

        berkeley.addSection(math);
        eva.addSection(math);
        anna.addSection(math);
        ben.addSection(math);
        mia.addSection(math);
        john.addSection(math);
        marc.addSection(math);
        henri.addSection(math);
        berkeley.addSection(bio);
        eva.addSection(bio);
        anna.addSection(bio);
        ben.addSection(bio);
        mia.addSection(bio);
        john.addSection(bio);
        marc.addSection(bio);
        mueller.addSection(bio);
        berkeley.addSection(compSci);
        eva.addSection(compSci);
        anna.addSection(compSci);
        ben.addSection(compSci);
        mia.addSection(compSci);
        john.addSection(compSci);
        marc.addSection(compSci);
        alby.addSection(compSci);

        math.setTeacher(henri);
        compSci.setTeacher(alby);
        bio.setTeacher(mueller);

        math.addStudent(eva);
        math.addStudent(anna);
        math.addStudent(ben);
        math.addStudent(mia);
        math.addStudent(john);
        math.addStudent(marc);
        compSci.addStudent(eva);
        compSci.addStudent(anna);
        compSci.addStudent(ben);
        compSci.addStudent(mia);
        compSci.addStudent(john);
        compSci.addStudent(marc);
        bio.addStudent(eva);
        bio.addStudent(anna);
        bio.addStudent(ben);
        bio.addStudent(mia);
        bio.addStudent(john);
        bio.addStudent(marc);

        System.out.println(berkeley.toString());
        System.out.println(math.toString());
        System.out.println(compSci.toString());
        System.out.println(bio.toString());
        System.out.println(henri.toString());
        System.out.println(alby.toString());
        System.out.println(mueller.toString());
        System.out.println(eva.toString());
        System.out.println(anna.toString());
        System.out.println(ben.toString());
        System.out.println(mia.toString());
        System.out.println(john.toString());
        System.out.println(marc.toString());



    }

}
