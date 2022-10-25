public class PersonBuilder {
    private String name = null;
    private String surname = null;
    private Integer age = null;
    private String address = null;

    public PersonBuilder(String surname, String address) {
        this.surname = surname;
        this.address = address;
    }

    public PersonBuilder() {
    }

    public PersonBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public PersonBuilder setSurname(String surname) {
        this.surname = surname;
        return this;
    }

    public PersonBuilder setAge(int age) {
        if (this.age != null && (this.age < 0 || this.age > 120)) {
            throw new IllegalArgumentException("Некорректный возраст");
        }
        this.age = age;
        return this;
    }

    public PersonBuilder setAddress(String address) {
        this.address = address;
        return this;
    }

    public Person build() {
        if (this.name == null) {
            throw new IllegalStateException("Имя должно быть заполнено");
        }
        if (this.surname == null) {
            throw new IllegalStateException("Фамилия должна быть заполнена");
        }

        return new Person(name, surname, age, address);
    }


}
