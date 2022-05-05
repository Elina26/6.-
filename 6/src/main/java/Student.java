public class Student extends Human {

    private String facultyName;

    public Student(String surname, String name, String patronymic, int age, String facultyName) {
        super(surname, name, patronymic, age);
        this.facultyName = facultyName;
    }
    public Student(Human human, String facultyName) {
        super(human);
        this.facultyName = facultyName;
    }

    public String getFacultyName() {
        return facultyName;
    }
    public void setFacultyName(String facultyName) {
        this.facultyName = facultyName;
    }




}
