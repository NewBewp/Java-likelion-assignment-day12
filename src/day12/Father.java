package day12;

public class Father {
    private int age;
    private String name;

    public Father(){}

    public Father(int age, String name1) {
        this.age = age;
        name = name1;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
