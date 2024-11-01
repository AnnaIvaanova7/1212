package builder;

public class Person {
    private String firstName;
    private String lastName;
    private String middleName;

    public Person(String firstName, String lastName, String middleName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.middleName = middleName;
    }




    public static class PersonBuilder {
        private String firstName;
        private String lastName;
        private String middleName;

        public PersonBuilder firstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        public PersonBuilder lastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public PersonBuilder middleName(String middleName) {
            this.middleName = middleName;
            return this;
        }

        public Person build(){
            return new Person(firstName, lastName, middleName);
        }

        @Override
        public String toString() {
            return "PersonBuilder{" +
                    "firstName='" + firstName + '\'' +
                    ", lastName='" + lastName + '\'' +
                    ", middleName='" + middleName + '\'' +
                    '}';
        }
    }

    public static PersonBuilder builder(){
        return new PersonBuilder();
    }


    public void firstName(String firstName) {
        this.firstName = firstName;
    }

    public void lastName(String lastName) {
        this.lastName = lastName;
    }

    public void middleName(String middleName) {
        this.middleName = middleName;
    }


}
