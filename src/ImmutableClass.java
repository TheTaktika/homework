public final class ImmutableClass {
    private final NonImmutableClass nonImmutableClass;

    public ImmutableClass (String name, int age) {
        this.nonImmutableClass = new NonImmutableClass(name, age);
    }

    public ImmutableClass (NonImmutableClass nonImmutableClass) {
        this.nonImmutableClass = new NonImmutableClass(nonImmutableClass.getName(), nonImmutableClass.getAge());
    }

    public NonImmutableClass getNonImmutableClass () {
        return new  NonImmutableClass(
                nonImmutableClass.getName(),
                nonImmutableClass.getAge()
        );
    }

    public String getName () {
        return nonImmutableClass.getName();
    }

    public int getAge () {
        return nonImmutableClass.getAge();
    }

   public static void main(String[] args) {
        NonImmutableClass mutable = new NonImmutableClass("Vlad", 25);
        ImmutableClass immutable = new ImmutableClass(mutable);

        System.out.println(immutable.getAge());
        System.out.println(mutable.getAge());

        mutable.setAge(50);
        System.out.println(immutable.getAge());
        System.out.println(mutable.getAge());
    }
}