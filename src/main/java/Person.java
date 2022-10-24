import java.util.OptionalInt;

public class Person {
    private final String name;
    private final String surname;
    private Integer age;
    private String address;

    private Person child;


    public Person(String name, String surname, Integer age, String city) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.address = city;
    }


    public String getName() {
        return name;
    }


    public String getSurname() {
        return surname;
    }


    public OptionalInt getAge() {
        return OptionalInt.empty();
    }

    public void happyBirthday() {
        if (this.age != null) {
            this.age++;
        }
    }

    public boolean hasAddress() {
        return address != null;
    }

    public String getCity() {
        return address;
    }

    public void setAddress(String city) {
        this.address = city;
    }

    public PersonBuilder newChildBuilder() {
        return new PersonBuilder(this.surname, this.address);
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                '}';
    }


}
