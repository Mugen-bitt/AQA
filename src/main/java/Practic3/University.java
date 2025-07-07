package Practic3;

public class University {
    static String universityName = "Hogwarts Practic3.University";
    final int studentID;
    private String studentName;

    //Конструктор
    public University(int studentID, String studentName){
        this.studentID = studentID;
        this.studentName = studentName;
    }
    //Метод для изменения названия универа
    public static void changeUniversityName(String newName){
        universityName = newName;
    }
    //Геттер для получения имени студента
    public String getStudentName(){
        return studentName;
    }
    //Метод для вывода инфы о студенте и универе
    public void printStudentInfo(){
        System.out.println("Студент: " + studentName + ", ID: " + studentID + ", Университет: " + universityName);
    }
    //Метод main
    public static void main(String[] args){
        University student1 = new University(1, "Гарри Поттер");
        University student2 = new University(2, "Рон Уизли");
        University student3 = new University(3, "Гермиона Грейнджер");

        student1.printStudentInfo();
        student2.printStudentInfo();
        student3.printStudentInfo();

        University.changeUniversityName("Hogwarts school of Mistery");

        student1.printStudentInfo();
        student2.printStudentInfo();
        student3.printStudentInfo();
    }
}
