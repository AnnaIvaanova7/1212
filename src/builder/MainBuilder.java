package builder;

public class MainBuilder {
    public static void main(String[] args) {
        Person p = Person.builder().build();
        System.out.println(p);
    }
}
