package ReflectionAPI;

public abstract class Person {

    private Long id;

    public Person(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }


    public void test() {
        System.out.println("Test PERSON");
    }
    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                '}';
    }
}