package Module1;

public class NonImmutableClass {

    private String name;
    private int age;

    public NonImmutableClass (String name, int age) {
        this.name = name;
        this.age = age;
    }

    public NonImmutableClass(NonImmutableClass mutable) {
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
