import java.util.ArrayList;
import java.util.Objects;

public class Human {
    private String surname;
    private String name;
    private String patronymic;
    private int age;

    public Human(String surname, String name, String patronymic, int age) {
        this.surname = surname;
        this.name = name;
        this.patronymic = patronymic;
        this.age = age;
    }

    public Human(Human human) {
        this.surname = human.getSurname();
        this.name = human.getName();
        this.patronymic = human.getPatronymic();
        this.age = human.getAge();
    }

    public Human() {
        this.surname = null;
        this.name = null;
        this.patronymic = null;
        this.age = 0;
    }

    public String getSurname() {
        return surname;
    }
    public String getName() {
        return name;
    }
    public String getPatronymic() {
        return patronymic;
    }
    public int getAge() {
        return age;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }
    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Human)) return false;
        Human human = (Human) o;
        return getAge() == human.getAge() && Objects.equals(getSurname(), human.getSurname()) && Objects.equals(getName(), human.getName()) && Objects.equals(getPatronymic(), human.getPatronymic());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getSurname(), getName(), getPatronymic(), getAge());
    }

    @Override
    public String toString() {
        return "Human{" +
                "surname='" + surname + '\'' +
                ", name='" + name + '\'' +
                ", patronymic='" + patronymic + '\'' +
                ", age=" + age +
                '}';
    }
}
