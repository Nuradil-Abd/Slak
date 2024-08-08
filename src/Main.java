import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("Nuradil", "Java", LocalDate.of(1997, 1, 24));
        Student student2 = new Student("Atai", "Java", LocalDate.of(2005, 3, 12));
        Student student3 = new Student("Kanat", "English", LocalDate.of(2000, 4, 15));
        Student student4 = new Student("Oleg", "Js", LocalDate.of(1995, 2, 23));
        Student student5 = new Student("Sam", "Js", LocalDate.of(2007, 5, 13));
        Student student6 = new Student("Ekaterina", "Java", LocalDate.of(1985, 4, 24));
        Student student7 = new Student("Viktoria", "English", LocalDate.of(1993, 5, 22));
        Student student8 = new Student("Kayrat", "Java", LocalDate.of(2007, 7, 8));
        Student student9 = new Student("Babakhan", "Java", LocalDate.of(2010, 6, 11));
        Student student10 = new Student("Bektur", "Java", LocalDate.of(2002, 1, 1));
        Student student11 = new Student("Yroslav", "SQL", LocalDate.of(2000, 1, 23));
        Student student12 = new Student("Viktor", "Java", LocalDate.of(1999, 4, 15));
        Student student13 = new Student("Askat", "Java", LocalDate.of(1986, 12, 30));
        Student student14 = new Student("Tilek", "JS", LocalDate.of(1996, 4, 15));
        Student student15 = new Student("Alina", "English", LocalDate.of(2005, 3, 5));
        Student student16 = new Student("Amina", "SQL", LocalDate.of(2001, 5, 16));
        Student student17 = new Student("Ekaterina", "Js", LocalDate.of(2009, 5, 13));
        Student student18 = new Student("Viktor", "SQL", LocalDate.of(2011, 4, 23));
        Student student19 = new Student("Nailya", "Java", LocalDate.of(1990, 2, 20));
        Student student20 = new Student("Baisalbek", "Java", LocalDate.of(2004, 8, 16));

        Student[] students = {student1, student2, student3, student4, student5, student6, student7, student8, student9, student10,
                student11, student12, student13, student14, student15, student16, student17, student18, student19, student20};

        studentsOver2000(students); // Студенты рожденые до 2000 г

        studentsHigh2000(students); // Студенты рожденные после 2000 г

        byName(students,"Viktor");//поиск по Имени

        yangStudent(students); // Самый молодой студент
        oldStudent(students);  // Самый старший студент
        
        dateOfBInfo(students); // Информация даты рождения всех студентов

        byCourse(students,"Js"); // Информация студентов учашихся на курсе

        byStr(students,'N');   // Студенты чье имя начинается на symbol

        // Студенты рожденные в промежутке
        removeStudentsBetweenDates(students,LocalDate.of(1997,1,1),LocalDate.of(2006,1,1));
    }

    public static void studentsOver2000(Student[] students) {
        System.out.println("Студенты рожденные до 2000 года\n");
        for (Student yangStudent : students) {
            if (yangStudent.getDateOfBirth().getYear() < 2000) {
                System.out.println(yangStudent.studentInfo());
            }
        }
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
    }

    public static void studentsHigh2000(Student[] students ) {
        System.out.println("Студенты рожденные после 2000 года\n");
        for (Student oldStudent : students) {
            if ( oldStudent.getDateOfBirth().getYear() < 2000) {
                System.out.println(oldStudent.studentInfo());
            }
        }
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
    }


    public static void byName(Student[] students, String name){
        System.out.println("Информация о студенте с именем " + name + "\n");
        for (Student student : students) {
           if(student.getName().equals(name)){
               System.out.println(student.studentInfo());
           }
        }
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
    }

    public static void yangStudent(Student[] students){
        System.out.println("Самый молодой студент ");
        Student studentAge = students[0];
        for (Student student : students) {
            if(student.getDateOfBirth().isAfter(studentAge.getDateOfBirth())){
                studentAge = student;
            }
        }
        System.out.println(studentAge.getName() + " Дата рождения : " + (studentAge.getDateOfBirth()));
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
    }
  public static void oldStudent(Student[] students){
        System.out.println("Самый старший студент ");
        Student studentAge = students[0];
        for (Student student : students) {
            if(student.getDateOfBirth().isBefore(studentAge.getDateOfBirth())){
                studentAge = student;
            }
        }
        System.out.println(studentAge.getName() + " Дата рождения : " + (studentAge.getDateOfBirth()));
      System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
  }

    public static void dateOfBInfo(Student[] students){
        System.out.println("Даты рождения всех студентов ");
        for (Student student : students) {
            System.out.println(student.getName() + ": " + student.getDateOfBirth());
        }
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
    }

    public static void byCourse (Student[] students, String course){
        System.out.println("Студенты  кторые учаться на курсе " + course);
        for (Student student : students) {
            if(student.getCourse().equals(course)){
                System.out.println(student.getName() + " ");
            }
        }
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
    }

    public static void byStr (Student[] students, char symbol){
        System.out.println("Студенты у которых Имена начинаются с " + symbol);
        for (Student student : students) {
            char i = student.getName().charAt(0);
            if(i == symbol){
                System.out.println(student.getName() + " ");
            }
        }
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
    }

    public static void removeStudentsBetweenDates(Student[]students, LocalDate startDate, LocalDate endDate){
        System.out.println("Студенты ррожденные в промежутке " + startDate + " - " + endDate);
        for (Student student : students) {
            if(student.getDateOfBirth().isAfter(startDate) && student.getDateOfBirth().isBefore(endDate)){
                System.out.println(student.getName() + " : " + student.getDateOfBirth());
            }
        }
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
    }


}
