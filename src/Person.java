public class Person {
    private String name;
    private int id;
    private static int nextId = 0;

    public Person(String name) {
        this.name = name;
        this.id = nextId;
        nextId ++;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }


}
