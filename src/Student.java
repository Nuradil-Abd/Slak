import java.time.LocalDate;

public class Student {

    String name;
    String course;
    LocalDate dateOfBirth;

    public Student() {
    }

    public Student(String name, String course, LocalDate dateOfBirth) {
        this.name = name;
        this.course = course;
        this.dateOfBirth = dateOfBirth ;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String studentInfo(){
        return String.format("""
                Name: %s
                Course: %s
                Date of Birth: %s
                """,getName(),getCourse(), getDateOfBirth());
    }


}
